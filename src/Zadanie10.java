

// Napisz program generujący tablicę liczb 10 elementową (liczby -7 do 7). Program sprawdza czy tablica zawiera
// duplikaty, jeśli zawiera to generuje nową. Program ma wyświetlić wygenerowaną tablicę bez
// duplikatów oraz ilość powtórnych generacji tablicy.

import java.util.Random;

public class Zadanie10 {

    static Random random = new Random();

    public static int[] generatorTablic(int[] a) {
        for (int i = 0; i < a.length; i++) {
            a[i] = random.nextInt(-7, 7);
        }
        return a;
    }
    
    public static boolean sprawdzanieDuplikatow (int[] arrayToTest){
        for (int j = 0; j < arrayToTest.length; j++) {
            for (int k = j + 1; k < arrayToTest.length; k++) {
                if (k != j && arrayToTest[k] == arrayToTest[j]) {

                    return true;
                }
            }
        }

        return false;
    }  

    public static void main(String[] args) {

        int[] tablica1 = generatorTablic(new int[10]);

        for (int element : tablica1) {
            System.out.print(element + " ");
        }
        System.out.println("\n");

        int licznik = 0;


        do {
            tablica1 = generatorTablic(new int[10]);

            licznik += 1;

        } while (sprawdzanieDuplikatow(tablica1)) ;


            for (int element : tablica1) {
                System.out.print(element + " ");
            }

            System.out.println("\n");

            System.out.println(licznik);


        }
    }


