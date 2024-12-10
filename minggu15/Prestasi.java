package minggu15;

import java.util.Scanner;

public class Prestasi {

    static Scanner input = new Scanner(System.in);
    static Scanner inputStr = new Scanner(System.in);
    static int jumlahPeserta = 0;

    public static void main(String[] args) {
        String[][] arrData = new String[1000][5];
        int choose;
        do {
            System.out.println("=== PENCATATAN PRESTASI MAHASISWA ===");
            System.out.println("1. Tambah Data Prestasi\n2. Tampilkan Semua prestasi\n3. Analisis Prestasi Berdasarkan Jenis\n4. Keluar");
            System.out.print("Pilih Menu: ");
            choose = input.nextInt();
            switch (choose) {
                case 1:
                    inputDataPrestasi(arrData);
                    break;
                case 2:
                    System.out.println("=== DAFTAR SEMUA PRESTASI ===");
                    tampilData(arrData);
                    break;
                case 3:
                    analisisData(arrData);
                    break;
                case 4:
                    System.out.println("Program selesai. Terima kasih!");
                    break;
            }
        } while (choose != 4);
    }

    static void inputDataPrestasi(String[][] arrData) {
        System.out.print("Masukkan Nama Mahasiswa: ");
        arrData[jumlahPeserta][0] = inputStr.nextLine();
        System.out.print("Masukkan NIM Mahasiswa: ");
        arrData[jumlahPeserta][1] = inputStr.nextLine();
        System.out.print("Masukkan Jenis Prestasi: ");
        arrData[jumlahPeserta][2] = inputStr.nextLine();

        while (true) {
            System.out.print("Masukkan Tingkat Prestasi (Lokal/Nasional/Internasional): ");
            arrData[jumlahPeserta][3] = inputStr.nextLine();
            String tingkatPrestasi = arrData[jumlahPeserta][3];
            if (tingkatPrestasi.equalsIgnoreCase("Lokal") || tingkatPrestasi.equalsIgnoreCase("Nasional") || tingkatPrestasi.equalsIgnoreCase("Internasional")) {
                break;
            } else {
                System.out.println("Tingkat prestasi tidak valid. Coba lagi.");
                continue;
            }
        }

        int tahun;
        while (true) {
            System.out.print("Masukkan Tahun Prestasi (2010 - 2024): ");
            tahun = input.nextInt();
            if (tahun < 2010 || tahun > 2024) {
                System.out.println("Tahun tidak valid. Coba lagi");
                continue;
            } else {
                arrData[jumlahPeserta][4] = Integer.toString(tahun);
                break;
            }
        }
        System.out.println("Data prestasi berhasil ditambahkan.");
        System.out.println();
        jumlahPeserta++;
    }

    static void tampilData(String[][] arrData) {
        if (jumlahPeserta == 0) {
            System.out.println("Belum ada data prestasi.");
        }

        for (int i = 0; i < jumlahPeserta; i++) {
            for (int j = 0; j < 1; j++) {
                System.out.println("Nama: " + arrData[i][j] + " | " + "NIM: " + arrData[i][j+1] + " | " + "Jenis: " + arrData[i][j+2] + " | " + "Tingkat: " + arrData[i][j+3] + " | " + "Tahun: " + arrData[i][j+4]);
            }
        }
        System.out.println();
    }

    static void analisisData(String[][] arrData) {
        System.out.print("Masukkan Jenis Prestasi berdasarkan jenis yang ingin dianalisis: ");
        String jenis = inputStr.nextLine();
        System.out.print("Masukkan Jenis Prestasi berdasarkan tahun yang ingin dianalisis: ");
        String tahun = inputStr.nextLine();

        boolean found = false;
        System.out.println();
        System.out.println("=== ANALISIS PRESTASI ===");
        for (int i = 0; i < jumlahPeserta; i++) {
            if (jenis.equalsIgnoreCase(arrData[i][2])) {
                if(tahun.equalsIgnoreCase(arrData[i][4])){
                    System.out.println("Nama: " + arrData[i][0] + " | " + "NIM: " + arrData[i][1] + " | " + "Tingkat: " + arrData[i][3]);
                    found = true;
                }
            }
        }
        if (!found) {
            System.out.println("Tidak ada Jenis Prestasi dengan Jenis " + jenis);
        }
        System.out.println();
    }
}
