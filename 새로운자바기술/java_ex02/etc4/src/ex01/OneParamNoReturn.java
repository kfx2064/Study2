package ex01;

interface Printable {
    void print(String s);
}

public class OneParamNoReturn {
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
