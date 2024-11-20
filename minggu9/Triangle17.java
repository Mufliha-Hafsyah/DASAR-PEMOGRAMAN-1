package minggu9;
import java.util.Scanner;

public class Triangle17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkkan nilai N: ");
        int N = sc.nextInt();
        int i = 0;

        //Perulangan 
        while (i <= N) { //Outer loop
            int j = 0;
            while (j < i ) { //Inner loop
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
