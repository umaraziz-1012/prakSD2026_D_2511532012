package TugasPekan2_2511532012;

public class Musik_2511532012 {
	String judul_2012;
	String penyayi_2012;
	int durasi_2012;
	
	//CONSTRUKTOR
	Musik_2511532012 (String judul_2012, String penyayi_2012, int durasi_2012) {
		this.judul_2012 = judul_2012;
		this.durasi_2012 = durasi_2012;
		this.penyayi_2012 = penyayi_2012;
	}
	
	//GETTER
	public String getjudul_2012() {
		return judul_2012;
	}
	public int getdurasi_2012() {
		return durasi_2012;
	}
	public String getpenyayi_2012() {
		return penyayi_2012;
	}
	
	//SETTER
	public void setjudul_2012(String judul_2012) {
		this.judul_2012 = judul_2012;
	}
	public void setpenyayi_2012(String penyayi_2012) {
		this.penyayi_2012 = penyayi_2012;
	}
	public void setdurasi_2012(int durasi_2012) {
		this.durasi_2012 = durasi_2012;
	}
	
	
	@Override
	public String toString() {
			return "judul : " + judul_2012 + "| penyayi :" + penyayi_2012 + "| durasi : " + durasi_2012 + " Detk";
			
	}

}
