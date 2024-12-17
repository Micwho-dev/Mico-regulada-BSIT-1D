import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double kwh;
		double perday = 11.88;
		System.out.println("How much Kwh you've spend: ");
		kwh = sc.nextDouble();
		double Result = (kwh * perday);
		System.out.println("Your electric bill is: " + "\n" + Result);
		
		
	}
}