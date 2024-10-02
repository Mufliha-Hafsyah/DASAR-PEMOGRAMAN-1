package minggu5;

import java.util.Scanner;
public class Usia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Deklarasi Variabel
        int usia;
        
        //Input Usia
        System.out.print("Masukkan usia: ");
        usia = sc.nextInt();

        if (usia <0) {
            System.out.println("Input tidak valid");
        }else if (usia >=0 && usia <=12){
            System.out.println("Kategori usia: Anak-anak");
        }else if (usia >=13 && usia <=19){
            System.out.println("Kategori usia: Remaja");
        }else if (usia >=20 && usia <=64){
            System.out.println("Kategori usia: Dewasa");
        }else{ 
            System.out.println("Kategori usia: Lansia");
        }
    }
}
