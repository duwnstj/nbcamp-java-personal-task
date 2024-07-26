package calculator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Calculator abc = new Calculator();

        Scanner sc = new Scanner(System.in);

        while (true) {
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
