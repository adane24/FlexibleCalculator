public class Calculator {


    public Number calculate(Operation operation, Number num1, Number num2) {
        if (operation == null) {
            throw new UnsupportedOperationException("Null operation is not supported.");
        }
        return operation.apply(num1, num2);
    }

    public Number chainCalculate(Number initial, Object[][] operations) {
        Number result = initial;
        for (Object[] operation : operations) {
            Operation op = (Operation) operation[0];
            Number num = (Number) operation[1];
            result = calculate(op, result, num);
        }
        return result;
    }
}