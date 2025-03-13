public class StudentSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input number of students
        System.out.print("Enter number of students: ");
        int numStudents = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        Student[] students = new Student[numStudents];

        // Input student details
        for (int i = 0; i < numStudents; i++) {
            System.out.print("Enter name of student " + (i + 1) + ": ");
            String name = scanner.nextLine();

            System.out.print("Enter number of subjects: ");
            int numSubjects = scanner.nextInt();
            int[] marks = new int[numSubjects];

            System.out.println("Enter marks for " + numSubjects + " subjects:");
            for (int j = 0; j < numSubjects; j++) {
                marks[j] = scanner.nextInt();
            }
            scanner.nextLine(); // Consume newline

            students[i] = new Student(name, marks);
        }

        // Sorting students based on total marks (descending order)
        Arrays.sort(students);

        // Display sorted student details
        System.out.println("\nSorted Student List (Based on Total Marks):");
        for (Student student : students) {
            student.display();
        }

        scanner.close();
    }
}
