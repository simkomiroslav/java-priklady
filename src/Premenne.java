public class Premenne {
    public static void main(String[] args) {
        String meno = "Miroslav";
        int celeCislo = 123;
        float desatinneCislo = 234.56f;
        double desatinneCisloAkoDouble = 1.23;
        char znak = 'A';
        boolean jeDnesStreda = true;
        int celeCislo2;
        celeCislo2 = 456;
        int celeCislo3 = 789;
        celeCislo3 = 0;

        double cenaBezDPH = 1000.0;
        double cenaSDPH = 0.0;
        cenaSDPH = cenaBezDPH * 1.20;


        System.out.println("Meno: " + meno);
        System.out.println(celeCislo);
        System.out.println(desatinneCislo);
        System.out.println(desatinneCisloAkoDouble);
        System.out.println(znak);
        System.out.println(jeDnesStreda);
        System.out.println(celeCislo2);
        System.out.println(celeCislo3);
        System.out.println("cenaSDPH: " + cenaSDPH);
        System.out.println("Cena bez DPH: " + cenaBezDPH);
    }
}
