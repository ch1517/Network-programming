package Chapter9_2;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Chapter9_2 extends JFrame{
	private JButton btn1, btn2;
	public Chapter9_2(String title) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300,150); // ���� : 300, ���� 150
		setTitle(title); // ������ ĸ�� ����
		setBackground(Color.lightGray);
		
		setLayout(new BorderLayout());
		btn1 = new JButton("OK");
		btn2 = new JButton("Cancel");
		add(btn1, BorderLayout.NORTH);
		add(btn2, BorderLayout.SOUTH);

		setDefaultLookAndFeelDecorated(true);
//		setDefaultLookAndFeelDecorated(false);
		
		setVisible(true);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Chapter9_2 c = new Chapter9_2("���α׷��� ���� 2");
		
		
	}

}
