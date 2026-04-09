package Pekan1_2511532012;

public class Jam_2511532012 {
	private int hh; // 0..23
	private int mm; // 0..59
	private int ss; // 0.59
	
	// --- Validator ---
	public static boolean isValid(int h, int m, int s) {
		return (0 <= h && h <= 23) && (0 <= m && m <= 59) && (0 <= s && s <= 59);
	}
	
	// -- Konstruktor / Kreator --
	public Jam_2511532012(int h, int m, int s) {
		this.hh = h; this.mm = m; this.ss = s;
	}
	
	// --- Selektor ---
	public int getHour() { return hh; }
	public int getMinute() { return mm; }
	public int getSecond() { return ss; }
	
	// --- Mutator ---
	public void setHour(int h) {this.hh = h; }
	public void setMinute (int m) {this.mm = m; }
	public void setSecond (int s) {this.ss = s; }
	
	// --- Konversi ---
	public int toSecond() {return hh + 3600 + mm * 60 + ss; }
	public static Jam_2511532012 fromSeconds (int total) {
		if (total < 0) throw new IllegalArgumentException("detik negatif");
		total %= 24 * 3600; // wrap 24 jam
		int h = total / 3600; total %= 3600;
		int m = total / 60; int s = total % 60;
		return new Jam_2511532012(h, m, s);	
	}
	
	// --- Relasional _
	public int compareTo (Jam_2511532012 other) { return Integer.compare(this.toSecond(), other.toSecond()); }
	public boolean equals(Object o) {
		if (!(o instanceof Jam_2511532012 j)) return false;
		return hh == j.hh && mm == j.mm && ss == j.ss;
	}
	public int hashCode() {return java.util.Objects.hash(hh, mm, ss); }
	
	// --- Aritmatika ---
	public Jam_2511532012 plus (Jam_2511532012 other) {return fromSeconds(this.toSecond() + other.toSecond()); }
	public Jam_2511532012 minus (Jam_2511532012 other) {return fromSeconds(Math.floorMod(this.toSecond() - other.toSecond(), 24*3600)); }
	public Jam_2511532012 nextSecond() { return fromSeconds(this.toSecond() + 1); }
	public Jam_2511532012 nextNSeconds (int n) { return fromSeconds(this.toSecond() + Math.max(0,  n)); }
	public Jam_2511532012 prevSeconds() { return fromSeconds(Math.floorMod(this.toSecond() - 1, 24*3600)); }
	public Jam_2511532012 prevNSeconds (int n) { return fromSeconds(Math.floorMod(this.toSecond() - Math.max(0, n), 24*3600)); }
	
	// --- Durasi (detik) --- bisa negatif jika this > other? sesuai spesifikasi durasi (JAw,JAkh)
	public static int durasiDetik(Jam_2511532012 jaw, Jam_2511532012 jakh) {return jakh.toSecond() - jaw.toSecond(); }
	// overriding ke string
	public String toString() { return String.format("%02d:%02d", hh, mm, ss); } 

}
