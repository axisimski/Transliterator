package axisimski.bigramtagger;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class SettingsActivity extends AppCompatActivity {

    static RadioButton Bul;
    static RadioButton Rus;
    static RadioGroup RG;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        Bul=findViewById(R.id.Bul);
        Rus=findViewById(R.id.Rus);
        RG=findViewById(R.id.RG);

        RG.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {

                if (i == R.id.Bul) {
                    Intent myIntent = new Intent(SettingsActivity.this, MainActivity.class);
                    myIntent.putExtra("lang", 1);
                    startActivity(myIntent);


                } else  if (i == R.id.Rus) {
                    Intent myIntent = new Intent(SettingsActivity.this, MainActivity.class);
                    myIntent.putExtra("lang", 2);
                    startActivity(myIntent);

                }

            }
        });


    }











}




















//Can work on this latter

      /*  SharedPreferences SharedPref=getSharedPreferences("userInput", Context.MODE_PRIVATE);
        Integer prefs=SharedPref.getInt("Rus", 1);*/