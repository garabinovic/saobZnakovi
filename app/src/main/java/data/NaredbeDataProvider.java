package data;

import java.util.ArrayList;
import java.util.List;

import model.Znak;
import saobracajniznakovi.com.saobracajniznakovi.R;

/**
 * Created by Korisnik on 9.9.2016..
 */
public class NaredbeDataProvider {

    public static final String NAREDBE = "Znak izričitih naredbi";

    private static List<Znak> data = new ArrayList<>();

    public static List<Znak> getData() {
        return data;
    }

    static {

        data.add(new Znak(
                "II-1", // shirfa Znaka
                "Ustupanje prvenstva prolaza", // naziv Znaka
                NAREDBE, // grupa Znaka
                "koji na raskrsnici na kojoj je postavljen, označava naredbu vozaču da mora da ustupi prvenstvo prolaza vozilima koja se kreću putem na koji on nailazi.", // opis Znaka
                R.drawable.dva1 // vinjeta Znaka
        ));

        data.add(new Znak(
                "II-2", // shirfa Znaka
                "Obavezno zaustavljanje", // naziv Znaka
                NAREDBE, // grupa Znaka
                "koji na raskrsnici na kojoj je postavljen, označava naredbu vozaču da mora da zaustavi vozilo i ustupi prvenstvo prolaza vozilima koja se kreću putem na koji on nailazi.", // opis Znaka
                R.drawable.dva2 // vinjeta Znaka
        ));

        data.add(new Znak(
                "II-3", // shirfa Znaka
                "Zabrana saobraćaja u oba smera", // naziv Znaka
                NAREDBE, // grupa Znaka
                "Označava put odnosno deo puta na kome je zabrajen saobraćaj svim vozilima u oba smera.", // opis Znaka
                R.drawable.dva3 // vinjeta Znaka
        ));

        data.add(new Znak(
                "II-4", // shirfa Znaka
                "Zabrana saobražaja u jednom smeru", // naziv Znaka
                NAREDBE, // grupa Znaka
                "Označava put odnosno deo puta na kome je zabranjen saobraćaj vozilima iz smera prema kome je okrenut znak.", // opis Znaka
                R.drawable.dva4 // vinjeta Znaka
        ));

        data.add(new Znak(
                "II-5", // shirfa Znaka
                "Zabrana saobraćaja za motorna vozila", // naziv Znaka
                NAREDBE, // grupa Znaka
                "Označava put odnosno deo puta na kome je zabranjen saobraćaj za sva motorna vozila, osim za motocikle bez prikolice i mopede.", // opis Znaka
                R.drawable.dva5 // vinjeta Znaka
        ));

        data.add(new Znak(
                "II-6", // shirfa Znaka
                "Zabrana saobraćaja za autobuse", // naziv Znaka
                NAREDBE, // grupa Znaka
                "Označava put odnosno deo puta na kome je zabranjen saobraćaj za autobuse.", // opis Znaka
                R.drawable.dva6 // vinjeta Znaka
        ));

        data.add(new Znak(
                "II-7", // shirfa Znaka
                "Zabrana saobraćaja za teretna vozila", // naziv Znaka
                NAREDBE, // grupa Znaka
                "Označava put odnosno deo puta na kome je zabranjen saobraćaj za teretna vozila." +
                "Ako se uz ovaj znak doda i dopunska tabla na kojoj je označena najveže dozvoljena masa vozila," +
                "zabrana važi samo za ona teretna vozila čija najveća dozvoljena masa prelazi označenu masu.", // opis Znaka
                R.drawable.dva7 // vinjeta Znaka
        ));

        data.add(new Znak(
                "II-8", // shirfa Znaka
                "Zabrana saobraćaja za vozila koja prevoze materije koje mogu da izazovu zagađivanje vode", // naziv Znaka
                NAREDBE, // grupa Znaka
                "Označava put odnosno deo puta na kome je zabranjen saobraćaj vozilima " +
                "koja prevoze određenu količinu materije koja može da izazove zagađivanje vode.", // opis Znaka
                R.drawable.dva8 // vinjeta Znaka
        ));

        data.add(new Znak(
                "II-9", // shirfa Znaka
                "Zabrana saobraćaja vozilima koja prevoze eksploziv ili lako zapaljive materije", // naziv Znaka
                NAREDBE, // grupa Znaka
                "Označava put ili deo puta na kome je zabrajen saobraćaj vozilima koja prevoze eksploziv" +
                "ili lako zapaljive materije.", // opis Znaka
                R.drawable.dva9 // vinjeta Znaka
        ));

        data.add(new Znak(
                "II-9.1", // shirfa Znaka
                "Zabrana saobraćaja vozilima koja prevoze opasne materije", // naziv Znaka
                NAREDBE, // grupa Znaka
                "Označava put ili deo puta na kome je zabrajen saobraćaj vozilima koja prevoze opasne meterije",  // opis Znaka
                R.drawable.dva9t1 // vinjeta Znaka
        ));





    }
}
