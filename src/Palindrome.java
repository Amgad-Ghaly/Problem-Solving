import java.util.Scanner;
class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("hi enter a word");
        String word = input.nextLine();

        char[] orignal = word.toCharArray();
        char[]reversed = new char[orignal.length];
        int j=0;
        for(int i = orignal.length-1 ; i>=0 ; i-- )
        {
            reversed[j] = orignal[i];
            j++;
        }
        int i;
        for( i = 0 ; i < reversed.length ; i++ )
        {
            if(orignal[i] != reversed[i])
            {
                System.out.print(" no ");
                break;
            }
        }

        if( i == orignal.length)
        {
            System.out.print("yes");
        }
    }
}