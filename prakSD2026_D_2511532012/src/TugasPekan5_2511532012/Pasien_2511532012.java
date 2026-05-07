package TugasPekan5_2511532012;

public class Pasien_2511532012 {
	String nama;
	String penyakit;
	int antrian ;
	Pasien_2511532012 next;
	
	//CONSTRUCTOR 
	public Pasien_2511532012(String nama, String penyakit, int antrian) {
		this.nama = nama;
		this.penyakit = penyakit;
		this.antrian = antrian;
		this.next = null;

}
	//GETTER
	public String getnama() {
		return nama;
	}
	public String getpenyakit() {
		return penyakit;
	}
	public int getantrian() {
		return antrian;
	}
	public Pasien_2511532012 getnext() {
	    return next;
	}
	
	//SETER
	public void setnama(String nama) {
		this.nama = nama;
	}
	public void setpenyakit(String penyakit) {
		this.penyakit = penyakit;
	}
	public void setantrian(int antrian) {
		this.antrian = antrian;
	}
	public void setnext(Pasien_2511532012 next) {
		this.next = next;
	}
}
