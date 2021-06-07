package HelloWorld;
import java.util.Scanner;

public class PrintStars {

	public static void main(String[] args) {
		int num = 0;
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		for( int i = 1; i <=num; i ++) {
			for( int j = 1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
