package Bank_Account;

public class Account {
	private String acnum;
	private String own;
	private int money;
	
	public Account(String acnum, String own, int money) {
		this.acnum = acnum;
		this.money = money;
		this.own = own;
	}
	public String getAcnum() {
		return acnum;
	}
	public void setAcnum(String acnum) {
		this.acnum = acnum;
	}
	public String getOwn() {
		return own;
	}
	public void setOwn(String own) {
		this.own = own;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
}
