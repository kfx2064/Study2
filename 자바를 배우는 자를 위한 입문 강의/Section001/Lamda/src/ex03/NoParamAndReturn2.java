package ex03;

import java.util.Random;

interface Generator2 {
	int rand();
}

public class NoParamAndReturn2 {

	public static void main(String[] args) {
		
		Generator2 gen = () -> {
			Random  rand = new Random();
			return rand.nextInt(50);
		};
		
		System.out.println(gen.rand());
		
	}
	
}
