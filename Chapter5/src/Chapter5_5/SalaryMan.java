package Chapter5_5;

public class SalaryMan {
	int salary;
	SalaryMan(){ 
		salary = 1000000;
	}
	SalaryMan(int salary){ // 생성자 오버로딩
		this.salary=salary;
	}
	public int getAnnualGross() { // 연봉반환 메소드
		return salary*12+salary*5;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new SalaryMan().getAnnualGross());
		System.out.println(new SalaryMan(2_000_000).getAnnualGross());
	}

}
