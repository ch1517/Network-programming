package Chapter11_5;

import java.io.File;

public class Rename {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �Է¹޴� ���ϵ��� txt��� ����
		String path = "C:\\Users\\doqtq\\Documents\\����JAVA\\Chapter11\\src\\Chapter11_5";
		File file = new File(path,args[0]+".txt");
		File newfile = new File(path,args[1]+".txt");
		if(file.exists()) {
			file.renameTo(newfile); // ���ο� �̸����� ����
			System.out.println(args[0]+"->"+args[1]);
		} else {
			System.out.println(args[0]+".txt��� �̸��� ������ �������� �ʽ��ϴ�.");
		}
	}

}
