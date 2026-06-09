package TugasPekan8_2511532012;
import java.util.ArrayList;
import java.util.Scanner;

public class Sorting_2511532012 {
	//MENAMPILKAN MENU
		public static void tampilkanMenu() {
			System.out.println("\n=== Playlist Musik NIM: 2511532012 ===  : ");
			System.out.println("1.Tambah Lagu  ");
			System.out.println("2.Shell Sort  ");
			System.out.println("3.Quick Sort  ");
			System.out.println("4.Merge Sort  ");
			System.out.println("5.Tampilkan Data ");
			System.out.println("6.Keluar  ");
}
	//TAMBAH MUSIK
		public static void tambahMusik_2012(ArrayList<Lagu_2511532012> list,Scanner sc) {
			System.out.print("Masukkan Judul : ");
			String judul_2012 = sc.nextLine();
			System.out.print("Masukkan penyayi : ");
			String penyayi_2012 = sc.nextLine();
			System.out.print("Lama Durasi : ");
			int durasi_2012 = sc.nextInt();
			list.add(new Lagu_2511532012 (judul_2012, penyayi_2012, durasi_2012));
			System.out.println("Musik berhasil di tambahkan ke playlist");
}
		public static void shellsort_2012(ArrayList<Lagu_2511532012>list) {
			int n_2012 = list.size();
			int gap_2012 = n_2012/2;
			while (gap_2012 > 0 ) {
				for (int i_2012 = gap_2012; i_2012 < n_2012; i_2012++) {
				Lagu_2511532012 temp_2012 = list.get(i_2012);
				int j_2012 = i_2012;
				
				while (j_2012 >= gap_2012 && list.get(j_2012 - gap_2012).getjudul_2012().compareTo(temp_2012.getjudul_2012()) > 0) {
					list.set(j_2012, list.get(j_2012 - gap_2012));
                    j_2012 -= gap_2012;
                }
                list.set(j_2012, temp_2012);
            }
            gap_2012 /= 2;
}
}
		public static void tampilkandata_2012(ArrayList<Lagu_2511532012>list) {
			if (list.isEmpty()) {
				System.out.println("Playlist kosong!");
	            return;
			}else {
				System.out.print("Lagu");
				for(Lagu_2511532012 msc : list) {
					System.out.print(msc);
				}
			}
			
		}
		 public static void printArray(String[] arr_2012) {
		        for (String data : arr_2012) {
		        System.out.print(data + " ");
}
		        System.out.println();
}
		 public static void main(String []  args) {
			 ArrayList<Lagu_2511532012> musiklist = new ArrayList<>();
			 Scanner scanner = new Scanner (System.in);
			 int choice;
			 
			 do {
				 tampilkanMenu();
				 System.out.print("Pilih Menu : ");
				 choice = scanner.nextInt();
				 scanner.nextLine();
				 
				 switch (choice) {
				 case 1:
					 tambahMusik_2012 (musiklist, scanner);
					 break;
					 
				 case 2:
	                    if (musiklist.isEmpty()) {
	                        System.out.println("Playlist masih kosong! Tambahkan lagu terlebih dahulu.");
	                    } else {
	                        shellsort_2012(musiklist);
	                        System.out.println("Data setelah Shell Sort:");
	                        tampilkandata_2012(musiklist);
	                    }
	                    break;
				
				default :
					System.out.println("pilihan tidak valid");
			 
			 }
		 }while (choice != 6);
		  scanner.close();
 
}	 
}	 
		 
		 
		 
		 

