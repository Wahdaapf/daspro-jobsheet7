import java.util.Scanner;

public class SiakadWhile24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int nilai, jml, i = 0;

        System.out.print("Masukkan Jumlah Mahasiswa : ");
        jml = sc.nextInt();

        while(i < jml) {
            System.out.printf("Masukkan Nilai Mahasiswa ke-%s : ", i + 1);
            nilai = sc.nextInt();

            if(nilai < 0 || nilai > 100) {
                System.out.println("Nilai tidak valid. Masukkan lagi nilai yang valid!");
                continue;
            }

            if(nilai > 80 && nilai <= 100) {
                System.out.println("Nilai Mahasiswa ke-" + (i+1) + "Adalah A");
                System.out.println("Bagus, Pertahankan Nilainya!");
            }else if(nilai > 73 && nilai <= 80) {
                System.out.println("Nilai Mahasiswa ke-" + (i+1) + "Adalah B+");
            }else if(nilai > 65 && nilai <= 73) {
                System.out.println("Nilai Mahasiswa ke-" + (i+1) + "Adalah B");
            }else if(nilai > 60 && nilai <= 65) {
                System.out.println("Nilai Mahasiswa ke-" + (i+1) + "Adalah C+");
            }else if(nilai > 50 && nilai <= 60) {
                System.out.println("Nilai Mahasiswa ke-" + (i+1) + "Adalah C");
            }else if(nilai > 39 && nilai <= 50) {
                System.out.println("Nilai Mahasiswa ke-" + (i+1) + "Adalah C+");
            }else {
                System.out.println("Nilai Mahasiswa ke-" + (i+1) + "Adalah E");
            }
            i++;
        }
    }
}