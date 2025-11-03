package ex02;

interface Calculate2 {
	int cal(int a, int b);
}

public class TwoParamAndReturn2 {

	public static void main(String[] args) {
		
		Calculate2 c;
		c = (a, b) -> { return a + b; };
		System.out.println(c.cal(4, 3));
		
		c = (a, b) -> a + b;
		System.out.println(c.cal(4, 3));
		
	}
	
}
