package Pekan9_2511532012;

public class BTree_2511532012 {
	private Node_2511532012 root_2012;
	private Node_2511532012 curretNode_2012;
	public BTree_2511532012() {
		root_2012 = null;
	}
	public boolean search(int data) {
		return search(root_2012, data);
	}
	private boolean search (Node_2511532012 node_2012, int data_2012) {
		if (node_2012.getdata_2012() == data_2012)
			return true;
		if(node_2012.getleft_2012() != null)
			if(search(node_2012.getleft_2012(), data_2012))
			return true;
		if(node_2012.getright_2012() != null)
			if (search(node_2012.getright_2012(),data_2012))
				return true;
			return false;
	}
	public void printinorder_2012() {
		root_2012.printinorder_2012(root_2012);
	}
	public void printpreorder_2012() {
		root_2012.printpreorder_2012(root_2012);
	}
	public void printposorder_2012() {
		root_2012.printposorder_2012(root_2012);
	}
	public Node_2511532012 getroot() {
		return root_2012;
	}
	public boolean isEmpty() {
		return root_2012 == null;
	}
	public int countnodes() {
		return countnodes(root_2012);
	}
	private int countnodes(Node_2511532012 node_2012) {
		int count  = 1;
		if (node_2012 == null) {
			return 0;
		} else {
			count += countnodes(node_2012.getleft_2012());
			count += countnodes(node_2012.getleft_2012());
			return count;
		}
	}
	public void print() {
		root_2012.print();
	}
	public Node_2511532012 getcurret() {
		return curretNode_2012;
	}
	public void setcurret(Node_2511532012 node_2012) {
		this.curretNode_2012 = node_2012;
	}
	public void setroot(Node_2511532012 root_2012) {
		this.root_2012 = root_2012;
	}
		
}
