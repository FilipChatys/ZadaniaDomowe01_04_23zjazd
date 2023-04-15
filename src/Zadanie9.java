
//Napisz program w którym jest tablica zawierająca liczby od 2 do 101 (włącznie). Program ma wypisać liczby pierwsze
// znajdujące się w tej tablicy. Należy wykorzystać sito Eratostenesa. Sito Eratostenesa znajdziecie na wikipedii.
public class Zadanie9 {
    public static void main(String[] args) {
        System.out.println("Tablica przed operacją");
        for (int i = 2; i <= 101; i++) {
                System.out.print(i + " ");
            }
        System.out.println("\n");
        System.out.println("Tablica liczb pierwszych");
        for (int j = 2; j<=101; j++){
            System.out.print(isPrime(j) + " ");
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
