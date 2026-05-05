package Pekan5_2511532012;

public class PencarianSLL_2511532012 {
	static boolean searchKey_2012 (NodeSLL_2511532012 head_2012, int key_2012) {
		NodeSLL_2511532012 curr = head_2012;
		while (curr != null) {
			if (curr.data_2012 == key_2012)
			return true;
		curr = curr.next_2012;}
		return false;
}
	public static void travelsal_2012 (NodeSLL_2511532012 head_2012) {
		//mulai dari head
		NodeSLL_2511532012 curr = head_2012;
		//telusuri sampai pointer null
		while (curr != null) {
			System.out.print(" " + curr.data_2012);
			curr = curr.next_2012;
		}
		System.out.println();
}
	public static void main (String [] args) {
		NodeSLL_2511532012 head_2012 = new NodeSLL_2511532012(14);
		head_2012.next_2012 = new NodeSLL_2511532012 (21);
		head_2012.next_2012.next_2012 = new NodeSLL_2511532012 (13);
		head_2012.next_2012.next_2012.next_2012 = new NodeSLL_2511532012 (30);
		head_2012.next_2012.next_2012.next_2012.next_2012 = new NodeSLL_2511532012 (10);
		System.out.print("Penelusuran SLL");
		travelsal_2012 (head_2012);
		//DATA YANG AKAN DI CARI
		int key_2012 = 30;
		System.out.print("cari data " + key_2012 + " = ");
		if (searchKey_2012 (head_2012, key_2012))
			System.out.print("Ketemu");
		else
			System.out.print("Tidak Ketemu");
	}
}
