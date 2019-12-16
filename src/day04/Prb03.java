package day04;


//주어진 문자열 배열을 생성하여 
//배열의 내용을 역순으로 출력하할 수 있도록 
//main 메서드를 작성하세요. 
//
//-	문자열 배열의 내용을 역순으로 출력하되 각 문자열 또한 역순으로 출력한다.
//-	입력으로 주어진 문자열 배열의 예 :
//{ "Java Programming" , "JDBC", "Oracle10g", "JSP/Servlet" }
//
//처리 결과의 예 : 아래 참고.
//gnimmargorP avaJ
//CBDJ
//g01elcarO
//telvreS/PSJ
public class Prb03 {
	public static void main(String[] args) {
		String[] strData = { "Java Programming", "JDBC", "Oracle10g", "JSP/Servlet" };
		for (int i = strData.length - 1; i >= 0; i--) {
			for (int j = strData[i].length() - 1; j >= 0; j--) {
				System.out.print(strData[i].charAt(j));
			}
			System.out.println();
		}
	}
}
