package TugasPekan5_2511532012;

import java.util.Scanner;

public class RumahSakit_2511532012 {
    static int noantrian = 1;
    static Pasien_2511532012 head = null;
    // MENU
    public static void tampilkanMenu() {
        System.out.println("\n=== Antrian Rumah Sakit NIM: 2511532012 ===");
        System.out.println("1. Daftarkan Pasien");
        System.out.println("2. Panggil Pasien");
        System.out.println("3. Tampilkan Antrian");
        System.out.println("4. Cari Pasien");
        System.out.println("5. Cek Status Antrian");
        System.out.println("6. Keluar");
    }
    // MASUKKAN PASIEN
    public static Pasien_2511532012 insertattail(Pasien_2511532012 head, String nama, String penyakit) {
        Pasien_2511532012 newP =
                new Pasien_2511532012(nama, penyakit, noantrian);
        System.out.println("Pasien berhasil didaftarkan! Nomor Antrian: " + noantrian);
        noantrian++;
        if (head == null) {
            return newP;
        }
        Pasien_2511532012 last = head;
        while (last.getnext() != null) {
            last = last.getnext();
        }
        last.setnext(newP);
        return head;
    }
    // PANGGIL EPESIEN
    public static Pasien_2511532012 deletehead(Pasien_2511532012 head) {
        if (head == null) {
            System.out.println("Antrian kosong");
            return null;
        }
        System.out.println("Pasien " + head.getnama() + " dipanggil");
        return head.getnext();
    }
    // DISPLAY
    public static void display(Pasien_2511532012 head) {
        if (head == null) {
            System.out.println("Tidak ada Antrian");
            return;
        }
        Pasien_2511532012 current = head;
        System.out.println("\n=== DAFTAR ANTRIAN ===");
        while (current != null) {
            System.out.println("Nama       : " + current.getnama());
            System.out.println("Penyakit   : " + current.getpenyakit());
            System.out.println("No Antrian : " + current.getantrian());
            System.out.println("=================================");
            current = current.getnext();
        }
    }
    // SEARCH
    public static void Search(Pasien_2511532012 head, String nama) {
        if (head == null) {
            System.out.println("Tidak ada Antrian");
            return;
        }
        while (head != null) {
            if (head.getnama().equalsIgnoreCase(nama)) {
                System.out.println("Pasien ditemukan");
                System.out.println("No Antrian : " + head.getantrian());
                System.out.println("Nama       : " + head.getnama());
                System.out.println("Penyakit   : " + head.getpenyakit());
                return;
            }
            head = head.getnext();
        }
        System.out.println("Pasien tidak ditemukan");
    }
    // STATUS ANTRIAN
    public static void statusAntrian(Pasien_2511532012 head, String nama) {
        if (head == null) {
            System.out.println("Antrian kosong");
            return;
        }
        int posisi = 1;
        while (head != null) {
            if (head.getnama().equalsIgnoreCase(nama)) {
                System.out.println("Pasien ditemukan");
                System.out.println("Nama        : " + head.getnama());
                System.out.println("No Antrian  : " + head.getantrian());
                System.out.println("Posisi      : " + posisi);
                System.out.println("Status      : Masih menunggu");
                return;
            }
            head = head.getnext();
            posisi++;
        }
        System.out.println("Status: Pasien tidak ada / sudah dipanggil");
    }
    // MAIN
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            tampilkanMenu();
            System.out.print("Pilihan: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Masukkan Nama Pasien : ");
                    String nama = scanner.nextLine();

                    System.out.print("Masukkan Keluhan     : ");
                    String penyakit = scanner.nextLine();

                    head = insertattail(head, nama, penyakit);
                    break;

                case 2:
                    head = deletehead(head);
                    break;

                case 3:
                    display(head);
                    break;

                case 4:
                    System.out.print("Masukkan Nama Pasien : ");
                    String cari = scanner.nextLine();
                    Search(head, cari);
                    break;

                case 5:
                    System.out.print("Masukkan Nama Pasien : ");
                    String status = scanner.nextLine();
                    statusAntrian(head, status);
                    break;

                case 6:
                    System.out.println("Keluar dari Program");
                    break;

                default:
                    System.out.println("Pilihan Tidak Valid");
            }

        } while (choice != 6);

        scanner.close();
    }
}