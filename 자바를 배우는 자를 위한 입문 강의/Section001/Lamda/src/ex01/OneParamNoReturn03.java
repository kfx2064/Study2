package ex01;

interface Printable3 {
	void print(String s);
}

public class OneParamNoReturn03 {
	
	public static void main(String[] args) {
		
		Printable p;
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
