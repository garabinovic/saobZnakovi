package data;

import java.util.ArrayList;
import java.util.List;

import model.Znak;
import saobracajniznakovi.com.saobracajniznakovi.R;

/**
 * Created by Korisnik on 11.9.2016..
 */
public class Obavestanja1DataProvider {

    public static final String OBAVESTENJA1 = "Opšti znak obaveštenja";

    private static List<Znak> data = new ArrayList<>();

    public static List<Znak> getData() {
        return data;
    }

    static {

        data.add(new Znak(
                "III-1", // shirfa Znaka
                "Prvenstvo prolaza u odnosu na vozila iz suprotnog smera", // naziv Znaka
                OBAVESTENJA1, // grupa Znaka
                "Obaveštava vozača da na uskom prolazu ima pravo prvenstva u odnosu na vozila koja dolaze iz suprotnog smera.", // opis Znaka
                R.drawable.tri1 // vinjeta Znaka
        ));

        data.add(new Znak(
                "III-2", // shirfa Znaka
                "Put sa jednosmernim saobražajem", // naziv Znaka
                OBAVESTENJA1, // grupa Znaka
                "Obaveštava učesnike u saobražaju o jednosmernom putu.", // opis Znaka
                R.drawable.tri2 // vinjeta Znaka
        ));

        data.add(new Znak(
                "III-2.1", // shirfa Znaka
                "Put sa jednosmernim saobražajem", // naziv Znaka
                OBAVESTENJA1, // grupa Znaka
                "Obaveštava učesnike u saobražaju o jednosmernom putu.", // opis Znaka
                R.drawable.tri2t1 // vinjeta Znaka
        ));

        data.add(new Znak(
                "III-3", // shirfa Znaka
                "Put sa prvenstvom prolaza", // naziv Znaka
                OBAVESTENJA1, // grupa Znaka
                "Označava put ili deo puta na kome vozila imaju prvenstvo prolaza u odnosu na vozila koja se kreću" +
                        "putevima koji se ukrštaju sa tim putem ili delom puta.", // opis Znaka
                R.drawable.tri3 // vinjeta Znaka
        ));

        data.add(new Znak(
                "III-3.1", // shirfa Znaka
                "Završetak puta sa prvenstvom prolaza", // naziv Znaka
                OBAVESTENJA1, // grupa Znaka
                "Označava mesto na kome se završava put ili deo puta sa prvenstvom prolaza.", // opis Znaka
                R.drawable.tri3t1 // vinjeta Znaka
        ));

        data.add(new Znak(
                "III-4", // shirfa Znaka
                "Prepreka za usporavanje saobraćaja", // naziv Znaka
                OBAVESTENJA1, // grupa Znaka
                "Označava nailazak na mesto na putu gde su postavljeni elementi za usporavanje saobraćaja.", // opis Znaka
                R.drawable.tri4 // vinjeta Znaka
        ));

        data.add(new Znak(
                "III-5", // shirfa Znaka
                "Prelazak biciklističke staze preko kolovoza", // naziv Znaka
                OBAVESTENJA1, // grupa Znaka
                "Označava mesto na kome se nalazi prelaz biciklističke staze preko kolovoza.", // opis Znaka
                R.drawable.tri5 // vinjeta Znaka
        ));

        data.add(new Znak(
                "III-6", // shirfa Znaka
                "Pešački prelaz", // naziv Znaka
                OBAVESTENJA1, // grupa Znaka
                "Označava mesto na kome se nalazi pešački prelaz.", // opis Znaka
                R.drawable.tri6 // vinjeta Znaka
        ));

        data.add(new Znak(
                "III-7", // shirfa Znaka
                "Pešački prelaz i prelaz biciklističke staze preko kolovoza", // naziv Znaka
                OBAVESTENJA1, // grupa Znaka
                "Označava mesto na kome se nalazi pešački prelaz i prelaz biciklističke staze preko kolovoza.", // opis Znaka
                R.drawable.tri7 // vinjeta Znaka
        ));

        data.add(new Znak(
                "III-8", // shirfa Znaka
                "Podzemni ili nadzemni pešački prolaz", // naziv Znaka
                OBAVESTENJA1, // grupa Znaka
                "Označava mesto na kome se nalazi podzemni ili nadzemni pešački prolaz.", // opis Znaka
                R.drawable.tri8 // vinjeta Znaka
        ));

        data.add(new Znak(
                "III-9", // shirfa Znaka
                "Slepi put", // naziv Znaka
                OBAVESTENJA1, // grupa Znaka
                "Označava blizinu i položaj puta koji nema izlaz (slepi put).", // opis Znaka
                R.drawable.tri9 // vinjeta Znaka
        ));


        data.add(new Znak(
                "III-10", // shirfa Znaka
                "Smer kretanja vozila koje želi da skrene ulevo na raskrsnici na kojoj je skretanje u levo zabranjeno", // naziv Znaka
                OBAVESTENJA1, // grupa Znaka
                "Označava put kojim se vozilo mora kretati ako namerava da skrene ulevo na sledećoj raskrsnici " +
                        "na kojoj je skretanje ulevo zabranjeno.", // opis Znaka
                R.drawable.tri10 // vinjeta Znaka
        ));

        data.add(new Znak(
                "III-11", // shirfa Znaka
                "Blizina škole", // naziv Znaka
                OBAVESTENJA1, // grupa Znaka
                "Označava mesto u čijoj se blizini nalazi škola i pešački prelaz koji deca često prelaze.", // opis Znaka
                R.drawable.tri11 // vinjeta Znaka
        ));







    }

}
