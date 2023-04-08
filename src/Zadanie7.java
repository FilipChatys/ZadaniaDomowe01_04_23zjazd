import java.util.Scanner;

//Program zawiera zmienną n. Napisz program, który sprawdzi jaką potęgą liczby 2 jest liczba n. Program powinien
//wyświetlać potęgę lub komunikat jeśli liczba n nie jest potęgą liczby 2
public class Zadanie7 {


        public static void main (String[]args){

            Scanner scanner = new Scanner(System.in);

            long n = scanner.nextLong();

            if ((n & -n) == n) {
                int powerOfTwo = (int) (Math.log(n) / Math.log(2));
                System.out.println(n + " jest potęgą 2 o wykładniku " + powerOfTwo);
            } else {
                System.out.println(n + " nie jest potęgą 2");
            }


        }
    }

