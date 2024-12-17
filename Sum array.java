public class Main {
	public static void main(String[] args) {
		int total = 0;
		int [][] numbers = { {1,2,3}, {4,5,6}, {7,8,9} };
		for (int i = 0; i <numbers.length; i++) {
			for (int j = 0; j < numbers[i].length; j++ ) {
				total+=numbers [i] [j];
	}
}
System.out.println("Sum of Row "  + "is " + numbers.length + " the total column and sum is: " + total);
	}
}