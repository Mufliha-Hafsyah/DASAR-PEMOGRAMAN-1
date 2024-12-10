package minggu12;
import java.util.Scanner;

public class SkorSepakBola {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Input jumlah dan nama tim
        System.out.print("Masukkan jumlah tim: ");
        int jmlTim = input.nextInt();
        input.nextLine();

        String namaTim[] = new String[jmlTim];
        for (int i = 0; i < jmlTim; i++){
            System.out.print("Nama Tim " + (i+1) + ": Tim ");
            namaTim [i]= input.nextLine();
        }
        System.out.println();
        
        // Input skor pertandingan
        int skor [][] = new int[jmlTim][jmlTim];
        System.out.println("Masukkan skor pertandingan: ");
        for (int i=0; i < jmlTim; i ++){
            for (int j= i+1; j < jmlTim; j++){
                System.out.print("Tim " + namaTim[i] + " vs " + "Tim " + namaTim[j] + ", skor: ");
                int skorPertandingan = input.nextInt();
                skor[i][j] = skorPertandingan;
                skor[j][i] = - skorPertandingan;
            }
        }
        System.out.println();

        //Menampilkan skor pertandingan 
        System.out.println("Tabel Skor Pertandingan: ");
        System.out.print("\t");
        for (String tim : namaTim) {
            System.out.print("Tim " + tim + "\t");
        }
        System.out.println();

        for (int i = 0; i < jmlTim; i++) {
            System.out.printf("%-8s", "Tim "+ namaTim[i]);
            for (int j = 0; j < jmlTim; j++) {
                System.out.printf("%5d ", skor[i][j]);
            }
            System.out.println();
        }
        System.out.println();

        //hitung total skor
        for (int i = 0; i < jmlTim; i++) {
            int totalSkor = 0;
            for (int j = 0; j < jmlTim; j++) {
                totalSkor += skor[i][j];
            }
            System.out.println("Tim " + namaTim[i] + " total skor " + totalSkor);
        }

    }
}
