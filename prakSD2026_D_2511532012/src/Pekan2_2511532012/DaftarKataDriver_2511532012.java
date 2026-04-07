package Pekan2_2511532012;

public class DaftarKataDriver_2511532012 {

	public static void main(String[] args) {
		DaftarKata_2511532012 a1 = new DaftarKata_2511532012();
		
		a1.tambah("Kami");
		a1.tambah("Informatika");
		
		a1.tambahPada(1, "Mahasiswa");
		
		System.out.println("Awal 	: " + a1);
		
		a1.ubahElemen(1, "Department");
		System.out.println("Setelah Unah : " + a1);
		
		String terhapus = a1.hapusElemen(0);
		System.out.println("Terhapus : " + terhapus);
		System.out.println("Setelah Hapus :" + a1);
		
		System.out.println("Iterasi :");
		a1.iterasiCetak();
		System.out.println();
	}

}
