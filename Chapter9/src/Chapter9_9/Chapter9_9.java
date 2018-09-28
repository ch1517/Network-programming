package Chapter9_9;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Chapter9_9 extends JFrame{
	public Chapter9_9(String title) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle(title);
		setSize(400,250);
		setLayout(new GridLayout(2,4,10,20));
		add(new JButton("1")); 
		JPanel jp1 = new JPanel();
		jp1.setBackground(Color.YELLOW);
		add(jp1);
		add(new JButton("2")); 
		JPanel jp2 = new JPanel();
		jp2.setBackground(Color.PINK);
		add(jp2);
		JPanel jp3 = new JPanel();
		jp3.setBackground(Color.GREEN);
		add(jp3);
		add(new JButton("3")); 
		JPanel jp4 = new JPanel();
		jp4.setBackground(Color.BLUE);
		add(jp4);
		add(new JButton("4")); 

		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Chapter9_9 c = new Chapter9_9("Grid Button");
	}

}
