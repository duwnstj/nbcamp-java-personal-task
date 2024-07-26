package calculator;

import java.util.ArrayList;
import java.util.List;

public class Calculator {
    static final double circumference = 3.14;
    // 사칙 연산을 할 때는 원주율의 값이 필요가 없기 때문에 static을 사용하여 클래스 멤버로 만들어준다.
    // 원주율의 값인 3.14는 절대 바뀌지 않는 상수이기때문에 final을 사용해준다.
    private List<Double> cirResults;
    private List<Integer> results;


    public Calculator() {
        this.results = new ArrayList<>();
    }

    public Calculator(List<Double> cirResults) {
        this.cirResults = cirResults;
    }

    public double calculateCircleArea(int r1, int r2) {

        double result2 = r1 * r2 * circumference;
        cirResults.add(result2);
        return result2;
    }

    public int calculate(int a, int b, String c) {
        int result = 0;
        try {

            if (c.equals("+")) {
                result = a + b;
                results.add(result);
            } else if (c.equals("-")) {
                result = a - b;
                results.add(result);
            } else if (c.equals("*")) {
                result = a * b;
                results.add(result);
            } else if (c.equals("/")) {
                result = a / b;
                results.add(result);
            } else if (c.equals("%")) {
                result = a % b;
                results.add(result);
            } else {
                System.out.println("잘못된 사칙연산을 입력했어요");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    public void removeResult() {
        results.remove(0);
    }

    public void inquiryResults() {
        for (int result1 : results) {
            System.out.print("(" + result1 + ")");
        }
    }

    public List<Integer> getResults() {

        return results;
    }

    public void setResults(List<Integer> results) {
        this.results = results;
    }

    public List<Double> getCirResults() {

        return cirResults;
    }

    public void setCirResults(List<Double> cirResults) {
        this.cirResults = cirResults;
    }
}
