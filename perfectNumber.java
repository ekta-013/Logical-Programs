package logicalPrograms;
import java.util.Scanner;

public class perfectNumber {

	public static void main(String[] args) {
		int Sum = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number : ");
		long n = scan.nextLong();
		
		for (int i = 1; i < n; i++) {
			if (n % i == 0) {
				Sum = Sum + i;
			}
		}
	    if (Sum == n) {
	    	System.out.println(n + "is a Perfect Number");
	    } else {
	    	System.out.println(n + "is not  a Perfect Number");	   
	    }
	}
}
