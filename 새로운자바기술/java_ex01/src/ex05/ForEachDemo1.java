package ex05;

import java.util.Arrays;
import java.util.List;

public class ForEachDemo1 {
    public static void main(String[] args) {
        List<String> ls = Arrays.asList("Box", "Robot");
        ls.forEach(s -> System.out.println(s));
        ls.forEach(System.out::println);
    }
}
