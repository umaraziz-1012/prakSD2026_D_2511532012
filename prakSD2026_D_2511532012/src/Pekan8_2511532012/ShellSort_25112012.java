package Pekan8_2511532012;

public class ShellSort_25112012 {
	public static void ShellSort(int[] A) {
		int n = A.length;
		int gap = n/2;
		while (gap > 0 ) {
			for (int i = gap; i<n ; i++) {
				int temp = A[i];
				int j = i;
				while (j >= gap && A[j - gap] > temp) {
					A[j] = A[j - gap];
					j = j - gap;
				}
				A[j] = temp;
			}
			gap = gap / 2;
		}
	}
	public static void printarray(int[] arr) {
		for (int i : arr) 
		System.out.print(i + " ");
		System.out.println();
	}
	
	
public static void main(String [] args) {
	int [] data = {3,10,4,6,8,9,7,2,1,5};
	System.out.print("DATA SEBELUM : ");
	printarray(data);
	
	ShellSort(data);
	
	System.out.print("DATA SESUDAH (SHELLSORT) ");
	printarray(data);
}
}
