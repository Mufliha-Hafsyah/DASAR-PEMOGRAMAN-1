package minggu9;
import java.util.Scanner;

public class RataNilai17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, j;
        float nilai, totalNilai, rataNilai;

        //perulangan 
        i = 1; 
        while (i <= 5) {
            totalNilai = 0;
            System.out.println("Input Nilai Mahasiswa ke " + i);
            for (j=1; j<=5; j++) { //inner loop 
                System.out.print("Nilai ke-" + j + " = ");
                nilai = sc.nextInt();
                totalNilai += nilai;
            }
            rataNilai = totalNilai/5;
            System.out.println("Rata2 Nilai Mahasiswa ke " + i + "adalah " + rataNilai);
            i++;
        }
    }
}
