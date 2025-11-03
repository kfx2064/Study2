package ex03;

import java.util.Random;

interface Generator1 {
	int rand();
}

public class NoParamAndReturn {

	public static void main(String[] args) {
		
		Generator1 gen = () -> {
			Random rand = new Random();
			return rand.nextInt(50);
		};
		
		System.out.println(gen.rand());
		
	}
	
}
