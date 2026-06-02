package Pekan8_2511532012;

public class QuickSort_2511532012 {
	static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr [i] = arr[j];
		arr[j] = temp;
	}
	//METODE TAMBAH UNTUK MEGATUR PIVOT 
	static void medianoftheree ( int[] arr, int low, int high) {
		int mid = low + (high - low) / 2;
		//URUTKAN ELEMEN LOW, MID, DAN HIGH
		if (arr[low] > arr[mid]) {
			swap(arr, low, mid );
		}
		if (arr[low] > arr[high]) {
			swap( arr, low, high);
		}
		if (arr[mid] > arr[high]) {
			swap (arr, mid, high);
		}
		swap(arr, mid, high);
	}
	static int pertition(int[] arr, int low, int high) {
		//panggil fungsi median of tree
		medianoftheree(arr, low, high);
		int pivot = arr[high];
		int i = low-1;
		
		for (int j = low; j <= high - 1; j++) {
			//jika elemenn saat ini sama atauu lebih kecil dari pivot
			if (arr[j] < pivot) {
			i++;
			swap( arr, i, j);
		}
	}
	swap(arr, i + 1, high);
	return (i + 1);
	}
	
	static void QuickSort(int[] arr, int low, int high) {
		if ( low < high) {
			int pi = pertition( arr, low, high);
			QuickSort (arr, low, pi - 1);
			QuickSort (arr, pi + 1, high);
		}
	}
	
	public static void printArr(int[] arr) {
		for ( int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		int [] arr = {10,7, 8,9,1,5};
		int N = arr.length;
		System.out.print("DATA SEBELUM DI URUT : ");
		printArr(arr);
		
		QuickSort(arr, 0, N-1);
		
		System.out.print("DATA TERURUT QUICKSHORT : ");
		printArr(arr);
	
	}
}
