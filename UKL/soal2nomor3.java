import java.util.Random;
import java.util.Scanner;

public class soal2nomor3 {

    public static void main(String[] args) {
        Scanner averil = new Scanner(System.in);
        Random random = new Random();

        while(true){
            int b1 = random.nextInt(10) + 1;
            int b2 = random.nextInt(10) + 1;
            int operator = random.nextInt(3);
            String operators;
            switch (operator) {
                case 0:
                    operators = "*";
                    break;
                case 1:
                    operators = "/";
                    break;
                case 2:
                    operators = "%";
                    break;
                default:
                    operators = "*";
            }
            System.out.print(b1 + " " + operators + " " + b2 + " = ");
            double jawaban = averil.nextDouble();
            double hasil;

            switch (operator) {
                case 0:
                    hasil = b1 * b2;
                    break;
                case 1:
                    hasil = (double) b1 / b2;
                    break;
                case 2:
                    hasil = b1 % b2;
                    break;
                default:
                    hasil = b1 * b2;
            }if (jawaban == hasil) {
                System.out.println("Jawaban anda benar");
            } else {
                System.out.println("Jawaban anda salah");
                System.out.println("Jawaban yang benar = " + hasil);
            }

            System.out.print("Mau Melanjutkan? (y/n): ");
            String pilihan = averil.next();
            if (pilihan.equalsIgnoreCase("n")) {
                System.out.println("Terima kasih telah bermain!");
                break;
            }
        }
    }
}