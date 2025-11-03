package ex02;

interface HowLong3 {
	int len(String s);
}

public class OneParamAndReturn3 {
	
	public static void main(String[] args) {
		
		HowLong3 hl = s -> s.length();
		System.out.println(hl.len("happy"));
		
	}

}
