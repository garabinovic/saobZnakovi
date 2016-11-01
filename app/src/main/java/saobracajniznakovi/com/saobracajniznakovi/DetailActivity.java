package saobracajniznakovi.com.saobracajniznakovi;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    private TextView tvGrupa, tvNaziv, tvShifra, tvOpis;
    private ImageView ivVinjeta;
    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);



        Intent intent = getIntent();
        String grupa = intent.getStringExtra("iGrupa");
        String shifra = intent.getStringExtra("iShifra");
        String naziv = intent.getStringExtra("iNaziv");
        String opis = intent.getStringExtra("iOpis");
        int vinjeta = intent.getIntExtra("iVinjeta",0);

        // WebView omogucava justfy poravnanje texta

        webView = (WebView) findViewById(R.id.webview);
        String text = "<html><body>"
                    + "<p align=\"justify\">"
                    + opis
                    + "</p> "
                    + "</body></html>";


        webView.loadData(text, "text/html; charset=utf-8", "utf-8");


        tvGrupa = (TextView) findViewById(R.id.detGrupa);
        tvGrupa.setText(grupa);

        tvNaziv = (TextView) findViewById(R.id.specDetNaziv);
        tvNaziv.setText(naziv);

//        tvOpis = (TextView) findViewById(R.id.detOpis);
//        tvOpis.setText(opis);

        tvShifra = (TextView) findViewById(R.id.specDetShifra);
        tvShifra.setText(shifra);

        ivVinjeta = (ImageView) findViewById(R.id.SpecDetVinjeta);
        ivVinjeta.setImageResource(vinjeta);

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if (item.getItemId() == android.R.id.home) {
            finish();
        }

        return super.onOptionsItemSelected(item);
    }
}
