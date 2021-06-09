package HelloWorld;
import java.util.Scanner;
import java.util.Arrays;

public class Sum {

	public static void main(String[] args) {
		int a = 0;
		int[] arr;
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Arr Size:");
		a = sc.nextInt();
		
		arr = new int[a];
		for(int i = 0; i < a; i++) {
			arr[i] = (int)(Math.random()*100+1);
			sum +=arr[i];
		}
		System.out.println("Array:" + Arrays.toString(arr) + "Sum:" +sum);
	}

}
