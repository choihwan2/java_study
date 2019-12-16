package Prob5;

public class Prob6 {

	public static void main(String[] args) {
		Person[] persons = { new Student("홍길동", 20, 200201), new Teacher("이순신", 30, "JAVA"),
				new Employee("유관순", 40, "교무과") };
		System.out.println("[출력값]");
		for (Person person : persons) {
			if (person instanceof Student) {
				((Student) person).print();
			}
			if (person instanceof Employee) {
				((Employee) person).print();
			}
			if (person instanceof Teacher) {
				((Teacher) person).print();
			}
		}
//		for (Person person : persons) {
//			person.print();
//		}
	}

}
