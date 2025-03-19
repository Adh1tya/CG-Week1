
public class Student {

    private String name;
    private int rollNumber;
    private double marks;

   
    public Student(String name, int rollNumber, double marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    
    public String calculateGrade() {
        if (marks >= 400) {
            return "A";
        } else if (marks >= 350) {
            return "B";
        } else if (marks >=300) {
            return "C";
        } else if (marks >=250) {
            return "D";
        } else {
            return "F";
        }
    }

   
    public void displayDetails() {
        System.out.println("Student Details:");
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + calculateGrade());
    }

    
    public static void main(String[] args) {
        
        Student student1 = new Student("Rai", 11401, 485.5);

        student1.displayDetails();
    }
}
