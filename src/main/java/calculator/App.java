package calculator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        List<Double> circle = new ArrayList<>();
        Calculator abc = new Calculator();
        Calculator abc2 = new Calculator(circle);

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("(1을 누르면 원의 넓이를 구하는 계산기가 실행됩니다.) , " +
                    "(2를 누르면 사칙연산을 해주는 계산기가 실행됩니다. )");
            int choose = sc.nextInt();
            if (choose == 1) {
                System.out.println("원의 반지름을 입력하세요 : ");
                int num3 = sc.nextInt();
                System.out.println("원의 반지름을 입력하세요 : ");
                int num4 = sc.nextInt();
                if (num3 != num4) {
                    System.out.println("반지름은 같아야합니다. 다시 입력해주세요");
                } else {
                    System.out.println("원의 넓이 : " + abc2.calculateCircleArea(num3, num4));
                    System.out.println("저장된 원의 넓이 값들 : " + abc2.getCirResults());
                }
            } else {
                System.out.print("첫번째 숫자를 입력하세요 : ");
                int num1 = sc.nextInt();
                System.out.print("두번째 숫자를 입력하세요 : ");
                int num2 = sc.nextInt();
                System.out.print("사칙연산 기호를 입력하세요 : ");
                String operator = sc.next();


                sc.nextLine();
                System.out.println("결과: " + abc.calculate(num1, num2, operator));
                System.out.println("가장 먼저 저장된 연산 결과를 삭제 하시겠습니까?  (remove 입력시 삭제)");
                String str2 = sc.nextLine();

                if (str2.equals("remove")) {
                    abc.removeResult();
                }
                System.out.println("저장된 연산결과를 조회하시겠습니까? (inquiry 입력시 조회)");
                String str3 = sc.nextLine();
                if (str3.equals("inquiry")) {
                    abc.inquiryResults();
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
