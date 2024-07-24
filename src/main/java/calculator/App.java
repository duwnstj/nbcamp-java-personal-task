package calculator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        List<Integer> calculationResult = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("첫번째 숫자를 입력하세요 : ");
            int a = sc.nextInt();
            System.out.print("두번째 숫자를 입력하세요 : ");
            int b = sc.nextInt();
            System.out.print("사칙연산 기호를 입력하세요 : ");
            String c = sc.next();
            int result = 0;


            switch (c) {
                case "+":
                    result = a + b;
                    System.out.println("결과: " + result);
                    break;
                case "-":
                    result = a - b;
                    System.out.println("결과: " + result);
                    break;
                case "*":
                    result = a * b;
                    System.out.println("결과: " + result);
                    break;
                case "/":
                    if (b == 0) {
                        System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
                    } else {
                        System.out.println("결과: " + result);
                    }
                    result = a / b;
                    break;
                case "%":
                    result = a % b;
                    System.out.println("결과: " + result);
                    break;
                default:
                    System.out.println("사칙연산을 다시 입력해주세요");
                    break;
            }
            calculationResult.add(result);
            System.out.println(calculationResult.toString());
            sc.nextLine();
            System.out.println("가장 먼저 저장된 연산 결과를 삭제 하시겠습니까?  (remove 입력시 삭제)");
            String str2 = sc.nextLine();
            if (str2.equals("remove")) {
                calculationResult.remove(0);
            }
            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            String src = sc.nextLine();

            if (src.equals("exit")) {
                break;
            }
        }

    }
}




