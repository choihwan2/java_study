package day06;

public class Test03 {
	public static void main(String[] args) {
		TV[] tvs = new TV[30];
		for (int i = 0; i < tvs.length; i++) {
			tvs[i] = new TV(); 
			System.out.println(tvs[i]);
		}
		//new TV(); // 템퍼러리한 객체로 만들고 무언가 함수를 호출한후 필요없을때 사용
	}

}

class TV{
	int size = 0;
	String modelString = " ";
	int channel = 0;
	boolean power = false;
	
	public void print() {
		System.out.printf("%d %s %d %b %n", size, modelString, channel, power);;
	}
}
