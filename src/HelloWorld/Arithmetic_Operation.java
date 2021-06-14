package HelloWorld;
import java.util.Scanner;

public class Arithmetic_Operation {

	static int add(int a, int b) {
		
		return a+b;
	}
	static int subtract(int a, int b) {
		
		return a-b;
	}
	static int multiply(int a, int b) {
		
		return a*b;
	}
	static void divide(int a, int b) {
		if(b==0) {
			System.out.println("0으론 나눌 수 없음");
		}
		else {
			System.out.printf("%d/%d = %f", a,b,(float)a/b);
		}
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("2개의 정수:");
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("+,-,*,/");
		String oper = sc.next();
		int result = 0;
		
		switch(oper) {
		case "+":
            result = add(a,b);
            System.out.printf("%d + %d = %d\n",a,b,result);
            break;
        case "-":
            result = subtract(a,b);
            System.out.printf("%d - %d = %d\n",a,b,result);
            break;
        case "*":
            result= multiply(a,b);
            System.out.printf("%d * %d = %d\n",a,b,result);
            break;
        case "/":
        	divide(a,b);
            break;
        default:
            System.out.println("잘못된 입력");
        }            
	}
}
