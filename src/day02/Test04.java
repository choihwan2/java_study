package day02;

public class Test04 {

	public static void main(String[] args) {
		int num = 100;
		num = num + 20;

		int i = 99, j = 77;
		System.out.println(num);
		System.out.printf("i = %d j = %d %n", i, j);
		int temp = 0;
		temp = i;
		i = j;
		j = temp;
		System.out.printf("i = %d j = %d %n", i, j);

		System.out.println("--------------");

		char c1 = 'C', c2 = 'W';
		char temp2 = c1;
		System.out.printf("c1 = %c c2 = %c %n", c1, c2);
		c1 = c2;
		c2 = temp2;
		System.out.printf("c1 = %c c2 = %c %n", c1, c2);
		System.out.println("--------------");
		
		String s1 = "hello", s2 = "java";
		System.out.printf("s1 = %s s2 = sc %n", s1, s2);
		String temp3 = s1;
		s1 = s2;
		s2 = temp3;
		System.out.printf("s1 = %s s2 = %s", s1, s2);
		

	}

}
