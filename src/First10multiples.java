import java.util.Scanner;
public class First10multiples {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("please enter number:");
        int num=0;
        num=input.nextInt();
        if( num >= 2 && num <= 20 )
        {
            for( int i = 1 ; i <= 10 ; i++ )
            {
                int result= num * i;
                System.out.println(num + " * " + i + " = " + result );
            }

        }
        else
            System.out.println("out of range");


    }
}