package calculator;

import java.util.List;

public class ArithmeticCalculator extends Calculator {
    //포함관계를 어떻게 나타내냐? ArithmeticCalculator 클래스의 필드로 선언해준다.
    // 지금 이 상태에서 오류가 나는 이유는 final로 선언을 하면 객체를 생성할떄 반드시 초기화를 해주어야한다.
    //  public ArithmeticCalculator(List<Double> results) {
    //        super(results);
    //    }
    // 이 녀석이 있기 때문에 초기화가 중복되서 안됐던 것이다.
    private final AddOperator addOperator;

    private final SubstractorOperator substractorOperator;

    private final MultiplyOperator multiplyOperator;

    private final DivideOperator divideOperator;

    // 생성자로 초기화
    public ArithmeticCalculator(List<Double> results, AddOperator addOperator, SubstractorOperator substractorOperator,
                                MultiplyOperator multiplyOperator, DivideOperator divideOperator) {
        super(results);
        this.addOperator = addOperator;
        this.substractorOperator = substractorOperator;
        this.multiplyOperator = multiplyOperator;
        this.divideOperator = divideOperator;
    }


    public double calculate(int a, int b, String c) {
        int result = 0;
        try {

            if (c.equals("+")) {
                result = addOperator.operate(a, b);

            } else if (c.equals("-")) {
                result = substractorOperator.operate(a, b);

            } else if (c.equals("*")) {
                result = multiplyOperator.operate(a, b);

            } else if (c.equals("/")) {
                result = divideOperator.operate(a, b);

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
