package Chapter11_3;

import java.io.File;

public class Chapter11_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "C:\\Users\\doqtq\\Documents\\����JAVA\\Chapter11\\src\\Chapter11_3";
		File f = new File(name);
		File[] flist = f.listFiles();
		for(File i : flist) {
			if(i.isDirectory()) { // ���͸� �̸�
				System.out.print("���� : ");
			} else { // ���͸��� �ƴϸ�(�����̸�)
				System.out.print("���� : ");
			}
			System.out.println(i.getName());
		}
	}

}
