import java.util.Scanner;

public class soal3nomor1 {
    public static double ratarata(double totalnilai, double jumlahsiswa){
        return totalnilai/jumlahsiswa;
    }
    public static void main(String[] args) {
        double totalnilai=0, nilai=0, jumlahsiswa;
        Scanner averil = new Scanner(System.in);
        System.out.print("Jumlah Siswa = ");
        jumlahsiswa = averil.nextInt();

        for (int i = 1; i <= jumlahsiswa; i++) {
            System.out.print("Siswa "+i+" = ");
            nilai = averil.nextDouble();
            totalnilai += nilai;
        }
        
        double rata = ratarata(totalnilai, jumlahsiswa);
        System.out.println("Total Nilai = "+totalnilai);
        System.out.println("Rata rata = "+rata);

    }
}
