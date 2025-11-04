package ex01;

interface Calculate {
    void cal(int a, int b);
}

public class TwoParamNoReturn {
    public static void main(String[] args) {
        Calculate c;
        c = (a, b) -> System.out.println(a + b);
        c.cal(4, 3);

        c = (a, b) -> System.out.println(a - b);
        c.cal(4, 3);

        c = (a, b) -> System.out.println(a * b);
        c.cal(4, 3);
    }
}
