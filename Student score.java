import java.util.Scanner;
public class main {
    public static void main(String[] args) {

        String[] students = {"John", "Alice Guo", "Bob", "Eve"};
        int[] scores = {85, 92, 76, 88};

        System.out.println("Student List:");
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i] + "-" + scores[i]);
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter the name of the student to update the score: ");
        String name = scanner.nextLine();

        int i = 0;
        boolean mico = false;
        while (i < students.length) {
            if (students[i].equalsIgnoreCase(name)) {
                System.out.print("Enter the new score for " + name + ": ");
                scores[i] = scanner.nextInt();
                mico = true;
                break;
            }
            i++;
        }

        if (!mico) {
            System.out.println("Student not found.");
        } else {

            System.out.println("\nUpdated Student List:");
            for (int m = 0; m < students.length; m++) {
                System.out.println(students[m] + "-" + scores[m]);
            }
        }        
    }
}