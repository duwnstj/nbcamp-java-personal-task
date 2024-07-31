package calculator;

public enum OperatorType {
    ADDITION("+"),
    SUBSTRACTION("-"),
    MULTIPLICATION("*"),
    DIVISION("/"),
    MODULO("%");

    private final String symbol;

    OperatorType(String symbol) {
        this.symbol = symbol;
    }

    /*
    String Operator 값을 받아 해당하는 OperatorType을 반환하는 정적 메서드 추가
     */
    public static OperatorType fromOperator(String operator) {
        for (OperatorType type : OperatorType.values()) {
            if (type.symbol == operator) {
                return type;
            }
        }
        throw new IllegalArgumentException("해당하는 연산자가 없습니다. " + operator);
    }
}
