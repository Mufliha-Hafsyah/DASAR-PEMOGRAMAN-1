package minggu10;
import java.util.Scanner;

public class PemesananKafe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jmlPesanan, i=0, j=0, total=0;

        System.out.print("Input jumlah pesanan: ");
        jmlPesanan = sc.nextInt();
        sc.nextLine();

        String[] nama = new String[jmlPesanan];
        int[] harga = new int[jmlPesanan];
        
        
        do {
            System.out.print("Nama makanan/ minuman pesanan ke-" + (i+1)+": ");
            nama[i] = sc.nextLine();
            System.out.print("Harga pesanan ke-" + (i+1) + ": ");
            harga[i] = sc.nextInt();
            sc.nextLine();
            System.out.println("============================");

            i++;
        } while (i < jmlPesanan);

        for (j=0; j<harga.length; j++){
            total += harga[j];
        }

        for (i=0; i<nama.length; i++){
            System.out.println("Daftar pesanan ke-" + (i+1) + " : " + nama[i]);
        }
        System.out.println("============================");
        System.out.println("Total harga: "+ total);
    }
}