import java.util.Scanner;

public class counter {
    public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		while(n>0) {
			System.out.println("%n");
			
		    System.out.println(n);
			n=n-1;
		}
	}
}
