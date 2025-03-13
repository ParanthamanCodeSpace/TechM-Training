import java.util.Scanner;

class Employee {
    // Instance variables
    private int empId;
    private String empName;
    private double salary; // Monthly salary
    private int yearsWorked;

    // Method to set employee details
    public void setEmployeeDetails(int empId, String empName, double salary, int yearsWorked) {
        this.empId = empId;
        this.empName = empName;
        this.salary = salary;
        this.yearsWorked = yearsWorked;
    }

    // Method to get employee details
    public void getEmployeeDetails() {
        System.out.println("\nEmployee Details:");
        System.out.println("ID: " + empId);
        System.out.println("Name: " + empName);
        System.out.println("Monthly Salary: ₹" + salary);
        System.out.println("Years Worked: " + yearsWorked);
    }

    // Method to check loan eligibility
    public void getLoanEligibility() {
        double annualSalary = salary * 12; // Convert monthly salary to annual salary
        double loanAmount = 0;

        if (yearsWorked <= 5) {
            System.out.println(empName + " is not eligible for a loan (Must work more than 5 years).");
            return;
        }

        if (annualSalary >= 15_00_000) {
            loanAmount = 7_00_000;
        } else if (annualSalary >= 10_00_000) {
            loanAmount = 5_00_000;
        } else if (annualSalary >= 6_00_000) {
            loanAmount = 2_00_000;
        }

        if (loanAmount > 0) {
            System.out.println(empName + " is eligible for a loan of ₹" + loanAmount);
        } else {
            System.out.println(empName + " is not eligible for a loan.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input for Employee details
        System.out.print("Enter Employee ID: ");
        int empId = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        System.out.print("Enter Employee Name: ");
        String empName = scanner.nextLine();

        System.out.print("Enter Monthly Salary (₹): ");
        double salary = scanner.nextDouble();

        System.out.print("Enter Years Worked: ");
        int yearsWorked = scanner.nextInt();

        // Creating Employee object and setting details
        Employee emp = new Employee();
        emp.setEmployeeDetails(empId, empName, salary, yearsWorked);

        // Displaying employee details and checking loan eligibility
        emp.getEmployeeDetails();
        emp.getLoanEligibility();

        scanner.close();
    }
}
