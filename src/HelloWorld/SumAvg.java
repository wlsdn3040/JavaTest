package HelloWorld;

public class SumAvg {
	
	public static void main(String[] args) {
		int sum = 0;

		String str = "90, 20, 40, 55, 21, 86, 77 , 22, 10, 45";
		str = str.replace(" ", "");
		String[] grade = str.split(",");
		
		System.out.println("Á¡¼ö:");
		for(int i = 0; i < 10; i++) {
			int score = Integer.parseInt(grade[i]);
			System.out.println(grade[i]);
			sum += score;
			}
		System.out.println(String.format("sum %d, Avg %d", sum, sum/10));
	}
}
