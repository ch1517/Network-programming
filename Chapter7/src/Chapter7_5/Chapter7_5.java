package Chapter7_5;

import java.util.Calendar;

public class Chapter7_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar cal = Calendar.getInstance();
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH)+1;
		int date = cal.get(Calendar.DATE);
		String d;
		
		switch(cal.get(Calendar.DAY_OF_WEEK)) {
		case 1:
			d="�Ͽ���";
			break;
		case 2:
			d="������";
			break;
		case 3:
			d="ȭ����";
			break;
		case 4:
			d="������";
			break;
		case 5:
			d="�����";
			break;
		case 6:
			d="�ݿ���";
			break;
		default:
			d="�����";
			break;
	}
	
		System.out.println("������ "+year+"�� "+month+"�� "+date+"�� "+ d+"�Դϴ�.");
		System.out.println("�� ���� "+cal.get(Calendar.DAY_OF_WEEK_IN_MONTH)+"��°"+d+"�Դϴ�.");
		System.out.println("�� ���� "+cal.get(Calendar.WEEK_OF_MONTH)+"��° ���Դϴ�.");
		System.out.println("�� ���� "+cal.get(Calendar.DAY_OF_YEAR)+"���Դϴ�.");
		System.out.println("�� ���� "+cal.get(Calendar.WEEK_OF_YEAR)+"��° ���Դϴ�.");
	}

}
