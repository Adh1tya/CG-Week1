import java.util.Scanner;

public class ifnot0add {
    public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
		double a  = scanner.nextDouble();
		double total = 0;
		while(a>=0){
			total = a * (a+1) / 2;
		}
	System.out.printf("%f",total);
	}
}
