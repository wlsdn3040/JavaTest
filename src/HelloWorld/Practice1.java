package HelloWorld;

import java.util.Scanner;

public class Practice1 {
	public static void main(String[] args) {
		int c =0;
		int f =0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("���� �Է�:");
		c = sc.nextInt();
		f = (c * 9/5) + 32;
		System.out.println("ȭ��: "+ f);
	}
}
