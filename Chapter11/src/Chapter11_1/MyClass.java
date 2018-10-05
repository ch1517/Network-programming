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
		int num=1; //줄 번호
		//불러올 파일 경로 + 이름
		String inFname = "C:\\Users\\doqtq\\Documents\\절대JAVA\\Chapter11\\src\\Chapter11_1\\MyClass.java";
		// 새로 만들 파일 경로 + 이름
		String outFname = "C:\\Users\\doqtq\\Documents\\절대JAVA\\Chapter11\\src\\Chapter11_1\\MyNum.java";
		try {
			// 읽을 파일 이름으로 FileInputStream 생성
			FileInputStream fis = new FileInputStream(inFname);
			FileOutputStream fout = new FileOutputStream(outFname);
			// 인코딩을 위해
			InputStreamReader isr = new InputStreamReader(fis, "MS949");
			OutputStreamWriter osw = new OutputStreamWriter(fout, "MS949");
			while((data = isr.read())!= -1) {
				char c = (char)data;
				if(num==1) { // 첫 번째 줄에 번호를 매기 위한 예외 처리 
					osw.write(num+++" ");
				}
				osw.write(c);
				if(c=='\n') {
					osw.write(num+++" ");
				}
			}
			osw.flush();//OutputStreamWriter의 버퍼를 비운다. (출력한다.) 
			isr.close();
			osw.close();
			fis.close();
			fout.close();
			System.out.println(outFname+" : 파일이 생성되었습니다.");
		} catch(FileNotFoundException e) {
			System.err.println("다음 파일이 없습니다. : "+inFname);
		} catch(IOException e) {
			System.out.println(e);
		}
	}

}