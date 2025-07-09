package Project_Calculator;

import lv2.Calculate;

import java.util.ArrayList;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        int result1;
        String text1 = "";

        Scanner scanner = new Scanner(System.in);
        Calculate calculate = new Calculate();

        //정수 입력 받기
        while (!text1.equals("exit")) {
            System.out.print("첫번째 숫자를 입력하세요: ");
            int input1 = scanner.nextInt();

            System.out.print("+,-,*,/ 중 하나를 입력하세요: ");
            String sign1 = scanner.next();

            System.out.print("두번째 숫자를 입력하세요: ");
            int input2 = scanner.nextInt();

            //사칙연산 시작
            if (sign1.equals("+")) {
                result1 = calculate.sum(input1, input2);
                System.out.println("결과 : " + result1);
            } else if (sign1.equals("-")) {
                result1 = calculate.sub(input1, input2);
                System.out.println("결과 : " + result1);
            } else if (sign1.equals("*")) {
                result1 = calculate.mult(input1, input2);
                System.out.println("결과 : " + result1);
            } else if (sign1.equals("/")) {
                if (input2 == 0) {
                    System.out.println("***분모(두번째 정수) 부분에 0은 입력될 수 없습니다***");
                } else {
                    result1 = calculate.div(input1, input2);
                    System.out.println("결과 : " + result1);
                }
            } else System.out.println("사칙연산 기호를 잘 못 입력하셨습니다!!");


            System.out.print(" 계속 반복 하시겠습니까? (종료하려면 exit)");
            text1 = scanner.next();
        }
    }
}
