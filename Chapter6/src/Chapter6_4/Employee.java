package Chapter6_4;

public class Employee {
	String name; // �̸�
	int age; // ����
	String address; // �ּ�
	String department; //�μ�
	int salary; // ����
	
	// ������
	Employee(String name, int age, String address, String department){
		this.name = name;
		this.age = age;
		this.address = address;
		this.department = department;
	}
	
	// ��� �Լ�
	public void printInfo() {
		System.out.println("�̸� : "+name);
		System.out.println("���� : "+age);
		System.out.println("�ּ� : "+address);
		System.out.println("�μ� : "+department);
	}

	public void setSalary(int salary) {
		// ����Ŭ�������� ����
	}

	public void setWorkHours(int workhour) {
		// ����Ŭ�������� ����
	}
}
