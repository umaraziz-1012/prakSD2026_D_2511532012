package Pekan6_2511532012;

public class PenelusuranDLL_2511532012 {
	//fungsi penelusuran maju
	static void forwardTraversal (NodeDLL_2511532012 head_2012) {
		NodeDLL_2511532012 curr = head_2012;
		while ( curr != null) {
			System.out.print(curr.data_2012 + " <-> ");
			curr = curr.next_2012;
		}
		System.out.println();
}
	//penesulan mundur
	static void beacwardtraversal ( NodeDLL_2511532012 tall_2012) {
		// mulai dari akhir
		NodeDLL_2511532012 curr = tall_2012;
		//lanjut sampai head
		while (curr != null) {
			//cetak data
			System.out.print(curr.data_2012 + " <-> ");
			// pindah ke node sebelumnya
			curr = curr.prev_2012;
		}
		System.out.println();
	}
	public static void main (String [] args) {
		//cetak DLL
		NodeDLL_2511532012 head_2012 = new NodeDLL_2511532012(1);
		NodeDLL_2511532012 second_2012 = new NodeDLL_2511532012 (2);
		NodeDLL_2511532012 third_2012 = new NodeDLL_2511532012 (3);
		
		head_2012.next_2012 = second_2012;
		second_2012.prev_2012 = head_2012;
		second_2012.next_2012 = third_2012;
		third_2012.prev_2012 = second_2012;
		
		System.out.println ("penelusuran maju : ");
		forwardTraversal ( head_2012);
		
		System.out.print("penulusuran mundur : ");
		beacwardtraversal (third_2012);
	}
}
