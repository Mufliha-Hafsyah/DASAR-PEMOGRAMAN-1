package minggu10;

import java.util.Scanner;

public class SearchMenuKafe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] menu = { "Steak", "Sushi", "Pizza", "Gyoza", "Macaron", "Matcha Latte", "Red Velvet", "Chocolava"};
        
        // Input nama makanan yang ingin dicari
        System.out.print("Masukkan nama menu yang ingin dicari: ");
        String nama = sc.nextLine();
        
        boolean found = false; 

        for (int i = 0; i < menu.length; i++) {
            if (menu[i].equalsIgnoreCase(nama)) { 
                found = true; 
                break; 
            }
        }
        
        if (found) {
            System.out.println(nama + " tersedia di menu.");
        } else {
            System.out.println(nama+ " tidak ada di menu.");
        }
  
    }
}

