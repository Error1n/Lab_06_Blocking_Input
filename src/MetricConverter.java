import java.util.Scanner;
public class MetricConverter
{
    public static void main(String[] args)
    {
        Scanner in =new Scanner(System.in);
        double meters = 0.0;
        double miles = 0.0;
        double feet = 0.0;
        double inches = 0.0;
        String trash = "";
        boolean done = false;

        do
        {
            System.out.println("Enter a distance in meters: ");
            if(in.hasNextDouble())
            {
                meters = in.nextDouble();
                in.nextLine();
                miles = meters * 0.00062137;
                feet = meters * 3.28084;
                inches = 39.3701;

                System.out.println("Your distance in miles is: " + miles);
                System.out.println("Your distance in feet is: " + feet);
                System.out.println("Your distance in inches is: " + inches);

                done = true;

            }
            else
            {
                trash = in.nextLine();
                System.out.println("You entered: " + trash + ". Please enter a distance in meters.");
            }


        }while(!done);
    }
}
