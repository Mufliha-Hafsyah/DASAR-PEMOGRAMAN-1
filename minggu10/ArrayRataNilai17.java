package minggu10;
import java.util.Scanner;

public class ArrayRataNilai17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Deklarasi variabel
        int totalLulus = 0, totalTidakLulus=0,jmlMahasiswa=0;
        double rata2Lulus, rata2TidakLulus, jmlLulus=0, jmlTidakLulus=0;

        //Input
        System.out.print("Masukkan jumlah mahasiswa: ");
        jmlMahasiswa = sc.nextInt();

        //Deklarasi Array
        int[] nilaiMhs = new int[jmlMahasiswa];

        for (int i = 0; i < nilaiMhs.length; i++){
            System.out.print("Masukkan nilai mahasiswa ke-" + (i+1) + " : ");
            nilaiMhs[i] = sc.nextInt();
        }

        for (int i = 0; i < nilaiMhs.length; i++){
            if (nilaiMhs[i] > 70) {
                totalLulus += nilaiMhs[i];
                jmlLulus += 1;
            } else {
                totalTidakLulus += nilaiMhs[i];
                jmlTidakLulus += 1;
            }
        }
        rata2Lulus = totalLulus/jmlLulus;
        rata2TidakLulus = totalTidakLulus/jmlTidakLulus;
        System.out.println("Rata-rata nilai lulus: " + rata2Lulus);
        System.out.println("Rata-rata nilai tidak lulus: " + rata2TidakLulus);
    }
}
