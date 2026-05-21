package TugasPekan7_2511532012;

public class ADTMahasiswa_2511532012 {
	String  nama_2012;
	String  nim_2012;
	String  prodi_2012;
	
	public String getnama_2012() {
		return nama_2012;
	}
	public String getnim_2012() {
		return nim_2012;
	}
	public String getprodi_2012() {
		return prodi_2012;
	}
	public void setmahasiswa_2012(String nama_2012) {
		this.nama_2012=nama_2012;
	}
	public void setnim_2012(String nim_2012) {
		this.nim_2012=nim_2012;
	}
	public void setprodi_2012 (String prodi_2012) {
		this.prodi_2012=prodi_2012;
	}
	public ADTMahasiswa_2511532012(String nama_2012, String nim_2012, String prodi_2012) {
		this.nama_2012=nama_2012;
		this.nim_2012=nim_2012;
		this.prodi_2012=prodi_2012;
	}
	
	public String tostring() {
		return nama_2012 + "-" + nim_2012 + "-" + prodi_2012;
	}
}
