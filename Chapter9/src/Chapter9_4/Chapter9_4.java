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
		JSlider sdNorth = new JSlider(0,200,40); //0~200, �ʱⰪ 40
		sdNorth.setPaintLabels(true); // �� ���� �۾�
		sdNorth.setPaintTicks(true); // �� ����
		sdNorth.setMinorTickSpacing(10); // �� ���� ����
		sdNorth.setMajorTickSpacing(50); // �� ���� ����
		sdNorth.setForeground(Color.BLUE); // �Ķ��� �۾�
		
		JSlider sdEast = new JSlider(JSlider.VERTICAL,100,200,150); // ����, 100~200, �ʱⰪ 150
		sdEast.setPaintLabels(true); // �� ���� �۾�
		sdEast.setPaintTicks(true); // �� ����
		sdEast.setMinorTickSpacing(20); // �� ���� ����
		sdEast.setMajorTickSpacing(50); // �� ���� ����
		
		JSlider sdWest = new JSlider(JSlider.VERTICAL); // 0~100, �ʱⰪ 50
		sdWest.setPaintLabels(true); // �� ���� �۾�
		sdWest.setPaintTicks(true); // �� ����
		sdWest.setMajorTickSpacing(50); // �� ���� ����
		
		JSlider sdSouth = new JSlider(0,160,90); // 0~160, �ʱⰪ 90
		sdSouth.setPaintLabels(true); // �� ���� �۾�
		sdSouth.setPaintTicks(true); // �� ����
		sdSouth.setMinorTickSpacing(40); // �� ���� ����
		sdSouth.setMajorTickSpacing(80); // �� ���� ����
		sdSouth.setForeground(Color.red); // ���� ���� ����
		add(sdNorth,BorderLayout.NORTH);
		add(sdEast,BorderLayout.EAST);
		add(sdWest,BorderLayout.WEST);
		add(sdSouth,BorderLayout.SOUTH);
		
		
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Chapter9_4 c = new Chapter9_4("�����̴�");
	}

}
