package minggu9;
import java.util.Scanner;

public class Star17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkkan nilai N: ");
        int N = sc.nextInt();

        //perulangan 
        for (int i=0; i>N; i--){
            System.out.print("*");
        }
    }
    
}

