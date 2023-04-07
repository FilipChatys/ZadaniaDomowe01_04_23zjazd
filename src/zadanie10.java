

// Napisz program generujący tablicę liczb 10 elementową (liczby -7 do 7). Program sprawdza czy tablica zawiera
// duplikaty, jeśli zawiera to generuje nową. Program ma wyświetlić wygenerowaną tablicę bez
// duplikatów oraz ilość powtórnych generacji tablicy.

import java.util.Random;

public class zadanie10 {

    static Random random = new Random();

    public static int[] GeneratorTablic(int[] a) {

        for (int i = 0; i < a.length; i++) {
            a[i] = random.nextInt(-7, 7);
        }
        return a;
    }

    public static void main(String[] args) {

        int[] tablica1 = GeneratorTablic(new int[10]);


        for (int element : tablica1) {
            System.out.print(element + " ");
        }

        System.out.println("\n");

        int licznik = 0;

        boolean warunek = true;

        for (int i = 0; i < tablica1.length - 1; i++) {
                   if (tablica1[i] == tablica1[i + 1]) {
                       licznik = licznik + 1;
                       warunek = true;
                   } else {
                       warunek = false;
                   }
        }

        do {
            tablica1 = GeneratorTablic(new int[10]);
        } while (warunek == true);

        for (int element : tablica1) {
            System.out.print(element + " ");
        }

        System.out.println("\n");

        System.out.println(licznik);


    }
}
