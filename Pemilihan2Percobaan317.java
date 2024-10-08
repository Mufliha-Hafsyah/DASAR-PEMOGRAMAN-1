import java.util.Scanner;
public class Pemilihan2Percobaan317 {
    public static void main(String[] args) {
        Scanner absen17 = new Scanner(System.in);

        // Deklarasi Variabel
        String kategori;
        int penghasilan, gajiBersih;
        double pajak = 0;

        //Input
        System.out.print("Masukkan Kategori : ");
        kategori = absen17.nextLine();
        System.out.print("Masukkan Besarnya Penghasilan : ");
        penghasilan = absen17.nextInt();

        //Pengecekan
        if (kategori.equals("pekerja")) {
            if (penghasilan <= 2000000) 
                pajak = 0.1;
            else if (penghasilan <= 3000000)
                pajak = 0.15;
            else 
                pajak = 0.2;
            gajiBersih = (int) (penghasilan - (pajak * penghasilan));
            System.out.print("Penghasil Bersih : " + gajiBersih);    
        } else if (kategori.equals("Pebisnis")) {
            if (penghasilan <= 2500000) 
                pajak = 0.15;
            else if (penghasilan <= 3500000)
                pajak = 0.2;
            else 
                pajak = 0.25;
            gajiBersih = (int) (penghasilan - (pajak * penghasilan));
            System.out.print("Penghasil Bersih : " + gajiBersih); 
        }else 
            System.out.println("Masukan Kategori Salah");
    }
}
