import java.util.Scanner;

public class simpleint{
	public double si(double p,double r,double t){
		double s = (p * r * t)/100;
		return s;
	}
		
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		double principle = scanner.nextDouble();
		double rate = scanner.nextDouble();
		double time = scanner.nextDouble();
		simpleint Simpleint = new simpleint();
		double s = Simpleint.si(principle,rate,time);
		System.out.printf("The Simple Interest is %.2f for Principal %.2f, Rate of Interest %.2f and Time %.2f",s,principle,rate,time);
	}
}
	