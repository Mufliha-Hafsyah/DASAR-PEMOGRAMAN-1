package minggu13;
import java.util.Scanner;

public class Percobaan617 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int p,l,t,L,vol;

        System.out.print("Masukkan panjang: ");
        p=input.nextInt();
        System.out.print("Masukkan lebar: ");
        l=input.nextInt();
        System.out.print("Masukkan tinggi: ");
        t=input.nextInt();

        L = p*l;
        System.out.print("Luas Persegi panjang adalah " + L);

        vol = p*l*t;
        System.out.print("Volume balok adalah " + vol);
    }
}
