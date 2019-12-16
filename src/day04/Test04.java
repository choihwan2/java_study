package day04;

public class Test04 {

	public static void main(String[] args) {
		int eng[] = new int[] { 90, 30, 40, 50, 60 };

		eng[0] = 99;
		eng[1] = 88;
		eng[2] = 33;
		eng[3] = 11;
		eng[4] = 66;
		double sum = 0;
		double avg = 0;
		for (int i : eng) {
			sum += i;
		}
		avg = sum / eng.length;
		System.out.println(avg);

		String[] names = new String[5];
		names[0] = "최환";
		names[1] = "송영재";
		names[2] = "조규창";
		names[3] = "이진호";
		names[4] = "";
		for (String string : names) {
			if(string != null && string.length() > 0)
			System.out.print(string.charAt(0) + "** ");
		}
	}
}
