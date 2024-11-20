package minggu12;
import java.util.Scanner;

public class SistemInventarisGudang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Deklarasi Variabel
        int jmlJenisBarang, jmlLokasi;

        //Input jenis barang dan lokasi penyimpanan
        System.out.print("Masukkan jumlah jenis barang: ");
        jmlJenisBarang = sc.nextInt();
        System.out.print("Masukkan jumlah lokasi penyimpanan: ");
        jmlLokasi = sc.nextInt();
        sc.nextLine();
        
        //Deklarasi array       
        int[][] stokBarang = new int [jmlJenisBarang][jmlLokasi];
        String[] namaKota = new String[jmlLokasi];

        //Input nama kota
        System.out.println("Masukkan nama kota untuk setiap lokasi: ");
        for (int i = 0; i < jmlLokasi; i++) {
            System.out.print("Kota untuk lokasi " + (i+1) + ": ");
            namaKota[i] = sc.nextLine();
        }

        //Mengisi Stok Barang 
        System.out.println("\nMengisi stok barang...");
        for (int i = 0; i < stokBarang.length; i++) {
            System.out.print("Jenis barang (0-" + (jmlJenisBarang - 1) + "): ");
            int jenisBarang = sc.nextInt();
            System.out.print("Lokasi (0-" + (jmlLokasi - 1) + "): ");
            int kota = sc.nextInt();
            System.out.print("Tambah stok: ");
            int tambahStok = sc.nextInt();
            stokBarang[jenisBarang][kota] += tambahStok;
            
        } 
    
        //Menampilkan tabel stok barang
        System.out.println("\nTabel Stok Gudang:");
        System.out.printf("%-10s", " ");
        for (String kota : namaKota) {
            System.out.printf("%-12s", kota);
            //System.out.print(kota);
        }
        System.out.println();
        
        for (int i = 0; i < stokBarang.length; i++) {
            System.out.printf("Barang %d:   ", (i + 1));
            for (int j = 0; j < stokBarang[i].length; j++) {
                System.out.printf("%-12d", stokBarang[i][j]);
            }
            System.out.println();
        }
    
        //Menghitung total stok setiap jenis barang
        System.out.println("\nTotal stok untuk setiap jenis barang:");
        for (int i = 0; i < stokBarang.length; i++) {
            int total = 0;
            for (int j = 0; j < stokBarang[i].length; j++) {
                total += stokBarang[i][j];
            }
            System.out.println("Jenis barang ke-" + (i + 1) + ": " + total);
        }
    
        //Menemukan lokasi dengan stok terbanyak untuk setiap jenis barang
        System.out.println("\nLokasi dengan stok terbanyak untuk setiap jenis barang:");
        for (int i = 0; i < stokBarang.length; i++) {
            int stokTerbanyak = -1;
            int indexKota = -1;
            for (int j = 0; j < stokBarang[i].length; j++) {
                if (stokBarang[i][j] > stokTerbanyak) {
                    stokTerbanyak = stokBarang[i][j];
                    indexKota = j;
                }
            }
            if (stokTerbanyak > 0) {
                System.out.println("Jenis barang ke-" + (i + 1) + ": " + namaKota[indexKota]);
            } else {
                System.out.println("Jenis barang ke-" + (i + 1) + ": Tidak ada stok");
            }
        }

    }
    
}