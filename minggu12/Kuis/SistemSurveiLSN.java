package minggu12.Kuis;
import java.util.Scanner;

public class SistemSurveiLSN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Input jumlah daerah dan responden
        System.out.print("Masukkan jumlah daerah: ");
        int jmlDaerah = sc.nextInt();
        System.out.print("Masukkan jumlah responden: ");
        int jmlResponden = sc.nextInt();
        sc.nextLine(); 

        //Input nama daerah dan nama responden
        String namaDaerah[] = new String[jmlDaerah];
        System.out.println("Input Nama Daerah: ");
        for(int i=0; i<jmlDaerah; i++){
            System.out.print("Daerah ke-" +(i+1)+" : ");
            namaDaerah[i] = sc.nextLine();
        }
        System.out.println();

        //Mengisi Survei di Tiap Daerah
        String programPemerintah[] = {"Infrastruktur", "Kesehatan", "Pendidikan"};
        double survei[][] = new double [jmlResponden][programPemerintah.length];
        System.out.println("---- SURVEI PROGRAM PEMERINTAH ----");
        for (int h=0; h<jmlDaerah; h++){
            System.out.println("Daerah "+namaDaerah[h]);
            for (int i =0; i < survei.length; i++){
                System.out.println("Responden ke-" + (i+1) + " : ");
                for (int j=0; j < survei[i].length; j++){
                    System.out.print("Masukkan nilai kepuasan " + (programPemerintah[j]) + " (1-5): ");
                    int nilai = sc.nextInt();
                    survei[h][j] += nilai;
                }
            }
            System.out.println("-------------------------------");
        }
        System.out.println();

        //Menampilkan tabel survei
        System.out.println("TABEL HASIL SURVEI:");
        System.out.print("\t");
        for (String program : programPemerintah) {
            System.out.print(program + "\t");
        }
        System.out.println();
        for(int i=0; i<jmlDaerah; i++){
            System.out.print(namaDaerah[i] + "\t");
            for(int j=0; j<programPemerintah.length; j++){
                double rata2= survei[i][j]/jmlResponden;//
                System.out.print(rata2 +"\t");

            }
            System.out.println();
        }
        System.out.println();

        //hitung rata-rata kepuasan per program
        System.out.println("RATA-RATA KEPUASAN PER PROGRAM: "); 
        //double totalPerProgram[] = new double[programPemerintah.length];
        for (int j = 0; j < programPemerintah.length; j++) {
            double totalPerProgram = 0, rata2PerProgram=0;
            for (int i = 0; i < jmlResponden; i++) {
                //totalPerProgram[j] += survei[i][j];
                totalPerProgram += survei[i][j];
            }
            //rata2PerProgram= totalPerProgram[j] /jmlDaerah;
            rata2PerProgram = totalPerProgram / (jmlDaerah*jmlResponden);
            System.out.println("Rata-rata kepuasan program " + (programPemerintah[j]) + ": " + rata2PerProgram);
        }
        System.out.println();

        //menentukan daerah dgn nilai kepuasan tertinggi utk setiap program
        System.out.println("Daerah dengan nilai kepuasan tertinggi untuk setiap program:");
        for (int j = 0; j < programPemerintah.length; j++) {
            double max = -1;
            String daerahTertinggi = "";
            for (int i = 0; i < jmlDaerah; i++) {
                if (survei[i][j] > max) {
                    max = survei[i][j];
                    daerahTertinggi = namaDaerah[i];
                }
            }
            System.out.println(programPemerintah[j] + ": " + daerahTertinggi + " (Total: " + max + ")");
        }
        System.out.println();

        //menentukan program favorit dari tiap daerah
        System.out.println("Program favorit di setiap daerah:");
        for (int i = 0; i < jmlDaerah; i++) {
            int maxIndex = 0;
            for (int j = 1; j < programPemerintah.length; j++) {
                if (survei[i][j] > survei[i][maxIndex]) {
                    maxIndex = j;
                }
            }
            System.out.println(namaDaerah[i] + ": " + programPemerintah[maxIndex]);
        }
    }
}
