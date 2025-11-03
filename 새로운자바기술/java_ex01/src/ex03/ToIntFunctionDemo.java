package ex03;

import java.util.function.ToIntFunction;

public class ToIntFunctionDemo {

    public static void main(String[] args) {
        ToIntFunction<String> f = s -> s.length();
        System.out.println(f.applyAsInt("Robot"));
        System.out.println(f.applyAsInt("System"));
    }

}
