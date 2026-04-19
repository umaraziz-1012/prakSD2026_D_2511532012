package TugasPekan2_2511532012;
import java.util.ArrayList;
import java.util.Scanner;

public class DriveMusik_2511532012 {
 //MENAMPILKAN MENU
	public static void tampilkanMenu() {
		System.out.println("\n=== Playlist Musik NIM: 2511532012 ===  : ");
		System.out.println("1.Tambah Lagu  ");
		System.out.println("2.Lihat Playlist  ");
		System.out.println("3.Hapus lagu ");
		System.out.println("4.Cek Kapasitas  ");
		System.out.println("5.Keluar  ");
	}
//TAMBAH MUSIK
	public static void tambahMusik_2511532012(ArrayList<Musik_2511532012> list,Scanner sc) {
		System.out.print("Masukkan Judul : ");
		String judul_2012 = sc.nextLine();
		System.out.print("Masukkan penyayi : ");
		String penyayi_2012 = sc.nextLine();
		System.out.print("Lama Durasi : ");
		int durasi_2012 = sc.nextInt();
		list.add(new Musik_2511532012 (judul_2012, penyayi_2012, durasi_2012));
		System.out.println("Musik berhasil di tambahkan ke playlist");
	}
//MENAMPILKAN MUSIK 
	public static void tampilkanMusik_2511532012(ArrayList<Musik_2511532012> list ) {
		if (list.isEmpty ()) {
			System.out.println("Daftar Playlist Kosong");
		}else {
			System.out.println("Playlist : ");
			for (Musik_2511532012 msc : list) {
				System.out.println(msc);
			}
		}
	}
	
//MENGHAPUS MUSIK
	public static void hapusMusik_2511532012 (ArrayList<Musik_2511532012> list, Scanner sc) {
		System.out.print("Masukkan Judul yg mau di hapus :");
		String judul_2012Hapus = sc.nextLine();
		boolean removed = list.removeIf (msc -> msc.judul_2012.equals(judul_2012Hapus));
		
		if (removed) {
			System.out.println("lagu dengan judul " + judul_2012Hapus + " Berhasil di hapus");
		}else {
			System.out.println("Judul tidak di temukan");
		}
	}	
	
// CEK BANYAK PLAYLIST
	public static void cekkapasistasMusik_2511532012 (ArrayList<Musik_2511532012> list) {
		System.out.println("jumlah lagu : " + list.size());
	}
	
		public static void main (String [] args) {
			ArrayList<Musik_2511532012> MusikList = new ArrayList<>();
			Scanner scanner = new Scanner (System.in);
			int choice;
			
			do {
				tampilkanMenu();
				System.out.print("pilih menu : ");
				choice = scanner.nextInt();
				scanner.nextLine();
				
				switch (choice) {
				case 1 :
					tambahMusik_2511532012 (MusikList, scanner);
					break;
				case 2 :
					tampilkanMusik_2511532012 (MusikList);
					break;
				case 3 :
					hapusMusik_2511532012 (MusikList, scanner);
					break;
				case 4 :
					cekkapasistasMusik_2511532012 (MusikList);
					break;
				case 5 :
					System.out.println("Keluar DarI Program");
					break;
				default :
					System.out.println("pilihan tidak valid");
				}
			}while (choice != 5);
			scanner.close();
	}
}
