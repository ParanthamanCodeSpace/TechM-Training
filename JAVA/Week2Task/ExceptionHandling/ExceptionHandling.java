package ExceptionHandling;

import java.util.Scanner;

public class ExceptionHandling {

    public static void processInput() {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Enter a number: ");
            double num = Double.parseDouble(scanner.nextLine());

            if (num == 0) {
                throw new ArithmeticException("Reciprocal of zero is undefined");
            }

            double reciprocal = 1 / num;
            System.out.println("Reciprocal: " + reciprocal);
        } catch (NumberFormatException e) {
            System.out.println("Please enter a valid number");
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
