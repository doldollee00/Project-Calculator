package v2;

import java.util.Scanner;

public class Calculate {

    int result;

    //사칙연산 수행
    int sum(int value1, int value2) {
        result = value1 + value2;
        return result;
    }

    int sub(int value1, int value2) {
        result = value1 - value2;
        return result;
    }

    int mult(int value1, int value2) {
        result = value1 * value2;
        return result;
    }

    int div(int value1, int value2) {
        result = value1 / value2;
        return result;
    }
}
