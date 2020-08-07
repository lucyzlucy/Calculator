
public class Validator {

    public static boolean validateNum(double num) {
        if (num < -20 | num > 20) {
            System.out.println(ErrorMessages.INVALID_NUMBER.getMessage());
            return false;
        } else return true;
    }

    public static boolean validateOperator(char operator) {
        if (operator != '+' && operator != '-' && operator != '*' && operator != '/') {
            System.out.println(ErrorMessages.INVALID_OPERATOR.getMessage());
            return false;
        } else return true;

    }

    public static boolean validateDivisionByZero(double number2, char operator) {
        if (number2 == 0 && operator == '/') {
            System.out.println(ErrorMessages.ZERO_DIVISION.getMessage());
            return false;
        } else return true;
    }
}

