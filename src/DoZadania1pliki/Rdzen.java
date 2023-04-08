package DoZadania1pliki;
import DoZadania1pliki.GUI_BMI;

import java.util.Scanner;

import static DoZadania1pliki.BMI_Repository.getBmi;

public class Rdzen {
    GUI_BMI gui = new GUI_BMI();

    Scanner scanner = new Scanner(System.in);

    boolean run = true;

    public void start() {
        do {

            switch (gui.showMenu()) {
                case "1":
                    System.out.println("Wprowadz wzrost w metrach i wage w kilogramach : ");

                    double wynik = gui.countingBMI(scanner.nextDouble(),scanner.nextDouble());

                    System.out.println("Twoje BMI wynosi: " + wynik);

                    gui.healthState(wynik);

                    int ajdi = gui.iD();

                    System.out.println("Oto twoje personalne BMI ID: " + " " + ajdi
                            + " " + "Dzięki niemu przypomnisz sobie swój wynik");


                    BMI_Repository.addBmi(String.valueOf(ajdi), wynik);

                break;

                case "2":
                    System.out.println("Podaj swoje ID: ");

                    //getBmi(scanner.next());

                    System.out.println(getBmi(scanner.next()));

                    System.out.println("Oto twój wynik urzytkowniku");

                    break;

                case "3":
                    System.out.println("Zamykanie kalkulatora");
                    run = false;
                    break;


                default:
                    System.out.println("Niewłaściwy input pindolku, wybierz opcję 1, 2 lub 3");
                    break;
            }
        } while (run);
    }
}
