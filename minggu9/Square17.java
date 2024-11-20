package minggu9;
import java.util.Scanner;

public class Square17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkkan nilai N: ");
        int N = sc.nextInt();

        //perulangan 
        for (int iOuter=1; iOuter<=N; iOuter++){ //outer loop
            for (int i=1; i<=N; i++){ //inner loop
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
