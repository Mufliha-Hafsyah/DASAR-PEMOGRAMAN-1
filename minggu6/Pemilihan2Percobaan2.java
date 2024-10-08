package minggu6;

import java.util.Scanner;
public class Pemilihan2Percobaan2 {
    public static void main(String[] args) {
        Scanner absen17 = new Scanner(System.in);

        //Deklarasi Variabel
        String member, metodePembayaran="";
        int pilihan_menu;
        double diskon, harga, total=0;

        //Input
        System.out.println("-------------------------");
        System.out.println("===== MENU KAFE JTI =====");
        System.out.println("-------------------------");
        System.out.println("1. Ricebowl");
        System.out.println("2. Ice Tea");
        System.out.println("3. Paket Bundling (Ricebowl + Ice Tea)");
        System.out.println("--------------------------------------");
        System.out.print("masukkan angka dari menu yang dipilih = ");
        pilihan_menu = absen17.nextInt();
        absen17.nextLine();
        System.out.print("Apakah punya member (y/n) ? = ");
        member = absen17.nextLine();
        System.out.print("Apakah menggunakan QRIS (y/n) ? = ");
        metodePembayaran = absen17.nextLine();
        System.out.println("--------------------------------------");

        //Control statement
        if (member.equals("y")) { //Menggunakan equals untuk membandingkan string
            diskon = 0.10;
            System.out.println("Besar diskon = 10%");
            if (pilihan_menu == 1) {
                harga = 14000;
                System.out.println("Harga ricebowl = " + harga);
                
            } else if (pilihan_menu == 2) {
                harga = 3000;
                System.out.println("Harga Ice Tea = "+ harga);

            } else if (pilihan_menu == 3) {
                harga = 15000;
                System.out.println("Harga Bundling = " + harga);
                
            } else {
                System.out.println("Masukkan pilihan menu dengan benar");
                return; //Menghentikan eksekusi lebih lanjut jika pilihan salah
            } 
            
            //Mengihtung total bayar setelah diskon
            total = harga - (harga * diskon);
            if (metodePembayaran.equals("y")) {
                total = total - 1000;
            }
            System.out.println("Total bayar setelah diskon = " + total);

        }else if (member.equals("n")){ //Menggunakan equals untuk membandingkan string
            if (pilihan_menu == 1) {
                harga = 14000;
                System.out.println("Harga Ricebowl = " + harga);
                
            } else if (pilihan_menu == 2) {
                harga = 3000;
                System.out.println("Harga Ice Tea = " + harga);
            
            } else if (pilihan_menu == 3) {
                harga = 15000;
                System.out.println("Harga Bundling = " + harga);
            
            } else {
                System.out.println("Masukkan pilihan menu dengan benar");
                return; //Menghentikan eksekusi lebih lanjut jika pilihan salah
            }
            // Menghitung total bayar
            if (metodePembayaran.equals("y")) {
                total = total - 1000;
            }
            System.out.println("Total bayar = " + harga);

        } else {
            System.out.println("Member tidak valid");
        }
        System.out.println("--------------------------------------");
    }
}


