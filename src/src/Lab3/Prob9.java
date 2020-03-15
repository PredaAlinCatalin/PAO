package Lab3;

import java.util.Arrays;
public class Prob9 {

	public static int[] met(int arr[], int elem)
	{
		int index = Arrays.binarySearch(arr, elem);
		int arr2[] = Arrays.copyOfRange(arr, index - 1, arr.length);
		return arr2;
	}
	public static void main(String []args)
	{
		int arr[] = {1, 2, 3, 4};
		int elem = 3;
		int arr2[] = met(arr, elem);
		System.out.println(Arrays.toString(arr) + "\n" + Arrays.toString(arr2));
	}
}
