package minggu11;
import java.util.Scanner;

public record Survei() {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Deklarasi Variabel 
        int i, j;
        double rata2PerResponden, rata2PerPertanyaan, rata2Keseluruhan, total;

        //Deklarasi Array
        int[][] survei = new int[10][6];

        //Input jawaban survei 
        for (i=0; i < survei.length; i++){
            System.out.println("Responden ke-" + (i+1) + " : ");
            for (j=0; j < survei[i].length; j++){
                System.out.print("Masukkan nilai pertanyaan ke- " + (j+1) + " (1-5): ");
                survei[i][j]= sc.nextInt();
            }
        }

        //Menampilkan rata-rata per responden
        System.out.println("==================================");
        System.out.println(" Rata-rata untuk setiap responden ");
        System.out.println("----------------------------------");
        for(i=0; i<survei.length; i++){
            for (i = 0; i < 10; i++) {
                total = 0;
                for (j = 0; j < 6; j++) {
                    total += survei[i][j];
                }
                rata2PerResponden = total / 6;
                System.out.println("Rata-rata Responden ke-" + (i + 1) + ": " + rata2PerResponden);
            }
    
        // Menampilkan rata-rata untuk setiap pertanyaan
        System.out.println("==================================");
        System.out.println(" Rata-rata untuk setiap pertanyaan");
        System.out.println("----------------------------------");
        for (j = 0; j < 6; j++) {
            total = 0;
            for (i = 0; i < 10; i++) {
                total += survei[i][j];
            }
            rata2PerPertanyaan = total / 10;
            System.out.println("Rata-rata Pertanyaan " + (j + 1) + ": " + rata2PerPertanyaan);
        }
    
        // Menampilkan rata-rata keseluruhan
        System.out.println("==================================");
        System.out.println("        Rata-rata Keseluruhan     ");
        System.out.println("----------------------------------");
        double totalKeseluruhan = 0;
        for (i = 0; i < 10; i++) {
            for (j = 0; j < 6; j++) {
                totalKeseluruhan += survei[i][j];
            }
        }
        rata2Keseluruhan = totalKeseluruhan / (10 * 6);
         System.out.println("Rata-rata nilai keseluruhan: " + rata2Keseluruhan);
            
    
        }

    }
}
