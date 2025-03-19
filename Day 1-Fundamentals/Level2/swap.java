import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
		//Gettings user input for number1 and number2
		double side1 = scanner.nextDouble();
		double side2 = scanner.nextDouble();
		double side3 = scanner.nextDouble();
		//Initializing a temporary variable for it to store the number1 value to swap it later
		double perimeter = side1 + side2 + side3;
		double rounds = 5000 / perimeter;
		//Displaying the result 
		System.out.println("The total number of rounds the athlete will run is " + rounds + " to complete 5 km");
	}
}