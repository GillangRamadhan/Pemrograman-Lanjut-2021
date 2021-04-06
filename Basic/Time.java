package Basic;
import java.util.Scanner;

public class Time {
    public static void main (String [] args){
        Scanner Scanner = new Scanner(System.in);
        int days = Scanner.nextInt();

        int days1;
        int hours, minutes, seconds;

        days1 = days * 24;
        hours = days1 * 60;
        minutes = hours * 60;

        System.out.println(minutes);
    }
}
