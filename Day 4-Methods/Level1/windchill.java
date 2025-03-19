import java.util.Scanner;

public class windchill{
	public double calculateWindChill(double temperature, double windSpeed){
		double windspeed = 35.74 + 0.6215 * temperature + (0.4275 * temperature - 35.75) * Math.pow(windSpeed,0.16);
		return windspeed;
	}
		
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		double num= scanner.nextDouble();
		double ws= scanner.nextDouble();
		windchill Windchill = new windchill();
		double s = Windchill.calculateWindChill(num,ws);
		System.out.printf("windchill %.0f",s);
	}
}
	