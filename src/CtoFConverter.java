import java.util.Scanner;
public class CtoFConverter
{
    public static void main(String[] args)
    {
        double cel = 0;
        double far = 0;
        Scanner in =new Scanner(System.in);
        boolean done = false;
        String trash = "";

        do
        {
            System.out.println("Enter a temperature in Celsius: ");
            if(in.hasNextDouble())
            {
                cel = in.nextDouble();
                in.nextLine();
                far = (cel * 1.8) + 32;

                System.out.println("Your temperature in farenheit is: " + far);

                done = true;

            }
            else
            {
                trash = in.nextLine();
                System.out.println("You entered: " + trash + ". Please enter a number temperature in celsius.");
            }


        }while(!done);


    }
}