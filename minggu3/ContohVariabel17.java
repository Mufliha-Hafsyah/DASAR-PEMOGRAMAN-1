package minggu3;

public class ContohVariabel17 {
    public static void main(String[] args) {
        String salahSatuHobySayaAdalah = "Bermain petak umpet";
        boolean isPandai = true;
        char jenisKelamin = 'P';
        byte _umurSayaSekarang = 19;
        double $ipk = 3.24, tinggi = 1.78;

        System.out.println(salahSatuHobySayaAdalah);
        System.out.println("Apakah pandai?" + isPandai);
        System.out.println("Jenis kelamin:" + jenisKelamin);
        System.out.println( "Umurku saat ini:" + _umurSayaSekarang);
        System.out.println(String.format("Saya beripk %5, dengan tinggi badan %5", $ipk, tinggi));
    
    }
}
