package Chapter11_4;

import java.io.File;

public class Chapter11_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path = "C:\\Users\\doqtq\\Documents\\Àý´ëJAVA\\Chapter11\\src\\Chapter11_4";
		File f = new File(path,args[0]);
		try {
			f.mkdir();
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}
