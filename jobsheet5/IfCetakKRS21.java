import java.util.Scanner;

public class IfCetakKRS21 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("--- Cetak KRS Siakad ---");
        System.out.println("Apakah UKT sudah lunas? (true/false)");
        boolean uktLunas = sc.nextBoolean();
        
        String ukt = uktLunas ? "Pembayaran UKT Terverifikasi" : "Registrasi Ditolak";
        System.out.println(ukt);
        
        
            
    }
}