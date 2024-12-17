import java.util.Scanner;

public class ElectricBillingSystem {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Maximum number of customers we can handle
        int maxCustomers = 100;

        // Arrays to store customer details
        String[] customerNames = new String[maxCustomers]; // Array to store customer names
        double[] meterReadings = new double[maxCustomers]; // Array to store meter readings in kWh
        double[] bills = new double[maxCustomers]; // Array to store the total bills

        int customerCount = 0; // To keep track of how many customers are entered

        while (true) { // Main loop to process multiple customers
            // Enter customer data
            customerCount = enterCustomerData(scanner, customerNames, meterReadings, bills, customerCount);

            // Display the summary of entered customers
            displaySummary(customerNames, meterReadings, bills, customerCount);

            // Ask if the user wants to enter another customer
            System.out.print("Do you want to enter another customer? (y/n): ");
            String choice = scanner.nextLine();
            if (choice.equalsIgnoreCase("n")) {
                break;
            }

            // Check if maximum customer count is reached
            if (customerCount >= maxCustomers) {
                System.out.println("Maximum customer limit reached. Exiting input.");
                break;
            }
        }

        // Final message when exiting the program
        System.out.println("\nThank you for using the Electric Billing System!");
        scanner.close();
    }

    // Method to handle customer data entry and bill calculation
    public static int enterCustomerData(Scanner scanner, String[] customerNames, double[] meterReadings, double[] bills, int customerCount) {
        System.out.print("Enter customer name (or 'exit' to finish): ");
        String name = scanner.nextLine();

        // Exit if user types 'exit'
        if (name.equalsIgnoreCase("exit")) {
            return customerCount; // Return current count if 'exit' is typed
        }

        // Store the customer's name
        customerNames[customerCount] = name;

        // Ask for the meter reading (usage in kWh)
        System.out.print("Enter meter reading (in kWh): ");
        double usage = scanner.nextDouble();
        scanner.nextLine(); // Clear the buffer

        // Store the meter reading
        meterReadings[customerCount] = usage;

        // Calculate the bill (1 kWh = 11.88 units)
        double ratePerKWh = 11.88;
        double bill = usage * ratePerKWh;

        // Store the bill
        bills[customerCount] = bill;

        // Increment customer count
        customerCount++;

        return customerCount; // Return updated customer count
    }

    // Method to display the summary of customer data and bills
    public static void displaySummary(String[] customerNames, double[] meterReadings, double[] bills, int customerCount) {
        System.out.println("\nElectric Billing Summary:");
        for (int i = 0; i < customerCount; i++) {
            System.out.println("Customer: " + customerNames[i]);
            System.out.println("Meter Reading: " + meterReadings[i] + " kWh");
            System.out.println("Total Bill: $" + String.format("%.2f", bills[i]));
            System.out.println("--------------------------------");
        }
    }
}
