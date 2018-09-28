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
		northPanel.add(new JButton("Ű�е�"));
		northPanel.add(new JButton("�ֱٱ��"));
		northPanel.add(new JButton("���ã��"));
		northPanel.add(new JButton("����ó"));
		

		JPanel southPanel = new JPanel();
		southPanel.setLayout(new GridLayout(1, 2));
		JPanel southSubPanel = new JPanel();
		southSubPanel.setLayout(new GridLayout(1, 2));
		southSubPanel.add(new JButton("����"));
		southSubPanel.add(new JButton("���ã��"));
		

		southPanel.add(new JButton("Ű�е�"));
		southPanel.add(southSubPanel);
		
		add(northPanel, BorderLayout.NORTH);
		add(southPanel, BorderLayout.SOUTH);
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Chapter9_5 c = new Chapter9_5("���̾� �е带 ���� �⺻ ��ư");
	}
}
