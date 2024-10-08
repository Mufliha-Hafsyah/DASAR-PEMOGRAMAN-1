package minggu6;

import java.util.Scanner;
public class Pemilihan2Percobaan1 {
    public static void main(String[] args) {
        
        //Deklrasi Scanner
        Scanner absen17 = new Scanner(System.in);
        int tahun; 
        
        //Input
        System.out.print("Masukkan Tahun: ");
        tahun = absen17.nextInt();

        //Pengecekan Tahun Kabisat atau Bukan Tahun Kabisat
        if (tahun % 4 == 0) {
            if (tahun % 100 != 0){ 
                System.out.println("Tahun Kabisat");
           }
        }else { 
                System.out.println("Bukan Tahun Kabisat");  
        }
    }
}

