package Chapter8_7;

import java.util.Date;

public class PrintTime implements Runnable{
	int num; // 반복횟수
	Date now;
	public PrintTime(int num) {
		this.num = num;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			for(int i=0;i<num;i++) {
				now = new Date();
				Thread.sleep(1000); // 딜레이를 주기 위해
				System.out.println("순위: "+Thread.currentThread().getPriority()+
						" "+now+" "+Thread.currentThread().getName());
			}
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}

}
