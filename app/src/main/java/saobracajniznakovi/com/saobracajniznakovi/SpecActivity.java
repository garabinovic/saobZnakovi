package saobracajniznakovi.com.saobracajniznakovi;


import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import data.NaredbeDataProvider;
import data.Obavestanja1DataProvider;
import data.OpasnostiDataProvider;
import model.Znak;

public class SpecActivity extends AppCompatActivity {

    private GridView gridView;
    private List<Znak> specLista;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spec);

        popunjavanjeZnakListe();
        popunjavanjeGridView();
        podesavanjeKlika();

    }

    private void popunjavanjeZnakListe() {

        List<Znak> firstArrayList = new ArrayList<>();
        firstArrayList = OpasnostiDataProvider.getData();
        List<Znak> secondArrayList = new ArrayList<>();
        secondArrayList = NaredbeDataProvider.getData();
        List<Znak> thirdArrayList = new ArrayList<>();
        thirdArrayList = Obavestanja1DataProvider.getData();

        specLista = new ArrayList<>();
        specLista.addAll(firstArrayList);
        specLista.addAll(secondArrayList);
        specLista.addAll(thirdArrayList);
    }

    private void popunjavanjeGridView() {
        ArrayAdapter<Znak> adapter = new MojGridAdapter();
        GridView gridList = (GridView) findViewById(R.id.gridview);
        gridList.setAdapter(adapter);
    }

    public void pregledSpec(View view) {
        String provera;
        SharedPreferences preferences = getSharedPreferences("myPref",MODE_PRIVATE);
        provera = preferences.getString("poz", "");
        if(provera.equals("")){
            Toast.makeText(SpecActivity.this, "Vaša lista je trenutno prazna", Toast.LENGTH_SHORT).show();
        } else {
            Intent intent = new Intent(SpecActivity.this, SpecListActivity.class);
            startActivity(intent);
        }


    }

    private class MojGridAdapter extends ArrayAdapter<Znak> {
        public MojGridAdapter() {
            super(SpecActivity.this, R.layout.my_grid_image, specLista);
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            View itemView = convertView;
            if (itemView == null) {
                itemView = getLayoutInflater().inflate(R.layout.my_grid_image, parent, false);
            }

            Znak trenutniZnak = specLista.get(position);

            ImageView imageView = (ImageView) itemView.findViewById(R.id.imgMGI);
            imageView.setLayoutParams(new GridView.LayoutParams(150, 150));
            imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            imageView.setImageResource(trenutniZnak.getVinjeta());


            return itemView;
        }
    }

    private void podesavanjeKlika() {
        GridView gridList = (GridView) findViewById(R.id.gridview);
        gridList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                Znak kliknutiZnak = specLista.get(i);

                Intent intent = new Intent(SpecActivity.this,SpecDetActivity.class);
                intent.putExtra("iGrupa", kliknutiZnak.getGrupa());
                intent.putExtra("iNaziv", kliknutiZnak.getNaziv());
                intent.putExtra("iOpis", kliknutiZnak.getOpis());
                intent.putExtra("iVinjeta", kliknutiZnak.getVinjeta());
                intent.putExtra("iShifra", kliknutiZnak.getShifra());
                startActivity(intent);

                String message = "Odabrali ste znak " + kliknutiZnak.getShifra();
                Toast.makeText(SpecActivity.this, message, Toast.LENGTH_SHORT).show();
            }
        });

    }


}
