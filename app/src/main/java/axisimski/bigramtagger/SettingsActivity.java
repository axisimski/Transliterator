package axisimski.bigramtagger;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class SettingsActivity extends AppCompatActivity {

    static RadioButton Bul;
    static RadioButton Rus;
    static RadioGroup RG;
    static Button Save;
    static int langNum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        Bul=findViewById(R.id.Bul);
        Rus=findViewById(R.id.Rus);
        RG=findViewById(R.id.RG);
        Save=findViewById(R.id.save);

        SharedPreferences SharedPref=getSharedPreferences("userInput", Context.MODE_PRIVATE);



        Save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                saveSettings();
            }
        });

        RG.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {



                if (i == R.id.Bul) {

                    langNum=1;


                } else  if (i == R.id.Rus) {

                    langNum=2;

                }

            }
        }); //end of OnCheckedListener for the radio group


    }

    public void saveSettings(){




        Intent myIntent = new Intent(SettingsActivity.this, MainActivity.class);
        myIntent.putExtra("lang", langNum);
        startActivity(myIntent);




    }










}




















//Can work on this latter

      /*  SharedPreferences SharedPref=getSharedPreferences("userInput", Context.MODE_PRIVATE);
        Integer prefs=SharedPref.getInt("Rus", 1);*/