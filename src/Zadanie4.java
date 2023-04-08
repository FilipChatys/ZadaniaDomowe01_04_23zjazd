public class Zadanie4 {

    public static int blackjack(int a, int b){

        int wynik = 0;

        if(a > b){
            wynik = a;
        } else if (a<b) {

            wynik = b;

        } else if (a == b) {

            wynik = 0;

        }
        return wynik;
    }

    public static void main(String[] args) {

        System.out.println(blackjack(19,19));
        System.out.println(blackjack(19,15));
        System.out.println(blackjack(21,12));

    }

}
