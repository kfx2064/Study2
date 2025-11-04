package ex04;

import java.util.function.ObjIntConsumer;

public class ObjIntConsumerDemo {
    public static void main(String[] args) {
        ObjIntConsumer<String> c = (s, i) -> System.out.println(i + ". " + s);

        int n = 1;
        c.accept("Toy", n++);
        c.accept("Candy", n++);
        c.accept("Book", n);
    }
}
