package Chapter9_1;

import java.awt.Color;
import java.awt.Container;

import javax.swing.JFrame;

public class Chapter9_1 extends JFrame{

	public Chapter9_1(String title) { // 생성자
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 종료버튼으로 종료
		setSize(300,200); // 가로 : 300 , 세로 : 200
		setTitle(title);
		Container pane = getContentPane();
		pane.setBackground(Color.RED);
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Chapter9_1 c = new Chapter9_1("프로그래밍 연습 1");
	}

}
