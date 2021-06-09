package HelloWorld;
import java.util.Scanner;

public class Caesar_Cipher {

	public static void main(String[] args) {
		int n =3;
		String a= "";
		String ans = "";
		Scanner sc = new Scanner(System.in);
		System.out.println("입력:");
		a = sc.nextLine();
		
		for(int i = 0; i <a.length(); i++) {
			char tmp = a.charAt(i);
			if(tmp >= 'a' && tmp <='z') {
				 tmp = (char)((tmp - 'a' + n)% 26 + 'a');
			}
			else if(tmp >= 'A' && tmp <='Z') {
				 tmp = (char)((tmp - 'A' + n)% 26 + 'A');
			}
			ans += tmp;
		}
		System.out.println("변환:" +ans);
	}

}
