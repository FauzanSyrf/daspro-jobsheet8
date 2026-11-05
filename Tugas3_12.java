import java.util.Scanner;

public class Tugas3_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah toko = ");
        int toko = sc.nextInt();
        if (toko < 1) {
            System.out.println("Input toko paling tidak 1");
        }else{
            int totalBarangSemua= 0;
            int barangToko= -1;
            int tokoLaris= 0;
            int i = 1;
            while (i <= toko) {   
                System.out.print("Masukkan jumlah pelangan toko "+i+" = ");
                int pelanggan = sc.nextInt();
                int totalBarang= 0;
                int barang = 0;
                int j = 1;
                while (j <= pelanggan) {
                    System.out.print("Pelanggan "+j+" membeli barang = ");
                    barang = sc.nextInt();
                    if (barang < 0) {
                        System.out.println("barang tidak boleh negatif");
                    }
                    totalBarang += barang;
                    j++;
                }
                System.err.println("Toko "+i+" | pelanggan : "+pelanggan+" | total barang : "+totalBarang);
                totalBarangSemua += totalBarang;
                if (totalBarang > barangToko) {
                    barangToko = totalBarang;
                    tokoLaris = i;
                }
                i++;
            }
            System.out.println("Barang seluruh toko = "+totalBarangSemua);
            System.out.println("Toko paling laris = "+tokoLaris);
        }
        sc.close();
    }
}
