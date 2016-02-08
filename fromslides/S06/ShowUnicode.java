// package fromslides.S06;
/**
 * This class shows unicode characters from 0 - 999
 * @author P.Campbell
 * @version today
 **/
 
public class ShowUnicode {
    public static void main(String[] args)
        {
        int stopAt;
        System.out.println(args.length);
        System.out.println(args[0]);
        if (args.length >0 && args[0].equals("-all") )  
             stopAt = 65536;
        else 
            stopAt = 999;
            System.out.println(stopAt);
        for (int i = 0; i < stopAt; i++) {
            System.out.printf("num %03d char %c\t", i, i);
                if (i % 3 == 0) {
                    System.out.printf("\n");
                }
        }
        
    }  // main()
} // ConstSample
