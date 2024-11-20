package minggu9;
import java.util.Scanner;

public class SquareAngka {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai N: ");
        int N = sc.nextInt();

        //perulangan
        for (int i=1; i<=N; i++) {
            for (int j=1; j <= N; j++) {
                if (i==1 || i==N || j==1 ||j==N ) {
                    System.out.print(N + " ");
                } else if (N > 9) {
                    System.out.print("   ");
                } else {
                    System.out.print("  ");
                }
                
            }
            System.out.println();
        }
    }
}
