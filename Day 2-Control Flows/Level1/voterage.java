import java.util.Scanner;
public class naturalnum{
	public static void main(String[] args){
	Scanner scanner = new Scanner(System.in);
	double number = scanner.nextDouble();
	if (number>0){
		System.out.printf("Positive");
	}
	if else (number==0){
		System.out.printf("Zero");
	}
	else{
		System.out.printf("Negative");
	}
	scanner.close();
	}
}
