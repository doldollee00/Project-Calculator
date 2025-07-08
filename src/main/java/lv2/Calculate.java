package lv2;

import java.util.ArrayList;

public class Calculate {

    //연산 결과를 저장하는 컬렉션 타입
    ArrayList<Integer> resulthome = new ArrayList<>();

    //사칙연산 수행
    public int sum(int value1, int value2) {
        int result = value1 + value2;
        resulthome.add(result);
        return result;
    }

    public int sub(int value1, int value2) {
        int result = value1 - value2;
        resulthome.add(result);
        return result;
    }

    public int mult(int value1, int value2) {
        int result = value1 * value2;
        resulthome.add(result);
        return result;
    }

    public int div(int value1, int value2) {
        int result = value1 / value2;
        resulthome.add(result);
        return result;
    }
}
