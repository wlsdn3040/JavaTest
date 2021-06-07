package HelloWorld;
import java.util.Scanner;

public class CalGrade {
	public static void main(String[] args) {
		int grade = 0;
		Scanner sc = new Scanner(System.in);
		grade = sc.nextInt();
		if(grade >= 90) System.out.println("A");
		else if(grade >= 80) System.out.println("B");
		else if(grade >= 70) System.out.println("C");
		else if(grade >= 60) System.out.println("D");
		else if(grade < 60) System.out.println("F");
	}
}
