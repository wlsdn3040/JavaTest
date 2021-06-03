package HelloWorld;

import java.util.Scanner;

public class Practice1 {
	public static void main(String[] args) {
		int c =0;
		int f =0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("¼·¾¾ ÀÔ·Â:");
		c = sc.nextInt();
		f = (c * 9/5) + 32;
		System.out.println("È­¾¾: "+ f);
	}
}
