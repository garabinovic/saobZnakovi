package saobracajniznakovi.com.saobracajniznakovi;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

public class SpecListActivity extends AppCompatActivity {

    private String listaPozicija;
    private TextView lista;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spec_list);

        SharedPreferences preferences = getSharedPreferences("myPref",MODE_PRIVATE);
        listaPozicija = preferences.getString("poz", "Lista je prazna...");

        lista = (TextView) findViewById(R.id.listaPozicija);
        lista.setText(listaPozicija);




    }


    public void proslediDugme(View view) {

        Intent i = new Intent(Intent.ACTION_SEND);
        i.setType("message/rfc822");
        i.putExtra(Intent.EXTRA_SUBJECT,"Specifikacija saobraćajnih znakova");
        i.putExtra(Intent.EXTRA_EMAIL, new String[] {"andrijag.model5@gmail.com"});
        i.putExtra(Intent.EXTRA_TEXT, listaPozicija);

        try{

            startActivity(Intent.createChooser(i, "Send mail..."));

        }catch (ActivityNotFoundException e) {
            Toast.makeText(getApplicationContext(), "Please instal email clients before sending", Toast.LENGTH_SHORT).show();
        }
    }

    public void dodajDugme(View view) {
        Intent i = new Intent(SpecListActivity.this, SpecActivity.class);
        startActivity(i);
    }

    public void obrisiDugme(View view) {

        SharedPreferences preferences = getSharedPreferences("myPref",MODE_PRIVATE);
        preferences.edit().clear().commit();
        recreate();

    }
}
