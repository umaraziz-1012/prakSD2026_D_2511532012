package Pekan5_2511532012;

public class HapusSLL_251152012 {
//FUNGSI UNTUK MENGHAPUS HEAD
	public static NodeSLL_2511532012 deleteHead_2012 (NodeSLL_2511532012 head_2012) {
	// JIKA SLL KOSONG
	if (head_2012 == null) 
		return null;
	//PINDAHKAN HEAD KE NODE BERIKUTNYA
	head_2012 = head_2012.next_2012;
	//RETURN HEAD BARU
	return head_2012;	
}
	//FUNGSI MENGHAPUS NODE TERAKHIR SLL
	public static NodeSLL_2511532012 removeLastNode_2012(NodeSLL_2511532012 head_2012) {
		//JIKA LIST KOSONG RETURN NULL
		if (head_2012==null) {
			return null;
		}
		//JIKA LIST SATU NODE, HAPUS NODE DAN RETURN NULL
		if (head_2012.next_2012 == null) {
			return null;
		}
		//temukan noed terakhit kedua
		NodeSLL_2511532012 secondLast = head_2012;
		while (secondLast.next_2012.next_2012 != null) {
			secondLast =secondLast.next_2012;
		}
		//HAPUS NODE TERAKHIR 
		secondLast.next_2012 = null;
		return head_2012;
}
	//FUNGSI MENGHAPUS NODE DI POSISI TERTENTU
	public static NodeSLL_2511532012 deleteNode_2012(NodeSLL_2511532012 head_2012, int position_2012) {
		NodeSLL_2511532012 temp = head_2012;
		NodeSLL_2511532012 prev = null;
		//JIKA LINKED LIST NULL
		if (temp == null)
			return head_2012;
		//Kasus 1 : Head DI Hapus
		if (position_2012 == 1) {
			head_2012 = temp.next_2012;
			return head_2012;
		}
		//Kasus 2 : Mengahpus Head di Tengah
		// Telusuri ke Node yang di Hapus
		for (int i = 1; temp != null && i < position_2012; i++) {
			prev = temp;
			temp = temp.next_2012;
		}
		//jika di temukan, hapus node
		if (temp != null) {
			prev.next_2012 = temp.next_2012;
		} else {
			System.out.println("Data tidak Ada");
		}
		return head_2012;
}
	//FUNGSI MENCETAK SLL
	public static void printList(NodeSLL_2511532012 head) {
		NodeSLL_2511532012 curr = head;
		while (curr.next_2012 != null){
		System.out.print(curr.data_2012 + "-->");
		curr = curr.next_2012;
	}
		if (curr.next_2012 == null) {
			System.out.print(curr.data_2012);
			System.out.println();}
}
	public static void main(String [] args) {
		//BUAT SLL 1 -> 2 -> 3-> 4-> 5->6-> NULL
		NodeSLL_2511532012 head_2012 = new NodeSLL_2511532012(1);
		head_2012.next_2012 = new NodeSLL_2511532012 (2);
		head_2012.next_2012.next_2012 = new NodeSLL_2511532012 (3);
		head_2012.next_2012.next_2012.next_2012 = new NodeSLL_2511532012 (4);
		head_2012.next_2012.next_2012.next_2012.next_2012 = new NodeSLL_2511532012 (5);
		head_2012.next_2012.next_2012.next_2012.next_2012.next_2012 = new NodeSLL_2511532012 (6);
		//cetak list awal
		System.out.println("List Awal :");
		printList(head_2012);
		//hapus head
		head_2012 = deleteHead_2012 (head_2012);
		System.out.println("List Setelah head di hapus");
		printList(head_2012);
		//hapus node terakhir 
		head_2012 = removeLastNode_2012(head_2012);
		System.out.println("list setelah simpul terakhir di hapus");
		printList(head_2012);
		//deleting node at position 2
		int position = 2;
		head_2012 = deleteNode_2012 (head_2012, position);
		//Print List aafter deletion
		System.out.println("List setelah posisi 2 di hapus : ");
		printList(head_2012);
		
} 
}


