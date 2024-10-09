import java.util.Scanner;

public class KafeDoWhile24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int kopi, teh, roti, hargaKopi= 12000, hargaTeh = 7000, hargaRoti = 20000;
        String namaPelanggan;

        do {
            System.out.print("Masukkan nama pelanggan (ketik 'batal' untuk keluar): ");
            namaPelanggan = sc.nextLine();
            if(namaPelanggan.equalsIgnoreCase("batal")) {
                System.out.println("Transaksi dibatalkan.");
                break;
            }
            System.out.print("Jumlah Kopi\t: ");
            kopi = sc.nextInt();
            System.out.print("Jumlah Teh\t: ");
            teh = sc.nextInt();
            System.out.print("Jumlah Roti\t: ");
            roti = sc.nextInt();

            int totalHarga = (kopi * hargaKopi) + (roti * hargaRoti) + (teh * hargaTeh);
            System.out.println("Total yang Harus di Bayar Rp." + totalHarga);
            sc.nextLine();

        } while (true);

        System.out.println("Semua Transaksi Selesai");
    }
}