package minggu15;

import java.util.Scanner;

public class Prestasi {

    static Scanner input = new Scanner(System.in);
    static Scanner inputStr = new Scanner(System.in);
    static int jumlahPeserta = 0;

    public static void main(String[] args) {
        String[][] arrData = new String[1000][5];//array untuk menyimpan data prestasi setiap mahasiswa
        int choose;
        //perulangan untuk memanggil fungsi berdasarkan menu yang dipilih
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

    static void inputDataPrestasi(String[][] arrData) {//fungsi untuk menginput nama mahasiswa, NIM, jenis prestasi, tingkat, tahun prestasi
        System.out.print("Masukkan Nama Mahasiswa: ");
        arrData[jumlahPeserta][0] = inputStr.nextLine();
        System.out.print("Masukkan NIM Mahasiswa: ");
        arrData[jumlahPeserta][1] = inputStr.nextLine();
        System.out.print("Masukkan Jenis Prestasi: ");
        arrData[jumlahPeserta][2] = inputStr.nextLine();

        while (true) { //perulangan untuk menginput dan mengecek tingkat prestasi
            System.out.print("Masukkan Tingkat Prestasi (Lokal/Nasional/Internasional): ");
            arrData[jumlahPeserta][3] = inputStr.nextLine();
            String tingkatPrestasi = arrData[jumlahPeserta][3];
            if (tingkatPrestasi.equalsIgnoreCase("Lokal") || tingkatPrestasi.equalsIgnoreCase("Nasional") || tingkatPrestasi.equalsIgnoreCase("Internasional")) { //pemilihan untuk mengecek tingkat prestasi
                break;
            } else {
                System.out.println("Tingkat prestasi tidak valid. Coba lagi.");
                continue;
            }
        }

        int tahun;
        while (true) { //perulangan untuk menginput dan mengecek tahun prestasi 
            System.out.print("Masukkan Tahun Prestasi (2010 - 2024): ");
            tahun = input.nextInt();
            if (tahun < 2010 || tahun > 2024) { //pemilihan untuk mengecek tahun prestasi
                System.out.println("Tahun tidak valid. Coba lagi");
                continue;
            } else {
                arrData[jumlahPeserta][4] = Integer.toString(tahun); //mengubah variabel tahun menjadi string
                break;
            }
        }
        System.out.println("Data prestasi berhasil ditambahkan.");
        System.out.println();
        jumlahPeserta++;
    }

    static void tampilData(String[][] arrData) { //fungsi untuk menampilkan data prestasi yang telah diinput
        if (jumlahPeserta == 0) { //pemilihan untuk mengecek apakah sudah ada data prestasi yang diinput apa belum
            System.out.println("Belum ada data prestasi.");
        }

        for (int i = 0; i < jumlahPeserta; i++) { //perulangan bersarang untuk menampilkan semua data prestasi yang telah diinput 
            for (int j = 0; j < 1; j++) { 
                System.out.println("Nama: " + arrData[i][j] + " | " + "NIM: " + arrData[i][j+1] + " | " + "Jenis: " + arrData[i][j+2] + " | " + "Tingkat: " + arrData[i][j+3] + " | " + "Tahun: " + arrData[i][j+4]);
            }
        }
        System.out.println();
    }

    static void analisisData(String[][] arrData) { //fungsi untuk menganalisis data jenis prestasi yang inngin dianalisis
        System.out.print("Masukkan Jenis Prestasi berdasarkan jenis yang ingin dianalisis: ");
        String jenis = inputStr.nextLine();
        System.out.print("Masukkan Jenis Prestasi berdasarkan tahun yang ingin dianalisis: ");
        String tahun = inputStr.nextLine();

        boolean found = false; //flag untuk mengecek apakah kondisi sudah benar atau salah?
        System.out.println(); 
        System.out.println("=== ANALISIS PRESTASI ===");
        for (int i = 0; i < jumlahPeserta; i++) { //perulangan untuk menampilkan data yang dianalisis
            if (jenis.equalsIgnoreCase(arrData[i][2])) { //pemilihan untuk mengecek apakah jenis prestasi ada dalam arrData
                if(tahun.equalsIgnoreCase(arrData[i][4])){ //pemilihan untuk mengecek apakah tahun prestasi ada dalam arrData
                    System.out.println("Nama: " + arrData[i][0] + " | " + "NIM: " + arrData[i][1] + " | " + "Tingkat: " + arrData[i][3]);
                    found = true;
                }
            }
        }
        if (!found) { //pemilihan untuk mengecek ketika flag found tidak bernilai true
            System.out.println("Tidak ada Jenis Prestasi dengan Jenis " + jenis);
        }
        System.out.println();
    }
}
