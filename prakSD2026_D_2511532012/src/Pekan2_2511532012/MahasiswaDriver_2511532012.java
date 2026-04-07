package Pekan2_2511532012;
import java.util.ArrayList;
import java.util.Scanner;

public class MahasiswaDriver_2511532012 {

	public static void tampilkanMenu() {
		System.out.println("\nMenu : ");
		System.out.println("1. Tambah Mahasiswa ");
		System.out.println("2. Tampilkan Semua Mahasiswa ");
		System.out.println("3. Hapus Mahasiswa Bedasarkan NIM ");
		System.out.println("4. Cari Mahasiswa Bedasrkan NIM");
		System.out.println("5. Keluar");
	}
	public static void tambahMahasiswa_2511532012(ArrayList<Mahasiswa_2511532012> list, Scanner sc) {
		System.out.println("Masukkan NIM :");
		String nim = sc.nextLine();
		System.out.println("Masukkan Nama :");
		String nama = sc.nextLine();
		System.out.println("Masukkan Prodi :");
		String Prodi = sc.nextLine();
		list.add(new Mahasiswa_2511532012 (nim, nama, Prodi));
		System.out.println("Mahasiswa Berhasil Di Tmabhakan.");
	}
	
	public static void tampilkanSemuaMahasiswa_2511532012(ArrayList<Mahasiswa_2511532012> list ) {
		if (list.isEmpty ()) {
			System.out.println("Daftar Mahasiswa Kosong.");
		} else {
			System.out.println("Data Mahasiswa : ");
			for (Mahasiswa_2511532012 mhs : list ) {
				System.out.println(mhs);
			}
		}
	}
	
	public static void hapusMahasiswa_2511532012 (ArrayList<Mahasiswa_2511532012> list, Scanner sc ) {
		System.out.println("Masukkan NIM Yang Akan Di Hapus :");
		String nimHapus = sc.nextLine();
		boolean removed = list.removeIf (mhs -> mhs.nim.equals(nimHapus));
		
		if (removed) {
			System.out.println("Data Dengan NIM " + nimHapus + " Berhasil Di Hapus");
		} else {
			System.out.println("NIM Tidak Di Temukan");
		}
	}
	
	public static void cariMahasiswa_2511532012 (ArrayList<Mahasiswa_2511532012> list, Scanner sc ) {
		System.out.println("NIM Mahasiswa yang di Cari : ");
		String nimCari = sc.nextLine();
		boolean ditemukan = false;
		}
	public static void main (String [] args) {
		ArrayList<Mahasiswa_2511532012> mahasiswaList = new ArrayList<>();
		Scanner scanner = new Scanner (System.in);
		int choice;
	 
	do {
		tampilkanMenu();
		System.out.println("Pilih Menu : ");
		choice = scanner.nextInt();
		scanner.nextLine(); 
		
		switch  (choice) {
		case 1 : 
			tambahMahasiswa_2511532012 (mahasiswaList, scanner);
			break;
		case 2 :
			tampilkanSemuaMahasiswa_2511532012 (mahasiswaList);
			break;
		case 3 :
			hapusMahasiswa_2511532012(mahasiswaList, scanner);
			break;
		case 4 :
			cariMahasiswa_2511532012(mahasiswaList, scanner);
			break;
		case 5 :
			System.out.println("Keluar dari program.");
			break ;
		default :
			System.out.println("Pilihan Tidak Valid.");
		}
	} while (choice != 5);
	scanner.close();
}
}
