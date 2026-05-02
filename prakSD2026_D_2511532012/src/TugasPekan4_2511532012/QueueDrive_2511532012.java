package TugasPekan4_2511532012;
import java.util.Scanner;
public class QueueDrive_2511532012 {
	//TAMPILKAN MENU
	public static void tampilkanMenu() {
		System.out.println("\n=== PROGRAM ANTRIAN LOKET  ===  ");
		System.out.println("1.Tambah Antrian  ");
		System.out.println("2.Layani Antrian  ");
		System.out.println("3.Tampilkan Antrian ");
		System.out.println("4.Revers ");
		System.out.println("5.Keluar ");
	}
	
	//TAMBAH ANTRIAN
	public static void tambahkunjungan_2012(Queue_2511532012 antrian, Scanner sc) {
	System.out.print("Masukkan nama pengunjung :");
	String nama = sc.nextLine();
	antrian.enqueue_2012(nama);
	
	System.out.println("Data berhasil di tambah ke Antrian");
	}
	
	//HAPUS ANTRIAN
	public static void hapuskunjungan_2012(Queue_2511532012 antrian) {
		String keluar = antrian.dequeue_2012();
		if (keluar != null) {
			System.out.println(keluar + " Telah Di Layani");
		}
	}
	
	//TAMPILKAN ANTRIAN
	public static void  tampilkan_2012(Queue_2511532012 antrian) {
		antrian.display_2012() ;
	}
	
	//Revers 
	public static void revers_2012(Queue_2511532012 antrian) {
		antrian.revers_2012();
	}
	
	public static void main(String [] args ) {
		Queue_2511532012 antrian = new Queue_2511532012(2);
		Scanner scanner = new Scanner (System.in);
		int choice;
		
		do {
			tampilkanMenu();
			System.out.print("Pilih Menu : ");
			choice = scanner.nextInt();
			scanner.nextLine();
			
			switch  (choice) {
			case 1 :
				tambahkunjungan_2012 (antrian, scanner);
				break;
			case 2 :
				hapuskunjungan_2012 (antrian) ;
				break;
			case 3 :
				tampilkan_2012 (antrian) ;
				break;
			case 4 :
				revers_2012 (antrian) ;
				break;
			case 5 :
				System.out.println("Keluar dari Program");
			default :
				System.out.println("Pilihan tidak valid");
			}
		}while (choice != 5 );
		scanner.close();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
