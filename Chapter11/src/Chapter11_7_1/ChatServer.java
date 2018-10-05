package Chapter11_7_1;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;


public class ChatServer {
	public static int  port = 1004;
	ServerSocket server;
	Socket socket;
	
	public ChatServer(int port) {
		this.port = port;
		System.out.println(">> ������ �����մϴ�.");
		try {
			server = new ServerSocket(port);
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	public void communicate() {
		System.out.println(">> Ŭ���̾�Ʈ�� �����ϱ� ��ٸ��� �ֽ��ϴ�.(��Ʈ��ȣ : "+port+")");
		try {
			// Ŭ���̾�Ʈ ���� ������ ���
			socket = server.accept();
			System.out.println(socket.getInetAddress());
			printInfo();
			// ���� ���Ͽ� �Է°� ����� ���� sender�� receiver�� ����
			MsgSender sender = new MsgSender("����", socket);
			MsgReceiver receiver = new MsgReceiver("����", socket);
			// sender�� receiver�� �����带 ����
			receiver.start();
			sender.start();
		}  catch(SocketException e){
			System.out.println("�� �� ���� ������ ���� ������ ������ϴ�.");
		}catch(IOException e) {
			e.printStackTrace();
		}
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
		System.out.println(">> Ŭ���̾�Ʈ�� ���ӿ� �����߽��ϴ�.");
		// ���� ��Ʈ ��ȣ�� Ŭ���̾�Ʈ �ּҿ� ��Ʈ��ȣ ���
		System.out.println("     ���� ��Ʈ��ȣ: "+socket.getLocalPort());
		System.out.println("     Ŭ���̾�Ʈ �ּ�: "+socket.getInetAddress());
		System.out.println("     Ŭ���̾�Ʈ ��Ʈ��ȣ: "+socket.getPort());
		System.out.println(">>Ŭ���̾�Ʈ�� ������ �޽����� ���� Enter�� ��������. \n");
	}
	public static void start() {
		ChatServer myServer = new ChatServer(port);
		myServer.communicate();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		start();
	}

}
