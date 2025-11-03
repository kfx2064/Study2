package ex02;

import java.util.function.Consumer;

public class ConsumerDemo2 {

    public static void main(String[] args) {
        Consumer<String> c = s -> System.out.println(s);
        c.accept("Pineapple");
        c.accept("Strawberry");
    }

}
