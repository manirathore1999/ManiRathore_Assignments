package CoreJavaA1;

public class q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int originalNumber, remainder, result = 0;
				for(int number=100;number<=999;number++)
				{
					originalNumber = number;
		
			        while (originalNumber != 0)
			        {
			            remainder = originalNumber % 10;
			            result += Math.pow(remainder, 3);
			            originalNumber /= 10;
			        }
		
			        if(result == number)
			        {
			        	System.out.println(number);
			        }
			            result=0;
				}
	}

}
