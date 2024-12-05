import java.util.Scanner;

public class TheaterKiosk {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int customerAge = 0;
        int DRINKING_AGE = 21;

        System.out.println("Enter your age: ");
        customerAge = Integer.parseInt(input.nextLine());

        if (customerAge >= 21)
        {
            System.out.println("You get a wristband!");
        }
    }
}