import java.util.*;

public class StringTokens {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.nextLine().trim();

        if (s.length() == 0) {
            System.out.println(0);

        }

        String[] parts = s.split("[ !,?._'@]+");

        int count = 0;

        for (String word : parts) {
            if (!word.equals("")) {
                count++;
            }
        }

        System.out.println(count);

        for (String word : parts) {
            if (!word.equals("")) {
                System.out.println(word);
            }
        }
    }
}
