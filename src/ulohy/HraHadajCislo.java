package ulohy;

/*
Vytvorte program, kde Java vygeneruje náhodné číslo od 1 do 10. Používateľ musí uhádnuť číslo. Ak uhádne menšie,
tak mu Java vypíše Neuhádol si, moje číslo je väčšie, analogicky Neuhádol si, moje číslo je menšie a pri úspešnom
uhádnutí BINGO! Uhádol si!
Bonusová úloha:
Ak si trúfate, doplňte algoritmus hádania dovtedy, kým neuhádne.
*/

import java.util.Random;
import java.util.Scanner;

public class HraHadajCislo {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in); // Inicializacia konzoly pre pouzivatelsky vstup
        Random r = new Random();

        int maxHodnota = 10;
        int minHodnota = 1;
        int nahodneCisloGenerovaneJavou = r.nextInt(maxHodnota - minHodnota + 1) + minHodnota;

        System.out.println("CHEAT: Vygeneroval som takéto náhodné číslo " + nahodneCisloGenerovaneJavou);

        int zadaneCisloPouzivatelom = 0; // Priamo v konzole pozaduje zadanie cisla

       // ZACIATOK OPAKOVANIA
        while (nahodneCisloGenerovaneJavou != zadaneCisloPouzivatelom) { // Kod na opakovanie
            System.out.println("Zadaj číslo od 1 do 10");
            zadaneCisloPouzivatelom = scn.nextInt(); // Priamo v konzole pozaduje zadanie cisla
            if (nahodneCisloGenerovaneJavou == zadaneCisloPouzivatelom) {
                System.out.println("Áno, uhadol si");
            } else if (nahodneCisloGenerovaneJavou > zadaneCisloPouzivatelom) {
                System.out.println("Nie, neuhádol si, moje vygenerované číslo bolo väčšie!");
            } else {
                System.out.println("Nie, neuhádol so, moje vygenerované číslo bolo menšie!");
            }
        }
        // KONIEC OPAKOVANIA

    }
}
