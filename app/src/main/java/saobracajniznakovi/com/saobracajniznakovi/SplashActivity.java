package saobracajniznakovi.com.saobracajniznakovi;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

//        Runnable runnable3sec = new Runnable() {
//            @Override
//            public void run() {
//                nextActivity();
//                finish();
//            }
//        };
//
//        Handler myHandler = new Handler();
//        myHandler.postDelayed(runnable3sec, 3000);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                nextActivity();
                finish();
            }
        }, 3000);


    }

    private void nextActivity() {

        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);

    }
}
