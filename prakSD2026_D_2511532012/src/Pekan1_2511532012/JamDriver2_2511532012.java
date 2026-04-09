package Pekan1_2511532012;
import java.util.Scanner;
public class JamDriver2_2511532012 {

		public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			System.out.println("=== Program Driver Objek Jam ===");
			// 1. Input Jam Pertama
			System.out.println("\n--- Input Jam 1 ---");
			Jam_2511532012 j1 = buatJamDariInput (input);
			
			// 2. Input Jam Kedua
			System.out.println("\n--- Input Jam 2 ---");
			Jam_2511532012 j2 = buatJamDariInput (input);
			
			// 3. Menampilkan Data
			System.out.println("\n--- Hasil Operasi ---");
			System.out.println("Jam 1 (String)      : " + j1.toString());
			System.out.println("Jam 2 (String)      : " + j2.toString());
			System.out.println("Jam 1 dalam detik   : " + j1.toSecond());
			System.out.println("Jam 2 dalam detik   : " + j2.toSecond());
			
			// 4. Operasi Relasional (Perbandingan)
			int perbandingan = j1.compareTo(j2);
			if (perbandingan > 0 ) {
				System.out.println("Status				: Jam 1 lebih lambat (setelah) Jam 2");
			} else if (perbandingan < 0) {
				System.out.println("Status              : Jam 1 lebih awal (sebelumO Jam 2");
			} else {
				System.out.println("Status              : Jam 1 dan Jam 2 sama persis");
			}
			
			//5. Operasi Aritmatika
			System.out.println("Durasi (J1 ke J2)       : " + Jam_2511532012.durasiDetik(j1, j2) + " detik");
			
			Jam_2511532012 jNext = j1.nextSecond();
			System.out.println("Jam 1 Detik Berikutnya: " + jNext);
			
			Jam_2511532012 jPrev = j1.prevSeconds();
			System.out.println("Jam 1 Detik Sebelumnya : " + jPrev);
			
			// 6. Operasi penjumlahan Jam
			Jam_2511532012 jHasilPlus = j1.plus(j2);
			System.out.println("Hasil J1 + J2          : " + jHasilPlus);
			
			input.close();
			System.out.println("\nProgram Selesai.");
		}
		/**
		 * Prosedur pembantu untuk melakukan input dan validasi secara berulang
		 * sampai user memasukkan angka yang benar (0..23, 0..59).
		 */
		private static Jam_2511532012 buatJamDariInput (Scanner sc) {
			int h, m, s;
			while (true) {
				System.out.println("Masukkan Jam (0-23)     : " );
				h = sc.nextInt();
				System.out.println("Masukkan Menit (0-59)   : ");
				m = sc.nextInt();
				System.out.println("Masukkan Detik (0-59)   : ");
				s = sc.nextInt();
				
				//Memanggil method static isValid dari kelas Jam
				if (Jam_2511532012.isValid(h, m, s)) {
					return new Jam_2511532012(h, m, s);
				} else {
					System.out.println("[Error] Input tidak valid! Silakan ulangi.\n");
				}
			}
		}

	}

