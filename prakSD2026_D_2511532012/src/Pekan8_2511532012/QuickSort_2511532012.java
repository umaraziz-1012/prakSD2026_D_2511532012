package Pekan8_2511532012;

public class QuickSort_2511532012 {
	static void swap(int[] arr_2012, int i_2012, int j_2012) {
		int temp_2012 = arr_2012[i_2012];
		arr_2012[i_2012] = arr_2012[j_2012];
		arr_2012[j_2012] = temp_2012;
	}
	//METODE TAMBAH UNTUK MENGATUR PIVOT 
	static void medianoftheree ( int[] arr_2012, int low_2012, int high_2012) {
		int mid_2012 = low_2012 + (high_2012 - low_2012) / 2;
		//URUTKAN ELEMEN LOW, MID, DAN HIGH
		if (arr_2012[low_2012] > arr_2012[mid_2012]) {
			swap(arr_2012, low_2012, mid_2012);
		}
		if (arr_2012[low_2012] > arr_2012[high_2012]) {
			swap(arr_2012, low_2012, high_2012);
		}
		if (arr_2012[mid_2012] > arr_2012[high_2012]) {
			swap(arr_2012, mid_2012, high_2012);
		}
		swap(arr_2012, mid_2012, high_2012);
	}
	static int pertition(int[] arr_2012, int low_2012, int high_2012) {
		//panggil fungsi median of tree
		medianoftheree(arr_2012, low_2012, high_2012);
		int pivot_2012 = arr_2012[high_2012];
		int i_2012 = low_2012 - 1;
		
		for (int j_2012 = low_2012; j_2012 <= high_2012 - 1; j_2012++) {
			//jika elemenn saat ini sama atauu lebih kecil dari pivot
			if (arr_2012[j_2012] < pivot_2012) {
			i_2012++;
			swap(arr_2012, i_2012, j_2012);
		}
	}
	swap(arr_2012, i_2012 + 1, high_2012);
	return (i_2012 + 1);
	}
	
	static void QuickSort(int[] arr_2012, int low_2012, int high_2012) {
		if (low_2012 < high_2012) {
			int pi_2012 = pertition(arr_2012, low_2012, high_2012);
			QuickSort(arr_2012, low_2012, pi_2012 - 1);
			QuickSort(arr_2012, pi_2012 + 1, high_2012);
		}
	}
	
	public static void printArr(int[] arr_2012) {
		for (int i_2012 = 0; i_2012 < arr_2012.length; i_2012++) {
			System.out.print(arr_2012[i_2012] + " ");
		}
		System.out.println();
	}

	public static void main(String[] args_2012) {
		int[] arr_2012 = {10,7,8,9,1,5};
		int N_2012 = arr_2012.length;
		System.out.print("DATA SEBELUM DI URUT : ");
		printArr(arr_2012);
		
		QuickSort(arr_2012, 0, N_2012 - 1);
		
		System.out.print("DATA TERURUT QUICKSORT : ");
		printArr(arr_2012);
	}
}