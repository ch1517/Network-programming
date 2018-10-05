package Chapter11_6;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class FileCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int data;
		String path = "C:\\Users\\doqtq\\Documents\\����JAVA\\Chapter11\\src\\Chapter11_6";
		// �Է¹޴� ���ϵ��� txt��� ����
		File file = new File(path,args[0]+".txt");
		File newfile = new File(path,args[1]+".txt");
		
		if(file.exists()) {
			try {
				newfile.createNewFile();
				// ���� ���� �̸����� FileInputStream ����
				FileInputStream fis = new FileInputStream(file);
				FileOutputStream fout = new FileOutputStream(newfile);
				// ���ڵ��� ����
				InputStreamReader isr = new InputStreamReader(fis, "MS949");
				OutputStreamWriter osw = new OutputStreamWriter(fout, "MS949");
				
				while((data=isr.read())!=-1) {
					char c = (char)data;
					osw.write(c);
				}
				osw.flush();//OutputStreamWriter�� ���۸� ����. (����Ѵ�.) 
				isr.close();
				osw.close();
				fis.close();
				fout.close();
				System.out.println("���簡 �Ϸ�Ǿ����ϴ�.");
			}catch(FileNotFoundException e) {
				System.out.println(e);
			}catch (IOException e) {
				System.out.println(e);
			}catch (Exception e) {
				System.out.println(e);
			}
		} else {
			System.err.println("������ �����ϴ�.");
		}
	}

}
