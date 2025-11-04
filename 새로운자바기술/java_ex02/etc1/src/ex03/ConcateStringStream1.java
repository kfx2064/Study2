package ex03;

import java.util.stream.Stream;

public class ConcateStringStream1 {
    public static void main(String[] args) {
        Stream<String> ss1 = Stream.of("Cake", "Milk");
        Stream<String> ss2 = Stream.of("Lemon", "Jelly");

        Stream.concat(ss1, ss2).forEach(s -> System.out.println(s));
    }
}
