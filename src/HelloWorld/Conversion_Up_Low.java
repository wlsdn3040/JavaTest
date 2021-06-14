package HelloWorld;
import java.util.Scanner;

public class Conversion_Up_Low {

	public static void main(String[] args) {
		String input = "";
		String output = "";
		Scanner sc = new Scanner(System.in);
		
		System.out.println("입력:");
		input = sc.nextLine();
		
		for(int i =0; i < input.length(); i++) {
			int tmp = (int)input.charAt(i);
			
			if(tmp >= 65 && tmp <= 90) {
				output += (char)(tmp+32);
			}
			else if(tmp >= 97 && tmp <= 122) {
				output += (char)(tmp-32);
			}
			else {
				output += (char)tmp;
			}
		}
		System.out.println("변환:" +output);
	}
}
