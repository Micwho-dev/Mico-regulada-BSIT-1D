public class Mainu {

    public static void main(String[] args) {
        int[] numbers = {34, 56, 23, 89, 12, 78, 55, 21, 90, 11};

        int largest = numbers[0];
        int smallest = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > largest) {
                largest = numbers[i];
            } else if (numbers[i] < smallest) {
                smallest = numbers[i];
            }
        }

        System.out.println("Largest number in the array: " + largest);
        System.out.println("Smallest number in the array: " + smallest);
    }
}