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
import android.widget.Toast;

public class SettingsActivity extends AppCompatActivity {

    private RadioButton Bul;
    private RadioButton Rus;
    private RadioButton Mon;
    private RadioButton Srb;
    private RadioGroup RG;
    private Button Save;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        Bul=findViewById(R.id.Bul);
        Rus=findViewById(R.id.Rus);
        Mon=findViewById(R.id.Mon);
        Srb=findViewById(R.id.Srb);
        RG=findViewById(R.id.RG);
        Save=findViewById(R.id.save);

        loadSettings();

        Save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                saveSettings();
                loadSettings();
            }
        });
    }


    public void loadSettings()  {
        SharedPreferences sharedPreferences= this.getSharedPreferences("Setting", Context.MODE_PRIVATE);

        if(sharedPreferences!= null) {
            int checkedRadioButtonId = sharedPreferences.getInt("checkedRadioButtonId", 0);

            RG.check(checkedRadioButtonId);

            SharedPreferences.Editor editor = sharedPreferences.edit();

            if(Bul.isChecked()){
                editor.putInt("RUSBUL", 10);
            }

            else if(Rus.isChecked()){
                editor.putInt("RUSBUL", 5);
            }

            else if(Mon.isChecked()){
                editor.putInt("RUSBUL", 15);
            }

            else if(Srb.isChecked()){
                editor.putInt("RUSBUL", 20);
            }

            editor.apply();

        } else {
            RG.check(R.id.Rus);
            Toast.makeText(this,"Use the default setting",Toast.LENGTH_LONG).show();
        }


    }


    public void saveSettings()  {

        SharedPreferences sharedPreferences= this.getSharedPreferences("Setting", Context.MODE_PRIVATE);

        SharedPreferences.Editor editor = sharedPreferences.edit();

        int checkedRadioButtonId = RG.getCheckedRadioButtonId();

        editor.putInt("checkedRadioButtonId", checkedRadioButtonId);

        editor.apply();

        Toast.makeText(this,"Setting saved!",Toast.LENGTH_LONG).show();

        loadSettings();

    }





}





























//Can work on this latter

      /*  SharedPreferences SharedPref=getSharedPreferences("userInput", Context.MODE_PRIVATE);
        Integer prefs=SharedPref.getInt("Rus", 1);*/