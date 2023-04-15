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

    public static boolean sprawdzaniePotrojnychDuplikatow(int[] arrayToTest, int[] arrayToTest2, int[] arrayToTest3) {

        for (int j = 0; j < arrayToTest.length; j++) {
            for (int k = j + 1; k < arrayToTest2.length; k++) {
                for (int i = k + 1; i < arrayToTest3.length; i++) {
                    if (arrayToTest[j] == arrayToTest2[k] && arrayToTest3[i] == arrayToTest2[k]) {

                        return false;

                    }
                }
            }
        }
        return true;
    }

        public static void main (String[]args){

            int[] tablica1 = nowyGeneratorTablic(new int[10]);
            int[] tablica2 = nowyGeneratorTablic(new int[10]);
            int[] tablica3 = nowyGeneratorTablic(new int[10]);


            int licznik = 0;

            for (int element : tablica1) {
                System.out.print(element + " ");
            }
            System.out.println("\n");

            for (int element : tablica2) {
                System.out.print(element + " ");
            }
            System.out.println("\n");

            for (int element : tablica3) {
                System.out.print(element + " ");
            }

            System.out.println("\n");
            do {
                tablica1 = nowyGeneratorTablic(new int[10]);
                tablica2 = nowyGeneratorTablic(new int[10]);
                tablica3 = nowyGeneratorTablic(new int[10]);

                licznik += 1;

            } while (sprawdzaniePotrojnychDuplikatow(tablica1, tablica2, tablica3)) ;

            System.out.println("Tablice bez duplikatów");

            for (int element : tablica1) {
                System.out.print(element + " ");
            }

            System.out.println("\n");

            for (int element : tablica2) {
                System.out.print(element + " ");
            }

            System.out.println("\n");

            for (int element : tablica3) {
                System.out.print(element + " ");
            }

            System.out.println("\n");

            System.out.println(licznik);

        }


}
