package ex10;

import java.util.stream.IntStream;

public class OpIntStream {
    public static void main(String[] args) {
        int sum = IntStream.of(1, 3, 5, 7, 9)
                .sum();
        System.out.println("sum = " + sum);

        long cnt = IntStream.of(1, 3, 5, 7, 9)
                .count();
        System.out.println("count = " + cnt);

        IntStream.of(1, 3, 5, 7, 9)
                .average()
                .ifPresent(av -> System.out.println("avg = " + av));

        IntStream.of(1, 3, 5, 7, 9)
                .min()
                .ifPresent(mn -> System.out.println("min = " + mn));

        IntStream.of(1, 3, 5, 7,  9)
                .max()
                .ifPresent(mx -> System.out.println("max = " + mx));
    }
}
