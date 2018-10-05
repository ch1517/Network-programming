package Chapter11_7_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

import Chapter11_7_1.ChatServer;


public class ChatClient {
	Socket socket;
	BufferedReader in;
	PrintWriter out;
	String nickname;
	public ChatClient(String ip, int port) {
		try {
			socket = new Socket(ip, port);
			printInfo();
		}catch (IOException e) {
			e.printStackTrace();
		} 
	}
	public void communicate() {
		// 클라이언트 소켓에 입력과 출력을 위한 sender와 receiver를 연결
		MsgSender sender = new MsgSender(nickname, socket);
		MsgReceiver receiver = new MsgReceiver(nickname, socket);
		// sender와 receiver의 스레드를 실행
		sender.start();
		receiver.start();
	}
	public void close() {
		try {
			// 클라이언트 소켓 종료
			socket.shutdownOutput();
			socket.shutdownInput();
			socket.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	public void printInfo() {
		System.out.println(">> 서버 접속에 성공했습니다.");
		System.out.println("     클라이언트 포트번호: "+socket.getLocalPort());
		System.out.println("     서버 주소: "+socket.getInetAddress());
		System.out.println("     서버 포트번호: "+socket.getPort());
		System.out.print("닉네임 : ");
		Scanner s = new Scanner(System.in);
		nickname = s.nextLine();
		System.out.println(">>서버에 전달할 메시지를 쓰고 Enter를 누르세요. \n");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("서버 연결 원할 시 'connect'입력");
		Scanner s = new Scanner(System.in);
		String word = s.nextLine();
		String ip;
		int port;
		if(word.equals("connect")) {
			System.out.print("IP : ");
			ip = s.nextLine();
			System.out.print("Port : ");
			port = s.nextInt();
			ChatClient client = new ChatClient(ip, port);
			client.communicate();
		}
	}

}
