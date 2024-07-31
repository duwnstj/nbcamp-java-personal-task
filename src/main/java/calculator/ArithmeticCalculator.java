package calculator;

import java.util.List;

public class ArithmeticCalculator extends Calculator {

    public ArithmeticCalculator(List<Double> results) {
        super(results);
    }


    public double calculate(int a, int b, String c) {
        int result = 0;
        try {

            if (c.equals("+")) {
                result = a + b;

            } else if (c.equals("-")) {
                result = a - b;

            } else if (c.equals("*")) {
                result = a * b;

            } else if (c.equals("/")) {
                result = a / b;

            } else if (c.equals("%")) {
                result = a % b;

            } else {
                System.out.println("잘못된 사칙연산을 입력했어요");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    @Override
    public void inquiryResults() {
        for (Double result1 : super.getResults()) {
            System.out.print("(" + result1 + ")");
        }
    }

}
