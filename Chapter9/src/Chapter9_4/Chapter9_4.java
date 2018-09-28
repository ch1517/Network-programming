package Chapter9_4;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JSlider;

public class Chapter9_4 extends JFrame{
	public Chapter9_4(String title) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(600,300);
		setTitle(title);
		
		setLayout(new BorderLayout());
		JSlider sdNorth = new JSlider(0,200,40); //0~200, 초기값 40
		sdNorth.setPaintLabels(true); // 주 눈금 글씨
		sdNorth.setPaintTicks(true); // 주 눈금
		sdNorth.setMinorTickSpacing(10); // 부 눈금 간격
		sdNorth.setMajorTickSpacing(50); // 주 눈금 간격
		sdNorth.setForeground(Color.BLUE); // 파란색 글씨
		
		JSlider sdEast = new JSlider(JSlider.VERTICAL,100,200,150); // 수직, 100~200, 초기값 150
		sdEast.setPaintLabels(true); // 주 눈금 글씨
		sdEast.setPaintTicks(true); // 주 눈금
		sdEast.setMinorTickSpacing(20); // 부 눈금 간격
		sdEast.setMajorTickSpacing(50); // 주 눈금 간격
		
		JSlider sdWest = new JSlider(JSlider.VERTICAL); // 0~100, 초기값 50
		sdWest.setPaintLabels(true); // 주 눈금 글씨
		sdWest.setPaintTicks(true); // 주 눈금
		sdWest.setMajorTickSpacing(50); // 주 눈금 간격
		
		JSlider sdSouth = new JSlider(0,160,90); // 0~160, 초기값 90
		sdSouth.setPaintLabels(true); // 주 눈금 글씨
		sdSouth.setPaintTicks(true); // 주 눈금
		sdSouth.setMinorTickSpacing(40); // 부 눈금 간격
		sdSouth.setMajorTickSpacing(80); // 주 눈금 간격
		sdSouth.setForeground(Color.red); // 눈금 색상 레드
		add(sdNorth,BorderLayout.NORTH);
		add(sdEast,BorderLayout.EAST);
		add(sdWest,BorderLayout.WEST);
		add(sdSouth,BorderLayout.SOUTH);
		
		
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Chapter9_4 c = new Chapter9_4("슬라이더");
	}

}
