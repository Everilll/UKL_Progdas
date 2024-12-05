import java.util.Scanner;

public class soal2nomor2 {
    public static double VolumeTabung(double jarijari, double tinggi) {
        return 3.14*jarijari*jarijari*tinggi;
    }

    public static void main(String[] args) {
        Scanner averil = new Scanner(System.in);

        System.out.print("Masukkan jari-jari tabung: ");
        double jarijari = averil.nextDouble();
        System.out.print("Masukkan tinggi tabung: ");
        double tinggi = averil.nextDouble();
        double volume = VolumeTabung(jarijari, tinggi);

        System.out.println("---------------------\nVolume Tabung = "+volume);
    }
}
