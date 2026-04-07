package Pekan2_2511532012;
import java.util.ArrayList;
public class DaftarKata_2511532012 {
	private final ArrayList<String> data;
	public DaftarKata_2511532012() {
		this.data = new ArrayList<>();
	}
	public void tambah (String elemen) {
		data.add(elemen);
	}
	/** Menambahkan elemen pada indekks tertentu (menyisipkan). */
	public void tambahPada (int index, String elemen) {
		data.add(index, elemen);
	}
	public void ubahElemen(int index, String nilaiBaru) {
		data.set(index, nilaiBaru);
	}
	public String hapusElemen(int index) {
		return data.remove(index);
	}
	public void iterasiCetak() {
		for (int i = 0; i < data.size(); i++) {
			System.out.println(data.get(i)+ " ");
		}
	}
	public String get (int index) {
		return data.get(index);
	}
	
	@Override
	public String toString() {
		return data.toString();
	}
}
