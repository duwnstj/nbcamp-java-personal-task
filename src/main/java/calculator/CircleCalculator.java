package calculator;

import java.util.List;

public class CircleCalculator extends Calculator {
    //원의 넓이를 구하는 메서드


    public CircleCalculator(List<Double> results) {
        super(results);
    }


    public double calculate(int radius) {


        return circumference * radius * radius;

    }

    @Override
    public void inquiryResults() {
        for (Double cirResults : super.getResults()) {
            System.out.println("원의 넓이 : " + cirResults);
        }
    }

    @Override
    public List<Double> getResults() {
        return super.getResults();
    }
}
