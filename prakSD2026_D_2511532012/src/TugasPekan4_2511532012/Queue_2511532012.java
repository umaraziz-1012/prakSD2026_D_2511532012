package TugasPekan4_2511532012;

import java.util.Stack;

public class Queue_2511532012 {
	int front_2012, rear_2012, size_2012;
	int capacity_2012;
	String[] array_2012;
	
	//CONSTRUCTOR
	public Queue_2511532012 (int capacity_2012) {
		this.capacity_2012 = capacity_2012;
		front_2012 = this.size_2012 = 0;
		rear_2012 = capacity_2012 - 1;
		array_2012 = new String [this.capacity_2012];
		
	}
	// CEK PENUH
	boolean isFull_2012 (Queue_2511532012 queue) {
		return (queue.size_2012 == queue.capacity_2012);
				
	}
	// CEK KOSONG
	boolean isEmpty_2012 () {
		return (size_2012 == 0);
		
	}
	//TAMBAH
	void enqueue_2012 (String item) {
		if (isFull_2012(this)) {
			System.out.println("Antrian Sudah Penuh");
			return;
		}
			
		this.rear_2012 = (this.rear_2012 + 1) % this.capacity_2012;
		this.array_2012 [ this.rear_2012 ] = item;
		this.size_2012 = this.size_2012 + 1;
		System.out.println(item + " Berhasil di masukkan ");
		
	}
	//KURANG
	String dequeue_2012 () {
		if (isEmpty_2012()) {
			System.out.println("Tidak ada Antrian ");
			return null;
		}
		
		String item = this.array_2012[this.front_2012];
		this.front_2012 = (this.front_2012 + 1) % this.capacity_2012;
		this.size_2012 = this.size_2012 - 1;
		return item;
		
	}
	//REVERS 
	void revers_2012 () {
		if (isEmpty_2012())
			return;
		
		Stack<String> stack = new Stack<>();
		
		while (!isEmpty_2012()) {
			stack.push(dequeue_2012());
			
		}
		while (!stack.isEmpty()) {
			enqueue_2012(stack.pop());
		}
		System.out.println("Berhasil di revers");
		display_2012();
	}
	//DISPLAY
	void display_2012 () {
	    if (isEmpty_2012()) {
	        System.out.println("Antrian kosong");
	        return;
	    }

	    System.out.println("Isi antrian ");
	    for (int i = 0; i < size_2012; i++) {
	        int index = (front_2012 + i) % capacity_2012;
	        System.out.println((i + 1) + "."  + array_2012[index]);
	    }
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
