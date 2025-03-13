import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CheckNegativeNumbers {
    public static void main(String[] args) {
        try {
            // Read numbers from file and check for positives
            readNumbersFromFile("numbers.txt");
        } catch (FileNotFoundException e) {
            System.out.println("Exception caught: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }

        System.out.println("Program continues after exception handling.");
    }

    // Method to read numbers and throw exception for positive numbers
    public static void readNumbersFromFile(String fileName) throws FileNotFoundException {
        File file = new File(fileName);
        
        if (!file.exists()) {
            throw new FileNotFoundException("File " + fileName + " not found.");
        }

        Scanner scanner = new Scanner(file);
        System.out.println("Reading numbers from file:");

        while (scanner.hasNext()) {
            if (scanner.hasNextInt()) {
                int num = scanner.nextInt();
                System.out.println(num);

                // If the number is positive, throw an exception
                if (num > 0) {
                    scanner.close();
                    throw new IllegalArgumentException("Positive number " + num + " found! Only negative numbers are allowed.");
                }
            } else {
                scanner.next(); // Skip invalid data
            }
        }

        scanner.close();
        System.out.println("All numbers are negative.");
    }
}
