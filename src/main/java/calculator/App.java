package calculator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        // 생성자를 통해 새로 ArrayList 리스트를 만들어 초기화 할 수 있다.
        // 오류가 나는 이유는 생성자 매개변수가 서로 다르기 때문이다 . 매개변수의 개수를 맞춰줘야한다.
        ArithmeticCalculator arithmeticCalculator = new ArithmeticCalculator(
                new ArrayList<>(),
                new AddOperator(),
                new SubstractorOperator(),
                new MultiplyOperator(),
                new DivideOperator()
        );
        CircleCalculator circleCalculator = new CircleCalculator(new ArrayList<>());

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("(1을 누르면 원의 넓이를 구하는 계산기가 실행됩니다.) , " +
                    "(2를 누르면 사칙연산을 해주는 계산기가 실행됩니다. )");
            int choose = sc.nextInt();
            if (choose == 1) {
                System.out.println("원의 반지름을 입력하세요 : ");
                int radius = sc.nextInt();

                double area = circleCalculator.calculate(radius);
                circleCalculator.getResults().add(area);
                System.out.println("저장된 원의 넓이 전체 조회 : ");
                circleCalculator.inquiryResults();
            } else if (choose == 2) {
                System.out.print("첫번째 숫자를 입력하세요 : ");
                int num1 = sc.nextInt();
                System.out.print("두번째 숫자를 입력하세요 : ");
                int num2 = sc.nextInt();
                System.out.print("사칙연산 기호를 입력하세요 : ");
                String operator = sc.next();


                sc.nextLine();
                double result = arithmeticCalculator.calculate(num1, num2, operator);
                arithmeticCalculator.getResults().add(result);
                System.out.println("가장 먼저 저장된 연산 결과를 삭제 하시겠습니까?  (remove 입력시 삭제)");
                String str2 = sc.nextLine();

                if (str2.equals("remove")) {
                    arithmeticCalculator.removeResult(0);
                }
                System.out.println("저장된 연산결과를 조회하시겠습니까? (inquiry 입력시 조회)");
                String str3 = sc.nextLine();
                if (str3.equals("inquiry")) {
                    arithmeticCalculator.inquiryResults();
                    System.out.println();
                }
                System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
                String src = sc.nextLine();

                if (src.equals("exit")) {
                    break;
                }
            }
        }
    }
}
