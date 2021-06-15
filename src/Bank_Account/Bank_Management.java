package Bank_Account;
import java.util.Scanner;

public class Bank_Management {
	private static Account[] accountArr = new Account[100];
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		boolean op = true;
		while(op) {
			System.out.println("+-------------------------------------------------------------+");
			System.out.println("ㅣ 1.계좌생성 ㅣ 2.입금 ㅣ 3.출금 ㅣ 4. 잔액조회 ㅣ 5.계좌목록 ㅣ 6. 종료 ㅣ");
			System.out.println("+-------------------------------------------------------------+");
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
			if(selmenu == 5) {
				AccountLists();
			}
			if(selmenu ==  6) {
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
			if(accountArr[i]==null) {
			accountArr[i] = new Account(acnum, own, money);
			System.out.println("계좌 개설 완료");
			System.out.println("잔액: " +money);
			break;
			}
		}
	}
	private static void deposit(){
		System.out.println("+--------------+");
		System.out.println("ㅣ 2.입금 ㅣ");
		System.out.println("+--------------+");
		System.out.println("입금할 계좌를 입력해주세요: ");
		String acnum = sc.next();
		System.out.println("입금할 금액을 입력해주세요: ");
		int depmoney = sc.nextInt();
		if(CheckAccount(acnum)==null) {
			System.out.println("계좌가 존재하지 않습니다");
		}
		else {
			CheckAccount(acnum).setMoney(CheckAccount(acnum).getMoney() +depmoney);
			System.out.println("입금완료\n");
			System.out.println("입금후 잔액:" +CheckAccount(acnum).getMoney());
		}
	}
		
	private static void withdraw(){
		System.out.println("+--------------+");
		System.out.println("ㅣ 3.출금 ㅣ");
		System.out.println("+--------------+");
		System.out.println("출금할 계좌를 입력해주세요: ");
		String acnum = sc.next();
		System.out.println("출금할 금액을 입력해주세요: ");
		int witmoney = sc.nextInt();
		if(CheckAccount(acnum)==null) {
			System.out.println("계좌가 존재하지 않습니다");
		}
		else if(witmoney < CheckAccount(acnum).getMoney()){
			CheckAccount(acnum).setMoney(CheckAccount(acnum).getMoney() -witmoney);
			System.out.println("출금완료\n");
			System.out.println("출금후 잔액:" +CheckAccount(acnum).getMoney());
		}
		else if(witmoney > CheckAccount(acnum).getMoney()) {
			System.out.println("출금할 금액이 더 큽니다.");
		}
	}
	
	private static void Balanceinquiry(){
		System.out.println("+--------------+");
		System.out.println("ㅣ 4.잔액조회 ㅣ");
		System.out.println("+--------------+");
		System.out.println("조회할 계좌를 입력해주세요: ");
		String acnum = sc.next();
		if(CheckAccount(acnum)==null) {
			System.out.println("계좌가 존재하지 않습니다");
		}
		else {
			System.out.println("잔액:" +CheckAccount(acnum).getMoney());
		}
	}
	private static void AccountLists() {
		for(int i = 0; i < accountArr.length; i++) {
			if(accountArr[i]==null) {
				break;
			}
			else{
				System.out.println("계좌번호: " + accountArr[i].getAcnum() + "\n예금주: " + accountArr[i].getOwn() + "\n잔액: " + accountArr[i].getMoney());
			}
		}
	}
	
	private static Account CheckAccount(String acnum) {
		for(int i = 0; i < accountArr.length; i++) {
			if(accountArr[i] == null) {
				break;
			}
			else if(accountArr[i].getAcnum().equals(acnum)) {
				return accountArr[i];
			}
		}
		return null;
	}
}