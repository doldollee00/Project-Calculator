package lv3;

public enum Operator {
    PLUS("+"), MINUS("-"), MULT("*"), DIV("/");

    //Enum 의 상수를 저장하는 symbol변수
    private final String symbol;

    //생성자
    Operator(String symbol) {
        this.symbol = symbol;
    }

    public String getSymbol() {
        return symbol;
    }

    //입력받은 문자열을 enum으로 변환
    public static Operator fromSymbol(String symbol) {
        for (Operator op : Operator.values()) {
            if (op.getSymbol().equals(symbol)) {
                return op;
            }
        }
        return null;
    }
}