package Pekan6_2511532012;
	
public class InsertDLL_2511532012 {
	//menambah node di awal DLL
	static NodeDLL_2511532012 insertBegin(NodeDLL_2511532012 head_2012, int data_2012) {
		NodeDLL_2511532012 new_node = new NodeDLL_2511532012(data_2012);
		new_node.next_2012 = head_2012;
		//jadikan pointer nextnya di head
		if (head_2012 != null) {
			head_2012.prev_2012 = new_node;
		}
		return new_node;
	}
	//fungsi menambahkan node di akhir
	public static NodeDLL_2511532012 insertEnd(NodeDLL_2511532012 head_2012, int newData_2012) {
		//buat node baru
		NodeDLL_2511532012 newNode = new NodeDLL_2511532012 (newData_2012);
		// jika dll null jadikan head
		if (head_2012 == null) {
			head_2012 = newNode;
		} else {
			NodeDLL_2511532012 curr = head_2012;
			while (curr.next_2012 != null) {
				curr = curr.next_2012;
			}
			curr.next_2012 = newNode;
			newNode.prev_2012 = curr;
		}
		return head_2012;
	}
	//menambah node di posisi tertentu
	public static NodeDLL_2511532012 insertAtPosition (NodeDLL_2511532012 head_2012, int pos_2012, int new_data_2012) {
		//buat node baru
		NodeDLL_2511532012 new_node = new NodeDLL_2511532012 (new_data_2012);
		if (pos_2012 == 1) {
			new_node.next_2012 = head_2012;
			if (head_2012 != null) {
				head_2012.prev_2012 = new_node; 
				}
				head_2012 = new_node;
				return head_2012;
			}
			NodeDLL_2511532012 curr = head_2012;
			for (int i = 1; i < pos_2012 - 1 && curr != null ; ++i) {
				curr = curr.next_2012;
				
			}
				if (curr == null) {
					System.out.println("posisi tidak ada");
					return head_2012;
				}
				new_node.prev_2012 = curr;
				new_node.next_2012 = curr.next_2012;
				curr.next_2012 = new_node;
				
				if (new_node.next_2012 != null) {
					new_node.next_2012.prev_2012 = new_node;
				}
				return head_2012;
	}
	public static void printList (NodeDLL_2511532012 head_2012) {
				NodeDLL_2511532012 curr = head_2012;
				while (curr != null) {
					System.out.print(curr.data_2012 + " <-> ");
					curr = curr.next_2012;
				}
				System.out.println();
	}
	public static void main (String [] args) {
		//membuat dll 2 <-> 5
		NodeDLL_2511532012 head_2016 = new NodeDLL_2511532012(2);
		head_2016.next_2012 = new NodeDLL_2511532012 (3);
		head_2016.next_2012.prev_2012 = head_2016;
		head_2016.next_2012.next_2012 = new NodeDLL_2511532012 (5);
		head_2016.next_2012.next_2012.prev_2012 = head_2016.next_2012;
		
		//cetak dll awal
		System.out.print("DLL awal : ");
		printList(head_2016);
		
		//tambah 1 di awal
		head_2016 = insertBegin(head_2016, 1 );
		System.out.print("Simpul 1 di tambakan awal : ");
		printList(head_2016);
		
		//tambah 6 di akhir
		System.out.print("simpul 6 di tambahkan di akhir : ");
		int data_2016 = 6;
		head_2016 = insertEnd(head_2016, data_2016);
		printList(head_2016);
		
		//menambah node 4 di posisi ke 4
		System.out.print("tambah node 4 di posisi 4 ");
		int data2_2016 = 4;
		int pos_2016 = 4;
		head_2016 = insertAtPosition(head_2016, pos_2016, data2_2016);
		printList(head_2016);
		
		
	}
}
