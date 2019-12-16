package Prob5;

public class Student extends Person {
	private int id;

	public Student() {
	}

	public Student(String name, int age, int id) {
		super(name,age);
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}



	public void print() {
		System.out.printf("이  름 : %s	나이: %-5d학번 :%d%n", this.getName(), this.getAge(), id);
	}

}
