package minggu3;

import java.util.Scanner;

public class TugasGajiKaryawan {
    public static void main(String[] args) {
        int jumlahlJam, upahPerJam;
        float persenBonus = (float)0.1, persenPajak = 0.05f;


        //1. input
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Jumlah Jam Kerja Per Bulan: ");
        jumlahlJam = sc.nextInt();
        System.out.print("Masukkan Upah Per Jam: ");
        upahPerJam = sc.nextInt();


        //2. hitung gaji
        int totalGaji = jumlahlJam*upahPerJam;
        float bonus = persenBonus*totalGaji;
        int totalGajiPlusBonus = totalGaji+(int)bonus;
        float pajak = persenPajak*totalGajiPlusBonus;
        int gajiBersih = totalGajiPlusBonus-(int)pajak;

        
        //output
        System.out.println("Total Gaji = "+totalGaji);
        System.out.println("Bonus = "+bonus);
        System.out.println("Pajak = "+pajak);
        System.out.println("Gaji Bersih = "+gajiBersih);
        sc.close();
    }
}
