package week1.day2;

public class SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Input - 456
		//Output - 4 + 5 + 6 = 15
		int input = 456;
		int rem;
		int sum = 0;
		while(input > 0)
		{
		rem = input%10;
		sum = sum + rem;
		input = input/10;
		}
		System.out.println(sum);
	}

}
