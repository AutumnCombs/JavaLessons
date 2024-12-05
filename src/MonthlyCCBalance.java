import java.util.Arrays;

public class MonthyCCBalance {
    public static void main(String[] args) {

        double initialBal = 5000;
        double interestRate = 0.17;
        double oneMonthInt;
        double twoMonthInt;

        oneMonthInt = initialBal * interestRate;
        twoMonthInt = (initialBal + oneMonthInt) * interestRate;

        System.out.println("The interest due after one month is " + oneMonthInt );
        System.out.println("The interest due after two months is " + twoMonthInt );

    }
}