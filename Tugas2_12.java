import java.util.Scanner;

public class Tugas2_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai n = ");
        int n = sc.nextInt();
        int i = 1;
        int angka= 0;
        if (n < 3) {
            System.out.println("masukkan n ulang");
        }else{
            while (i <= n ) {
                int j = 1;
                while (j <= n) {
                    int hasil = i * j; 
                    System.out.printf("%4d", hasil);
                    angka += hasil;
                    j++;
                }
                System.out.println(" ");
                i++;

        }
            
        }
        System.out.println("Angka total = "+ angka);
        sc.close();
    }
}
