public class ZakladneMatematickeOperacie {

    public static double scitaj(double cis1, double cis2){
        return cis1 + cis2;
    }

    public static double odcitaj(double cis1, double cis2){
        return cis1 - cis2;
    }

    public static double delenie(double cis1, double cis2){
        return cis1 / cis2;
    }

    public static double nasobenie(double cis1, double cis2){
        return cis1 * cis2;
    }

    public static double modulo(double cis1, double cis2){
        return cis1 % cis2;
    }
    public static void main(String[] args) {
        double cislo1 = 5.0;
        double cislo2 = 2.5;

        System.out.printf("Výsledkom sčítania hodnôt %.1f a %.1f je: %.1f", cislo1 , cislo2 , scitaj(cislo1, cislo2));
        System.out.printf("\nVýsledkom odčítania hodnôt %.1f a %.1f je: %.1f" , cislo1 , cislo2 , odcitaj(cislo1, cislo2));
        System.out.printf("\nVýsledkom delenia hodnôt %.1f a %.1f je: %.1f" , cislo1 , cislo2 , delenie(cislo1, cislo2));
        System.out.printf("\nVýsledkom násobenia hodnôt %.1f a %.1f je: %.1f", cislo1 , cislo2 , nasobenie(cislo1, cislo2));
        System.out.printf("\nVýsledkom modula hodnôt %.1f a %.1f je: %.1f", cislo1 , cislo2 , modulo(cislo1, cislo2));
    }
}
