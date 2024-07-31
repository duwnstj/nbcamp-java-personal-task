package calculator;

import java.util.List;

public class ArithmeticCalculator extends Calculator {
    //포함관계를 어떻게 나타내냐? ArithmeticCalculator 클래스의 필드로 선언해준다.
    // 지금 이 상태에서 오류가 나는 이유는 final로 선언을 하면 객체를 생성할떄 반드시 초기화를 해주어야한다.
    //  public ArithmeticCalculator(List<Double> results) {
    //        super(results);
    //    }
    // 이 녀석이 있기 때문에 초기화가 중복되서 안됐던 것이다.


    // 생성자로 초기화
    public ArithmeticCalculator(List<Double> results) {
        super(results);
    }


    public double calculate(int a, int b, String c) {
        return operatorFactory(c).operate(a, b);
    }

    private Operator operatorFactory(String operator) {
        return switch (operator) {
            //이렇게 생성하면 안좋은 점이 operator가 해당하는 값일 때
            // 계속 객체를 만든다는 점이다.
            // 메모리 측면에서는 좋지 않다.
            case "+" -> new AddOperator();
            case "-" -> new SubstractorOperator();
            case "*" -> new MultiplyOperator();
            case "/" -> new DivideOperator();
            case "%" -> new ModOperator();
            default -> throw new UnsupportedOperationException("올바른 선택이 아닙니다.");
        };
    }

    @Override
    public void inquiryResults() {
        for (Double result1 : super.getResults()) {
            System.out.print("(" + result1 + ")");
        }
    }

}
