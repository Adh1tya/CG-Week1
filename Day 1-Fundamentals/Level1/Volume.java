import java.util.Scanner;

public class Volume{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		double rad = scanner.nextDouble();
		double hgt = scanner.nextDouble();
		double vol = Math.PI * Math.pow(rad,2) * hgt;
		System.out.println(vol);
	}
}



	 
	
		

		