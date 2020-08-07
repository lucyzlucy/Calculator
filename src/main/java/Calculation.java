import java.util.Date;

public class Calculation {
    private double number1;
    private double number2;
    private char operator;
    private Date date;
    private double result;


    public Calculation(double number1, double number2, char operator) {
        this.number1 = number1;
        this.number2 = number2;
        this.operator = operator;
        this.date = new Date();
        this.calculate();
    }

    private void calculate() {

        switch (operator) {
            case '+': {
                result = number1 + number2;
            }
            break;
            case '-': {
                result = number1 - number2;
            }
            break;
            case '*': {
                result = number1 * number2;
            }
            break;
            case '/': {
                result = number1 / number2;
            }
            break;
        }
    }

    public double getResult() {
        return result;
    }

    @Override
    public String toString() {
        return number1 + " " + operator + " " +
                number2 + " = " + result + "\n" +
                "Date: " + date;
    }
}
