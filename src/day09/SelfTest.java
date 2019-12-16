package day09;

public class SelfTest {
	public static void main(String[] args) {
		String namestString = "hwan";
		Lamdable lamdable = name -> {
			System.out.println("chapchap");
			System.out.println(name);
		};
		lamdable.lam(namestString);
	}
}

interface Lamdable {
	void lam(String name);

}