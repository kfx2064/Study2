package ex02;

interface HowLong2 {
	int len(String s);
}

public class OneParamAndReturn2 {

	public static void main(String[] args) {
		
		HowLong2 hl = s -> s.length();
		System.out.println(hl.len("happy"));
		
	}
	
}
