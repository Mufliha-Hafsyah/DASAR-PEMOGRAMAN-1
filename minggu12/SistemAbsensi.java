package minggu12;
import java.util.Scanner;

public class SistemAbsensi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Input jumlah siswa 
        System.out.print("Masukkan jumlah siswa: ");
        int jmlSiswa = sc.nextInt();
        sc.nextLine();
        System.out.println();

        // input nama siswa 
        System.out.println("=== Input Nama Siswa ===");
        String namaSiswa[] = new String[jmlSiswa];
        for (int i=0; i<jmlSiswa; i++){
            System.out.print("Siswa " + (i+1) + ": ");
            namaSiswa[i] = sc.nextLine();
        }
        System.out.println();

        //Array hari
        String hari[] = {"Senin", "Selasa", "Rabu", "Kamis", "Jumat"};
        String kehadiran [][] = new String[jmlSiswa][hari.length];

        //Data Kehadiran 
        System.out.println("=== Data Kehadiran ===");
        System.out.println("Input H = Hadir, TH = Tidak Hadir");

        //Input Kehadiran
        for(int j =0; j<hari.length; j++){
            System.out.println("Hari " + hari[j] + ": ");
            for (int i=0; i<jmlSiswa; i++){
                System.out.print(namaSiswa[i] + ": ");
                kehadiran[i][j] = sc.nextLine();
            }
            System.out.println("-----------------");
        }

        //Tabel Kehadiran
        System.out.println("Tabel Kehadiran: ");
        System.out.println("Keterangan: ");
        System.out.println("H = Hadir, TH = Tidak Hadir");
        System.out.print("\t");
        for (String d : hari) {
            System.out.print(d + "\t");
        }
        System.out.println();

        for (int i = 0; i < jmlSiswa; i++) {
            System.out.print(namaSiswa[i]);
            for (int j = 0; j < hari.length; j++) {
                System.out.print("\t " + kehadiran[i][j]);
            }
            System.out.println();
        }

        //menghitung jumlah absen per siswa
        System.out.println("Akumulasi absensi setiap siswa: ");
        for(int i=0; i<jmlSiswa; i++){
            int hadir = 0, tidakHadir=0;
            System.out.println(namaSiswa[i]);
             for (int j = 0; j < hari.length; j++){
                if(kehadiran[i][j].equalsIgnoreCase("H")){
                    hadir++;
                } else if (kehadiran[i][j].equalsIgnoreCase("TH")){
                    tidakHadir++;
                }

             }
            System.out.println("Hadir: " + hadir);
            System.out.println("Tidak Hadir: " + tidakHadir);
            System.out.println();
        }

        //siswa-siswa yang absen lebih dari 3 hari! 
        System.out.println("Siswa yang absen lebih dari 3 hari: ");
        boolean absenLebihDariTiga = false;
        for(int i=0; i<jmlSiswa; i++){
            int tidakHadir=0;
             for (int j = 0; j < hari.length; j++){
                if (kehadiran[i][j].equalsIgnoreCase("TH")){
                    tidakHadir++;
                }
             }
             if (tidakHadir>3){
                System.out.println(namaSiswa[i] + "Tidak hadir: " + tidakHadir+ " hari");
                absenLebihDariTiga = true;
             }
        }
        if(!absenLebihDariTiga){
            System.out.println("Tidak ada");
        }
    
    }
}
