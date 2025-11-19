package devpedro.marotona_java;

public class ExPares {
    public static void main(String[] args) {
        // Imprima todos os números pares de 0 até 1000000

        for (int i = 1; i <= 1000000; i += 2) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}