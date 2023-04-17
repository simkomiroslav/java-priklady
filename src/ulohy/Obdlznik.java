package ulohy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Obdlznik {

    public static double vypocitajObvod (double stranaA, double stranaB) {
        return 2 * (stranaA + stranaB);
    }
    public static void main(String[] args) {
        double a = 2; // Strana a
        double b = 3; // Strana b

        System.out.println("Obvod obdlžnika je: " + vypocitajObvod(a, b));
    }

    // Vlozime junit test
    // Otestujeme funkcnost metody vypocitajObvod
    @Test
    void otestujVypocitajObvod() {
        assertEquals(9.0, vypocitajObvod(2, 3));
    }
}
