package ex07;

import java.time.LocalDate;

public class LocalDateDemo1 {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        System.out.println("Today : " + today);

        LocalDate xmas = LocalDate.of(today.getYear(), 12, 25);

        LocalDate eve = xmas.minusDays(1);
        System.out.println("Xmax Eve : " + eve);
    }
}
