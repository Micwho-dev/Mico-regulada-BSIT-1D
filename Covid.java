import java.util.Scanner;
public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        String Q1, Q2, Q3;
        boolean M = true;
        while (M) {
        do {
            System.out.println("Do you have a fever?");
            Q1 = sc.next();
            System.out.println("Do you have a cough?");
            Q2 = sc.next();
            System.out.println("Do you have a difficulty in breathing?");
            Q3 = sc.next();
            if (Q1.equalsIgnoreCase("Yes") || Q2.equalsIgnoreCase("Yes") || Q3.equalsIgnoreCase("Yes")) {
                System.out.println("You may have a Covid-19 symptoms, Please consult a health care professional");
            } else {
                System.out.println("You do not exhibiy significant Covid-29 Symptoms. Stay safe");
            }
            
        } while (!M);
        System.out.println("Do you want to check symptoms again? (Yes/No)");
        String answer = sc.next();
        if (answer.equalsIgnoreCase("Yes")) {
        } else {
            M = false;
        }
        }    
    }
}