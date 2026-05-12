package Pekan6_2511532012;

public class NodeDLL_2511532012 {
	//mendefinisikan kelas Node
	int data_2012;
	NodeDLL_2511532012 next_2012;//pointer ke next node
	NodeDLL_2511532012 prev_2012;//pointer ke previous node
	
	//konstructor
	public NodeDLL_2511532012 (int data_2012) {
		this.data_2012 = data_2012;
		this.next_2012 = null;
		this.prev_2012 = null;
	}
}
