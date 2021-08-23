import java.util.Scanner;



public class BuyAndSellStock {

	public static void main(String[] args) {



		Scanner sc = new Scanner(System.in);



		System.out.println("Enter the size of array");



		int size = sc.nextInt();



		int arr[] = new int[size];

		System.out.println("Enter the elements");

		for (int i = 0; i < size; i++) {

			arr[i] = sc.nextInt();

		}



		printBuySellIndex(arr);



	}



	private static void printBuySellIndex(int[] arr) {

		int maxDifference = 0;

		int buyIndex = 0;

		int sellIndex = 0;



		for (int i = 0; i < arr.length - 1; i++) {



			for (int j = i + 1; j < arr.length; j++) {



				int difference = arr[j] - arr[i];



				if (difference > maxDifference) {

					buyIndex = i;

					sellIndex = j;

					maxDifference = difference;

				}



			}



		}



		System.out.println("Will buy at index  " + buyIndex + " and sell at index  " + sellIndex

				+ " With max profit is " + maxDifference);



	}



}