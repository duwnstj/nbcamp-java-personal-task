package calculator;

import java.util.ArrayList;
import java.util.List;

public class Calculator {

    List<Integer> results = new ArrayList<>();

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
}
