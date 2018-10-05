package Chapter11_5;

import java.io.File;

public class Rename {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 입력받는 파일들은 txt라고 가정
		String path = "C:\\Users\\doqtq\\Documents\\절대JAVA\\Chapter11\\src\\Chapter11_5";
		File file = new File(path,args[0]+".txt");
		File newfile = new File(path,args[1]+".txt");
		if(file.exists()) {
			file.renameTo(newfile); // 새로운 이름으로 수정
			System.out.println(args[0]+"->"+args[1]);
		} else {
			System.out.println(args[0]+".txt라는 이름의 파일이 존재하지 않습니다.");
		}
	}

}
