package Pekan4_2511532012;
import java.util.LinkedList;
import java.util.Queue;

public class QueueLinkedList_2511532012 {
	public static void main (String [] args) {
		Queue<Integer> q_2012 = new LinkedList<>();
		// tambah elemen {0, 1, 2, 3, 4, 5	} ke anrtian
		for (int i = 0 ; i < 6 ; i ++) 
			q_2012.add(i);
		
		// menampilkann isi antrian
		System.out.println("Elemen antrian " + q_2012);
		
		//untuk menghapus kepala antrian
		int hapus_2012 = q_2012.remove();
		System.out.println("hapus elemen = " + hapus_2012);
		System.out.println(q_2012);
		
		//untuk melihat anbtrian terdepan
		int depan_2012 = q_2012.peek();
		System.out.println("kelapa antrian = " + depan_2012);
		
		int banyak_2012 = q_2012.size();
		System.out.println("Size antrian = " + banyak_2012);
		}
}
