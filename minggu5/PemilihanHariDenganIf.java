package minggu5;

import java.util.Scanner;
public class PemilihanHariDenganIf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //Deklarasi Variabel & Input
        System.out.print("Input number: ");
        int number = sc.nextInt();
        

       //Pengecekan & Output
       if (number>=1 && number<=5) {
        System.out.println("Weekday");
       }else if (number==6 && number==7){
        System.out.println("Weekend");
       }else{
        System.out.println("Invalid number");
       }
    }
}
