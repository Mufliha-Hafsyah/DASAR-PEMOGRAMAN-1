package minggu9;
import java.util.Scanner;

public class Porseni {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int i,j,k,jmlPoliteknik;
        String atlet, cabor="";

        System.out.print("Masukkan jumlah Politeknik yang mendaftar: ");
        jmlPoliteknik = sc.nextInt();
        sc.nextLine();

        //perulangan
        for (i=1; i<=jmlPoliteknik; i++){
            System.out.println("=== Data Atlet Porseni Politeknik ke-" + i + " ===");
            for (j = 1; j <= 4; j++) {
                switch (j) {
                    case 1:
                        cabor = "Badminton";
                        break;
                    case 2:
                        cabor = "Tenis Meja";
                        break;
                    case 3:
                        cabor = "Basket";
                        break;
                    case 4:
                        cabor = "Bola Voly";
                        break;
                }
                System.out.println("Cabang Olahraga " + cabor + ":");
                for (k = 1; k <= 5; k++) {
                    System.out.print("Atlet ke-" + k + ": ");
                    atlet = sc.nextLine();
                }
            }
        }
    }
}
