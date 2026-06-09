package Pekan9_2511532012;

public class Node_2511532012 {
	int data_2012;
	Node_2511532012 left_2012;
	Node_2511532012 right_2012;
	
	public Node_2511532012 (int data_2012) {
		this.data_2012 = data_2012;
		left_2012 = null;
		right_2012 = null;
	}
	public void setleft_2012(Node_2511532012 node) {
		if (left_2012 == null)
			left_2012 = node;
	}
	public void setright_2012(Node_2511532012 node) {
		if (right_2012 == null)
			right_2012 = node;
	}
	public Node_2511532012 getleft_2012() {
		return left_2012;
	}
	public Node_2511532012 getright_2012() {
		return right_2012;
	}
	public int getdata_2012() {
		return data_2012;
	}
	public void setdata_2012(int data_2012){
		this.data_2012= data_2012;
	}
	void printpreorder_2012(Node_2511532012 node) {
		if (node == null)
		return;
		System.out.print(node.data_2012 + " ");
		printpreorder_2012(node.left_2012);
		printpreorder_2012(node.right_2012);
	}
	void printposorder_2012(Node_2511532012 node) {
		if (node == null)
			return;
		printposorder_2012(node.left_2012);
		printposorder_2012(node.right_2012);
		System.out.print(node.data_2012 + " ");
	}
	void printinorder_2012(Node_2511532012 node) {
		if (node == null)
			return;
		printinorder_2012(node.left_2012);
		System.out.print(node.data_2012);
		printinorder_2012(node.right_2012);
	}
	public String print() {
		return this.print("",true, "");
	}
	public String print(String prefix_2012, boolean istail_2012, String sb_2012) {
		if (right_2012 != null) {
			right_2012.print(prefix_2012 + (istail_2012 ? "|  " : "   "), false, sb_2012);
		}
		System.out.println(prefix_2012+(istail_2012 ? "\\-- " : "/-- ")+ data_2012);
		if(left_2012 != null) {
			left_2012.print(prefix_2012 + (istail_2012 ? "   " : "| "), true, sb_2012);
		}
		return sb_2012;
	}
}
