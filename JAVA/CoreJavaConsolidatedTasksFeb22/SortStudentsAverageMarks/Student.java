import java.util.Arrays;
import java.util.Scanner;

class Student implements Comparable<Student> {
    String name;
    int[] marks;
    int total;
    double average;

    // Constructor to initialize student details
    public Student(String name, int[] marks) {
        this.name = name;
        this.marks = marks;
        this.total = calculateTotal(marks);
        this.average = (double) total / marks.length;
    }

    // Method to calculate total marks
    private int calculateTotal(int[] marks) {
        int sum = 0;
        for (int mark : marks) {
            sum += mark;
        }
        return sum;
    }

    // Compare students based on total marks (descending order)
    @Override
    public int compareTo(Student other) {
        return Integer.compare(other.total, this.total); // Sorting in descending order
    }

    // Display student details
    public void display() {
        System.out.println("Name: " + name + ", Total: " + total + ", Average: " + String.format("%.2f", average));
    }
}
