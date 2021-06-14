package Bank_Account;
import java.util.Scanner;

public class Bank_Management {
	private static Account[] accountArr = new Account[100];
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		boolean op = true;
		while(op) {
			System.out.println("+---------------------------------------------------+");
			System.out.println("ㅣ 1.계좌생성 ㅣ 2.입금 ㅣ 3.출금 ㅣ 4. 잔액조회 ㅣ 5. 종료 ㅣ");
			System.out.println("+---------------------------------------------------+");
			System.out.println("메뉴선택: ");
			
			int selmenu = sc.nextInt();
			
			if(selmenu ==  1) {
				createAcc();
			}
			if(selmenu ==  2) {
				deposit();
			}
			if(selmenu ==  3) {
				withdraw();
			}
			if(selmenu ==  4) {
				Balanceinquiry();
			}
			if(selmenu ==  5) {
				System.out.println("시스템을 종료합니다.");
				op = false;
			}	
		}
	}
	private static void createAcc() {
		System.out.println("+--------------+");
		System.out.println("ㅣ 1.계좌생성 ㅣ");
		System.out.println("+--------------+");
		System.out.println("계좌번호를 입력해주세요: ");
		String acnum = sc.next();
		System.out.println("예금주명을 입력해주세요: ");
		String own = sc.next();
		System.out.println("입금할 금액을 입력해주세요: ");
		int money = sc.nextInt();
		
		for(int i = 0; i < accountArr.length; i++) {
			accountArr[i] = new Account(acnum, own, money);
			System.out.println("계좌 개설 완료");
			System.out.println("잔액: " +money);
			break;
		}
	}
	private static void deposit(){
		System.out.println("+--------------+");
		System.out.println("ㅣ 2.입금 ㅣ");
		System.out.println("+--------------+");
		System.out.println("입금할 금액을 입력해주세요: ");
		int depmoney = sc.nextInt();
	}
	private static void withdraw(){
		System.out.println("+--------------+");
		System.out.println("ㅣ 3.출금 ㅣ");
		System.out.println("+--------------+");
	}
	private static void Balanceinquiry(){
		System.out.println("+--------------+");
		System.out.println("ㅣ 4.잔액조회 ㅣ");
		System.out.println("+--------------+");
	}
}
