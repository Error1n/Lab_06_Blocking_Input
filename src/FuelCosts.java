import java.util.Scanner;
public class FuelCosts
{
    public static void main(String[] args)
    {
        Scanner in =new Scanner(System.in);
        double gallons = 0.0;
        double milesPerGal = 0.0;
        double gasPerGal = 0.0;
        double costPer100 = 0.0;
        double howFar = 0.0;
        boolean gallonsDone = false;
        boolean milesPerGalDone = false;
        boolean gasPerGalDone = false;
        String trash = "";


        // cost per 100 miles would be how many gals of gas per mile * 100, that amount * cost of gallon of gas
        // how far the car can go with the gas in the tank = milesPerGal * gallons

        do
        {
            System.out.println("Enter the number of gallons in your gas tank: ");
            if(in.hasNextDouble())
            {
                gallons = in.nextDouble();
                in.nextLine();

                gallonsDone = true;

            }
            else
            {
                trash = in.nextLine();
                System.out.println("You entered: " + trash + ". Please enter the number of gallons in your gas tank.");
            }

        }while(!gallonsDone);

        do
        {
            System.out.println("Enter the number of miles you can travel per gallon of gas: ");
            if(in.hasNextDouble())
            {
                milesPerGal = in.nextDouble();
                in.nextLine();

                milesPerGalDone = true;

            }
            else
            {
                trash = in.nextLine();
                System.out.println("You entered: " + trash + ". Please enter the number of miles you can travel per gallon of gas.");
            }

        }while(!milesPerGalDone);

        do
        {
            System.out.println("Enter the price of a gallon of gas: ");
            if(in.hasNextDouble())
            {
                gasPerGal = in.nextDouble();
                in.nextLine();

                gasPerGalDone = true;

            }
            else
            {
                trash = in.nextLine();
                System.out.println("You entered: " + trash + ". Please enter the price of a gallon of gas.");
            }

        }while(!gasPerGalDone);

        costPer100 = (milesPerGal * 100) * gasPerGal;
        System.out.println("It would cost " + costPer100 + " to travel 100 miles.");

        howFar = milesPerGal * gallons;
        System.out.println("Your car can travel " + howFar + " miles before you need to refuel.");


    }
}
