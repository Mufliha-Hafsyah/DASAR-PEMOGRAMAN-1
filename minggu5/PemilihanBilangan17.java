package minggu5;

import java.util.Scanner;
public class PemilihanBilangan17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan sebuah angka: ");
        int angka = sc.nextInt();

        // Penggunaan ternary operator untuk menentukan ganjil/genap
        String hasil = (angka % 2 == 0) ? "Bilangan genap" : "Bilangan ganjil";

        System.out.println(angka + " adalah " + hasil);

    }
}
