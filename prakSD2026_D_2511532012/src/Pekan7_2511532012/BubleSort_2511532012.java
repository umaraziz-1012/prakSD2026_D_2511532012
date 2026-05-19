package Pekan7_2511532012;

public class BubleSort_2511532012 {
public static void BubleSort_2511532012(int[] arr) {
	int n = arr.length;
	for (int j=0;j<n;j++) {
		if (arr[j]>arr[j+1]) {
			int temp = arr[j];
			arr[j]=arr[j+1];
			arr[j+1]=temp;
		}
	}
}
public static void main(String [] args) {
	int arr[] = {23, 78, 45, 8, 32, 56, 1};
	int n = arr.length;
	System.out.printf("array yang belum terurut :\n");
	for (int i=0;i<n;i++)
		System.out.print(arr [i] + " ");
	System.out.println("");
	BubleSort_2511532012(arr);
	System.out.print("array yang terurut :\n");
	for (int i=0;i<n;i++)
		System.out.print(arr[i] + " ");
	System.out.println("");
	
}
}
