package lv3;

public enum Operator {
    PLUS("+"), MINUS("-"), MULT("*"), DIV("/");

    //Enum 의 상수를 저장하는 symbol변수
    private final String symbol;

    //생성자
    Operator(String symbol) {
        this.symbol = symbol;
    }
}