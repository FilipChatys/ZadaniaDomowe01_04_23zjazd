
//Napisz program w którym jest tablica zawierająca liczby od 2 do 101 (włącznie). Program ma wypisać liczby pierwsze
// znajdujące się w tej tablicy. Należy wykorzystać sito Eratostenesa. Sito Eratostenesa znajdziecie na wikipedii.
public class Zadanie9 {
    public static void main(String[] args) {
        for (int i = 2; i <= 101; i++) {
                System.out.print(isPrime(i) + " ");
            }
        }


    public static String isPrime(int n) {
        if (n <= 1) {
            return "";
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return "";
            }
        }
        return String.valueOf(n);
    }
}
