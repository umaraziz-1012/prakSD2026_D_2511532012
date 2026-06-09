package Pekan9_2511532012;

public class BtreeDriver_25115323012 {
	public static void main(String[] args) {
		//Membuat Pohon
		BTree_2511532012 tree_2012 = new BTree_2511532012();
		System.out.println("jumlah simpul awal pohon : ");
		System.out.println(tree_2012.countnodes());
		//tambahkan simpul data 1
		Node_2511532012 root_2012 = new Node_2511532012(1);
		tree_2012.setroot(root_2012);
		System.out.println("jumlah simpul jika hanya ada root");
		System.out.println(tree_2012.countnodes());
		Node_2511532012 node2_2012 = new Node_2511532012(2);
		Node_2511532012 node3_2012 = new Node_2511532012(3);
		Node_2511532012 node4_2012 = new Node_2511532012(4);
		Node_2511532012 node5_2012 = new Node_2511532012(5);
		Node_2511532012 node6_2012 = new Node_2511532012(6);
		Node_2511532012 node7_2012 = new Node_2511532012(7);
		Node_2511532012 node8_2012 = new Node_2511532012(8);
		Node_2511532012 node9_2012 = new Node_2511532012(9);
		root_2012.setleft_2012(node2_2012);
		node2_2012.setleft_2012(node4_2012);
		node2_2012.setright_2012(node5_2012);
		node4_2012.setright_2012(node8_2012);
		root_2012.setright_2012(node3_2012);
		node3_2012.setleft_2012(node6_2012);
		node3_2012.setright_2012(node7_2012);
		node2_2012.setleft_2012(node9_2012);
		tree_2012.setcurret(tree_2012.getroot());
		System.out.println("menampilkan simpul terakhir : ");
		System.out.println(tree_2012.getcurret().getdata_2012());
		System.out.println("jumlah simpul setelah simpul 7 di tambahkan : ");
		System.out.println(tree_2012.countnodes());
		System.out.println("in order : ");
		tree_2012.printinorder_2012();
		System.out.println("\nPreOrder : ");
		tree_2012.printpreorder_2012();
		System.out.println("\nPosOrder : ");
		tree_2012.printposorder_2012();
		System.out.println("");
		System.out.println("menampiilkan data dalam bentuk table : ");
		tree_2012.print();
		
	}

}
