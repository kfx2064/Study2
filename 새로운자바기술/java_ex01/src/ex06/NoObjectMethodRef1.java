package ex06;

import java.util.function.ToIntBiFunction;

class IBox1 {
    private int n;
    public IBox1(int i) {
        n = i;
    }
    public int larger(IBox1 b) {
        if (n > b.n) {
            return n;
        } else {
            return b.n;
        }
    }
}

public class NoObjectMethodRef1 {
    public static void main(String[] args) {
        IBox1 ib1 = new IBox1(5);
        IBox1 ib2 = new IBox1(7);

        ToIntBiFunction<IBox1, IBox1> bf = (b1, b2) -> b1.larger(b2);
        int bigNum = bf.applyAsInt(ib1, ib2);
        System.out.println(bigNum);
    }
}
