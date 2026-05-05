package Pekan5_2511532012;

public class TambahSLL_2511532012 {
	public static NodeSLL_2511532012 insertAtFront_2012(NodeSLL_2511532012 head_2012, int value_2012) {
	NodeSLL_2511532012 new_node = new NodeSLL_2511532012(value_2012);
	new_node.next_2012 = head_2012;
	return new_node;
}
//FUNGSI MENAMBAHKAN NODE DI AKHIR SLL
	public static NodeSLL_2511532012 insertAtEnd_2012 (NodeSLL_2511532012 head_2012, int value_2012) {
	//BUAT SEBUAH NODE DENGAN NILAI
	NodeSLL_2511532012 newNode = new NodeSLL_2511532012(value_2012);
	//JIKA LIST KOSONG MAKA VALUE JADI HEAD
	if (head_2012 == null) {
		return newNode;
	}
	//SIMPAN HEAD KE VARIABLE SEMENTARA
	NodeSLL_2511532012 last = head_2012;
	//TELUSURI KE NODE AKHIR
	while (last.next_2012 != null) {
		last = last.next_2012;
	}
	//UBAH POINTER
	last.next_2012 = newNode;
	return head_2012;
}
	static NodeSLL_2511532012 GetNode_2012(int data_2012) {
	return new NodeSLL_2511532012(data_2012);
}
	static NodeSLL_2511532012 insertPos_2012 (NodeSLL_2511532012 headNode_2012, int Position_2012, int value_2012) {

		NodeSLL_2511532012 head_2012 = headNode_2012;
		if (Position_2012 < 1) 
			System.out.print("invalid position");
		if (Position_2012 == 1) {
			NodeSLL_2511532012 new_node = new NodeSLL_2511532012 (value_2012);
			new_node.next_2012 = head_2012;
			return new_node;
		}else {
			while (Position_2012-- != 0 ) {
				if (Position_2012 == 1) {
					NodeSLL_2511532012 newNode = GetNode_2012(value_2012);
					newNode.next_2012 = headNode_2012.next_2012;
					headNode_2012.next_2012 = newNode;
					break;
				}
				headNode_2012 = headNode_2012.next_2012;
			}
			if (Position_2012 != 1)
				System.out.print("Posisi di Luar Jangkauan");
			return head_2012;	
	}
		
			
			
}	
	public static void printList_2012(NodeSLL_2511532012 head_2012) {
		NodeSLL_2511532012 curr = head_2012;
		while  (curr.next_2012 != null) {
			System.out.print(curr.data_2012 + "-->");
			curr = curr.next_2012;
		}
		if (curr.next_2012 == null) {
			System.out.print(curr.data_2012);
			System.out.println( );
		}
}
	public static void main(String [] args) {
		//Buat LINKED LIST 2->3->5->6
		NodeSLL_2511532012 head_2012= new NodeSLL_2511532012(2);
		head_2012.next_2012 = new NodeSLL_2511532012 (3);
		head_2012.next_2012.next_2012 = new NodeSLL_2511532012 (5);
		head_2012.next_2012.next_2012.next_2012 = new NodeSLL_2511532012 (6);
		//CETAK HASIL LIST ASLI
		System.out.print("Senaral Berantai Awal = ");
		printList_2012(head_2012);
		//TAMBAHKAN NODE BARU DI DEPAN
		System.out.print("tambah satu simpul di depan = ");
		int data_2012 = 1;
		head_2012 = insertAtFront_2012(head_2012, data_2012);
		//CETAK UPDATE LIST
		printList_2012(head_2012);
		//TAMBAHKAN NODE BARU DI BELAKANG
		System.out.print("tambah satu simpul di belakang = ");
		int data2_2012 = 7;
		head_2012 = insertAtEnd_2012(head_2012, data2_2012);
		//CETAK UPDATE LIST
		printList_2012(head_2012);
		System.out.print("tambah satu simpul ke data ke 4 = ");
		int data3_2012 = 4;
		int pos_2012 = 4;
		head_2012 = insertPos_2012(head_2012,pos_2012,data3_2012);
		//CETAK UPDATE LIST
		printList_2012(head_2012);
	}
}
