import java.util.Scanner;
public class divis{
	public static void main(String[] args){
	Scanner scanner = new Scanner(System.in);
	double number = scanner.nextDouble();
	String divisibility = "";
	if (number%5 == 0){
		divisibility = "yes";
	}else{
		divisibility = "no";
	}
	System.out.println("Is the number " + number + " divisible by 5? " + divisibility);
	scanner.close();
	}
}
