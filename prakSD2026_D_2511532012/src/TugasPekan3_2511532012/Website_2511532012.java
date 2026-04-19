package TugasPekan3_2511532012;

public class Website_2511532012 {
	String judul_2012;
	String URL_2012;
	
	//CONSTRUCTOR
	Website_2511532012 (String judul_2012, String URL_2012) {
	this.judul_2012 = judul_2012;
	this.URL_2012 = URL_2012 ;
	}
	
	//GETTER
	public String getjudul_2012 () {
	return judul_2012;
	}
	public String getURL_2012 () {
		return URL_2012;
	}
	
	//SETTER
	public void setjudul_2012 (String judul_2012) {
		this.judul_2012 = judul_2012;
	}
	public void setURL_2012 (String URL_2012) {
		this.URL_2012 = URL_2012;
	}
	
	@Override
	public String toString () {
		return "judul : " + judul_2012 + " | " +  "URL : " + URL_2012 ;
	}
}
