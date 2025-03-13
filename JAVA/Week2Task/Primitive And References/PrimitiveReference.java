public class PrimitiveReferenceDemo {
    
    // Method to modify an integer and an array
    public static void modifyValues(int num, int[] arr) {
        num = num + 10; // Modifying the primitive variable
        arr[0] = arr[0] + 10; // Modifying the first element of the array
    }

    public static void main(String[] args) {
        int number = 50; // Primitive variable
        int[] numbersArray = {1, 2, 3, 4, 5}; // Reference variable (array)

        System.out.println("Before method call:");
        System.out.println("Integer: " + number);
        System.out.print("Array: ");
        for (int n : numbersArray) {
            System.out.print(n + " ");
        }
        System.out.println();

        // Calling method and passing the integer and array
        modifyValues(number, numbersArray);

        System.out.println("\nAfter method call:");
        System.out.println("Integer: " + number); // Will remain unchanged
        System.out.print("Array: ");
        for (int n : numbersArray) {
            System.out.print(n + " ");
        }
        System.out.println();
    }
}
