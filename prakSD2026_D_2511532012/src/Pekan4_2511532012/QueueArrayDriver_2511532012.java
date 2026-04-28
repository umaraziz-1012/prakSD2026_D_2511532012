package Pekan4_2511532012;
import java.util.*;
public class QueueArrayDriver_2511532012 {
	public static void main(String [] args) {
		QueueArray_2511532012 queue_2511532012 = new QueueArray_2511532012(1000);
		queue_2511532012.enqueue_2511532012(10);
		queue_2511532012.enqueue_2511532012(20);
		queue_2511532012.enqueue_2511532012(30);
		queue_2511532012.enqueue_2511532012(40);
		System.out.println("item di depan " + queue_2511532012.front_2511532012());
		System.out.println("item di belakang " + queue_2511532012.rear_2511532012());
		System.out.println("tampilkan queue");
		queue_2511532012.display_2511532012();
		System.out.println();
		System.out.println(queue_2511532012.dequeue_2511532012() + " di hapus dari queue");
		System.out.println("item di depan " + queue_2511532012.front_2511532012());
		System.out.println("item di belakang " + queue_2511532012.rear_2511532012());
		System.out.println("tampilkan queue setelah satu data di hapus");
		queue_2511532012.display_2511532012();
	}
}
