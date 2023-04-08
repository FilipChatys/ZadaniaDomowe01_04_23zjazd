import java.util.Random;

// Napisz program generujący 3 tablice 10 elementowe (liczby -20 do 20). Program ma sprawdzić czy w każdej z tablic
// znajdują się 3 takie same elementy, jeśli nie to generuje tablice ponownie. Program ma wypisywać
// wygenerowane tablice oraz ilość ponownych generacji tablic.

public class Zadanie11 {
    static Random random = new Random();

    public static int[] nowyGeneratorTablic(int[] a) {
        for (int i = 0; i < a.length; i++) {
            a[i] = random.nextInt(-20, 20);
        }
        return a;
    }

    public static boolean sprawdzaniePotrojnychDuplikatow(int[] arrayToTest) {

        for (int j = 0; j < arrayToTest.length; j++) {
            for (int k = j + 1; k < arrayToTest.length; k++) {
                for (int i = k + 1; i < arrayToTest.length; i++) {
                    if ((k != j) && (i != j) && (arrayToTest[k] == arrayToTest[j] && arrayToTest[i] == arrayToTest[j])) {

                        return false;

                    }
                }
            }
        }
        return true;
    }

        public static void main (String[]args){

            int[] tablica1 = nowyGeneratorTablic(new int[10]);

            int licznik = 0;

            for (int element : tablica1) {
                System.out.print(element + " ");
            }
            System.out.println("\n");
            do {
                tablica1 = nowyGeneratorTablic(new int[10]);

                licznik += 1;

            } while (sprawdzaniePotrojnychDuplikatow(tablica1)) ;


            for (int element : tablica1) {
                System.out.print(element + " ");
            }

            System.out.println("\n");

            System.out.println(licznik);

        }


}
