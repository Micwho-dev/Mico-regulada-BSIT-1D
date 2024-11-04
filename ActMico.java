import java.util.Scanner;
public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main (String[] args) {
    String Name;
    String Sex;
    int Age;
    double Height;
    double Weight;
    System.out.println("Enter Name: ");
    Name = sc.next();
    System.out.println("Enter Sex: ");
    Sex = sc.next();
    System.out.println("Enter Age: ");
    Age = sc.nextInt();
    System.out.println("Enter Height: ");
    Height = sc.nextDouble();
    System.out.println("Enter Weight ");
    Weight = sc.nextDouble();
    
    System.out.println("Name: " + Name);
    System.out.println("Sex: " + Sex);
    System.out.println("Age: " + Age);
    System.out.println("Height: " + Height);
    System.out.println("Weight: " + Weight);
    }
}