package Chapter6_4;


public class Chapter6_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee r = new Regular("�̼���",35,"����","�λ��");
		Employee t = new Temporary("�庸��", 25, "��õ", "�渮��");
		r.setSalary(5000000);
		r.printInfo();
		t.setWorkHours(120);
		t.printInfo();
	}

}
