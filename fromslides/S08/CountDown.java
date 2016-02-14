//package fromslides.S08;
import java.util.Scanner;

/**
 * This class illustrates exercises from the slide deck for the course
 * 360-420-DW Intro to Java
 * @author PMCampbell
 * @version today
 **/
public class CountDown
{
   public static void main(String[] args)
   {
   Scanner kb = new Scanner(System.in);
   int limit;     // limit
   int count = 0;   // counter
   
   System.out.print("I will count down from this number: ");
   limit = kb.nextInt();
   
   System.out.println("Countdown: ");
   while (limit > 0) {
      System.out.println(limit);
      limit--;          // change border condition inside loop
                        // what happens if I use  ++ instead of -- ??
   }
   
   System.out.println("Blastoff!");
        
   } // main()
}    // CountDown