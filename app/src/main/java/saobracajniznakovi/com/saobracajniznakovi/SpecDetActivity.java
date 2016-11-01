package saobracajniznakovi.com.saobracajniznakovi;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import model.Znak;

public class SpecDetActivity extends AppCompatActivity {

    private List<Znak> specLista;
    private TextView sdShifra;
    private ImageView sdVinjeta;
    private EditText sdKolicina, sdOpis;
    private Znak sdZnak;
    private RadioGroup sdDim, sdKlasa;
    private RadioButton radioButtonDim, radioButtonKlasa;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spec_det);

        sdZnak = new Znak();
        Intent intent = getIntent();
        if (intent != null) {
            sdZnak.setShifra(intent.getStringExtra("iShifra"));
            sdZnak.setNaziv(intent.getStringExtra("iNaziv"));
            sdZnak.setGrupa(intent.getStringExtra("iGrupa"));
            sdZnak.setOpis(intent.getStringExtra("iOpis"));
            sdZnak.setVinjeta(intent.getIntExtra("iVinjeta",R.drawable.jedan19));
        }

        sdShifra = (TextView) findViewById(R.id.specDetShifra);
        sdShifra.setText(sdZnak.getShifra());

        sdVinjeta = (ImageView) findViewById(R.id.SpecDetVinjeta);
        sdVinjeta.setImageResource(sdZnak.getVinjeta());

        sdKolicina = (EditText) findViewById(R.id.number);


        sdOpis = (EditText) findViewById(R.id.opisEditText);


        sdDim = (RadioGroup) findViewById(R.id.dimRBG);
        sdKlasa = (RadioGroup) findViewById(R.id.klasaRBG);


    }

    public void klikOdustani(View view) {
        Toast.makeText(SpecDetActivity.this, "Pridruživanje je otkazano!", Toast.LENGTH_SHORT).show();
        finish();
    }

    public void klikPridruzi(View view) {

//        sdZnak.setuKolicina(Integer.parseInt(sdKolicina.getText().toString()));

        if(sdKolicina.getText().toString().trim().length() == 0 || Integer.parseInt(sdKolicina.getText().toString()) ==0){
            Toast.makeText(SpecDetActivity.this, "Niste uneli količinu!", Toast.LENGTH_SHORT).show();;
        } else {

            sdZnak.setuKolicina(Integer.parseInt(sdKolicina.getText().toString()));

            sdZnak.setuOpis(sdOpis.getText().toString());

            int selecOptDim = sdDim.getCheckedRadioButtonId();
            radioButtonDim = (RadioButton) findViewById(selecOptDim);
            sdZnak.setuDimenzije(radioButtonDim.getText().toString());

            int selecOptKlasa = sdKlasa.getCheckedRadioButtonId();
            radioButtonKlasa = (RadioButton) findViewById(selecOptKlasa);
            sdZnak.setuKlasa(radioButtonKlasa.getText().toString());

            Toast.makeText(SpecDetActivity.this, "Pozicija je pridružen vašoj listi", Toast.LENGTH_SHORT).show();

            String pozicija =   "Znak: " + sdZnak.getShifra() + ",\n" +
                                "Naziv: " + sdZnak.getNaziv() + ",\n" +
                                "Klasa: " + sdZnak.getuKlasa() + ",\n" +
                                "Dimenzije: " + sdZnak.getuDimenzije() + ",\n" +
                                "Detaljniji opis pozicije: " + sdZnak.getuOpis() + ",\n" +
                                "KOLIČINA: " +sdZnak.getuKolicina() + " [kom].\n\n";


            SharedPreferences preferences = getSharedPreferences("myPref", Context.MODE_PRIVATE);
            SharedPreferences.Editor editor = preferences.edit();

            String prethodnaLista = preferences.getString("poz","");
            editor.putString("poz", pozicija + prethodnaLista);
            editor.commit();
            Log.d("GRB", preferences.getString("poz","nema"));


            Intent i = new Intent(SpecDetActivity.this, SpecListActivity.class);
//            i.putExtra("pozicija", pozicija);
            startActivity(i);
        }

    }
}
