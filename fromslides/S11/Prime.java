package fromslides.S11;
import java.util.Scanner;
public class Prime {
    public static void main(String[] args) {

boolean isPrime = true;
int count =2, num=11;
// must init or read into num & count or get complie error
while (count <= Math.sqrt(num) &&  isPrime)
{
	if (num % count==0)
		isPrime = false;
	count++;
}
if (isPrime) {
	System.out.println(num + " is prime");
}
	else {
	System.out.println(num + " is prime");
	}

} //main()
} // 