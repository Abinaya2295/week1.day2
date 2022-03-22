package week1.day2;

import java.util.Arrays;

public class FindSecondLargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {3,2,11,4,6,7};

		// To find the length
//		int x = a.length;
//		System.out.println(a.length);
		
		// To find the array index
//		System.out.println(a[2]);

		// Sorting in ascending order
//		Arrays.sort(a);
//		for(int i = 0; i<a.length; i++)
//		{
//			System.out.println(a[i]);
//		}
		//Sort by descending order
//		Arrays.sort(a);
//		for(int i = a.length-1; i>=0; i--)
//		{
//			System.out.println(a[i]);
//		}
		
		// To find second largest number
		Arrays.sort(a);
		System.out.println(a[a.length-2] + " is the seond largest number in the given series");
		
	
	}


}
