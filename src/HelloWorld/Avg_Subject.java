package HelloWorld;
import java.util.Scanner;

public class Avg_Subject {
	public static void main(String[] args) {
		int i,j;
		int[][] arrSub = new int [5][3];
		Scanner sc = new Scanner(System.in);
		
		for(i = 0; i < arrSub.length; i++) {
			int sum = 0;
			for(j = 0; j <arrSub[i].length; j++) {
				System.out.printf("%d��° �л��� �����������Է�:", i+1);
				arrSub[i][j] = sc.nextInt();
			}
			for( int score : arrSub[i]) {
				sum += score;
			}
			System.out.println(i+1 +"��°�л��� �հ�:"+ sum + "���:"+ sum/3);
		}
	}
}

