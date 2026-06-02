package Pekan8_2511532012;

public class ShellSort_25112012 {
	public static void ShellSort(int[] A_2012) {
		int n_2012 = A_2012.length;
		int gap_2012 = n_2012/2;
		while (gap_2012 > 0 ) {
			for (int i_2012 = gap_2012; i_2012 < n_2012; i_2012++) {
				int temp_2012 = A_2012[i_2012];
				int j_2012 = i_2012;
				while (j_2012 >= gap_2012 && A_2012[j_2012 - gap_2012] > temp_2012) {
					A_2012[j_2012] = A_2012[j_2012 - gap_2012];
					j_2012 = j_2012 - gap_2012;
				}
				A_2012[j_2012] = temp_2012;
			}
			gap_2012 = gap_2012 / 2;
		}
	}
	public static void printarray(int[] arr_2012) {
		for (int i_2012 : arr_2012) 
		System.out.print(i_2012 + " ");
		System.out.println();
	}
	
	
public static void main(String [] args_2012) {
	int [] data_2012 = {3,10,4,6,8,9,7,2,1,5};
	System.out.print("DATA SEBELUM : ");
	printarray(data_2012);
	
	ShellSort(data_2012);
	
	System.out.print("DATA SESUDAH (SHELLSORT) ");
	printarray(data_2012);
}
}