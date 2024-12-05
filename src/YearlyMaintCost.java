public class YearlyMaintenanceCost {
    public static void main(String[] args) {

        double springCost = 0;
        double summerCost = 0;
        double autumnCost = 0;
        double winterCost = 0;
        double yearlyCost = 0;

        System.out.println("500");
            springCost = 500;

        System.out.println("300");
            summerCost = 500;

        System.out.println("500");
            autumnCost = 500;

        System.out.println("300");
            winterCost = 500;

        yearlyCost = springCost + summerCost + autumnCost + winterCost;

        System.out.println("The total yearly maintenance cost is " + yearlyCost);
    }
}