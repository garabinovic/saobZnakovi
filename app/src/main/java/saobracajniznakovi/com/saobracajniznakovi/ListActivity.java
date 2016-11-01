package saobracajniznakovi.com.saobracajniznakovi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

import data.NaredbeDataProvider;
import data.Obavestanja1DataProvider;
import data.OpasnostiDataProvider;
import model.Znak;

public class ListActivity extends AppCompatActivity {

    private List<Znak> znakLista;
    private int proveraDugmeta = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        Intent j = getIntent();
        if (j!=null) {
            proveraDugmeta = j.getIntExtra("dugme",proveraDugmeta);
        }

        popunjavanjeZnakListe(proveraDugmeta);
        popunjavanjeListView();
        podesavanjeKlika();

    }

    private void popunjavanjeZnakListe(int i) {
        if(i==1){
            znakLista = OpasnostiDataProvider.getData();
        } else if(i==2) {
            znakLista = NaredbeDataProvider.getData();
        } else if (i==3) {
            znakLista = Obavestanja1DataProvider.getData();
        }
    }

    private void popunjavanjeListView() {
        ArrayAdapter<Znak> adapter = new MojListAdapter();
        ListView list = (ListView) findViewById(R.id.listView);
        list.setAdapter(adapter);

    }

    private class MojListAdapter extends ArrayAdapter<Znak> {
        public MojListAdapter() {
            super(ListActivity.this, R.layout.my_list_item, znakLista);
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            View itemView = convertView;
            if (itemView == null) {
                itemView = getLayoutInflater().inflate(R.layout.my_list_item, parent, false);
            }

            Znak trenutniZnak = znakLista.get(position);

            ImageView imageView = (ImageView) itemView.findViewById(R.id.imgTemp);
            imageView.setImageResource(trenutniZnak.getVinjeta());

            TextView textView = (TextView) itemView.findViewById(R.id.sifraZnaka);
            textView.setText(trenutniZnak.getShifra());


            return itemView;
        }
    }

    private void podesavanjeKlika() {
        ListView list = (ListView) findViewById(R.id.listView);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                Znak kliknutiZnak = znakLista.get(i);

                Intent intent = new Intent(ListActivity.this,DetailActivity.class);
                intent.putExtra("iGrupa", kliknutiZnak.getGrupa());
                intent.putExtra("iNaziv", kliknutiZnak.getNaziv());
                intent.putExtra("iOpis", kliknutiZnak.getOpis());
                intent.putExtra("iVinjeta", kliknutiZnak.getVinjeta());
                intent.putExtra("iShifra", kliknutiZnak.getShifra());
                startActivity(intent);

                String message = "Kliknuli ste na znak " + kliknutiZnak.getShifra();
                Toast.makeText(ListActivity.this, message, Toast.LENGTH_SHORT).show();
            }
        });

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
