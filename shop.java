public class Main {
	public static void main(String[] args) {
	
		double books = 150;
		double pens = 10;
		double notebooks = 25;
		double Discount = .15;
		double Total = (books * 2) + (pens * 5) + (notebooks * 3);
		System.out.println("Total Amount: " + Total);
		if (Total >= 350) {
		double DiscountedPrice = (Discount * Total);
		System.out.println("Discounted Amount: " + DiscountedPrice);
			System.out.println("Total Bills: " + (Total - DiscountedPrice));
		} else {
			System.out.println("No Discount");
		
		}
	}
}