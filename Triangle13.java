import java.util.Scanner;
public class Triangle13 {
    public static void main(String[] args) {
        Scanner jvd = new Scanner(System.in);
        System.out.print("Masukkan nilai n = ");
        int n = jvd.nextInt();

        int i = 0;
        while (i < n) {
            int j = 0;
            while (j < i) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }
        jvd.close();
    }
}