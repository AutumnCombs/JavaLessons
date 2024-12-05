import java.util.Scanner;

public class ShipCostCalc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt for item price
        System.out.print("Enter the price of the item: $");
        double itemPrice = scanner.nextDouble();

        double shipCost =0;
        double totalCost =0;

        // if 100 or more
        if (itemPrice >= 100)
        {
            shipCost = 0.0;
        } else {
            // Calc ship cost as 2% of the item price
            shipCost = itemPrice * .02;
        }

        // Calc the total cost
        totalCost = itemPrice + shipCost;

        // Display the shipping cost and total price
        System.out.println("Shipping Cost: $" + shipCost);
        System.out.println("Total Price: $" + totalCost);

        // Close the scanner
        scanner.close();
    }
}