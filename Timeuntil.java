import java.util.Scanner;
import java.time.LocalDateTime;

public class Timeuntil
{
    public static void main (String[] args)
    {
        Scanner scam = new Scanner(System.in);
        int h = LocalDateTime.now().getHour();
        int m = LocalDateTime.now().getMinute();
        int s = LocalDateTime.now().getSecond();

        System.out.println("Input the hour: ");
        int nh = scam.nextInt();

        System.out.println("Input the minutes: ");
        int nm = scam.nextInt();

        System.out.println("Input the second(s): ");
        int ns = scam.nextInt();


        int d = nh - h;
        int md = nm - m;
        int sd = ns - s;

        if (d < 0)
        {
            d += 24;
        }
        if (md < 0)
        {
            d -= 1;
            md += 60;
        }
        if (sd < 0)
        {
            md -= 1;
            sd += 60;
        }
        if (d > 0)
        {
            System.out.println("You are " + d + " hours away");
        }
        if (md > 0)
        {
            System.out.println("You are " + md + " minutes away");    
        }
        if (sd > 0)
        {
            System.out.println("You are " + sd + " seconds away");    
        }
        
        

    }
}