package fromslides.S08;
import java.util.Scanner;
public class SimpleMethods
{
    //  takes two parameters int a and int b
    //  returns an int
    public static int min(int a, int b) {
        int small;
        if ( a > b)
           small = b;
        else 
           small = a;
           
        return small;
    }  // min()
    
    public static void main(String[] args)
    {
    int num1, num2;
    
    message();

    num1 = readInt();
    num2 = readInt();
    
    showMinMax(num1, num2);
    
    message();
    } // main()
    
    public static void showMinMax(int num1, int num2) {
        System.out.printf("Given %d and %d\n", num1, num2);
        System.out.println("Smallest is "+ min(num1,num2));
        System.out.println("Biggest is "+ max(num1,num2));
    }  // showMinMax()
    
    //  takes two parameters int a and int b
    //  returns an int
    public static int max(int a, int b) {
        int big;
        if ( a > b)
           big = a;
        else 
           big = b;
           
        return big;
    }  // max()
    
    //  takes no parameters
    //  returns an int
    public static int readInt() {
        int num;
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Enter an integer: ");
        num =  keyboard.nextInt();
        return num;
        
    }  // readInt()
    
    // takes no parameters
    // returns nothing
    public static void message() {
        System.out.println("Brought to you by Dawson College");
    }  // message()
} // TestMethods
