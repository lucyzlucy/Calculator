import java.io.*;
import java.util.Scanner;

public class Calculator {
    Calculation calc;

    public static void main(String[] args) {
        new Calculator().allActions();
    }

    private void allActions() {
        do {
            input();
            output();
            log();
            System.out.println("================================");
        } while (oneMore("Do you want to perform another calculation? (y - Yes, n - No) :" + "\n"));
    }

    private void input() {
        double number1;
        char operator;
        double number2;
        do {
            number1 = inputNumber("first");
            operator = inputOperator();
            number2 = inputNumber("second");
        } while (!Validator.validateDivisionByZero(number2, operator));
        calc = new Calculation(number1, number2, operator);
    }

    private double inputNumber(String numberOrder) {
        Scanner input = new Scanner(System.in);
        double number = 0;
        do {
            System.out.println("Please, enter the " + numberOrder + " number:");
            while (!input.hasNextDouble()) {
                input.next();
                System.out.println(ErrorMessages.NOT_A_NUMBER.getMessage());
            }
            number = input.nextDouble();
        } while (!Validator.validateNum(number));
        return number;
    }

    private char inputOperator() {
        Scanner input = new Scanner(System.in);
        char operator = 0;
        do {
            System.out.println("Please, enter an operator:");
            operator = input.next().charAt(0);
        } while (!Validator.validateOperator(operator));
        return operator;
    }

    private void output() {
        System.out.println("Your result is: " + calc.getResult());
    }

    private void log() {
        File file = new File("logResults.txt");

        try (PrintWriter w = new PrintWriter(new FileWriter(file, true))) {
            w.write("\n" + calc + "\n");
        } catch (IOException e) {
            System.out.println();
            if (oneMore(ErrorMessages.FILE_ISSUE.getMessage())) {
                log();
            }
        }
    }

    private boolean oneMore(String message) {
        System.out.print(message);
        Scanner scan = new Scanner(System.in);
        String reply = scan.nextLine();
        return reply.compareToIgnoreCase("n") != 0;
    }
}
