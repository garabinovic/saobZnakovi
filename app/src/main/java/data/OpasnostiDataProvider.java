package data;

import java.util.ArrayList;
import java.util.List;

import saobracajniznakovi.com.saobracajniznakovi.R;
import model.Znak;

/**
 * Created by Korisnik on 9.9.2016..
 */
public class OpasnostiDataProvider {

    public static final String OPASNOSTI = "Znak opasnosti";

    private static List<Znak> data = new ArrayList<>();

    public static List<Znak> getData() {
        return data;
    }

    static {

        data.add(new Znak(
                "I-1", // shirfa Znaka
                "Krivina nalevo", // naziv Znaka
                OPASNOSTI, // grupa Znaka
                "Ozačava približavanje opasnoj krivini na levo.", // opis Znaka
                R.drawable.jedan1 // vinjeta Znaka
        ));

        data.add(new Znak(
                "I-1.1", // shirfa Znaka
                "Krivina nadesno", // naziv Znaka
                OPASNOSTI, // grupa Znaka
                "Ozačava približavanje opasnojh krivini na desno.", // opis Znaka
                R.drawable.jedan1t1 // vinjeta Znaka
        ));

        data.add(new Znak(
                "I-2", // shirfa Znaka
                "Dvostruka krivina ili više uzastopnih krivina od kojih je prva nalevo", // naziv Znaka
                OPASNOSTI, // grupa Znaka
                "Ozačava približavanje delu puta sa više uzastopnih krivina zbog fizičkih karakteristika ili nedovoljne preglednosti, " +
                "od kojih je prva na levo.", // opis Znaka
                R.drawable.jedan2 // vinjeta Znaka
        ));

        data.add(new Znak(
                "I-2.1", // shirfa Znaka
                "Dvostruka krivina ili više uzastopnih krivina od kojih je prva nalevo", // naziv Znaka
                OPASNOSTI, // grupa Znaka
                "Ozačava približavanje delu puta sa više uzastopnih krivina zbog fizičkih karakteristika ili nedovoljne preglednosti, " +
                "od kojih je prva na desno.", // opis Znaka
                R.drawable.jedan2t1 // vinjeta Znaka
        ));

        data.add(new Znak(
                "I-2.2", // shirfa Znaka
                "Opasna krivina", // naziv Znaka
                OPASNOSTI, // grupa Znaka
                "Ozačava više uzastopnih krivina koje su opasne zbog svojih fizičkih karakteristika ili zbog nedovoljne preglednosti.", // opis Znaka
                R.drawable.jedan2t2 // vinjeta Znaka
        ));

        data.add(new Znak(
                "I-3", // shirfa Znaka
                "Opasan uspon", // naziv Znaka
                OPASNOSTI, // grupa Znaka
                "Ozačava približavanje opasnom usponu zbog veličine nagiba i dužine dela puta pod nagibom.", // opis Znaka
                R.drawable.jedan3 // vinjeta Znaka
        ));

        data.add(new Znak(
                "I-4", // shirfa Znaka
                "Opasana nizbrdica", // naziv Znaka
                OPASNOSTI, // grupa Znaka
                "Ozačava približavanje opasnoj nizbrdici zbog veličine nagiba i dužine dela puta pod nagibom.", // opis Znaka
                R.drawable.jedan4 // vinjeta Znaka
        ));

        data.add(new Znak(
                "I-5", // shirfa Znaka
                "Suženje puta", // naziv Znaka
                OPASNOSTI, // grupa Znaka
                "Približavanje delu puta na kome suženje kolovoza može da predstavlja opasnost.", // opis Znaka
                R.drawable.jedan5 // vinjeta Znaka
        ));

        data.add(new Znak(
                "I-5.1", // shirfa Znaka
                "Suženje puta s desne strane", // naziv Znaka
                OPASNOSTI, // grupa Znaka
                "Približavanje delu puta na kome suženje kolovoza može da predstavlja opasnost.", // opis Znaka
                R.drawable.jedan5t1 // vinjeta Znaka
        ));

        data.add(new Znak(
                "I-5.1", // shirfa Znaka
                "Suženje puta s leve strane", // naziv Znaka
                OPASNOSTI, // grupa Znaka
                "Približavanje delu puta na kome suženje kolovoza može da predstavlja opasnost.", // opis Znaka
                R.drawable.jedan5t2 // vinjeta Znaka
        ));








    }
}
