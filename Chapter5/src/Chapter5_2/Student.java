package Chapter5_2;

public class Student {
	private String department;
	private int class_num;
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public int getClass_num() {
		return class_num;
	}
	public void setClass_num(int class_num) {
		this.class_num = class_num;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = new Student();
		s.setDepartment("정보통신공학과");
		s.setClass_num(20150000);
		System.out.println("학과 : "+s.getDepartment());
		System.out.println("학번 : "+s.getClass_num());
	}

}
