package Chapter11_7_2;

import java.awt.Window;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class MsgSender extends Thread {
	String nickname;
	Socket socket;
	PrintWriter out;
	
	public MsgSender(String nickname, Socket socket) {
		this.nickname = "["+nickname+"]";
		this.socket = socket;
		try {
			//���Ͽ� ��� ��Ʈ���� ����
			out = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()));
		}catch (IOException e) {
			System.out.println(e.toString());
		}
	}
	public void run() {
		Scanner s = new Scanner(System.in);
		while(out != null){
			String msg = s.nextLine();
			out.println(nickname+msg);
			out.flush();
			//������ ����� ������� �տ� �ٿ� ����
			if(msg.equals("quit")){
				try {
					out.close();
					socket.close(); 
					System.exit(0);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if(msg.equals("bye")){
				try {
					 
					System.exit(0);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
	
}
