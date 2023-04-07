public class zadanie3 {
    public static int fixTeen(int n) {

        if(n >= 13 && n <= 19 && n != 15 && n !=16 ){

            return 0;

        }

        return n;
    }

    public static int noTeenSum(int a, int b, int c){
        int i = a + b + c;
        return i;
    }


    public static void main(String[] args) {

        int a = fixTeen(13);

        int b = fixTeen(10);

        int c = fixTeen(1);

        System.out.println(noTeenSum(a , b, c));

    }

}
