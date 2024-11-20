package minggu11;
import java.util.Scanner;

public class BioskopWithScanner17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Deklarasi Variabel
        String nama, next;
        int baris, kolom, menu;

        String[][] penonton = new String[4][2];

        do {
            System.out.println("=========== MENU ===========");
            System.out.println("1. Input Data Penonton\n2. Tampilkan Daftar Penonton\n3. Exit");
            System.out.println("============================");
            System.out.print("Pilih Menu: ");
            menu = sc.nextInt();
            sc.nextLine();

            while (true) {
                if(menu == 1){
                    System.out.print("Masukkan nama: ");
                    nama = sc.nextLine();

                    do {
                        System.out.print("Masukkan baris: ");
                        baris = sc.nextInt();
                        if (baris < 1 || baris > 4) {
                            System.out.println("Nomor baris tidak tersedia! Silahkan input antara 1-4!");
                        }
                    } while (baris < 1 || baris > 4); 

                    do {
                        System.out.print("Masukkan kolom: ");
                        kolom = sc.nextInt();
                        if (kolom < 1 || kolom > 2) {
                            System.out.println("Kolom kursi tidak tersedia! Silahkan input antara 1-2!");
                        }
                    } while (kolom < 1 || kolom > 2);
                    sc.nextLine();

                    //menghandle apabila nomor baris/kolom kursi yang tidak tersedia
                    if (penonton[baris-1][kolom-1] == null){
                        penonton[baris-1][kolom-1] = nama;
                        System.out.println("Penonton "+ nama + " menempati baris " + baris + ", kolom " + kolom);
                    } else {
                        System.out.println("Kursi di baris " + baris + ", kolom " + kolom + " telah terisi, silahkan input ulang!");
                        continue;
                    }

                    System.out.print("Input penonton lainnya? (y/n): ");
                    next = sc.nextLine();

                    if (next.equalsIgnoreCase("n")) {
                        break;
                    }
                } else if (menu == 2){
                    System.out.println("Daftar Penonton: ");
                    
                    for (int i=0; i < penonton.length; i++){
                        for (int j=0; j < penonton[i].length; j++){
                            String daftarnama=penonton[i][j];
                            if (daftarnama!=null){
                                System.out.println("Baris " + (i + 1) + ", Kolom " + (j + 1) + ": " + daftarnama);
                            } else {
                                System.out.println("Baris " + (i + 1) + ", Kolom " + (j + 1) + ": ***");
                            }
                        }
                    }
                    break;
                } else if (menu == 3){
                    System.out.println("Terima kasih, program selesai.");
                    break;
                } else {
                    System.out.println("Menu yang dipilih tidak tersedia, silahkan memilih menu yang tersedia!");
                    break;
                }
            } 
         } while (menu != 3);
    }
}
