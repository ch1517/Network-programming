package Chapter9_5;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Chapter9_5 extends JFrame{
	public Chapter9_5(String title) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle(title);
		setSize(400,200);
		
		setLayout(new BorderLayout());
		
		JPanel northPanel = new JPanel();
		northPanel.setLayout(new GridLayout(1, 4));
		northPanel.add(new JButton("키패드"));
		northPanel.add(new JButton("최근기록"));
		northPanel.add(new JButton("즐겨찾기"));
		northPanel.add(new JButton("연락처"));
		

		JPanel southPanel = new JPanel();
		southPanel.setLayout(new GridLayout(1, 2));
		JPanel southSubPanel = new JPanel();
		southSubPanel.setLayout(new GridLayout(1, 2));
		southSubPanel.add(new JButton("이전"));
		southSubPanel.add(new JButton("즐겨찾기"));
		

		southPanel.add(new JButton("키패드"));
		southPanel.add(southSubPanel);
		
		add(northPanel, BorderLayout.NORTH);
		add(southPanel, BorderLayout.SOUTH);
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Chapter9_5 c = new Chapter9_5("다이얼 패드를 위한 기본 버튼");
	}
}
