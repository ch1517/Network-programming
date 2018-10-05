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
		// Ŭ���̾�Ʈ ���Ͽ� �Է°� ����� ���� sender�� receiver�� ����
		MsgSender sender = new MsgSender(nickname, socket);
		MsgReceiver receiver = new MsgReceiver(nickname, socket);
		// sender�� receiver�� �����带 ����
		sender.start();
		receiver.start();
	}
	public void close() {
		try {
			// Ŭ���̾�Ʈ ���� ����
			socket.shutdownOutput();
			socket.shutdownInput();
			socket.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	public void printInfo() {
		System.out.println(">> ���� ���ӿ� �����߽��ϴ�.");
		System.out.println("     Ŭ���̾�Ʈ ��Ʈ��ȣ: "+socket.getLocalPort());
		System.out.println("     ���� �ּ�: "+socket.getInetAddress());
		System.out.println("     ���� ��Ʈ��ȣ: "+socket.getPort());
		System.out.print("�г��� : ");
		Scanner s = new Scanner(System.in);
		nickname = s.nextLine();
		System.out.println(">>������ ������ �޽����� ���� Enter�� ��������. \n");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("���� ���� ���� �� 'connect'�Է�");
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
