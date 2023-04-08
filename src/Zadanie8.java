import java.util.Arrays;
import java.util.Random;

//Napisz program, który generuje 30 elementową tablicę (liczby 0 - 100). Program powinien wypisywać na ekranie
// wygenerowaną tablicę oraz drugą największą liczbę w tablicy.
public class Zadanie8 {
    public static void main(String[] args) {

        int [] tablica1 = new int[30];

        Random random = new Random();

        for(int i=0; i< tablica1.length;i++){
            tablica1[i]= random.nextInt(101);
        }

        for(int element : tablica1){
            System.out.print(element + " ");
        }

        int najwieksza = 0;

        System.out.println("\n");

        Arrays.sort(tablica1);

        //for(int element : tablica1){
        //    System.out.print(element + " ");
        //}

        System.out.println("\n");
        System.out.println(tablica1[28]);

    }
}
