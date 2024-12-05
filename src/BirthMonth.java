import java.util.Scanner;

public class BirthMonth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //input birth month
        System.out.print("Please enter your birth month (1 - 12): ");
        int birthMonth = scanner.nextInt();

        //input correct range for birth month
        if (birthMonth >= 1 && birthMonth <= 12)

        {
            System.out.println("Your birth month is: " + birthMonth);
        }
            //display error response
        else
        {
            System.out.println("You entered an incorrect month value: " + birthMonth);
        }
    }
}