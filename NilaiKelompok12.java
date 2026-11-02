import java.util.Scanner;

public class NilaiKelompok12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah kelompok : ");
        int jumlahKelompok = sc.nextInt();
        System.out.print("Masukkan jumlah penilai : ");
        int jumlahPenilai = sc.nextInt();
        if (jumlahKelompok <= 0 || jumlahPenilai <= 0) {
            System.out.println("Jumlah kelompok dan penilai harus > 0.");
        } else {
            int nomerKelompok = 1;
            double rataTertinggi = -1;
            int kelompokTerbaik = 0;
            while (nomerKelompok <= jumlahKelompok) {
                System.out.println("Kelompok "+ nomerKelompok);
                double totalNilai = 0;
                for (int j = 1; j <= jumlahPenilai; j++) {
                    int nilai;
                    do {
                        System.out.print(" Nilai dari Penilai "+ j +" : ");
                        nilai = sc.nextInt();
                        if (nilai < 0 || nilai > 100) {
                            System.out.println("Nilai harus 0-100, ulangi input!");
                        }
                    } while (nilai < 0 || nilai > 100);
                    totalNilai += nilai;    
                }
                double rataNilai = totalNilai / jumlahPenilai;
                System.out.println("Kelompok "+nomerKelompok
                            +": nilai rata-rata = "+ rataNilai);
                if (rataNilai > rataTertinggi) {
                    kelompokTerbaik = nomerKelompok;
                    rataTertinggi = rataNilai;
                }
                nomerKelompok++;
            }   
            System.out.println("===================================");
            System.out.println("kelompok terbaik    : "+ kelompokTerbaik);
            System.out.println("rata-rata tertinggi : "+ rataTertinggi);
        }
        sc.close();
    }
}
