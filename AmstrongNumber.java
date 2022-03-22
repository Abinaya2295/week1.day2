package week1.day2;

public class AmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Armstrong Numput - input 153
		// output (1*1*1)+(5*5*5)+(3*3*3) = 153

		int input = 153;
		int org = input;
		int rem;
		int sum = 0;
		while(input > 0)
		{
		rem = input % 10;
		int cube = (rem * rem * rem);
		sum = sum + cube;
		input = input / 10;
		}
		if(sum == org)
		{
			System.out.println(org +" is a Armstrong number");
		}
		else
		{
			System.out.println(org + " is not armstrong number");
		}
	}

}
