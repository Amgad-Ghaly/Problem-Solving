import java.util.*;
public class intToString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String s = Integer.toString(num);
        if(num==Integer.parseInt(s)){
            System.out.println("good job");
        }
        else{
            System.out.println("wrong answer");
        }



    }
}
