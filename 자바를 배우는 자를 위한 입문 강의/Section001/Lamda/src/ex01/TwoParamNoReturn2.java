package ex01;

interface Calculate2 {
	void cal(int a, int b);
}

public class TwoParamNoReturn2 {

	public static void main(String[] args) {
		
		Calculate2 c;
		c = (a, b) -> System.out.println(a + b);
		c.cal(4, 3);
		
		c = (a, b) -> System.out.println(a - b);
		c.cal(4, 3);
		
		c = (a, b) -> System.out.println(a * b);
		c.cal(4, 3);
		
	}
	
}
