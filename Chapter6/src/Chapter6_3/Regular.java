package Chapter6_3;

public class Regular extends Employee{
	
	// 생성자
	Regular(String name, int age, String address, String department) {
		// 상위 생성자 호출
		super(name, age, address, department);
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public void printInfo() {
		super.printInfo();
		System.out.println("졍규직");
		System.out.println("월급 : "+salary);
		System.out.println();
	}

}
