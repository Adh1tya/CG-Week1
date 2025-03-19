import java.util.Scanner;
public class largest{
	public static void main(String[] args){
	Scanner scanner = new Scanner(System.in);
	double number1 = scanner.nextDouble();
	double number2 = scanner.nextDouble();
	double number3 = scanner.nextDouble();
	System.out.printf("Is the first number the largest? %b",((number1>number2)&&(number1>number3)));
	System.out.printf("Is the first number the largest? %b",((number2>number1)&&(number2>number3)));
	System.out.printf("Is the first number the largest? %b",((number3>number1)&&(number3>number2)));
	scanner.close();
	}
}
