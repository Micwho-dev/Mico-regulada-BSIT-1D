import java.util.Scanner;

public class LoginSystem {
    public static void main(String[] args) {
        
        String Username = "Mico";
        String Password = "secret";
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your username: ");
        String username = scanner.nextLine();
        System.out.print("Enter your password: ");
        String password = scanner.nextLine();

        if (username.equals(Username) && password.equals(Password)) {
            System.out.println();
            System.out.println("Login successful!");
            
            System.out.println();
             System.out.println("-------OPERATION SELECTION-------");
             System.out.println();
             
             System.out.println(" 'Choose an Operation' ");
             System.out.println();
             System.out.println(" A. Addition ");
             System.out.println(" B. Subtraction");
             System.out.println(" C. Multiplication");
             System.out.println(" D. Division");
             System.out.println();
             
             System.out.println(" Enter your Choice");
             String choice = scanner.nextLine();
             System.out.println();
             
             if (choice.equals("A")) {
       System.out.println(" Results: " + ("Addition")); 
       
      } else if (choice.equals("B")) {
          System.out.println(" Results: " + ("Subtraction"));
      } else if (choice.equals("C")) {
             System.out.println(" Results: " + ("Multiplication"));
      } else if (choice.equals("D")) {
             System.out.println(" Results:" + ("Division")); 
             
        } else {
             System.out.println(" BRIGHT KABALONG WALA NA SA CHOICES!"); }
             
             System.out.println(); 
             
      System.out.println(" Enter your first number");
       double num1 = scanner.nextDouble();
       System.out.println(" Enter your second number");
       double num2 = scanner.nextDouble();
       
       
       
      if (choice.equals("A")) {
       System.out.println(" Results: " + (num1 + num2 )); 
       
      } else if (choice.equals("B")) {
          System.out.println(" Results: " + (num1 - num2));
      } else if (choice.equals("C")) {
             System.out.println(" Results: " + (num1 * num2));
      } else if (choice.equals("D")) {
             if (num2 != 0) 
             System.out.println("Error: Division by zero!");             
             System.out.println(" Results:" + (num1 / num2)); 
             
        } else {
           System.out.println(" Wala lagi na sa Choices!!"); }
           
           
             System.out.println();
             System.out.print(" !Problem Solved! ");
             System.out.println();
             
        
             } else {	
            System.out.println("Invalid username or password.");                                              
            }            
                                            
        }
    }
