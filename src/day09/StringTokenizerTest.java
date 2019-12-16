package day09;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class StringTokenizerTest {

	public static void main(String[] args) {
		Scanner b = null;
		try {
			b = new Scanner(new File("StringTokenizer.txt"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		while (b.hasNextLine()) {
			String bString = b.nextLine();
			StringTokenizer str = new StringTokenizer(bString, " !", true);
			while (str.hasMoreTokens()) {
				System.out.println(str.nextToken());
			}
		}

	}
	/*
	 * 구분자의 default 값은 공백으로, 구분자를 입력하지 않으면 공백에서 끊어준다. String phoneNum =
	 * "TEL 82-02-997-2059"; StringTokenizer str1 = new StringTokenizer(phoneNum);
	 * while(str1.hasMoreTokens()) System.out.println(str1.nextToken());
	 * 
	 * 공백과 구분자를 모두 토큰으로 사용할 수 있다. StringTokenizer str2 = new
	 * StringTokenizer(phoneNum, " -"); while(str2.hasMoreTokens())
	 * System.out.println(str2.nextToken());
	 * 
	 * 
	 * boolean과 함께 쓸 경우, true일때는 구분자를 포함, false일때는 구분자를 제외하고 출력한다. String javaCode =
	 * "num+=1";
	 * 
	 * StringTokenizer str3 = new StringTokenizer(javaCode, "+=", true);
	 * while(str3.hasMoreTokens()) System.out.println(str3.nextToken());
	 * 
	 * StringTokenizer str4 = new StringTokenizer(javaCode, "+=", false);
	 * while(str4.hasMoreTokens()) System.out.println(str4.nextToken());
	 */
}
