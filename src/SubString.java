import java.util.*;
public class SubString
{
	public static void main(String[] args)
	{
        System.out.println("please enter a string then two numbers start and end");
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        int first = input.nextInt();
        int end = input.nextInt();
        /*
        char[] arr = s.toCharArray();
        for(int i = first ; i <= end - 1 ; i++)
        {
            System.out.print(arr[i]);
        }
        */
        SubString subString = new SubString();
        System.out.println(s.substring(first,end)) ;



    }
}