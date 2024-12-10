package minggu13;
import java.util.Scanner;

public class PenjualanCafe {
    static String[] menu={"Kopi", "Teh", "Es Degan", "Roti Bakar", "Gorengan"};
    //Fungsi untuk menginputkan data penjualan 
    static void inputDataPenjualan (int[][] data, String[] menu){
        Scanner input = new Scanner(System.in);
        System.out.println("----- INPUT DATA PENJUALAN -----");
        for(int i = 0; i < 7; i++){
            System.out.println("Hari ke " + (i+1));
            for (int j = 0; j < data.length; j++){
                System.out.print(menu[j] + ": ");
                data[j][i] = input.nextInt();
            }
            System.out.println("--------------------------------");
        }
    }

    //Fungsi untuk menampilkan seluruh data penjualan dari hari pertama hingga hari terakhir 
    static void dataPenjualan(int[][] data, String[] menu){
        System.out.println("\n----- TABEL DATA PENJUALAN -----");
        System.out.print("\t\t");
        for(int i = 0; i < 7; i++){
            System.out.print("Hari ke " + (i+1) + "\t");
        }
        System.out.println();
        for (int i = 0; i < data.length; i++){
            System.out.printf(String.format("%-17s", menu[i]));
            for (int j = 0; j < data[i].length; j++){
                System.out.print(data[i][j] + "\t\t");
                
            }
            System.out.println();
        }
    }

    //Fungsi untuk menghitung total penjualan per menu
    static int[] totalPenjualanPerMenu(int[][] data){
        int[] totalPerMenu = new int[data.length];

        for (int i = 0; i < data.length; i++){
            for (int j = 0; j < data[i].length; j++){
                totalPerMenu[i] += data[i][j];

            }
        }
        return totalPerMenu;
    }

    //Fungsi untuk menampilkan Menu yang memiliki penjualan tertinggi
    static void menuPenjualanTertinggi(int[][] data, String[] menu){
        System.out.println("\n----- MENU DENGAN PENJUALAN TERTINGGI -----");
        int[] totalPerMenu = totalPenjualanPerMenu(data);

        int index = 0, max = 0;
        for(int i = 0; i < totalPerMenu.length; i++){
            if(totalPerMenu[i] > max){
                max = totalPerMenu[i];
                index = i;
            }
        }
        System.out.println("Menu yang memiliki penjualan tertinggi adalah " + menu[index]);
    }

	//Fungsi untuk menampilkan rata-rata penjualan untuk setiap menu
    static void rata2PenjualanPerMenu(int[][] data, String[] menu){
        System.out.println("\n----- RATA-RATA PENJUALAN SETIAP MENU -----");
        int[] totalPerMenu = totalPenjualanPerMenu(data);

        for(int i = 0; i < totalPerMenu.length; i++){
            double rata2PerMenu = (double) totalPerMenu[i]/7;
            System.out.println("Rata-rata penjualan untuk menu " + menu[i] + ": " + rata2PerMenu);
        }
    }

    //main
    public static void main(String[] args) {
        int[][] data = new int[menu.length][7];

        inputDataPenjualan(data, menu);
        dataPenjualan(data, menu);
        menuPenjualanTertinggi(data, menu);
        rata2PenjualanPerMenu(data, menu);
    }
}
