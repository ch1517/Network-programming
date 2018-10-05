package Chapter11_7_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.SocketException;

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
	public void byeClient() {
		while(in != null){	
			try {
				//소켓으로부터 받은 메시지를 화면에 출력
				String r = in.readLine();
				if(r==null) { // quit 입력으로 인해 연결이 끊어졌을 때
					in.close();
					socket.close();
					System.exit(0);
				}else {
					System.out.println(r);
				}
			}catch(SocketException e) { // client의 연결이 비정상적으로 끊겼을 때(=bye 입력시)
				ChatServer.port = ChatServer.port+1; // port 번호 바꾸고
				ChatServer.start();
				break;
			}catch(IOException e) {
				System.out.println(e.toString());
			} catch (Exception e) {
				System.out.println("연결을 종료하였습니다.");
				System.exit(0);
			}
		}
	}
	public void run() {
		try {
			byeClient();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
