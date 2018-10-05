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
			//���Ͽ� �Է� ��Ʈ���� ����
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		}catch (IOException e) {
			System.out.println(e.toString());
			// TODO: handle exception
		}
	}
	public void byeClient() {
		while(in != null){	
			try {
				//�������κ��� ���� �޽����� ȭ�鿡 ���
				String r = in.readLine();
				if(r==null) { // quit �Է����� ���� ������ �������� ��
					in.close();
					socket.close();
					System.exit(0);
				}else {
					System.out.println(r);
				}
			}catch(SocketException e) { // client�� ������ ������������ ������ ��(=bye �Է½�)
				ChatServer.port = ChatServer.port+1; // port ��ȣ �ٲٰ�
				ChatServer.start();
				break;
			}catch(IOException e) {
				System.out.println(e.toString());
			} catch (Exception e) {
				System.out.println("������ �����Ͽ����ϴ�.");
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
