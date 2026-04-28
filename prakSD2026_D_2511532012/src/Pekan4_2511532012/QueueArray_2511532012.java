package Pekan4_2511532012;
	
public class QueueArray_2511532012 {
	int front_2012, rear_2012, size_2012;
	int capacity_2012;
	int array_2012[];
	
	public QueueArray_2511532012 (int capacity_2012) {
		this.capacity_2012 = capacity_2012;
		front_2012 = this.size_2012 = 0;
		rear_2012 = capacity_2012 - 1;
		array_2012 = new int[ this.capacity_2012];
		
	}
	
	boolean isFull_2511532012 (QueueArray_2511532012 queue) {
		return (queue.size_2012 == queue.capacity_2012);
		
	}
	
	boolean isEmpty_2511532012 (QueueArray_2511532012 queue) {
		return (queue.size_2012 == 0);
		
	}
	
	void enqueue_2511532012 (int item) {
		if (isFull_2511532012(this))
			return;
		this.rear_2012 = (this.rear_2012 + 1) % this.capacity_2012;
		this.array_2012 [this.rear_2012] = item;
		this.size_2012 = this.size_2012 + 1 ;
		System.out.println(item + " enquaued to queue");
	}
	
	int dequeue_2511532012 () {
		if (isEmpty_2511532012(this))
			return Integer.MIN_VALUE;
		int item = this.array_2012[this.front_2012];
		this.front_2012 = (this.front_2012 + 1) % this.capacity_2012;
		this.size_2012 = this.size_2012 - 1;
		return item;
		
	}
	
	int front_2511532012 () {
		if (isEmpty_2511532012(this))
			return Integer.MIN_VALUE;
		
		return this.array_2012[this.front_2012];
		
	}
	
	int rear_2511532012 () {
		if (isEmpty_2511532012(this))
			return Integer.MIN_VALUE;
		return this.array_2012[this.rear_2012];
	}
		// mencetak elemen antrian
	void display_2511532012() {
		int i;
		if (front_2012 == rear_2012) {
			System.out.printf("\nAntrian Kosong\n");
			return;
		}
		//kunjungi dari belakang dan cetak
		for (i = front_2012 ; i < rear_2012 ; i++) {
			System.out.printf(" %d <-- ", array_2012[i]);
		}
		return;
	}	
}
