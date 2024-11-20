package minggu8;
import java.util.Scanner;

public class gameRPG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Deklarasi Variabel 
        int nyawaAwalPemain, nyawaAwalMusuh, attackPowerPemain, attackPowerMusuh, sisaNyawaPemain=0, sisaNyawaMusuh=0, ronde=1;
        String respon;

        //Input 
        System.out.print("Masukkan nyawa awal pemain: ");
        nyawaAwalPemain = sc.nextInt();
        System.out.print("Masukkan nyawa awal musuh: ");
        nyawaAwalMusuh = sc.nextInt();
        System.out.print("Masukkan kekuatan serangan pemain: ");
        attackPowerPemain = sc.nextInt();
        System.out.print("Masukkan kekuatan serangan musuh: ");
        attackPowerMusuh = sc.nextInt();

        sisaNyawaMusuh = nyawaAwalMusuh;
        sisaNyawaPemain = nyawaAwalPemain;
        
        //Perulangan
        while (sisaNyawaMusuh > 0 && sisaNyawaPemain> 0 ) {
            System.out.println("");
            System.out.println("=== Ronde " + ronde + " ===");
            sisaNyawaMusuh = sisaNyawaMusuh - attackPowerPemain;
            System.out.println("Pemain menyerang! Nyawa musuh tersisa: " + sisaNyawaMusuh);
            sisaNyawaPemain = sisaNyawaPemain - attackPowerMusuh;
            System.out.println("Musuh menyerang! Nyawa pemain tersisa: " + sisaNyawaPemain);

            ronde++;
               if (sisaNyawaMusuh <= 0 || sisaNyawaPemain <=0) {
                    System.out.println("Permainan berhenti");
               } else {
                 if (sisaNyawaPemain <= 0.2*nyawaAwalPemain) {
                    System.out.println("Pemain Berada dalam Kondisi Kritis");
                    System.out.print("Apakah anda ingin melarikan diri? (ya/tidak): ");
                    sc.nextLine();
                    respon = sc.nextLine();
                    if (respon.equalsIgnoreCase("ya")) {
                        System.out.println("Permainan berhenti");
                        break;
                    } else {

                    }
                }
               }
               
        }
    }
}

