import java.util.Scanner;
/**
 *
 * @author combsau
 */
public class Main
{
    /**
     *
     * @param args the command line arguements
     *             test our method here
     */
    Scanner in = new Scanner(System.in);

    double tempC = getDouble(in,"Enter a temperature in Celcius: ");
    System.out.println("\nYou said the temperature is: " + tempC);

    tempC = in.nextDouble();
            in.nextLine();
    tempF = (tempC * 1.8) + 32;
            System.out.println("This is equivalent to " + tempF + " degrees F");
            
    /**
     *
     * @param pipe
     * @param prompt
     * @return
     */
    public static void main(String[] args)
    {
        System.out.printf("Hello and welcome!");
    }
}