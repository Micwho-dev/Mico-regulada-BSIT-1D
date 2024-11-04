import java.util.Scanner;
public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num1");
        double num1 = sc.nextInt();
        System.out.println("Enter num1");
        double num2 = sc.nextInt();
        System.out.println("Select an Operation 1. Addition, 2. Subtraction, 3. Multiplication, 4. Division");
        char Operator = sc.next().charAt(0);
        switch (Operator) {
            case '1':
                Add(num1, num2);
                break;
            case '2':
                Subtract(num1, num2);
                break;
            case '3':
                Multiplication(num1, num2);
                break;
            case '4':
                Division(num1, num2);
                break;
            default:
            System.out.println("Input a number");
                
        }
    }
    public static void Add(double num1, double num2) {
        double result;
        result = num1 + num2;
    }
    public static void Subtract(double num1, double num2) {
        double result;
        result = num1 - num2;
    }
    public static void Multiplication(double num1, double num2) {
        double result;
        result = num1 * num2;
    }
    public static void Division(double num1, double num2) {
        double result;
        result = num1 / num2;
    
    }
}