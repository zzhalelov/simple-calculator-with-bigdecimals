import java.math.BigDecimal;

public class Calculator {

    public BigDecimal resultOfCalculating(BigDecimal value1, BigDecimal value2, OperationType operationType) {
        BigDecimal result = operationType.calculate(value1, value2);
        System.out.println("Результат вычисления " + result);
        return result;
    }
}
