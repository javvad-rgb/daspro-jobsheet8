import java.util.Scanner;
public class Star13 {
    public static void main(String[] args) {
        Scanner jvd = new Scanner(System.in);

        System.out.print("Masukkan nilai n = ");
        int n = jvd.nextInt();

        for (int i = 1; i <= n; i ++) {
                System.out.print(i + "");
        }
        System.out.println();
        jvd.close();
    }
}