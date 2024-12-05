import java.util.Scanner;

public class soal3nomor3 {
    public static void main(String[] args) {
        Scanner averil = new Scanner(System.in);

        System.out.print("Masukkan jumlah Array: ");
        int n = averil.nextInt();
        int[] array = new int[n];
        boolean[] everil = new boolean[n];
        System.out.println("Masukkan elemen Array:");
        for (int i = 0; i < n; i++) {
            array[i] = averil.nextInt();
        }

        System.out.println("Frekuensi elemen dalam array:");
        for (int i = 0; i < n; i++) {
            if (!everil[i]) {
                int count = 1;
                for (int j = i + 1; j < n; j++) {
                    if (array[i] == array[j]) {
                        count++;
                        everil[j] = true;
                    }
                }
                System.out.println(array[i] + " muncul " + count + " kali");
            }
        }

        averil.close();
    }
}

