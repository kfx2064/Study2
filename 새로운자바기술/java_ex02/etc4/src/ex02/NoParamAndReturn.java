package ex02;

import com.sun.security.jgss.GSSUtil;

import java.util.Random;

interface Generator {
    int rand();
}

public class NoParamAndReturn {
    public static void main(String[] args) {
        Generator gen = () -> {
            Random rand = new Random();
            return rand.nextInt(50);
        };

        System.out.println(gen.rand());
    }
}
