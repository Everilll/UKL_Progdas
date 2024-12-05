import java.util.Scanner;

public class soal1nomor1 {
    public static void main(String[] args) {
        Scanner averil = new Scanner (System.in);
        double berat, jarak, harga, hargaperkg, panjang, lebar, tinggi, volume, hargatotal;
        System.out.print("Berat Paket (kg): ");
        berat = averil.nextDouble();
        System.out.print("Jarak Tempuh Paket (km): ");
        jarak = averil.nextDouble();
        System.out.print("-----Volume Paket-----\nPanjang (cm) = ");
        panjang = averil.nextDouble();
        System.out.print("Lebar (cm) = ");
        lebar = averil.nextDouble();
        System.out.print("Tinggi (cm) = ");
        tinggi = averil.nextDouble();
        volume = panjang*lebar*tinggi;
        System.out.println("----------------------");

        if(jarak<=10){
            hargaperkg = 4250;
            harga = berat*hargaperkg;
            if(volume>100){
                hargatotal = harga+50000;
                System.out.println("Harga Total = "+hargatotal);
            }else{
                System.out.println("Harga Total = "+harga);
            }
        }else if(jarak>10){
            hargaperkg = 6000;
            harga = berat*hargaperkg;
            if(volume>100){
                hargatotal = harga+50000;
                System.out.println("Harga Total = "+hargatotal);
            }else{
                System.out.println("Harga Total = "+harga);
            }
        }else {
            System.out.println("Error");
        }
        
    }
}