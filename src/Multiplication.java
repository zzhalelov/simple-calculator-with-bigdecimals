import java.math.BigDecimal;


public class Multiplication extends OperationType {
    @Override
    public BigDecimal calculate(BigDecimal value1, BigDecimal value2) {
        return value1.multiply(value2);
    }
}
