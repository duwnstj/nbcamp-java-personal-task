package calculator;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        List<Integer> calculationResult = new ArrayList<>();
        int count = 0;
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
            for (int i = 0; i < calculationResult.size(); i++) {
                calculationResult.add(result);
                if (count > 10) {
                    calculationResult.remove(0);
                    calculationResult.add(result);
                }

            }
            count++;
            System.out.println("count : " + count);

            sc.nextLine();
            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            String src = sc.nextLine();

            if (src.equals("exit")) {
                break;
            }


        }
    }
}


