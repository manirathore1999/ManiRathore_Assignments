package CoreJavaA2;

public class q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double balance=30000;
		double credit=10000;
		int deposit=15000;
		System.out.println(getTotalCash(balance, credit));
		System.out.println(getTotalCash(balance, deposit));
	}
	
	public static double getTotalCash(double balance,int deposit) {
		System.out.print("In savings account : ");
		return balance+deposit;
	}
	public static double getTotalCash(double balance,double credit) {
		System.out.print("In current account : ");
		return balance+credit;
	}

}
