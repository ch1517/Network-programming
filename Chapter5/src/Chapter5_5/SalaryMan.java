package Chapter5_5;

public class SalaryMan {
	int salary;
	SalaryMan(){ 
		salary = 1000000;
	}
	SalaryMan(int salary){ // ������ �����ε�
		this.salary=salary;
	}
	public int getAnnualGross() { // ������ȯ �޼ҵ�
		return salary*12+salary*5;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new SalaryMan().getAnnualGross());
		System.out.println(new SalaryMan(2_000_000).getAnnualGross());
	}

}
