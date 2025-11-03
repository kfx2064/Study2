package ex01;

interface Printable2 {
	void print(String s);
}

public class OneParamNoReturn02 {

	public static void main(String[] args) {
		
		Printable2 p;
		p = (String s) -> { System.out.println(s); };
		p.print("Lambda exp one.");
		
		p = (String s) -> System.out.println(s);
		p.print("Lambda exp two.");
		
		p = (s) -> System.out.println(s);
		p.print("Lambda exp three.");
		
		p = s -> System.out.println(s);
		p.print("Lambda exp four.");
		
	}
	
}
