import java.util.Scanner;
import java.util.Arrays;

public class sumarr{
    public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
		int [] arr = new int[10]; 
		int sum = 0;
		while(true){
			for (int i = 0 ; i < 10 ; i++){
				int a = scanner.nextInt();
				sum = sum + a;
				arr[i] = a;
				if (a<=0){
					break;
				}
				
			}
		
			System.out.printf("Total sum : %d%n",sum);
		    System.out.println(Arrays.toString(arr));
			System.exit(0);
		}
	}
}	
				
