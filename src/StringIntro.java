import java .util.*;
public class StringIntro
{
	public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String A = input.nextLine();
        String B = input.nextLine();
        System.out.println(A.length() + B.length());

        if(A.compareTo(B) > 0)
        {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }

        System.out.print(A.substring(0,1).toUpperCase()
        + A.substring(1) + " " );
        System.out.print(B.substring(0,1).toUpperCase()
                + B.substring(1));



    }






}
