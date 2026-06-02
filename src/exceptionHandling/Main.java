package exceptionHandling;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int p = input.nextInt();

        try
        {
            if( n == 0 && p == 0 )
            {
                throw new Exception("n and p should not be 0");
            }
            else if ( n < 0 || p < 0 )
            {
                throw new Exception("n and p should not be negative");
            }

            long res=(long)MyCalculator.power(n,p);
            System.out.println(res);

        }
        catch (Exception e)
        {
            System.out.println(e);

        }



    }
}
