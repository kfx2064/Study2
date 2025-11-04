package ex04;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

class ReportCard1 {
    private int kor;
    private int eng;
    private int math;

    public ReportCard1(int k, int e, int m) {
        kor = k;
        eng = e;
        math = m;
    }

    public int getKor() {
        return kor;
    }

    public int getEng() {
        return eng;
    }

    public int getMath() {
        return math;
    }
}

public class GradeAverage1 {
    public static void main(String[] args) {
        ReportCard1[] cards = {
                new ReportCard1(70, 80, 90),
                new ReportCard1(90, 80, 70),
                new ReportCard1(80, 80, 80)
        };

        Stream<ReportCard1> sr = Arrays.stream(cards);

        IntStream si = sr.flatMapToInt(
                r -> IntStream.of(r.getKor(), r.getEng(), r.getMath())
        );

        double avg = si.average().getAsDouble();
        System.out.println("avg. " + avg);
    }
}
