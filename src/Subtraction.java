import java.math.BigDecimal;

public class Subtraction extends OperationType {
    @Override
    public BigDecimal calculate(BigDecimal value1, BigDecimal value2) {
        return value1.subtract(value2);
    }
}
