package Chapter5_1;

public class Student {
	String department;
	int class_num;
	Student(String d, int c){
		department=d;
		class_num=c;
	}
	public void print() {
		System.out.println("�а� : "+department);
		System.out.println("�й� : "+class_num);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = new Student("������Ű��а�",20150000);
		s.print();
	}

}
