package minggu6;

import java.util.Scanner;
public class DiskonTokoBuku {
    public static void main(String[] args) {
        
        // Deklarasi Scanner untuk input
        Scanner input = new Scanner(System.in);
        
        // Deklarasi variabel
        String jenisBuku;
        int jumlahBuku;
        double hargaPerBuku, totalHarga, diskon = 0;
        
        // Input
        System.out.print("Masukkan jenis buku (kamus/novel/lainnya): ");
        jenisBuku = input.nextLine();
        
        System.out.print("Masukkan jumlah buku: ");
        jumlahBuku = input.nextInt();
        
        System.out.print("Masukkan harga per buku: ");
        hargaPerBuku = input.nextDouble();
        
        // Hitung total harga awal
        totalHarga = jumlahBuku * hargaPerBuku;
        
        // Pengecekan jenis buku dan menghitung diskon
        if (jenisBuku.equalsIgnoreCase("kamus")) {
            diskon = 0.10; // Diskon 10% untuk kamus
            if (jumlahBuku > 2) {
                diskon += 0.02; // Tambahan diskon 2% jika jumlah lebih dari 2
            }
        } else if (jenisBuku.equalsIgnoreCase("novel")) {
            diskon = 0.07; // Diskon 7% untuk novel
            if (jumlahBuku > 3) {
                diskon += 0.02; // Tambahan diskon 2% jika jumlah lebih dari 3
            } else {
                diskon += 0.01; // Tambahan diskon 1% jika jumlah kurang dari atau sama dengan 3
            }
        } else {
            if (jumlahBuku > 3) {
                diskon = 0.05; // Diskon 5% untuk buku selain kamus dan novel jika jumlah lebih dari 3
            }
        }
        
        // Hitung jumlah diskon dan total yang harus dibayar
        double jumlahDiskon = totalHarga * diskon;
        double totalBayar = totalHarga - jumlahDiskon;
        
        // Output
        System.out.println("Jumlah diskon: Rp " + jumlahDiskon);
        System.out.println("Total yang harus dibayar: Rp " + totalBayar);
    }
}

    

