package fromslides.S11;
import java.util.Scanner;
public class Pi {
    public static void main(String[] args) {
        double pi = calcPi(0.0000001);
        System.out.printf("Estimate of PI is: %.7f", pi);
    }
    public static double calcPi(double accuracy) {
            // declare and initialize estimates
            double current = 0;
            double next = 4.0 / 1;
            int n = 1;

            while (Math.abs(next - current) >= accuracy) {
                current = next;
                next = current + 4. * Math.pow(-1, n) / (2 * n + 1);
                n++;
            }
            return current;
        } // main()
} // Pi
