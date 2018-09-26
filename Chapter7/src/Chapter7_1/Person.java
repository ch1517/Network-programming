package Chapter7_1;

public class Person {
	String name; // ¿Ã∏ß
	Person(String name){
		this.name = name;
	}
	public boolean equals(Person p) {
		if(this.name.equals(p.name)) {
			return true;
		}
		else {
			return false;
		}
	}
}
