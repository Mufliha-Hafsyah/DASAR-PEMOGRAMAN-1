package minggu7;
import java.util.Scanner;

public class Bioskop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Deklarasi variabel
        int jmlTiket, totalTiket=0, hargaTiket, totalHarga=0, diskon, tiket=50000, totalPendapatan=0;
        String respon="y";

        //Input
        while (respon.equalsIgnoreCase("y")) {
            System.out.print("Masukkan jumlah tiket : ");
            jmlTiket = sc.nextInt();
            if (jmlTiket <= 0) {
                System.out.println("Input invalid, silahkan input ulang");
                continue;
            } else if (jmlTiket > 4) {
                diskon = (int) (0.1 * tiket);
            } else if (jmlTiket > 10){
                diskon = (int) (0.15 * 50000);
            } else {
                diskon = 0;
            }
        
            hargaTiket = (50000-diskon)*jmlTiket;
            totalTiket = totalTiket + jmlTiket;
            totalHarga = totalHarga + hargaTiket;

            System.out.println("Diskon: "+ diskon);
            System.out.println("Harga Tiket: " +hargaTiket);
            
            sc.nextLine();
            System.out.print("Apakah mau melanjutkan transaksi (y/n): ");
            respon = sc.nextLine();
        }

        //Output
        System.out.println("Total Tiket: " + totalTiket);
        System.out.println("Total Harga: " + totalHarga);
        
    }
}