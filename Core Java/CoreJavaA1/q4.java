package CoreJavaA1;

import java.util.Scanner;

public class q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int marks[]=new int[3];
		int counter=0;
		for (int i=0;i<3;i++) {
			marks[i]=sc.nextInt();
			if(marks[i]>60)
				counter++;
		}
		switch (counter) {
		case 1:
			System.out.println("Student failed");
			break;
		case 2:
			System.out.println("Student promoted");
			break;
		case 3:
			System.out.println("Student passed");
			break;
		default:
			System.out.println("Student failed");
		}
	}

}
