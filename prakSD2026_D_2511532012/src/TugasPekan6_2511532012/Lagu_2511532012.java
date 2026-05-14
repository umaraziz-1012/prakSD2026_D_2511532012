package TugasPekan6_2511532012;

public class Lagu_2511532012 {
	private String judul_2012;
	private String penyanyi_2012;
	private Lagu_2511532012 next_2012;
	private Lagu_2511532012 prev_2012;
	
	//GETTER 
	public String getJudul_2012 () {
		return judul_2012;
	}
	public String getpenyanyi_2012 () {
		return penyanyi_2012;
	}
	public Lagu_2511532012 getnext_2012 () {
		return next_2012;
	}
	public Lagu_2511532012 getprev_2012 () {
		return prev_2012;
	}
	
	//SETTER
	public void setjudul_2012(String judul_2012) {
		this.judul_2012 = judul_2012;
	}
	public void setpenyanyi_2012 (String penyanyi_2012) {
		this.penyanyi_2012 = penyanyi_2012;
	}
	public void setnext_2012 ( Lagu_2511532012 next_2012) {
		this.next_2012 = next_2012;
	}
	public void setprev_2012 (Lagu_2511532012 prev_2012) {
		this.prev_2012 = prev_2012;
	}
	
	//CONSTRUCTOR
	public Lagu_2511532012 ( String judul_2012 ,String penyanyi_2012 ) {
		this.judul_2012 = judul_2012;
		this.penyanyi_2012 = penyanyi_2012;
		this.next_2012 = null;
		this.prev_2012 = null;
	}
}
