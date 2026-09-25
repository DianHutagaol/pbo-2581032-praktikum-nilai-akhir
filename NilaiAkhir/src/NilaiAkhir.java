import java.util.Scanner;

public class NilaiAkhir{
    public static final double BOBOT_PRAKTIKUM = 0.30;
    public static final double BOBOT_TUGAS = 0.20;
    public static final double BOBOT_MID = 0.20;
    public static final double BOBOT_FINAL = 0.30;

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nilai praktikum : ");
        double praktikum = scanner.nextDouble();

        System.out.print("Nilai tugas : ");
        double tugas = scanner.nextDouble();

        System.out.print("Nilai mid : ");
        double mid = scanner.nextDouble();

        System.out.print("Nilai final : ");
        double finalNilai= scanner.nextDouble();

        /*Jika rumus diganti menggunakan tipe int:
        * int nilaiInt = praktikum * 30 / 100 + tugas * 20 / 100 + mid 20 / 100 + finalNilai * 30 /100 ;
        * Hasil = 78 (bukan 79.1)
        * Karena pembagian dua bilangan integer seperti 2550 / 100 menghasilkan 25 bukan 25.5 karena bagian pecahannya di simpan diam diam.*/

        /*Karena operator perkalian (*) memiliki precende lebih tinggi daripada operator penjumalahan(+) */
        double akhir = praktikum * BOBOT_PRAKTIKUM + tugas * BOBOT_TUGAS + mid * BOBOT_MID;
        akhir += finalNilai * BOBOT_FINAL;

        int dipotong = (int) akhir;
        long dibulatkan = Math.round(akhir);

        System.out.println("\n-----Nilai Akhir-----");
        System.out.println("Praktikum : " + praktikum + "(30%)");
        System.out.println("Tugas : " + tugas + "(20%)");
        System.out.println("Mid : " + mid + "(20%)");
        System.out.println("Final : " + finalNilai + "(30%)");
        System.out.println("Nilai akhir : " + akhir);
        System.out.println("Dipotong (int) : " + dipotong);

    }
}
