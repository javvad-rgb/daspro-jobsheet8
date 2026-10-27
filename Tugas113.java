import java.util.Scanner;
public class Tugas113 {
    public static void main(String[] args) {
        Scanner jvd = new Scanner(System.in);
        System.out.print("Masukkan nilai n = ");
        int n = jvd.nextInt();

        int t = 0;
        for (int i = 1; i <= n; i++ ) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
                t++;
            }
            System.out.println();
        }
        System.out.print("Total angka tercetak : " + t);
        jvd.close();
    }
}
