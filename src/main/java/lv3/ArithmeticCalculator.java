package lv3;

import java.awt.geom.Rectangle2D;
import java.util.ArrayList;

public class ArithmeticCalculator <T extends Number> {

    //연산 결과를 저장하는 컬렉션 타입, 외부에서 접근하기 못하도록 private로 캡슐화
    private ArrayList<Double> resultHome = new ArrayList<>();

    //사칙연산 수행
    public double calculator(T a, T b, Operator operator) {
        double num1 = a.doubleValue();
        double num2 = b.doubleValue();
        double result = 0;

        switch (operator) {
            case PLUS:
                result = num1 + num2;
                break;
            case MINUS:
                result = num1 - num2;
                break;
            case MULT:
                result = num1 * num2;
                break;
            case DIV:
                result = num1 / num2;
                break;
            default:
        }

        //연산 결과값 resultHome에 저장
        resultHome.add(result);
        return result;
    }

    //게터 설정
    public ArrayList<Double> getResultHome() {
        return resultHome;
    }

    //세터 설정
    public void setResultHome(ArrayList<Double> resultHome) {
        this.resultHome = resultHome;
    }

    // 저장된 데이터 삭제
    public ArrayList<Double> removeResultHome() {
        resultHome.remove(0);
        return resultHome;
    }

    //Scanner로 입력받은 값보다 큰 결과값 들을 출력
    public void bigresult(double c) {
        resultHome.stream()
                .filter(result -> result > c)
                .forEach(result -> System.out.println(result));
    }
}