package Chapter6_4;


public class Chapter6_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee r = new Regular("이순신",35,"서울","인사부");
		Employee t = new Temporary("장보고", 25, "인천", "경리부");
		r.setSalary(5000000);
		r.printInfo();
		t.setWorkHours(120);
		t.printInfo();
	}

}
