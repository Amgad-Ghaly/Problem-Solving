import java.util.*;
public class StaticInitializerBlock {
    static Scanner input = new Scanner(System.in);
    static int breadth =input.nextInt();
    static int height =input.nextInt();
    static boolean flag = true ;
    static {
        try{
            if(breadth <= 0 || height <= 0 ){
                 flag = false;
                throw new Exception("Breadth and height must be positive");

            }

        }
        catch(Exception e){
            System.out.println(e);
        }

    }
    public static void main(String[] args){

        if(flag){
            System.out.println(breadth * height);
        }

    }
}
