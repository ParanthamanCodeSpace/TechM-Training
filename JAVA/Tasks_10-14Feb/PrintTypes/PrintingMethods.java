package JavaIO_10thFeb;

public class PrintingMethods {
    public static void main(String[] args) {
        PrintingMethods obj = new PrintingMethods();
        print();
        println();
        obj.err();
    }
        static void print() {
            System.out.print("System.out.print! ");
            System.out.print("System.out.print! ");
        }

        static void println() {
            System.out.println("System.out.println! ");
            System.out.println("System.out.println! ");
            System.out.println("System.out.println! ");
        }

        void err() {
            System.err.println("This is another error message using println().");
            System.err.println("This is another error message using println().");
        }
}
