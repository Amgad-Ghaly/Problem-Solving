import java.util.*;
import java.time.LocalDate;
public class DateAndTime
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        int months = input.nextInt();
        int days = input.nextInt();
        int years = input.nextInt();
        findDay(days, months, years);


        System.out.println(findDay(days, months, years));
    }
    public static String findDay(int day, int month, int year)
    {
        LocalDate date = LocalDate.of(year, month, day);
        return date.getDayOfWeek().toString();

    }
}
