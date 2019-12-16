package day07;

public class Test05 {
	public static void main(String[] args) {
		Animal[] animals = { new Dog("진돗개", "퀘리"), new Fish("쿠피"), new Fish("붕붕이"), new Dog("댕댕이", "낑깡") };
		
		for (Animal animal : animals) {
			if(animal instanceof Dog) {
				((Dog) animal).print();
			}
			if(animal instanceof Fish) {
				((Fish) animal).print();
			}
			animal.breath();
		}
		
	}
}
