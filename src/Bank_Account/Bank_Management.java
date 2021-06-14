package Bank_Account;
import java.util.Scanner;

public class Bank_Management {
	private static Account[] accountArr = new Account[100];
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		boolean op = true;
		while(op) {
			System.out.println("+---------------------------------------------------+");
			System.out.println("�� 1.���»��� �� 2.�Ա� �� 3.��� �� 4. �ܾ���ȸ �� 5. ���� ��");
			System.out.println("+---------------------------------------------------+");
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
			if(selmenu ==  5) {
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
			accountArr[i] = new Account(acnum, own, money);
			System.out.println("���� ���� �Ϸ�");
			System.out.println("�ܾ�: " +money);
			break;
		}
	}
	private static void deposit(){
		System.out.println("+--------------+");
		System.out.println("�� 2.�Ա� ��");
		System.out.println("+--------------+");
		System.out.println("�Ա��� �ݾ��� �Է����ּ���: ");
		int depmoney = sc.nextInt();
	}
	private static void withdraw(){
		System.out.println("+--------------+");
		System.out.println("�� 3.��� ��");
		System.out.println("+--------------+");
	}
	private static void Balanceinquiry(){
		System.out.println("+--------------+");
		System.out.println("�� 4.�ܾ���ȸ ��");
		System.out.println("+--------------+");
	}
}
