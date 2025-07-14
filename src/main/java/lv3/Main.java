package lv3;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int result1;
        String text1 = "";

        Scanner scanner = new Scanner(System.in);
        ArithmeticCalculator<Double> calculate = new ArithmeticCalculator<>();



        //정수 입력 받기

        while (!text1.equals("exit")) {
            System.out.print("첫번째 숫자를 입력하세요: ");
            Double input1 = scanner.nextDouble();

            System.out.print("+,-,*,/ 중 하나를 입력하세요: ");
            String sign1 = scanner.next();

            System.out.print("두번째 숫자를 입력하세요: ");
            Double input2 = scanner.nextDouble();

            Operator operator = Operator.fromSymbol(sign1);  //Operator 연결
            if (operator == null) {
                System.out.println("잘못된 연산자 기호입니다!");
            } else if (operator == Operator.DIV && input2 == 0) {
                System.out.println("0으로 나눌 수 없습니다.");
            } else {
                Double result = calculate.calculator(input1, input2, operator);
                System.out.println("결과: " + result);
            }

            //게터
            ArrayList<Double> resultHome = calculate.getResultHome();
            System.out.println("resutlhome값" + resultHome);

            System.out.print(" 계속 반복 하시겠습니까?(계속(아무값), 종료(exit), 초기화(reset), 맨앞에 값 삭제(rm)");
            text1 = scanner.next();


            //세터를 이용한 결과값 초기화
            if (text1.equals("reset")) {
                ArrayList<Double> newResultHome = new ArrayList<>();
                calculate.setResultHome(newResultHome);
                System.out.println("결과 값들을 초기화 하였습니다." + calculate.getResultHome());
            } else if (text1.equals("rm")) {
                ArrayList<Double> removeResultHome = calculate.removeResultHome();
                calculate.setResultHome(removeResultHome);
                System.out.println("결과 값을 삭제 하였습니다." + calculate.getResultHome());
            }
            //큰 결과값 찾는 scanner 추가
            System.out.print("비교할 숫자를 입력하세요: ");
            Double input3 = scanner.nextDouble();
            calculate.bigresult(input3);
        }
    }
}
