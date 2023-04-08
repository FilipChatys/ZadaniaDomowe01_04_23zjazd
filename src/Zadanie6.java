import java.util.Random;

//Napisz program który generuje 10 elementową tablicę liczb (0 - 100) a następnie przesuwa tą tablicę o 3 elementy
// w prawo. Program ma wypisywać na ekranie pierwotną oraz przesuniętą tablicę
public class Zadanie6 {

    public static void main(String[] args) {

        long[] tablica1 = new long [10];

        Random random = new Random();

        for(int i=0; i < tablica1.length; i++){
            tablica1[i] = random.nextInt(101);
        }


        System.out.println("Tablica przed zamianą");
        for (long l : tablica1) {
            System.out.print(l + " ");
        }

        System.out.println("\n");

        System.out.println("Tablica po zamianie");
        int startIndex = 7;
        int endIndex = 6;

        long[] newArray = new long[startIndex + tablica1.length - endIndex - 1];
        int j = 0;

        for (int i = startIndex; i < tablica1.length; i++) {
            newArray[j] = tablica1[i];
            System.out.print(tablica1[i] + " ");
            j++;
        }

        for (int i = 0; i <= endIndex; i++) {
            newArray[j] = tablica1[i];
            System.out.print(tablica1[i] + " ");
            j++;
        }
    }

}
