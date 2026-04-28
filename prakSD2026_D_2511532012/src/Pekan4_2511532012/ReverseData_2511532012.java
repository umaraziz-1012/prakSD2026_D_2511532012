package Pekan4_2511532012;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
public class ReverseData_2511532012 {

	public static void main(String[] args) {
		Queue<Integer> q_2012 = new LinkedList<Integer>();
		q_2012.add(1);
		q_2012.add(2);
		q_2012.add(3);
		System.out.println("sebelum revers "+ q_2012);
		Stack<Integer> s_2012 = new Stack<Integer> ();
		while (!q_2012.isEmpty()) { // Q -> S 
			s_2012.push(q_2012.remove());
			
		}
		while (!s_2012.isEmpty()) {
			q_2012.add(s_2012.pop());
		}
		System.out.println("sesudah revers = " + q_2012);
	}

}
