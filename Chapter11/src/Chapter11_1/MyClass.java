package Chapter11_1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class MyClass {

	public static void main(String[] args) {
		int data;
		int num=1; //�� ��ȣ
		//�ҷ��� ���� ��� + �̸�
		String inFname = "C:\\Users\\doqtq\\Documents\\����JAVA\\Chapter11\\src\\Chapter11_1\\MyClass.java";
		// ���� ���� ���� ��� + �̸�
		String outFname = "C:\\Users\\doqtq\\Documents\\����JAVA\\Chapter11\\src\\Chapter11_1\\MyNum.java";
		try {
			// ���� ���� �̸����� FileInputStream ����
			FileInputStream fis = new FileInputStream(inFname);
			FileOutputStream fout = new FileOutputStream(outFname);
			// ���ڵ��� ����
			InputStreamReader isr = new InputStreamReader(fis, "MS949");
			OutputStreamWriter osw = new OutputStreamWriter(fout, "MS949");
			while((data = isr.read())!= -1) {
				char c = (char)data;
				if(num==1) { // ù ��° �ٿ� ��ȣ�� �ű� ���� ���� ó�� 
					osw.write(num+++" ");
				}
				osw.write(c);
				if(c=='\n') {
					osw.write(num+++" ");
				}
			}
			osw.flush();//OutputStreamWriter�� ���۸� ����. (����Ѵ�.) 
			isr.close();
			osw.close();
			fis.close();
			fout.close();
			System.out.println(outFname+" : ������ �����Ǿ����ϴ�.");
		} catch(FileNotFoundException e) {
			System.err.println("���� ������ �����ϴ�. : "+inFname);
		} catch(IOException e) {
			System.out.println(e);
		}
	}

}