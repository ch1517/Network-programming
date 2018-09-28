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
		pkg.setVisibleRowCount(4); // JList ����� ��ũ�� ������ ����ϹǷ� ���̴� �׸� ���� ����
		JScrollPane sp = new JScrollPane(pkg); // JList ��� ��ü�� ���ڷ� ��ũ�� ���� ����
		sp.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
		// �ʿ��Ҷ��� ���� ��ũ�� �� ����
		
		String month[]= {"January","February","March","April","May","June","July",
				"August","September","October","November","December"};
		JComboBox<String> cb = new JComboBox<String>(month);
		cb.setEditable(true); // �޺��ڽ� ���� ����
		cb.setSelectedIndex(3);
		
		add(sp, BorderLayout.CENTER);
		add(cb,BorderLayout.SOUTH);
		
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Chapter9_8 c = new Chapter9_8("��� ������ ���� ��Ʈ��");
	}

}
