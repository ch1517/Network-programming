package Chapter9_1;

import java.awt.Color;
import java.awt.Container;

import javax.swing.JFrame;

public class Chapter9_1 extends JFrame{

	public Chapter9_1(String title) { // ������
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // �����ư���� ����
		setSize(300,200); // ���� : 300 , ���� : 200
		setTitle(title);
		Container pane = getContentPane();
		pane.setBackground(Color.RED);
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Chapter9_1 c = new Chapter9_1("���α׷��� ���� 1");
	}

}
