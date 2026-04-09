package Pekan3_2511532012;
import java.util.ArrayList;
class Siswa_2012 {
	String nama_2012;
	int nim_2012;
	
	public Siswa_2012(String nama_2012, int nim_2012) {
	this.nama_2012 = nama_2012;
	this.nim_2012 = nim_2012;
	}
	
	@Override
	public String toString () {
		return "Nim : " + nim_2012 + ", Nama :" + nama_2012;
	}
}
public class SiswaStack_2511532012 {
	private ArrayList<Siswa_2012> stack;
	
	public SiswaStack_2511532012() {
		stack = new ArrayList<>();
		
	}
	
	public void push (Siswa_2012 mhs) {
		stack.add(mhs);
	}
	public Siswa_2012 pop () {
		if (!isEmpty()) {
			return stack.remove(stack.size() - 1);
		}
		return null;
	}
	
	public Siswa_2012 peek() {
		if (!isEmpty()) {
			return stack.remove(stack.size() -1);
		}
		return null;
	}
	 public boolean isEmpty () {
		 return stack.isEmpty();
	 }
	 
	 public void tampilkanSiswa_2012() {
		 for (int i = stack.size() -1; i >= 0; i--) {
			 System.out.println(stack.get(i));
		 }
	 }
	 public static void main(String [] args) {
		 SiswaStack_2511532012 studentStack = new SiswaStack_2511532012();
		 
		 Siswa_2012 mhs1 = new Siswa_2012 ("Ali", 1);
		 Siswa_2012 mhs2 = new Siswa_2012 ("Boby", 2);
		 Siswa_2012 mhs3 = new Siswa_2012 ("Siswa", 3);
		 
		 studentStack.push(mhs1);
		 studentStack.push(mhs2);
		 studentStack.push(mhs3);
		 
		 System.out.println("siswa teratas " + studentStack.peek());
		 System.out.println("mengeluarkan siswa teratas dari stack: " + studentStack.pop());
		 System.out.println("daftar siswa setelah di pop : ");
		 studentStack.tampilkanSiswa_2012();
	 }

}
