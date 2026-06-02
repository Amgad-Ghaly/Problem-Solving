import java.util.*;
public class Anagrams {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String a = input.nextLine();
        String b = input.nextLine();
        boolean c =isAnagram(a,b);
        if(c ){
            System.out.println("Anagrams");
        }
        else{
            System.out.println("Not Anagrams");
        }
    }

    static boolean isAnagram(String a, String b) {
    char []arr1 = a.toCharArray();
    char []arr2 = b.toCharArray();
    // the main idea
    Arrays.sort(arr1);
    Arrays.sort(arr2);
    if(Arrays.equals(arr1,arr2)){
        return true;
    }
    else {
        return false;
    }


    }
}
