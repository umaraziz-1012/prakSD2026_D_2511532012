package Pekan7_2511532012;

public class InsertionSort_2511532012 {
	public static void insertionSort_2511532012 (int[] arr) {
		int n = arr.length;
		for (int i=1;i<n;i++){
			int key = arr[i];
			int j = i - 1;
			while ( j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j+1] = key;
		}
	}
	public static void main(String [] args) {
		int arr[] = {23, 78, 45, 8, 32, 56, 1};
		int n = arr.length;
		System.out.printf("array yang belum teruryt : \n");
		for (int i=0;i<n;i++)
			System.out.print(arr[i] + " ");
		System.out.println(" ");
		insertionSort_2511532012(arr);
		System.out.printf("array yang terurut :\n");
		for (int i=0;i<n;i++)
			System.out.print(arr[i] + " ");
		System.out.println("");
	}

}
