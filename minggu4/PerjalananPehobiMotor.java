package minggu4;

import java.util.Scanner;

public class PerjalananPehobiMotor {
    public static void main(String[] args) {
         //Variabel
        double totalBahanBakar, konsumsiBahanBakarKota, konsumsiBahanBakarTol, konsumsiBahanBakarGunung, kapasitasMesin, targetBahanBakar, 
        rata2, jarakKota, jarakTol, jarakGunung, jarakTotal, kecepatanKota, kecepatanTol, kecepatanGunung, durasiKota, durasiTol, durasiGunung, presentase;
        
        //Mencari konsumsi bahan bakar di tiap segmen
            //Mencari konsumsi bahan bakar saat melakukan perjalanan di area perkotaan 
            Scanner sc = new Scanner(System.in);
            System.out.print("Masukkan Kecepatan Perjalanan di Area Perkotaan dalam km/jam: ");
            kecepatanKota = sc.nextDouble();
            System.out.print("Masukkan Durasi Perjalanan di Area Perkotaan dalam jam: ");
            durasiKota = sc.nextDouble();
            System.out.print("Masukkan Kapasitas Mesin Perjalanan di Area Perkotaan dalam liter/km: ");
            kapasitasMesin = sc.nextDouble();
        
            konsumsiBahanBakarKota= (kecepatanKota*durasiKota/100)*kapasitasMesin*0.5;
            System.out.println("Konsumsi Bahan Bakar saat melakukan perjalanan di area perkotaan: "+konsumsiBahanBakarKota+" liter");

            //Mencari konsumsi bahan bakar saat melakukan perjalanan di jalan tol
            Scanner tol = new Scanner(System.in);
            System.out.print("Masukkan Kecepatan Perjalanan di Jalan Tol dalam km/jam: ");
            kecepatanTol = tol.nextDouble();
            System.out.print("Masukkan Durasi Perjalanan di Jalan Tol dalam jam: ");
            durasiTol = tol.nextDouble();
            System.out.print("Masukkan Kapasitas Mesin Perjalanan di Jalan Tol dalam liter/km: ");
            kapasitasMesin = tol.nextDouble();
        
            konsumsiBahanBakarTol= (kecepatanTol*durasiTol/100)*kapasitasMesin*0.3;
            System.out.println("Konsumsi Bahan Bakar saat melakukan perjalanan di jalan tol: "+konsumsiBahanBakarTol+" liter");

            //Mencari konsumsi bahan bakar saat melakukan perjalanan di pegunungan
            Scanner gn = new Scanner(System.in);
            System.out.print("Masukkan Kecepatan Perjalanan di Pegununungan dalam km/jam: ");
            kecepatanGunung = gn.nextDouble();
            System.out.print("Masukkan Durasi Perjalanan di Pegunungan dalam jam: ");
            durasiGunung = gn.nextDouble();
            System.out.print("Masukkan Kapasitas Mesin Perjalanan di Pegunungan dalam liter/km: ");
            kapasitasMesin = gn.nextDouble();
        
            konsumsiBahanBakarGunung = (kecepatanGunung*durasiGunung/100)*kapasitasMesin*0.7;
            System.out.println("Konsumsi Bahan Bakar saat melakukan perjalanan di pegunungan: "+konsumsiBahanBakarGunung+" liter");

        //Mencari Total Konsumsi Bahan Bakar 
        totalBahanBakar= konsumsiBahanBakarKota+konsumsiBahanBakarTol+konsumsiBahanBakarGunung;
        System.out.println("Total konsumsi bahan bakar dari semua aktivitas olahraga: "+totalBahanBakar+"liter");

        //Mencari rata-rata konsumsi bahan bakar yang dibutuhkan per km
        jarakKota = kecepatanKota*durasiKota;
        jarakTol = kecepatanTol*durasiGunung;
        jarakGunung = kecepatanGunung*durasiGunung;
        jarakTotal= jarakKota+jarakTol+jarakGunung;
    
        rata2 = totalBahanBakar/jarakTotal;
        System.out.println("Rata-rata konsumsi bahan bakar yang dibutuhkan per km: "+rata2+" liter/km");

        //Mencari presentase konsumsi bahan bakar dari target bahan bakar harian pengendara
        Scanner t = new Scanner(System.in);
        System.out.print("Masukkan target bahan bakar harian dalam liter: ");
        targetBahanBakar= t.nextDouble();

        presentase = totalBahanBakar/targetBahanBakar*100;
        System.out.println("Presentase konsumsi bahan bakar dari target bahan bakar harian pengendara: "+presentase+"%");
    }
}
