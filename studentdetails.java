import java.util.Scanner;

public class studentdetails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();
        scanner.nextLine();
        
        for (int i = 0; i < numStudents; i++) {
            System.out.println("\nEnter details for student " + (i + 1) + ":");
            System.out.print("Name: ");
            String name = scanner.nextLine();            
            System.out.print("Age: ");
            int age = scanner.nextInt();            
            System.out.print("Grade: ");
            int grade = scanner.nextInt();
            scanner.nextLine();
            System.out.println("\nStudent Details for student " + (i + 1) + ":");
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Grade: " + grade);
        }

        scanner.close();
    }
}


