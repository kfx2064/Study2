package ex02;

import java.util.ArrayList;
import java.util.List;

class ToyPriceInfo2 {
    private String model;
    private int price;

    public ToyPriceInfo2(String m, int p) {
        model = m;
        price = p;
    }

    public String getModel() {
        return model;
    }

    public int getPrice() {
        return price;
    }
}

public class ToyStream2 {
    public static void main(String[] args) {
        List<ToyPriceInfo2> ls = new ArrayList<>();
        ls.add(new ToyPriceInfo2("GUN_LR_45", 200));
        ls.add(new ToyPriceInfo2("TEDDY_BEAR_S_014", 350));
        ls.add(new ToyPriceInfo2("CAR_TRANSFORM_VER_7719", 550));

        int sum = ls.stream()
                .filter(p -> p.getPrice() < 500)
                .mapToInt(t -> t.getPrice())
                .sum();

        System.out.println("sum = " + sum);
    }
}
