/* Vytvorte jednoduchý program, ktorého cieľom bude výpočet 5 základných matematických operácií a to sčítanie (+), odčítanie (-), násobenie (*) a delenie (/), modulo (%).
Matematické operácie budú “narábať” s dvoma hodnotami, ktoré budú zadané v premenných, napr. cislo1  a cislo2.


Pozn.: Nezabúdať na to, že sa môže jednať o desatinné čísla.
Program nám zároveň vypíše takýto text:
Výsledkom sčítania hodnôt 2 a 3 je 5.
Výsledkom odčítania hodnôt 2 a 3 je -1.
atď.


Bonusová úloha: Vedeli by ste v prípade desatinných miest nahradiť desatinnú bodku za čiarku?
Pomôcka:
// Ako naformatovat cislo v SK formate na 2 desatinne miesta, pouzijeme %.2f
System.out.printf("Desatinné číslo naformátované ako desatinná čiarka %.2f", desatinneCislo);
*/




public class NoveZadanie {
    public static void main(String[] args) {
    double cisloJedna = 2.3;
    double cisloDva = 1;
    double scitanie = cisloJedna + cisloDva;
    double odcitanie = cisloJedna - cisloDva;
    double delenie = cisloJedna / cisloDva;
    double nasobenie = cisloJedna * cisloDva;
    double modulo = cisloJedna % cisloDva;

    String cisloJednaSDesatinnouCIarkou = String.format("%.2f" , cisloJedna);
    String ScitanieSDesatinnouCiarkou = String.format("%.2f", scitanie);
    String OdcitanieSDesatinnouCiarkou = String.format("%.2f", odcitanie);
    String DeleniesDesatinnouciarkou = String.format ("%.2f" , delenie);
    String NasobenieSDesatinnouCiarkou = String.format ("%.2f" , nasobenie);
    String ModuloSDesatinnouCiarkou = String.format ("%.2f" , modulo);



        System.out.println("Výsledkom sčítania hodnôt "+ cisloJednaSDesatinnouCIarkou+" a "+ cisloDva+" je: "+ScitanieSDesatinnouCiarkou );
        System.out.println("Výsledok odčítania hodnôt "+ cisloJednaSDesatinnouCIarkou+" a "+ cisloDva+" je: " + OdcitanieSDesatinnouCiarkou);
        System.out.println("Výsledkom delenia hodnôt "+ cisloJednaSDesatinnouCIarkou+" a "+ cisloDva+" je: " + DeleniesDesatinnouciarkou);
        System.out.println("Výsledkom násobenia hodnôt "+ cisloJednaSDesatinnouCIarkou+" a "+cisloDva+" je: " + NasobenieSDesatinnouCiarkou);
        System.out.println("Výsledkom modula hodnôt "+ cisloJednaSDesatinnouCIarkou+" a "+cisloDva+" je: " + ModuloSDesatinnouCiarkou);
    }
}
