import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        
        int[] multiplicationResult = new int[4];  // for 6, 7, 8, 9

        
        for (int i = 6; i <= 9; i++) {
            multiplicationResult[i - 6] = number * i; // Store result in array
        }

        for (int i = 6; i <= 9; i++) {
            System.out.println(number + " * " + i + " = " + multiplicationResult[i - 6]);
        }
    }
}
