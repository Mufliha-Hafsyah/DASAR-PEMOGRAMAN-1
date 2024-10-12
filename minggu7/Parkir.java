package minggu7;
import java.util.Scanner;

public class Parkir {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jenis, durasi=0, total=0;

        System.out.println("-------------------------------------");
        System.out.println("========== JENIS KENDARAAN ==========");
        System.out.println("-------------------------------------");
        System.out.println("1. Mobil");
        System.out.println("2. Motor");
        System.out.println("0. Keluar");
        System.out.println("-------------------------------------");

        do {
            System.out.print("Masukkan jenis kendaraan (1/2/0): ");
            jenis = sc.nextInt(); 

            if (jenis==1 || jenis ==2) {
                System.out.print("Masukkan durasi: ");
                durasi = sc.nextInt();
                if (durasi > 5) 
                    total += 12500;
            } else {
                    if (jenis == 1){
                    total += durasi*3000;
                } else {
                    total += durasi*2000;   
                }
            }

        } while (jenis != 0);

        System.out.println("-------------------------------------");
        System.out.println("Total: "+total);

    }
}
