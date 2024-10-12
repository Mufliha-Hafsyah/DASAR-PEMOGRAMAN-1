package minggu6;

import java.util.Scanner;

public class DiskonTokoBuku{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        //Deklarasi variabel
        String jenisBuku;
        int jumlah;
        double diskon;

        //Input
        System.out.print("Jenis Buku: ");
        jenisBuku=input.nextLine();
        System.out.print("Jumlah Buku: ");
        jumlah=input.nextInt();

        //Pemilihan
        if(jenisBuku.equalsIgnoreCase("kamus")){
            diskon=0.1;
            if(jumlah>2){
                diskon= diskon + 0.02;
            }
        }else if(jenisBuku.equalsIgnoreCase("novel")){
            diskon=0.07;
            if(jumlah>3){
                diskon=diskon+0.02;
            }else{
                diskon=diskon+0.01;
            }
        }else {
            if(jumlah>3){
                diskon=0.05;
            }else{
                diskon=0;
            }
        }

        //output
        System.out.println("Total diskon yang diterima sebesar: " + diskon + "%");
    }
}
