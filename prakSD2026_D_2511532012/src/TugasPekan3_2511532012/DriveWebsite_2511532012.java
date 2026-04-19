package TugasPekan3_2511532012;
import java.util.Scanner;
import java.util.Stack;

public class DriveWebsite_2511532012 {
	//MENAMPILKAN MENU
	public static void tampilkanMenu() {
		System.out.println("\n=== Browser History NIM: 2511532012 ===  ");
		System.out.println("1.Kunjungi Website  ");
		System.out.println("2.Tombol Back  ");
		System.out.println("3.Lihat Halaman Aktif ");
		System.out.println("4.Cek Histiory ");
		System.out.println("5.Keluar ");
	}
	
	//PUSH
	public static void KunjungiWebsite_2511532012(Stack<Website_2511532012> stack, Scanner sc) {
		System.out.print("Masukkan Judul : ");
		String judul_2012 = sc.nextLine();
		
		System.out.print("Masukkan URL : ");
		String URL_2012 = sc.nextLine();
		
		stack.push(new Website_2511532012 (judul_2012, URL_2012));
		System.out.println("Berhasil Mengunjungi Halaman ");
	}
	
	//POP
	public static void tombolback_251153012 (Stack<Website_2511532012> stack) {
		if (stack.isEmpty () ) {
			System.out.println("Tidak ada Website Yang di Buka");
		} else {
			Website_2511532012 web = stack.pop();
			System.out.println("Keluar dari Website : " + web.judul_2012);
		}
	}
	
	//PEEK
	public static void lihatwebaktif_2511532012(Stack<Website_2511532012> stack) {
		if (stack.isEmpty()) {
			System.out.println("Tidak ada Website Yang di Aktif");
		} else {
			Website_2511532012 web = stack.peek();
			System.out.println("==Website Yg Aktif==");
			System.out.println("Judul Website : " + web.judul_2012);
			System.out.println("URL           : " + web.URL_2012);
		}
	}
	
	//HISTORY
	public static void history_25115531012(Stack<Website_2511532012> stack) {
		if (stack.isEmpty()) {
			System.out.println("Belum ada website yang di kunjungi");
		} else {
			System.out.println("terdapat sebanyak " + stack.size() + " HIstory");
		}
	}
	
	
	public static void main(String [] args ) {
		Stack<Website_2511532012> WebsiteStack = new Stack<>();
		Scanner scanner = new Scanner (System.in);
		int choice;
		
		do {
			tampilkanMenu();
			System.out.print("Pilih Menu : ");
			choice = scanner.nextInt();
			scanner.nextLine();
			
			switch (choice) {
			case 1 :
				KunjungiWebsite_2511532012 (WebsiteStack, scanner);
				break;
			case 2 :
				tombolback_251153012 (WebsiteStack);
				break;
			case 3 :
				lihatwebaktif_2511532012 (WebsiteStack);
				break;
			case 4 :
				history_25115531012 (WebsiteStack);
				break ;
			case 5 :
				System.out.println("Keluar dari Program");
			default :
				System.out.println("Pilihan Tidak Valid");
			}
		}while (choice != 5);
		scanner.close();
	}
}
