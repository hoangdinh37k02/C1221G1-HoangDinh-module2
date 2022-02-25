package ss8_cleancode.pratice.renamevariable;

public class RefactoringVariable {
    public static final String ADDITION ="+";
    public static final String SUBTRACTION ="-";
    public static final String MULTIPLICATION ="*";
    public static final String DIVISION="/";

    public static int calculate(int firstNumber, int secondNumber, String operrator) {
        switch (operrator) {
            case ADDITION:
                return firstNumber + secondNumber;
            case SUBTRACTION:
                return firstNumber - secondNumber;
            case MULTIPLICATION:
                return firstNumber * secondNumber;
            case DIVISION:
                if (secondNumber != 0)
                    return firstNumber / secondNumber;
                else
                    throw new RuntimeException("Can not divide by 0");
            default:
                throw new RuntimeException("Unsupported operation");
        }
    }
}
