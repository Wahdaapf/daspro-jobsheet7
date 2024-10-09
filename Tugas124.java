import java.util.Scanner;

public class Tugas124 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hargaTiket = 50000, totalTiketTerjual = 0, jumlahTiket;
        double totalPenjualan = 0;
        
        while (true) {
            System.out.print("Masukkan jumlah tiket yang dibeli (atau ketik 0 untuk keluar): ");
            jumlahTiket = sc.nextInt();
            if (jumlahTiket == 0) {
                break;
            }
            if (jumlahTiket < 0) {
                System.out.println("Jumlah tiket tidak valid. Masukkan jumlah tiket yang benar!");
                continue;
            }
            double totalHarga;
            if (jumlahTiket > 10) {
                totalHarga = jumlahTiket * hargaTiket * 0.85; 
            } else if (jumlahTiket > 4) {
                totalHarga = jumlahTiket * hargaTiket * 0.90; 
            } else {
                totalHarga = jumlahTiket * hargaTiket;
            }
            totalTiketTerjual += jumlahTiket;
            totalPenjualan += totalHarga;
            System.out.printf("Total harga untuk %d tiket adalah Rp %.2f\n", jumlahTiket, totalHarga);
        }
        System.out.println("\n==========OUTPUT==========");
        System.out.println("Total tiket terjual\t: " + totalTiketTerjual);
        System.out.printf("Total penjualan tiket\t: Rp %.2f\n", totalPenjualan);
        sc.close();
    }
}
