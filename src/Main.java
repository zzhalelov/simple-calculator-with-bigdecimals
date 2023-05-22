import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        OperationType addition = new Addition();
        OperationType subtraction = new Subtraction();
        OperationType multiplication = new Multiplication();
        OperationType division = new Division();
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите первое значение");
        BigDecimal value1 = scan.nextBigDecimal();
        System.out.println("Введите второе значение");
        BigDecimal value2 = scan.nextBigDecimal();
        System.out.println("Введите нужный арифметический оператор: + - * /");
        char operator = scan.next().charAt(0);
        switch (operator) {
            case '+' -> calc.resultOfCalculating(value1, value2, addition);
            case '-' -> calc.resultOfCalculating(value1, value2, subtraction);
            case '*' -> calc.resultOfCalculating(value1, value2, multiplication);
            case '/' -> calc.resultOfCalculating(value1, value2, division);
        }
    }
}