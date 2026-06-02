import java.util.InputMismatchException;
import java.util.Scanner;
public class ExceptionHandling1
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        try
        {
            int x = input.nextInt();
            int y = input.nextInt();

            if ( y == 0 )
            {
                throw new ArithmeticException("cannot divide by zero");
            }

//            else if (input.hasNextInt() )
//            {
//                throw new InputMismatchException();
//            }
//
//            else if (input.hasNext()) {
//                throw new InputMismatchException();
//            }

            System.out.println( x / y);


        }
        catch (ArithmeticException e)
        {
            System.out.println(e);
        }
        catch (InputMismatchException e){
            System.out.println(e + " must be integers");
        }



    }

}
