import java.util.Scanner;
public class Tugas313 {
    public static void main(String[] args) {
        Scanner jvd = new Scanner (System.in);
        System.out.print("Masukkan jumlah toko: ");
        int toko = jvd.nextInt();

        if (toko < 1){
            System.out.print("Jumlah toko minimal 1");
        } else {
            int nomortoko = 1;              
            int totalseluruh = 0;           
            int barangterbanyak = -1;       
            int tokoterbanyak = 0;
            String ringkasan = "";          
 
            while (nomortoko <= toko) {
                System.out.println("Toko " + nomortoko);
 
                int pelanggan;
                do {
                    System.out.print("  Jumlah pelanggan: ");
                    pelanggan = jvd.nextInt();
                    if (pelanggan < 0) {
                        System.out.println("  Tidak boleh negatif. Ulangi input!");
                    }
                } while (pelanggan < 0);
 
                int totalbarang = 0;        
 
                for (int j = 1; j <= pelanggan; j++) {
                    int barang;
                    do {
                        System.out.print("    Barang pelanggan " + j + ": ");
                        barang = jvd.nextInt();
                        if (barang < 0) {
                            System.out.println("    Tidak boleh negatif. Ulangi input!");
                        }
                    } while (barang < 0);
                    totalbarang += barang;
                }
 
                ringkasan += "Toko " + nomortoko + " - pelanggan: " + pelanggan
                        + ", total barang: " + totalbarang + "\n";
                totalseluruh += totalbarang;
 
                if (totalbarang > barangterbanyak) {
                    barangterbanyak = totalbarang;
                    tokoterbanyak = nomortoko;
                }
 
                nomortoko++;
            }
 
            System.out.println();
            System.out.print(ringkasan);
            System.out.println("Total barang seluruh toko: " + totalseluruh);
            System.out.println("Toko dengan barang terbanyak: " + tokoterbanyak);
        }
        jvd.close();
    }
}