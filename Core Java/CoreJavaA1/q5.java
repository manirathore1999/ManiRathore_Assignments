package CoreJavaA1;

import java.util.Scanner;

public class q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double tax=0,it;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter income ");
		it=sc.nextDouble();
		if(it<=180000)
			tax=0;
		else if(it<=300000)
			tax=0.1*(it-181000);
		else if(it<=500000)
			tax=(0.2*(it-300000))+(0.1*181000);
		else if(it<=1000000)
			tax=(0.3*(it-500000))+(0.2*300000)+(0.1*181000);
		
		System.out.println("Income tax amount is "+tax);

	}

}
