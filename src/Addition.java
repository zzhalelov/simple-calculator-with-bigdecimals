import java.math.BigDecimal;

public class Addition extends OperationType {
    @Override
    public BigDecimal calculate(BigDecimal value1, BigDecimal value2) {
        return value1.add(value2);
    }
}
