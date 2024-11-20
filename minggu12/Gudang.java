package minggu12;

import java.util.Scanner;

public class Gudang {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        //input
        System.out.print("Masukkan jumlah jenis barang: ");
        int jmlhJenis=input.nextInt();
        System.out.print("Masukkan jumlah lokasi penyimpanan: ");
        int jmlhLokasi=input.nextInt();
        input.nextLine();

        //array
        int[][] informasiStokBarang=new int[jmlhJenis][jmlhLokasi];
        String[] lokasi=new String[jmlhLokasi];

        //loop input lokasi
        for (int i = 0; i < jmlhLokasi; i++) {
            
            System.out.print("Kota untuk lokasi " + (i+1) + ": ");
            lokasi[i]=input.nextLine();
        }

        System.out.println();

        //input jenis barang, lokasi, program tambah stok
        int jenisBarang, kota, tambahStok=0;
        for (int i = 0; i < informasiStokBarang.length; i++) {
            System.out.print("Jenis barang (0-" + (jmlhJenis-1) + "): ");
            jenisBarang=input.nextInt();
            System.out.print("Lokasi (0-" + (jmlhLokasi-1) + "): ");
            kota=input.nextInt();
            System.out.print("Tambah stok: ");
            tambahStok=input.nextInt();
                
            informasiStokBarang[jenisBarang][kota]+=tambahStok;
        }

        System.out.println();

        //tabel stok gudang
        System.out.println("Tabel stok gudang:");
        System.out.print("\t");
        for (String lokasiKota : lokasi) {
            System.out.print("\t");
            System.out.print(lokasiKota);
        }

        System.out.println();

        for(int i=0;i<informasiStokBarang.length;i++){
            System.out.print("Barang " + (i+1) + ": " );
            for (int j = 0; j < informasiStokBarang[i].length; j++) {
                System.out.print("\t");
                System.out.print(informasiStokBarang[i][j] );
            }
            System.out.println();
        }
        
        System.out.println();

        //menghitung total per barang
        for (int i = 0; i < informasiStokBarang.length; i++) {
            int totalPerbarang=0;
            for (int j = 0; j < informasiStokBarang[i].length; j++) {
                totalPerbarang+=informasiStokBarang[i][j];
            }
            System.out.println("Total barang " + (i+1) + ": " + totalPerbarang);
        }

        System.out.println();

        //mencari lokasi dengan barang terbanyak
        for (int i = 0; i < informasiStokBarang.length; i++) {
            int terbanyak=0;
            int indeksTerbanyak=0;
            for (int j = 0; j < informasiStokBarang[i].length; j++) {
                if(informasiStokBarang[i][j]>terbanyak){
                    terbanyak=informasiStokBarang[i][j];
                    indeksTerbanyak=j;
                }
            }
            System.out.println("Barang ke-" + (i+1) + ": " + lokasi[indeksTerbanyak]);
        }
    }

   
}

