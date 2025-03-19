import java.util.Scanner;

public class EmployeeBonusCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take salary input
        System.out.print("Enter employee salary: ");
        double salary = scanner.nextDouble();

        // Take years of service input
        System.out.print("Enter years of service: ");
        int yearsOfService = scanner.nextInt();

        // Check if employee is eligible for bonus
        if (yearsOfService > 5) {
            double bonus = 0.05 * salary;
            System.out.println("Bonus amount: " + bonus);
        } else {
            System.out.println("No bonus. Years of service must be more than 5.");
        }

        scanner.close();
    }
}
