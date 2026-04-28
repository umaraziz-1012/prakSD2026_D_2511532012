package Pekan4_2511532012;
import java.util.Iterator;
import java.util.Queue;
import java.util.LinkedList;
public class IterasiQueue_2511532012 {

	public static void main(String[] args) {
				Queue<String> q_2012 = new LinkedList<>() ;
				
				q_2012.add("praktikum");
				q_2012.add("structur");
				q_2012.add("Data");
				q_2012.add("Dan");
				q_2012.add("Algoritma");
				
				Iterator<String> iterator = q_2012.iterator();
				while (iterator.hasNext()) { 
					System.out.print(iterator.next() + " ");
				}
		}
}
	


