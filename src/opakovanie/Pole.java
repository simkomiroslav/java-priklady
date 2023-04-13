package opakovanie;

// Vytvorte program, ktory nacita z pola ciselne cele hodnoty a vypise, ci je dana hodnota parna alebo neparna

public class Pole {
    public static void main(String[] args) {
        int [] cisla = {1, 8, 10, 12, 90}; // hranat zatvorky urcuju, ze sa jedna o "staticke" pole

        // Prechadzate jednotlivymi polozkami (teda cislami) pola ...
        for (int i = 0; i < cisla.length; i++) {
            System.out.println(cisla[i]); // ... a vypiseme ich do konzoly
            // Todo nastavit logiku, ktora vypise ci je cislo parne alebo nie
            // RIESENIE: Ak je cislo delitelne 2-mi tak je parne a ak nie, tak je neparne.
            // Mozete pouzit IF, ELSE a modulo

            if (cisla[i] % 2 == 0) {
                System.out.println("je párne");
            } else {
                System.out.println("je nepárne");
            }
        }
    }
}
