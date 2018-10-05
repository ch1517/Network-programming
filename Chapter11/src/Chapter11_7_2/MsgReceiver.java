package Chapter11_7_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.util.Scanner;

public class MsgReceiver extends Thread{
	String nickname;
	Socket socket;
	BufferedReader in;
	
	public MsgReceiver(String nickname, Socket socket) {
		this.nickname = "["+nickname+"]";
		this.socket = socket;
		try {
			//소켓에 입력 스트림을 연결
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		}catch (IOException e) {
			System.out.println(e.toString());
			// TODO: handle exception
		}
	}
	public void run() {
		while(in != null){
			try {
				//소켓으로부터 받은 메시지를 화면에 출력
				System.out.println(in.readLine());
			} catch(IOException e) {
				System.out.println("소켓연결을 종료했습니다");
				try {
					in.close();
					socket.close();
					System.exit(0);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		}
		
	}
}
