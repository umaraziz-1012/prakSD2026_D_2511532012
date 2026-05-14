package TugasPekan6_2511532012;
import java.util.Scanner;
public class Music_2511532012 {
	//MENU 
	public static void tampilkanMenu_2012() {
        System.out.println("\n=== Playlist Music NIM: 2511532012 ===");
        System.out.println("1. Tambah Music ");
        System.out.println("2. Hapus Lgu Pertama ");
        System.out.println("3. Lihat Playlist (Maju) ");
        System.out.println("4. Lihat Playlist (Mundur) ");
        System.out.println("5. Cari Lagu");
        System.out.println("6. Keluar");
}
	//TAMBAHLAGU
	public static Lagu_2511532012 tambahlagu_2012(Lagu_2511532012 head, String judul, String penyanyi) {
		Lagu_2511532012 newnode = new Lagu_2511532012 (judul, penyanyi);
		
		if (head == null) {
			head = newnode;
		}else {
			Lagu_2511532012 curr = head;
			while (curr.getnext_2012() != null) {
				curr = curr.getnext_2012();
			}
			curr.setnext_2012(newnode);
			newnode.setprev_2012(curr);;
		}
		System.out.print("LAGU BERHASIL DI TAMBAHKAN");
		return head;
	}
	
	//HAPUSLAGUAWAL
	public static Lagu_2511532012 hapuslaguawal_2012(Lagu_2511532012 head) {
		if (head == null) {
			System.out.print("TIDAK ADA LAGU DI PLAYLIST");
			return null;
		}
		head = head.getnext_2012();
		if (head != null) {
			head.setprev_2012(null);
		}
		System.out.print("LAGU BERHASIL DI HAPUS");
		return head;
	}
	
	//TAMPIL MAJU
	static void tampilmaju_2012(Lagu_2511532012 head) {
		if (head == null) {
			System.out.println("TIDAK ADA LAGU DI PLAYLIST");
			return;
		}
		Lagu_2511532012 curr = head;
		while ( curr != null) {
			System.out.print(curr.getJudul_2012() + " <-> " );
			curr = curr.getnext_2012();
		}
		System.out.println();
	}
	
	//TAMPILKAN MUNDUR
	static void tampilmundur_2012(Lagu_2511532012 head) {
		if (head == null) {
			System.out.println("TIDAK ADA LAGU DI PLAYLIST");
			return;
		}
		Lagu_2511532012 curr = head;
		while (curr.getnext_2012() != null) {
			curr = curr.getnext_2012();
		}
		
		while (curr != null) {
			System.out.print(curr.getJudul_2012() + "<->" );
			curr = curr.getprev_2012();
		}
		System.out.println();
	}
	//CARI LAGU
	public static void carilagu_2012(Lagu_2511532012 head, String judul) {
		if (head == null) {
			System.out.print("TIDAK ADA PLAYLIST");
			return;
		}
		while (head != null) {
			if (head.getJudul_2012().equalsIgnoreCase(judul)) {
				System.out.println("Lagu di Temukan");
				System.out.println("Judul    : " + head.getJudul_2012());
				System.out.println("Penyanyi : " + head.getpenyanyi_2012());
				return;
			}
			head = head.getnext_2012();
		}
		System.out.print("LAGU TIDAK DI TEMUKAN");
	}
	
	//MAIN
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Lagu_2511532012 head = null;
		int pilihan;
		do {
			tampilkanMenu_2012();
			System.out.print("Pilihan : ");
			pilihan = input.nextInt();
			input.nextLine();
			switch (pilihan) {
			case 1:
				System.out.print("Judul Lagu : ");
				String judul = input.nextLine();
				System.out.print("Penyanyi   : ");
				String penyanyi = input.nextLine();
				head = tambahlagu_2012(head,judul,penyanyi);
				break;
			case 2:
				head = hapuslaguawal_2012(head);
				break;
			case 3:
				System.out.println("\nPLAYLIST MAJU");
				tampilmaju_2012(head);
				break;
			case 4:
				tampilmundur_2012(head);
				break;
			case 5:
				System.out.print("Judul Lagu : ");
				String cari = input.nextLine();
				carilagu_2012(head, cari);
				break;
			case 6:
				System.out.println("PROGRAM SELESAI");
				break;
			default:
				System.out.println("PILIHAN TIDAK VALID");
			}
		} while (pilihan != 6);
		input.close();
	}
}