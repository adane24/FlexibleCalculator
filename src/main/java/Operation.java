public enum Operation {
    ADD((num1, num2) -> num1.doubleValue() + num2.doubleValue()),
    SUBTRACT((num1, num2) -> num1.doubleValue() - num2.doubleValue()),
    MULTIPLY((num1, num2) -> num1.doubleValue() * num2.doubleValue()),
    DIVIDE((num1, num2) -> {
        if (num2.doubleValue() == 0) {
            throw new ArithmeticException("Division by zero");
        }
        return num1.doubleValue() / num2.doubleValue();
    });

    private final OperationStrategy strategy;

    Operation(OperationStrategy strategy) {
        this.strategy = strategy;
    }

    public Number apply(Number num1, Number num2) {
        return strategy.calculate(num1, num2);
    }

    public static Operation fromString(String operationName) {
        try {
            return Operation.valueOf(operationName.toUpperCase());
        } catch (IllegalArgumentException e) {
            throw new UnsupportedOperationException("Operation '" + operationName + "' is not supported.");
        }
    }
}



