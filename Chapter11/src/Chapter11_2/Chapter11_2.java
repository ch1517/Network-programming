package Chapter11_2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Chapter11_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int data;
		String inFname = "C:\\Users\\doqtq\\Documents\\����JAVA\\Chapter11\\src\\Chapter11_2\\heart.jpg";
		try {
			FileInputStream fis = new FileInputStream(inFname);
			while((data=fis.read())!=-1) {
				System.out.print((char)data);
			}
		}catch(FileNotFoundException e) {
			System.err.println("���� ������ �����ϴ� : "+inFname);
		}catch (Exception e) {
			System.out.println(e);
		}
	}

}
