import java.text.SimpleDateFormat;
import java.util.Date;


public class PremenneUlohy {
    public static void main(String[] args) {
        String datumNarodenia = "03.04.2000";
        float znamka = 1.5f;
        String aktualnyDatum = "18.06.2022";
        String znamkaSDesatinnouCIarkou = String.format("%.1f", znamka);
        String meno = "Jozef Mrkvička";
        String mesiac = "septembra";
        int rok = 2022;
        String pozicia = "Java programátor";



        System.out.println("Študent "+meno+ " sa narodil "+ datumNarodenia+" z maturitnej skúšky \nmá znamku" + "" +
                " "+znamkaSDesatinnouCIarkou+" a od "+mesiac+" "+rok+ " nastúpi do nového zamestnania \nako "+pozicia+".\nV Bratislave Dňa " +
                " "+aktualnyDatum);

        Date datum = new Date ();
        SimpleDateFormat formatDatumu = new SimpleDateFormat("dd.MM.yyyy");
        System.out.println(formatDatumu.format(datum));
    }
}
