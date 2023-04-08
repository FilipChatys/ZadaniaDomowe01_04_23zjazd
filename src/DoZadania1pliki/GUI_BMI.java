package DoZadania1pliki;

import java.util.Random;
import java.util.Scanner;

public class GUI_BMI {

    Scanner scanner = new Scanner(System.in);

    //double BMI;

    public String showMenu() {

        System.out.println("1. Oblicz BMI");
        System.out.println("2. Przypomnij BMI");
        System.out.println("3. Exit program");

        return scanner.nextLine();
    }

    public double countingBMI(double wzrost, double waga) {

        double BMI = waga / (wzrost * wzrost);

        return BMI;
    }

    public String healthState(double bmi) {


        if (bmi < 18.5) {
            System.out.println("Stan: Niedowaga");
        }
        if (bmi >= 18.5 && bmi <= 24.9) {
            System.out.println("Stan: Waga prawidłowa");
        }
        if (bmi >= 25 && bmi <= 29.9) {
            System.out.println("Stan: Nadwaga");
        }
        if (bmi >= 30 && bmi <= 39.9) {
            System.out.println("Stan: Otyłość");
        }
        if (bmi >= 40) {
            System.out.println("Stan: Jakim cudem jeszcze chodzisz mordo ?");
        }
        return "";
    }

    //int ID;

    public int iD() {
        Random random = new Random();

        int ID = random.nextInt(100000000, 999999999);

        return ID;
    }

}


