package fromslides.S11;
import java.util.Scanner;
public class NestedLoops {
	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		// 24  clock 00:00 to23:59 w minutes
		int minutes, hours = 0;
		while (hours <= 23) {
			minutes = 0;
			while (minutes <= 59) {
				//System.out.println(hours + ":" + minutes);
				System.out.printf("%02d:%02d\n", hours, minutes);
				minutes++;
			}
			hours++;
		}
		// 10x10 table
		final int SIZE = 10;
		int row = 1, col = 1;
		while (row <= SIZE) {
			col = 1;
			while (col <= SIZE) {
				System.out.print(" * ");
				col++;
			}
			System.out.println();
			row++;
		}
		// triangle
		for (int rows = 1; rows <= 5; rows++) {
			for (int cols = 1; cols <= rows; cols++) {
				System.out.print("*");
			}
			System.out.println();
		}
} //main()
} //