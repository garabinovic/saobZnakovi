package saobracajniznakovi.com.saobracajniznakovi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.ScaleGestureDetector;
import android.webkit.WebView;
import android.widget.TextView;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class ZakonActivity extends AppCompatActivity {

    WebView webView;
    TextView text;
    ScaleGestureDetector scaleGestureDetector;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zakon);

        text = (TextView)findViewById(R.id.zobsTextView);
        text.setText(readTxt());
        scaleGestureDetector = new ScaleGestureDetector(this, new simpleOnScaleGestureListener());

//        webView = (WebView) findViewById(R.id.webViewPravilnik);
//        webView.loadUrl("http://www.cekos.rs/saobra%C4%87ajni-znaci-u-republici-srbiji");
    }

    private String readTxt() {

        InputStream inputStream = getResources().openRawResource(R.raw.zobs);

        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();

        int i;
        try {
            i = inputStream.read();
            while (i != -1) {
                byteArrayOutputStream.write(i);
                i = inputStream.read();
            }
            inputStream.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return byteArrayOutputStream.toString();
    }

    public class simpleOnScaleGestureListener extends
            ScaleGestureDetector.SimpleOnScaleGestureListener {

        @Override
        public boolean onScale(ScaleGestureDetector detector) {
            // TODO Auto-generated method stub
            float size = text.getTextSize();

            float factor = detector.getScaleFactor();


            float product = size*factor;
            text.setTextSize(TypedValue.COMPLEX_UNIT_PX, product);

            size = text.getTextSize();

            return true;
        }
    }
}



