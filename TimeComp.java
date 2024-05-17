import java.util.Scanner;
public class TimeComp {
    public static void main(String[] args) {
        Scanner scr_obj = new Scanner(System.in);
        System.out.println("Enter number of seconds:");
        int totalseconds = scr_obj.nextInt();
        int hours = totalseconds/3600;
        int remaining_sec = totalseconds % 3600;
        int minutes = remaining_sec / 60;
        int seconds = remaining_sec % 60;
        System.out.println(totalseconds + " seconds is equivalent to " + hours + " hours, " + minutes + " minutes, and " + seconds + " seconds.");
        scr_obj.close();

    }
}
