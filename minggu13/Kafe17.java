package minggu13;
import java.util.Scanner;

public class Kafe17 {
    public static void Menu(String namaPelanggan, boolean isMember, String kodePromo) {
        System.out.println("Selamat datang, " + namaPelanggan + "!");

        //Cek Member
        if (isMember) {
            System.out.println("Anda adalah member, dapatkan diskon 10% untuk setiap pembelian!");
        }
        //Cek Kode Promo
        if (kodePromo.equals("DISKON50")) {
            System.out.println("Kode promo berhasil dipakai! Anda mendapatkan diskon 50%.");
        } else if(kodePromo.equals("DISKON30")){
            System.out.println("Kode promo berhasil dipakai! Anda mendapatkan diskon 30%.");
        } else {
            System.out.println("Kode promo invalid.");
        }

        System.out.println("===== MENU RESTO KAFE =====");
        System.out.println("1. Kopi Hitam - Rp 15,000");
        System.out.println("2. Cappuccino - Rp 20,000");
        System.out.println("3. Latte - Rp 22,000");
        System.out.println("4. Teh Tarik - Rp 12,000");
        System.out.println("5. Roti Bakar - Rp 10,000");
        System.out.println("6. Mie Goreng - Rp 18,000");
        System.out.println("===========================");
        System.out.println("Silahkan pilih menu yang Anda inginkan.");
    }

    public static int hitungTotalHarga17(int pilihanMenu, int banyakItem, String kodePromo){
        int[] hargaItems = {15000, 20000, 22000, 12000, 10000, 18000};

        int hargaTotal = hargaItems[pilihanMenu-1]*banyakItem;
        if (kodePromo.equals("DISKON50")) {
            hargaTotal *= 0.5; 
        } else if (kodePromo.equals("DISKON30")) {
            hargaTotal *= 0.7; 
        } else {
            System.out.println("Kode invalid.");
        }
        return hargaTotal;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Menu("Andi", true, "DISKON30");
        int pilihanMenu = 0, banyakItem = 0, totalHarga =0, totalItem = 0;
        boolean selesai = false;
        while (!selesai){
            System.out.print("\nMasukkan nomor menu yang ingin Anda pesan (input 0 untuk selesai): ");
            pilihanMenu = sc.nextInt();
            if (pilihanMenu == 0){
                selesai = true;
                break;
            }
            System.out.print("Masukkan jumlah item yang ingin dipesan: ");
            banyakItem = sc.nextInt();
        
            totalHarga += hitungTotalHarga17(pilihanMenu, banyakItem, "DISKON30");
            totalItem += banyakItem;
        }
        System.out.println("Total harga untuk pesanan Anda: Rp" + totalHarga);
        System.out.println("Total item pesanan anda: " + totalItem + " item");
        
    }
}
