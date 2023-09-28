import java.util.Scanner;
public class RectangleInfo
{
    public static void main(String[] args)
    {
        Scanner in =new Scanner(System.in);
        double width = 0.0;
        double height = 0.0;
        double area = 0.0;
        double perimeter = 0.0;
        double diagonal = 0.0;
        double diagonalSq = 0.0;
        boolean done = false;
        String trash = "";

        do
        {
            System.out.println("Enter the width of your rectangle: ");
            if(in.hasNextDouble())
            {
                width = in.nextDouble();
                in.nextLine();

                done = true;

            }
            else
            {
                trash = in.nextLine();
                System.out.println("You entered: " + trash + ". Please enter the width of your rectangle.");
            }
        }while(!done);

        do
        {
            System.out.println("Enter the height of your rectangle: ");
            if(in.hasNextDouble())
            {
                height = in.nextDouble();
                in.nextLine();

                done = true;

            }
            else
            {
                trash = in.nextLine();
                System.out.println("You entered: " + trash + ". Please enter the height of your rectangle.");
            }
        }while(!done);

        area = width * height;
        System.out.println("The area of your rectangle is: " + area);

        perimeter = (width * 2) + (height * 2);
        System.out.println("The perimeter of your rectangle is: " + perimeter);

        diagonalSq = (width * width) + (height * height);
        diagonal = Math.sqrt(diagonalSq);
        System.out.println("The diagonal of your rectangle is: " + diagonal);
    }
}
