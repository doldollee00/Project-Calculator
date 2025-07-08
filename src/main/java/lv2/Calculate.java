package lv2;

public class Calculate {

    int result;

    //사칙연산 수행
    public int sum(int value1, int value2) {
        result = value1 + value2;
        return result;
    }

    public int sub(int value1, int value2) {
        result = value1 - value2;
        return result;
    }

    public int mult(int value1, int value2) {
        result = value1 * value2;
        return result;
    }

    public int div(int value1, int value2) {
        result = value1 / value2;
        return result;
    }
}
