package Chapter11_3;

import java.io.File;

public class Chapter11_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "C:\\Users\\doqtq\\Documents\\절대JAVA\\Chapter11\\src\\Chapter11_3";
		File f = new File(name);
		File[] flist = f.listFiles();
		for(File i : flist) {
			if(i.isDirectory()) { // 디렉터리 이면
				System.out.print("폴더 : ");
			} else { // 디렉터리가 아니면(파일이면)
				System.out.print("파일 : ");
			}
			System.out.println(i.getName());
		}
	}

}
