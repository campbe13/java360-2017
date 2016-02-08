package fromslides.S07;
import java.util.Scanner;
public class Credit
{
   public static void main(String[] args)
   {
   final float SALARY = 30000F;
   final int YEARS = 2;
   
   Scanner keyboard = new Scanner(System.in);
   float salary;
   int years;
   
   System.out.print("Enter your salary: ");
   salary = keyboard.nextFloat();
   System.out.print("Enter years at the job: ");
   years = keyboard.nextInt();
   
   if ( salary >= SALARY ) {
      if ( years >= YEARS ) {
         System.out.println("Let's talk!");
         }
      else {
         System.out.println("You need 2 years at the job.");
         }
      }
   else 
      System.out.printf("You need a salary of > $%.2f", SALARY);
   }
}