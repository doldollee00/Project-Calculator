package Project_Calculator;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        int result = 0;
        String text1 = "";

        Scanner number = new Scanner(System.in);
        Scanner sign = new Scanner(System.in);
        Scanner text = new Scanner(System.in);

        //정수 입력 받기
        while (!text1.equals("exit")) {
            System.out.print("첫번째 숫자를 입력하세요: ");
            int input1 = number.nextInt();

            System.out.print("+,-,*,/ 중 하나를 입력하세요: ");
            String sign1 = sign.next();

            System.out.print("두번째 숫자를 입력하세요: ");
            int input2 = number.nextInt();

            //사칙연산 시작
            if (sign1.equals("+")) {
                result = input1 + input2;
                System.out.println("결과 : " + result);
            } else if (sign1.equals("-")) {
                result = input1 - input2;
                System.out.println("결과 : " + result);
            } else if (sign1.equals("*")) {
                result = input1 * input2;
                System.out.println("결과 : " + result);
            } else if (sign1.equals("/")) {
                if (input2 == 0) {
                    System.out.println("***분모(두번째 정수) 부분에 0은 입력될 수 없습니다***");
                } else {
                    result = input1 / input2;
                    System.out.println("결과 : " + result);
                }
            } else System.out.println("사직연산 기호를 잘 못 입력하셨습니다!!");

            System.out.print(" 계속 반복 하시겠습니까? (종료하려면 exit)");
            text1 = text.next();

        }
    }
}
