package ex02;

interface HowLong {
	int len(String s);
}

public class OneParamAndReturn {
	
	public static void main(String[] args) {
		
		HowLong hl = s -> s.length();
		System.out.println(hl.len("happy."));
		
	}

}
