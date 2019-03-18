package id.sch.smktelkom_mlg.www.fraggment4;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private ImageButton buttonmaps;
    private TextView Java;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setDisplayHomeAsUpEnabled(false);

        Java = (TextView)findViewById(R.id.java_text);
        buttonmaps = (ImageButton)findViewById(R.id.buttonmaps);

        buttonmaps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri goLocation = Uri.parse("geo:0,0?q=-6.870563, 107.594126(SMK Telkom Malang)?z=23");
                showMap(goLocation);
            }

            private void showMap(Uri goLocation) {
                Intent mapIntent = new Intent(Intent.ACTION_VIEW);
                mapIntent.setData(goLocation);
                if (mapIntent.resolveActivity(getPackageManager()) != null)
                    startActivity(mapIntent);
            }
        });

        Java.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);

                intent.setData(Uri.parse("https://www.udacity.com/learn/java"));
                startActivity(intent);
            }
        });
    }
}

