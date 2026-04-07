package Pekan2_2511532012;
public class Mahasiswa_2511532012 {
	String nim;
	String nama;
	String prodi;
	Mahasiswa_2511532012 (String nim, String nama, String prodi) {
		this.nim = nim;
		this.nama = nama;
		this.prodi = prodi;
	}
	@Override
	public String toString() {
		return "NIM: " + nim + ", NAMA: " + nama + ", Prodi: " + prodi ; 
	}

}
