package Chapter9_8;

import java.awt.BorderLayout;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;


public class Chapter9_8 extends JFrame{
	public Chapter9_8(String title) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle(title);
		setSize(400,200);
		setLayout(new BorderLayout());
		
		String swing[] = {"javax.accessibility", "javax.swing,javax.swing.border",
				"javax.swing.event", "javax.swing.filechooser",
				"javax.swing.plaf", "javax.swing.plaf.basic", "javax.swing.plaf.metal"};
		JList<String> pkg = new JList<String>(swing);
		pkg.setVisibleRowCount(4); // JList 목록을 스크롤 페인을 사용하므로 보이는 항목 수를 지정
		JScrollPane sp = new JScrollPane(pkg); // JList 목록 객체를 인자로 스크롤 패인 생성
		sp.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
		// 필요할때만 수직 스크롤 바 생성
		
		String month[]= {"January","February","March","April","May","June","July",
				"August","September","October","November","December"};
		JComboBox<String> cb = new JComboBox<String>(month);
		cb.setEditable(true); // 콤보박스 편집 가능
		cb.setSelectedIndex(3);
		
		add(sp, BorderLayout.CENTER);
		add(cb,BorderLayout.SOUTH);
		
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Chapter9_8 c = new Chapter9_8("목록 선택을 위한 콘트롤");
	}

}
