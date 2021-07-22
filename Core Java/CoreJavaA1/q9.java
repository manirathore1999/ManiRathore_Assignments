package CoreJavaA1;

import java.util.Scanner;

public class q9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int subA[]=new int[3];
		int subB[]=new int[3];
		int subC[]=new int[3];
		
		Scanner sc=new Scanner(System.in);
		
		for(int i=0;i<3;i++)
		{
			subA[i]=sc.nextInt();
		}
		for(int i=0;i<3;i++)
		{
			subB[i]=sc.nextInt();
		}
		for(int i=0;i<3;i++)
		{
			subC[i]=sc.nextInt();
		}
		int totA=0,totB=0,totC=0;
		for(int i=0;i<3;i++) {
			totA+=subA[i];
			totB+=subB[i];
			totC+=subC[i];
		}
		System.out.println("Total of Subject A : "+totA+" Average : "+totA/3);
		System.out.println("Total of Subject B : "+totB+" Average : "+totB/3);
		System.out.println("Total of Subject C : "+totC+" Average : "+totC/3);
		
		double stu[]=new double[3]; 
		for(int i=0;i<3;i++) {
			stu[i]=subA[i]+subB[i]+subC[i];
		}
		for(int i=0;i<3;i++) {
			System.out.println("Student "+(i+1)+" :");
			System.out.println("Total : "+stu[i]+" Average : "+stu[i]/3);
		}
	}

}
