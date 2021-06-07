package HelloWorld;

public class GuGuDan {

	public static void main(String[] args) {
		// 구구단
		int sum = 0;
		for(int i = 1; i <= 9; i++) {
			System.out.printf("** %d단 **\n", i);
			for(int j =1; j <= 9; j++) {
				System.out.printf("%d * %d = %d\n", i,j,sum=i*j);
			}
			System.out.printf("\n");
		}
	}
}
