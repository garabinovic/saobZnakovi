package saobracajniznakovi.com.saobracajniznakovi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class KatalogActivity extends AppCompatActivity {

    int butChek = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_katalog);
    }

    public void katalogButton1(View view) {
        butChek = 1;
        Intent i  = new Intent(KatalogActivity.this, ListActivity.class);
        i.putExtra("dugme", butChek);
        startActivity(i);
    }

    public void katalogButton2(View view) {
        butChek = 2;
        Intent i  = new Intent(KatalogActivity.this, ListActivity.class);
        i.putExtra("dugme", butChek);
        startActivity(i);
    }

    public void katalogButton3(View view) {
        butChek = 3;
        Intent i  = new Intent(KatalogActivity.this, ListActivity.class);
        i.putExtra("dugme", butChek);
        startActivity(i);
    }
}
