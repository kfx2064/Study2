package ex09;

import java.util.Arrays;

public class StringStream4 {
    public static void main(String[] args) {
        String[] names = {"YOON", "LEE", "PARK"};
        Arrays.stream(names).forEach(s -> System.out.println(s));
    }
}
