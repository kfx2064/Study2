package ex08;

import java.util.Optional;

public class OptionalBase1 {
    public static void main(String[] args) {
        Optional<Integer> oi1 = Optional.of(3);
        Optional<Integer> oi2 = Optional.empty();

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
