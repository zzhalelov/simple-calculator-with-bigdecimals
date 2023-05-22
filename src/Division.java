import java.math.BigDecimal;
import java.math.RoundingMode;

public class Division extends OperationType {
    @Override
    public BigDecimal calculate(BigDecimal value1, BigDecimal value2) {
        return value1.divide(value2, 10, RoundingMode.HALF_UP);
    }
}
