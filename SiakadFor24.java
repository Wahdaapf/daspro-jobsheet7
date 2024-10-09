import java.util.Scanner;

public class SiakadFor24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double nilai, tertinggi = 0.0, terendah = 100.0, batasKelulusan = 60.0;
        int lulus = 0, tidakLulus = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.printf("Masukkan Nilai Mahasiswa ke-%s : ", i);
            nilai = sc.nextDouble();
            if (nilai > tertinggi) {
                tertinggi = nilai;
            }
            if (nilai < terendah) {
                terendah = nilai;
            }
            if (nilai >= batasKelulusan) {
                lulus++;
            } else {
                tidakLulus++;
            }
        }

        System.out.println("Nilai Tertinggi\t\t: " + tertinggi);
        System.out.println("Nilai Terendah\t\t: " + terendah);
        System.out.println("Jumlah Mahasiswa Lulus\t\t: " + lulus);
        System.out.println("Jumlah Mahasiswa Tidak Lulus\t: " + tidakLulus);
    }
}
