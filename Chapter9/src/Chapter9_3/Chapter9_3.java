package Chapter9_3;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Chapter9_3 extends JFrame{
	private JLabel yellowJLabel, orangeJLabel, blueJLabel;
	public Chapter9_3(String title){
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(375, 200); // ����350, ���� 150+����
		setTitle(title);
		
		yellowJLabel = new JLabel("yellow");
		yellowJLabel.setBackground(Color.yellow);
		yellowJLabel.setOpaque(true);
		yellowJLabel.setPreferredSize(new Dimension(50, 100)); // ũ�� ����
		
		orangeJLabel = new JLabel("orange");
		orangeJLabel.setBackground(Color.orange);
		orangeJLabel.setOpaque(true);
		orangeJLabel.setPreferredSize(new Dimension(300, 100)); // ũ�� ����
		
		blueJLabel = new JLabel("blue");
		blueJLabel.setBackground(Color.blue);
		blueJLabel.setOpaque(true);
		blueJLabel.setPreferredSize(new Dimension(350, 50)); // ũ�� ����
		
		setLayout(new FlowLayout(FlowLayout.CENTER,0,0));
		add(yellowJLabel);
		add(orangeJLabel);
		add(blueJLabel);
		
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Chapter9_3 c = new Chapter9_3("BorderLayout ����");
	}

}
