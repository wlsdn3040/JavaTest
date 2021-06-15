package Bank_Account;
import java.util.Scanner;

public class Bank_Management {
	private static Account[] accountArr = new Account[100];
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		boolean op = true;
		while(op) {
			System.out.println("+-------------------------------------------------------------+");
			System.out.println("�� 1.���»��� �� 2.�Ա� �� 3.��� �� 4. �ܾ���ȸ �� 5.���¸�� �� 6. ���� ��");
			System.out.println("+-------------------------------------------------------------+");
			System.out.println("�޴�����: ");			
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
				System.out.println("�ý����� �����մϴ�.");
				op = false;
			}	
		}
	}
	private static void createAcc() {
		System.out.println("+--------------+");
		System.out.println("�� 1.���»��� ��");
		System.out.println("+--------------+");
		System.out.println("���¹�ȣ�� �Է����ּ���: ");
		String acnum = sc.next();
		System.out.println("�����ָ��� �Է����ּ���: ");
		String own = sc.next();
		System.out.println("�Ա��� �ݾ��� �Է����ּ���: ");
		int money = sc.nextInt();
		
		for(int i = 0; i < accountArr.length; i++) {
			if(accountArr[i]==null) {
			accountArr[i] = new Account(acnum, own, money);
			System.out.println("���� ���� �Ϸ�");
			System.out.println("�ܾ�: " +money);
			break;
			}
		}
	}
	private static void deposit(){
		System.out.println("+--------------+");
		System.out.println("�� 2.�Ա� ��");
		System.out.println("+--------------+");
		System.out.println("�Ա��� ���¸� �Է����ּ���: ");
		String acnum = sc.next();
		System.out.println("�Ա��� �ݾ��� �Է����ּ���: ");
		int depmoney = sc.nextInt();
		if(CheckAccount(acnum)==null) {
			System.out.println("���°� �������� �ʽ��ϴ�");
		}
		else {
			CheckAccount(acnum).setMoney(CheckAccount(acnum).getMoney() +depmoney);
			System.out.println("�ԱݿϷ�\n");
			System.out.println("�Ա��� �ܾ�:" +CheckAccount(acnum).getMoney());
		}
	}
		
	private static void withdraw(){
		System.out.println("+--------------+");
		System.out.println("�� 3.��� ��");
		System.out.println("+--------------+");
		System.out.println("����� ���¸� �Է����ּ���: ");
		String acnum = sc.next();
		System.out.println("����� �ݾ��� �Է����ּ���: ");
		int witmoney = sc.nextInt();
		if(CheckAccount(acnum)==null) {
			System.out.println("���°� �������� �ʽ��ϴ�");
		}
		else if(witmoney < CheckAccount(acnum).getMoney()){
			CheckAccount(acnum).setMoney(CheckAccount(acnum).getMoney() -witmoney);
			System.out.println("��ݿϷ�\n");
			System.out.println("����� �ܾ�:" +CheckAccount(acnum).getMoney());
		}
		else if(witmoney > CheckAccount(acnum).getMoney()) {
			System.out.println("����� �ݾ��� �� Ů�ϴ�.");
		}
	}
	
	private static void Balanceinquiry(){
		System.out.println("+--------------+");
		System.out.println("�� 4.�ܾ���ȸ ��");
		System.out.println("+--------------+");
		System.out.println("��ȸ�� ���¸� �Է����ּ���: ");
		String acnum = sc.next();
		if(CheckAccount(acnum)==null) {
			System.out.println("���°� �������� �ʽ��ϴ�");
		}
		else {
			System.out.println("�ܾ�:" +CheckAccount(acnum).getMoney());
		}
	}
	private static void AccountLists() {
		for(int i = 0; i < accountArr.length; i++) {
			if(accountArr[i]==null) {
				break;
			}
			else{
				System.out.println("���¹�ȣ: " + accountArr[i].getAcnum() + "\n������: " + accountArr[i].getOwn() + "\n�ܾ�: " + accountArr[i].getMoney());
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