import java.util.Scanner;
public class Tugas213 {
    public static void main(String[] args) {
        Scanner jvd = new Scanner (System.in);
        System.out.print("Masukkan nilai n = ");
        int n = jvd.nextInt();

        int a = 0;
        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= n; j++){
                int hasil = j*i;
            System.out.print("\t" + hasil);
            a += hasil;
            }
            System.out.println();
        }   
        System.out.println("Jumlah seluruh angka: " + a);
        jvd.close();
    }
}