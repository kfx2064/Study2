package ex06;

import java.util.function.ToIntBiFunction;

class IBox2 {
    private int n;
    public IBox2(int i) {
        n = i;
    }
    public int larger(IBox2 b) {
        if (n > b.n) {
            return n;
        } else {
            return b.n;
        }
    }
}

public class NoObjectMethodRef2 {
    public static void main(String[] args) {
        IBox2 ib1 = new IBox2(5);
        IBox2 ib2 = new IBox2(7);

        ToIntBiFunction<IBox2, IBox2> bf = (b1, b2) -> b1.larger(b2);
        int bigNum = bf.applyAsInt(ib1, ib2);
        System.out.println(bigNum);
    }
}
