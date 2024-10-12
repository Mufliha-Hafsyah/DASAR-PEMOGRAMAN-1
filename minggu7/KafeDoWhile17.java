package minggu7;
import java.util.Scanner;

public class KafeDoWhile17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Deklarasi Variabel
        int kopi, teh, roti, hargaKopi=12000, hargaTeh=7000, hargaRoti=20000, totalHarga;
        String namaPelanggan;

        //Perulangan
        do {
            System.out.print("Masukkan nama pelanggan (ketik 'batal' untuk keluar): ");
            namaPelanggan = sc.nextLine();
            if (namaPelanggan.equalsIgnoreCase("batal")) {
                System.out.println("Transaksi dibatalkan.");
                break;
            
            }
            System.out.print("Jumlah kopi: ");
            kopi = sc.nextInt();
            System.out.print("Jumlah teh: ");
            teh = sc.nextInt();
            System.out.print("Jumlah roti: ");
            roti = sc.nextInt();

            totalHarga = (kopi*hargaKopi) + (teh*hargaTeh) + (roti*hargaRoti);
            System.out.println("Total yang harus dibayar: Rp " + totalHarga);
            sc.nextLine();
        } while (true);

        System.out.println("Semua transaksi selesai.");
    }
}