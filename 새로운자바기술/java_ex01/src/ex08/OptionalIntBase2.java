package ex08;

import java.util.OptionalInt;

public class OptionalIntBase2 {
    public static void main(String[] args) {
        OptionalInt oi1 = OptionalInt.of(3);
        OptionalInt oi2 = OptionalInt.empty();

        System.out.println("[Step 1.] : ");
        oi1.ifPresent(i -> System.out.println(i + "\t"));
        oi2.ifPresent(i -> System.out.println(i));
        System.out.println();

        System.out.println("[Step 2.] : ");
        System.out.println(oi1.orElse(100) + "\t");
        System.out.println(oi2.orElse(100) + "\t");
        System.out.println();
    }
}
