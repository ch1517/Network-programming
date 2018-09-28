package Chapter9_6;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.TextField;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Chapter9_6 extends JFrame {
	public Chapter9_6(String title) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle(title);
		setSize(400,350);
		
		setLayout(new BorderLayout());
		
		JPanel northPanel = new JPanel(); // ���κ� �г�
		northPanel.setLayout(new GridLayout(1, 4));
		northPanel.add(new JButton("Ű�е�"));
		northPanel.add(new JButton("�ֱٱ��"));
		northPanel.add(new JButton("���ã��"));
		northPanel.add(new JButton("����ó"));
		
		JPanel centerPanel = new JPanel(); // ��� �κ� �г�
		centerPanel.setLayout(new BorderLayout());
		centerPanel.add(new TextField(),BorderLayout.NORTH); // ���ʿ� �ؽ�Ʈ �ʵ� �߰�
		
		JPanel centerSubPanel = new JPanel();
		centerSubPanel.setLayout(new GridLayout(4, 3));
		for(int i=1;i<=9;i++) {
			centerSubPanel.add(new JButton(i+""));
		}
		centerSubPanel.add(new JButton("*"));
		centerSubPanel.add(new JButton("0"));
		centerSubPanel.add(new JButton("#"));
		centerPanel.add(centerSubPanel,BorderLayout.CENTER);
		
		
		JPanel southPanel = new JPanel(); // �غκ� �г�
		southPanel.setLayout(new GridLayout(1, 2));
		JPanel southSubPanel = new JPanel();
		southSubPanel.setLayout(new GridLayout(1, 2));
		southSubPanel.add(new JButton("����"));
		southSubPanel.add(new JButton("���ã��"));
		

		southPanel.add(new JButton("Ű�е�"));
		southPanel.add(southSubPanel);
		
		add(northPanel, BorderLayout.NORTH);
		add(southPanel, BorderLayout.SOUTH);
		add(centerPanel, BorderLayout.CENTER);
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Chapter9_6 c = new Chapter9_6("���̾� �е�");
	}

}
