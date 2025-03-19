import java.util.Scanner;
public class circle {

    private double radius;
    public circle() {
        this.radius = 0.1;
    }
	public circle(double radius) {
        this.radius = radius;
    }
	
    public void display(double radius){
        System.out.println("The radius of the circle is: " + radius);
        double area = Math.PI * radius * radius;
        System.out.println("The area of the circle is: " + area);
        double circumference = 2 * Math.PI * radius;
        System.out.println("The circumference of the circle is: " + circumference);
    }
	public static void main(String[] args) {
        
        circle cir = new circle();  
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of the circle: ");
        double radius = sc.nextDouble();
        cir.display(radius);
        circle cs = new circle(10.99);
        System.out.println(cs.radius);
    }
}