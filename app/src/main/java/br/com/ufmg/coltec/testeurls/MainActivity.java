package br.com.ufmg.coltec.testeurls;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView url = findViewById(R.id.url_text_view);
        url.setText(BuildConfig.BASE_URL);
    }
}
