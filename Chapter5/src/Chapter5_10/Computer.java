package Chapter5_10;

public class Computer {
	public String[] osType = {"����7", "���� OS X", "�ȵ���̵�"};
	int name;
	int memory;
	Computer(int name, int memory){
		this.name = name;
		this.memory = memory;
	}
	public void print() {
		System.out.println("�ü�� : "+osType[this.name]+", ���θ޸� : "+this.memory);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Computer pc = new Computer(0, 16);
		Computer apple = new Computer(1, 32);
		Computer galaxy = new Computer(2, 16);
		pc.print();
		apple.print();
		galaxy.print();
	}

}
