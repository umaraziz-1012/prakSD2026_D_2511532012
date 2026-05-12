package Pekan6_2511532012;

public class HapusDLL_2511532012 {
	//HAPUS NODE AWAL
	public static NodeDLL_2511532012 dellhead (NodeDLL_2511532012 head_2012) {
		if (head_2012 == null) {
			return null;
		}
		NodeDLL_2511532012 temp = head_2012;
		head_2012 = head_2012.next_2012;
		if ( head_2012 != null) {
			head_2012.prev_2012 = null;
		}
		return head_2012;
}
	//HAPUS NODE AKHIR
	public static NodeDLL_2511532012 delLast(NodeDLL_2511532012 head_2012 ) {
		if ( head_2012 == null) {
			return null;
		}
		if ( head_2012.next_2012 == null) {
			return null;
		}
		NodeDLL_2511532012 curr = head_2012;
		while (curr.next_2012 != null) {
			curr = curr.next_2012;
		}
		//update pointer
		if (curr.prev_2012 != null) {
			curr.prev_2012.next_2012 = null;
		}
		return head_2012;
}
	//HAPUS NODE DI POSISI TERTENTU
	public static NodeDLL_2511532012 dellpos (NodeDLL_2511532012 head, int pos) {
		if ( head == null) {
			return head;
		}
		NodeDLL_2511532012 curr = head;
		for (int i = 1 ; curr != null && i < pos; ++i) {
			curr = curr.next_2012;
		}
		if (curr == null) {
		return head;
		}
		if (curr.prev_2012 != null) {
			curr.prev_2012.next_2012 = curr.next_2012;
		}
		if (curr.next_2012 != null) {
			curr.next_2012.prev_2012 = curr.prev_2012;
		}
		if (head == curr) {
			head = curr.next_2012;
		}
		return head;
}
	//FUNGSI MENCETAK DLL
	public static void printlist (NodeDLL_2511532012 head) {
	NodeDLL_2511532012 curr = head;
	while (curr != null) {
		System.out.print(curr.data_2012 + " ");
		curr = curr.next_2012;
	}
	System.out.println();
}
	public static void main(String [] args) {
		//BUAT SEBUAH DLL
		NodeDLL_2511532012 head = new NodeDLL_2511532012(1);
		head.next_2012 = new NodeDLL_2511532012(2);
		head.next_2012.prev_2012 = head;
		head.next_2012.next_2012 = new NodeDLL_2511532012 (3);
		head.next_2012.next_2012.prev_2012 = head.next_2012;
		head.next_2012.next_2012.next_2012 = new NodeDLL_2511532012 (4);
		head.next_2012.next_2012.next_2012.prev_2012 = head.next_2012.next_2012;
		head.next_2012.next_2012.next_2012.next_2012 = new NodeDLL_2511532012 (5);
		head.next_2012.next_2012.next_2012.next_2012.prev_2012 = head.next_2012.next_2012.next_2012;
		
		System.out.print("dll di awal : ");
		printlist(head);
		
		System.out.print("setelah head di hapus: ");
		head = dellhead(head);
		printlist (head);
		
		System.out.print("setelah node terkahir di hapus " );
		head = delLast(head);
		printlist (head);
		
		System.out.print("menghapus node ke dua ");
		head = dellpos( head, 2);
		
		printlist(head);
		
	}
}
