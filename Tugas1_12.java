import java.util.Scanner;

public class Tugas1_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai n = ");
        int n = sc.nextInt();
        int i = 1;
        int angka = 0;
        while (i <= n) {
            int j = 1;
           while (j <= i) {
                System.out.print(j +" ");
                angka++;
                j++;
           }
        i++;    
        System.out.println(" ");
        }
        System.out.println("Total angka tercetak = "+angka);
        sc.close();
    }
}
