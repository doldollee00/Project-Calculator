package lv2;

import java.util.ArrayList;

public class Calculate {

    //연산 결과를 저장하는 컬렉션 타입, 외부에서 접근하기 못하도록 private로 캡슐화
    private ArrayList<Integer> resultHome = new ArrayList<>();

    //사칙연산 수행
    public int sum(int value1, int value2) {
        int result = value1 + value2;
        resultHome.add(result);
        return result;
    }
    public int sub(int value1, int value2) {
        int result = value1 - value2;
        resultHome.add(result);
        return result;
    }
    public int mult(int value1, int value2) {
        int result = value1 * value2;
        resultHome.add(result);
        return result;
    }
    public int div(int value1, int value2) {
        int result = value1 / value2;
        resultHome.add(result);
        return result;
    }

    //게터 설정
    public ArrayList<Integer> getResultHome() {
        return resultHome;
    }

    //세터 설정
    public void setResultHome(ArrayList<Integer> resultHome) {
        this.resultHome = resultHome;
    }

    // 저장된 데이터 삭제
    public ArrayList<Integer> removeResultHome() {
        resultHome.remove(0);
        return resultHome;
    }
}
