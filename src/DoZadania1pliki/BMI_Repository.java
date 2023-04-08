package DoZadania1pliki;

import java.util.HashMap;
import java.util.Map;

public class BMI_Repository {
    private static Map<String, Double> bmis = new HashMap<>();

    public static void addBmi(String id, double bmi) {
        bmis.put(id, bmi);
    }

    public static Double getBmi(String id) {
        return bmis.get(id);
    }
}

