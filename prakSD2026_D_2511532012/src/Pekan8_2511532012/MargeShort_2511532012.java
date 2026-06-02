package Pekan8_2511532012;

public class MergeSort_2511532012 {
	void merge_2012(int arr_2012[], int l_2012, int m_2012, int r_2012) {
		//CARI UKURAN 2 SUBARRAY UNTUK DI MERGE
		int n1_2012 = m_2012 - l_2012 + 1;
		int n2_2012 = r_2012 - m_2012;
		// CREATE TEMP ARRAY
		int L_2012[] = new int[n1_2012];
		int R_2012[] = new int[n2_2012];
	
		//COPY DATA KE TEMP ARRAY
		for (int i_2012 = 0; i_2012 < n1_2012; ++i_2012)
			L_2012[i_2012] = arr_2012[l_2012 + i_2012];
		 for (int j_2012 = 0; j_2012 < n2_2012; ++j_2012)
	            R_2012[j_2012] = arr_2012[m_2012 + 1 + j_2012];
	        int i_2012 = 0, j_2012 = 0;
	        // Initial index of merged subarray array
	        int k_2012 = l_2012;
	        while (i_2012 < n1_2012 && j_2012 < n2_2012) {
	            if (L_2012[i_2012] <= R_2012[j_2012]) {
	                arr_2012[k_2012] = L_2012[i_2012];
	                i_2012++;
	            } else {
	                arr_2012[k_2012] = R_2012[j_2012];
	                j_2012++;
	            }
	            k_2012++;
	        }
	        // Copy remaining elements of L[] if any
	        while (i_2012 < n1_2012) {
	            arr_2012[k_2012] = L_2012[i_2012];
	            i_2012++;
	            k_2012++;
	        }
	        // Copy remaining elements of R[] if any
	        while (j_2012 < n2_2012) {
	            arr_2012[k_2012] = R_2012[j_2012];
	            j_2012++;
	            k_2012++;
	        }
	}
	        
	void sort_2012(int arr_2012[], int l_2012, int r_2012) {
		if (l_2012 < r_2012) {
			// Find the middle point
			int m_2012 = (l_2012 + r_2012) / 2;
			// Sort first and second halves
			sort_2012(arr_2012, l_2012, m_2012);
			sort_2012(arr_2012, m_2012 + 1, r_2012);
			// Merge the sorted halves
			merge_2012(arr_2012, l_2012, m_2012, r_2012);
		}
	}
	
	// Utility function to print array
	static void printArray_2012(int arr_2012[]) {
		int n_2012 = arr_2012.length;
		for (int i_2012 = 0; i_2012 < n_2012; ++i_2012)
			System.out.print(arr_2012[i_2012] + " ");
		System.out.println();
	}
	
	public static void main(String args_2012[]) {
		int arr_2012[] = {12, 11, 13, 5, 6, 7};
		System.out.println("Sebelum terurut");
		printArray_2012(arr_2012);
		
		MergeSort_2511532012 ob_2012 = new MergeSort_2511532012();
		ob_2012.sort_2012(arr_2012, 0, arr_2012.length - 1);
		
		System.out.println("\nSesudah Terurut menggunakan Merge Sort");
		printArray_2012(arr_2012);
	}
}