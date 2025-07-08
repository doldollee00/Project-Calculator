package lv2;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        int result1 ;
        Calculate calculate = new Calculate();

        Scanner number = new Scanner(System.in);
        Scanner sign = new Scanner(System.in);
        Scanner text = new Scanner(System.in);

        //정수 및 사칙연산 입력 받기
        System.out.print("첫번째 숫자를 입력하세요: ");
        int input1 = number.nextInt();

        System.out.print("+,-,*,/ 중 하나를 입력하세요: ");
        String sign1 = sign.next();

        System.out.print("두번째 숫자를 입력하세요: ");
        int input2 = number.nextInt();

        //사칙연산 구별
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
        } else System.out.println("사직연산 기호를 잘 못 입력하셨습니다!!");
    }
}
