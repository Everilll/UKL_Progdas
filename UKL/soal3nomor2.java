import java.util.Scanner;

public class soal3nomor2 {
    public static void main(String[] args) {
        Scanner averil = new Scanner(System.in);
        System.out.println("Masukkan jumlah elemen dalam array: ");
        int n = averil.nextInt();
        int[] array = new int[n];

        System.out.println("Masukkan elemen array:");
        for (int i = 0; i < n; i++) {
            array[i] = averil.nextInt();
        }

        boolean adaDuplikat = false;
        System.out.print("Array memiliki elemen duplikat: ");
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (array[i] == array[j]) {
                    System.out.print(array[i] + " ");
                    adaDuplikat = true;
                    break;
                }
            }
        }

        if (!adaDuplikat) {
            System.out.println("Tidak ada elemen duplikat.");
        } else {
            System.out.println();
        }

        averil.close();
    }
}