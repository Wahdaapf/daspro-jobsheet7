import java.util.Scanner;

public class Tugas224 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jenisKendaraan, durasiParkir, tarifMobil = 3000, tarifMotor = 2000, tarifTetap = 12500, totalBayar = 0;

        while (true) {
            System.out.print("Masukkan jenis kendaraan (1: Mobil, 2: Motor, 0: Keluar): ");
            jenisKendaraan = sc.nextInt();
            if (jenisKendaraan == 0) {
                System.out.println("Program dihentikan.");
                break;
            }
            System.out.print("Masukkan durasi parkir (jam): ");
            durasiParkir = sc.nextInt();
            if (durasiParkir > 5) {
                totalBayar += tarifTetap; 
            } else {
                if (jenisKendaraan == 1) {
                    totalBayar += durasiParkir * tarifMobil;
                } else if (jenisKendaraan == 2) {
                    totalBayar += durasiParkir * tarifMotor;
                } else {
                    System.out.println("Jenis kendaraan tidak valid.");
                    continue;
                }
            }
            System.out.println("Total pembayaran parkir: Rp " + totalBayar);
        }

        System.out.println("\n==========OUTPUT==========");
        System.out.println("Total pembayaran parkir: Rp " + totalBayar);
        sc.close();
    }
}
