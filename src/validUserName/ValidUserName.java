package validUserName;

import java.util.*;

public class ValidUserName {

    public static void main(String[] args)
    {
        Scanner input= new Scanner(System.in);
        int num = input.nextInt();
//        String[] username=new String[num] ;
//        for(int i = 0 ; i < num ; i++)
//        {
//            username[i]=input.next();
//        }
//        for(int i = 0 ; i < num ; i++){
//            if(username[i].length() < 8 || username[i].length() > 30)
//            {
//                System.out.println("Invalid   range ");
//            }
//            for(int j = 0 ; j < username[i].length() ; j++){
//                if (!Character.isLetter(username[i].charAt(j)))
//                {
//                    System.out.println("Invalid   alphabet ");
//                }
//            }
//
//
//
//
//        }
        String[] username=new String[num];

        for (int i = 0; i < num; i++)
        {
            username[i] = input.next();


        }
        for(int i = 0 ; i < num ; i++){
            if(username[i].matches(UsernameValidator.regularExperession))
            {
                System.out.println("Valid");
            }
            else
            {
                System.out.println("Invalid");
            }

        }




    }
}
