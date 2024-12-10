package minggu13;
import java.util.Scanner;

public class Kubus17 {
    //Fungsi hitung luas
    static int hitungLuas(int s){
        int Luas = 6*(s*s);
        return Luas;
    }

    //Fungsi hitung volume
    static int hitungVolume(int s){
        int Volume = s*s*s;
        return Volume;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan panjang sisi: ");
        int s=input.nextInt();
        
        int L = hitungLuas(s);
        System.out.println("Luas permukaan kubus adalah: " + L);

        int V = hitungVolume(s);
        System.out.println("Volume kubus adalah " + V);
    }
}
