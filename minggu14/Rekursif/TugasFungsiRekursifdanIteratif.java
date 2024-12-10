package minggu14.Rekursif;
import java.util.Scanner;

public class TugasFungsiRekursifdanIteratif {
    static Scanner sc = new Scanner(System.in);

    //Fungsi Rekursif
    static int hitungTotalRekursif(int[] angka, int n) {
        if (n == 0) {
            return 0; 
        } else {
            return angka[n - 1] + hitungTotalRekursif(angka, n - 1); 
        }
    }

    // Fungsi Iteratif
    static int hitungTotalIteratif(int[] angka, int n) {
        int total = 0;
        for (int i = 0; i < n; i++) {
            total += angka[i]; 
        }
        return total;
    }
    
    public static void main(String[] args) {
        System.out.print("Masukkan jumlah angka yang ingin dihitung (N): ");
        int n = sc.nextInt();
        int[] angka = new int[n];

        for (int i = n; i > 0; i--) {
            System.out.print("Masukkan angka ke-" + i + ": ");
            angka[n - i] = sc.nextInt();
        }

        int totalRekursif = hitungTotalRekursif(angka, n);
        int totalIteratif = hitungTotalIteratif(angka, n);

        System.out.println("Total dari " + n + " angka yang dimasukkan (rekursif): " + totalRekursif);
        System.out.println("Total dari " + n + " angka yang dimasukkan (iteratif): " + totalIteratif);
    }
}