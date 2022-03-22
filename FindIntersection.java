package week1.day2;

public class FindIntersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {3,2,11,4,6,7};
		int[] arr1 = {1,2,8,4,9,7};
		int arrlength = arr.length;
		int arr1length = arr1.length;
		for(int i=0; i<arrlength; i++)
		{
			for(int j=0; j<arr1length; j++)
			{
				if(arr[i] == arr1[j])
				{
					System.out.println(arr[i]);
				}
			}
		}

	}

}
