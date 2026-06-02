package Pekan8_2511532012;

public class MargeShort_2511532012 {
	void marge(int arr[], int l, int m, int r) {
		//CARI UKURAN 2 SUBARRAY UNTUK DI MARGE
		int n1 = m - l + 1;
		int n2 = r - m;
		// CREATE TEMP ARRAY
		int L[] = new int[n1];
		int R[] = new int[n2];
	
		//COPY DATA KE TEMP ARRAY
		for (int i = 0; i < n1; ++i)
			L[i] = arr[l + i];
		 for (int j = 0; j < n2; ++j)
	            R[j] = arr[m + 1 + j];
	        int i = 0, j = 0;
	        // Initial index of merged subarray array
	        int k = l;
	        while (i < n1 && j < n2) {
	            if (L[i] <= R[j]) {
	                arr[k] = L[i];
	                i++;
	            } else {
	                arr[k] = R[j];
	                j++;
	            }
	            k++;
	        }
	        // Copy remaining elements of L[] if any
	        while (i < n1) {
	            arr[k] = L[i];
	            i++;
	            k++;
	        }
	        // Copy remaining elements of R[] if any
	        while (j < n2) {
	            arr[k] = R[j];
	            j++;
	            k++;
	        }
	}
	        void merge(int arr[], int l, int m, int r) {
	            int n1 = m - l + 1;
	            int n2 = r - m;
	            int L[] = new int[n1];
	            int R[] = new int[n2];
	            for (int i = 0; i < n1; ++i)
	                L[i] = arr[l + i];
	            for (int j = 0; j < n2; ++j)
	                R[j] = arr[m + 1 + j];
	            int i = 0, j = 0;
	            int k = l;
	            while (i < n1 && j < n2) {
	                if (L[i] <= R[j]) {
	                    arr[k] = L[i];
	                    i++;
	                } else {
	                    arr[k] = R[j];
	                    j++;
	                }
	                k++;
	            }
	            while (i < n1) {
	                arr[k] = L[i];
	                i++;
	                k++;
	            }

	            while (j < n2) {
	                arr[k] = R[j];
	                j++;
	                k++;
	            }
	        }

	        void sort(int arr[], int l, int r) {
	            if (l < r) {

	                // Find the middle point
	                int m = (l + r) / 2;

	                // Sort first and second halves
	                sort(arr, l, m);
	                sort(arr, m + 1, r);

	                // Merge the sorted halves
	                merge(arr, l, m, r);
	            }
	        }

	        // Utility function to print array
	        static void printArray(int arr[]) {
	            int n = arr.length;

	            for (int i = 0; i < n; ++i)
	                System.out.print(arr[i] + " ");

	            System.out.println();
	        }

	        public static void main(String args[]) {

	            int arr[] = {12, 11, 13, 5, 6, 7};

	            System.out.println("Sebelum terurut");
	            printArray(arr);

	            MargeShort_2511532012 ob = new MargeShort_2511532012();
	            ob.sort(arr, 0, arr.length - 1);

	            System.out.println("\nSesudah Terurut menggunakan Merge Sort");
	            printArray(arr);
	        }
	    }