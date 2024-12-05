import java.util.Scanner;

public class PartyAffiliation {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String menuChoice = "";
        String menu = "D - Democrat\tR - Republican\tI - Independent\tO - Other\nPlease select your party affiliation: ";

        //Display menu
        System.out.println(menu);
        menuChoice = input.nextLine();

        if (menuChoice.equalsIgnoreCase("D"))
        {
            System.out.println("You get a Democratic Donkey");
        }

        else if(menuChoice.equalsIgnoreCase("R"))
        {
            System.out.println("You get a Republican Elephant");
        }

        else if(menuChoice.equalsIgnoreCase("I"))
        {
            System.out.println("You get an Independent Person");
        }

        else if(menuChoice.equalsIgnoreCase("O"))
        {
            System.out.println("You get an Other Otter");
        }

        else
        System.out.println("That is not a valid option (" + menuChoice + ") answer must be [DRIO].");
    }
}