package JavaIO_10thFeb;

import java.io.IOException;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;

public class BufferAndScanner {
    public static void main(String[] args) {
        try {
            ipbuffer();
        } catch(Exception e) {
            System.out.println("An error occurred.");
        }
        BufferAndScanner obj = new BufferAndScanner();
        obj.getInputUsingScannerClass();
    }
        static void ipbuffer () throws IOException
        {
            // Enter data using BufferReader
            BufferedReader bufferedReader = new BufferedReader(
                    new InputStreamReader(System.in));
            System.out.println("Enter the input:");
            // Reading data using readLine
            String lines = bufferedReader.readLine();

            // Printing the read line
            System.out.println("The given input:" + lines);
        }

        void getInputUsingScannerClass ()
        {
            // Using Scanner for Getting Input from User
            Scanner ipscnner = new Scanner(System.in);
            System.out.println("Enter the input string :");
            String s1 = ipscnner.nextLine();
            System.out.println("You entered string " + s1);

            System.out.println("Enter the input integer :");
            int a = ipscnner.nextInt();
            System.out.println("You entered integer " + a);

            System.out.println("Enter the input float :");
            float b = ipscnner.nextFloat();
            System.out.println("You entered float " + b);
        }
    }
