import java.util.Arrays;

public class SalesTax {
    public static void main(String[] args) {

        final double SALES_TAX_RATE = .05;
        double itemPrice = 0;
        double salesTaxAmt = 0;

        System.out.println("50.25");
        itemPrice = 50.25;

        salesTaxAmt = itemPrice * SALES_TAX_RATE;

        System.out.println("The sales tax for the item price of $ " + itemPrice + " is $ " + salesTaxAmt + ".");
    }
}