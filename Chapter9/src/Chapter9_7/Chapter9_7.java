package Chapter9_7;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Chapter9_7 extends JFrame{
	public Chapter9_7(String title) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle(title);
		setSize(400,300);
		setLayout(new BorderLayout());
		
		JPanel northJPanel = new JPanel();
		northJPanel.setLayout(new BorderLayout());
		northJPanel.add(new JLabel("일 자:"),BorderLayout.WEST);
		JTextField tf = new JTextField();
		tf.setText("2012. 7.22");
		tf.setPreferredSize(new Dimension(345, 20));
		northJPanel.add(tf,BorderLayout.EAST);
		
		
		add(northJPanel,BorderLayout.NORTH);
		add(new JLabel("제 목:"),BorderLayout.WEST);
		JTextArea jt = new JTextArea(12,30);
		jt.setText("메모를 남기세요");
		JScrollPane js = new JScrollPane(jt);
		js.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS); // 항상 수직 스크롤바 표시
		js.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS); // 항상 수평 스크롤바 표시
		
		add(js,BorderLayout.CENTER);
		
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Chapter9_7 c = new Chapter9_7("형식이 있는 텍스트필드와 텍스트영역");
	}

}
