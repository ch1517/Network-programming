package Chapter5_1;

public class Student {
	String department;
	int class_num;
	Student(String d, int c){
		department=d;
		class_num=c;
	}
	public void print() {
		System.out.println("학과 : "+department);
		System.out.println("학번 : "+class_num);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = new Student("정보통신공학과",20150000);
		s.print();
	}

}
