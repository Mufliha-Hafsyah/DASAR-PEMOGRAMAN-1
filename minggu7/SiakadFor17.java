package minggu7;
import java.util.Scanner;

public class SiakadFor17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Deklarasi Variabel
        double nilai, tertinggi=0, terendah=100, batasKelulusan=60;
        int lulus=0, tidakLulus=0;

        for ( int i = 1; i<=10; i++ ) {
            System.out.print("Masukkan nilai mahasiswa ke-" + i + ": ");
            nilai = sc.nextDouble();
            if (nilai > tertinggi) {
                tertinggi = nilai;
            }
            if (nilai < terendah) {
                terendah = nilai;
            }

            //Perhitungan mahasiswa lulus dan tidak lulus
            if (nilai >= batasKelulusan) {
                lulus++;   
            } else {
                tidakLulus++;
            } 
        }

        //Output
        System.out.println("Nilai tertinggi: " + tertinggi);
        System.out.println("Nilai terendah: " + terendah);
        System.out.println("Jumlah mahasiswa lulus: "+ lulus);
        System.out.println("Jumlah mahasiswa tidak lulus: "+ tidakLulus);
    }
}