package week1.day2;

import java.util.Arrays;

public class MissingElementInAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Here is the input

		int[] arr = {1,2,3,4,6,7,8};
		Arrays.sort(arr);
		for(int i=arr[0]; i<arr.length; i++)
		{
			if(i != arr[i-1])
			{
				System.out.println(i);
				break;
			}
		}
		
	
		//Another concept
//		int[] arr = {1,2,3,4,7,6,8};
//		int sum = 0;
//		Arrays.sort(arr);
//		for(int i=0; i<arr.length; i++)
//		{
//			sum = sum + arr[i];
//		}
//		System.out.println(sum);
//		int sum1 = 0;
//		for(int j=1; j<=arr.length+1; j++)
//		{
//			sum1 = sum1 + j;
//		}
//		System.out.println(sum1);
//		System.out.println("Missing Element in the array is : "+(sum1-sum));
		
	
	}
}


