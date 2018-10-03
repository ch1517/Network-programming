package Chapter10_1;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Chapter10_1 extends JFrame implements ActionListener{
	JButton yellowBtn;
	JButton redBtn;
	JPanel p1; // 색이 바뀌는Panel
	JPanel p2; // 버튼이 들어가는 Panel
	//생성자
	public Chapter10_1(String title) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 200);
		setTitle(title);
		
		ButtonAction();
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Chapter10_1 c = new Chapter10_1("버튼 액션 이벤트 처리");
	}

	void ButtonAction() {
		yellowBtn = new JButton("노랑");
		redBtn = new JButton("빨강");
		p1 = new JPanel();
		p2 = new JPanel();
		
		p2.setLayout(new GridLayout(0, 2));
		p2.add(yellowBtn);
		p2.add(redBtn);
		add(p1, BorderLayout.CENTER);
		add(p2, BorderLayout.SOUTH);
		
		yellowBtn.addActionListener(this);
		redBtn.addActionListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String btnStr = e.getActionCommand();
		if(btnStr.equals("노랑")) {
			p1.setBackground(Color.YELLOW);
		}else {
			p1.setBackground(Color.RED);
		}
	}

}
