package axisimski.bigramtagger;

import android.Manifest;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Environment;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.MultiAutoCompleteTextView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class MainActivity extends AppCompatActivity {


    EditText text_edt;
    Button toCyrillic;
    Button toLatin;
    Button Settings;
    Spinner cyrType;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text_edt=(EditText)findViewById(R.id.text_edt);
        toCyrillic=(Button)findViewById(R.id.toCyrillic);
        toLatin=(Button)findViewById(R.id.toLatin);
        Settings=(Button)findViewById(R.id.settings);


        Settings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent n=new Intent(MainActivity.this, SettingsActivity.class);
                startActivity(n);
            }
        });




        toCyrillic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                LatinToCyrillic();

             }
        });

        toLatin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CyrillicToLatin();
            }
        });



    }//end onCreate


    public void CyrillicToLatin(){

        Intent mIntent = getIntent();
        int langVal = mIntent.getIntExtra("lang", 0);

        String cyr=text_edt.getText().toString();
        toLatin convToLat=new toLatin();

        if(langVal==1){
          String lat=convToLat.convertBG(cyr);
          text_edt.setText(lat);
        }

        else if(langVal==2){
            String lat=convToLat.convertRU(cyr);
            text_edt.setText(lat);
        }

    }

    public void LatinToCyrillic(){

        String type=cyrType.getSelectedItem().toString();
        String lat=text_edt.getText().toString();
        toCyrillic convToCyr=new toCyrillic();

        String cyr=convToCyr.convertToCyrBG(lat);
        text_edt.setText(cyr);

    }







}


























//Unigram prob fn


/* public String unigramProbability(String corpus, String ngram){


        //---------------------------------------------------------------corpus size
        int numCharsCorpus=corpus.length();
        int corpusSize=0;
        StringTokenizer st = new StringTokenizer(corpus, " ");
        corpusSize= st.countTokens();
        String css=Integer.toString(corpusSize);
        //----------------------------------------------------------end corpus size

        String[] arr = corpus.split("\\W+");


        int counter=0;
        String opit="";

        for(int i=0;i<corpusSize;i++){

            opit=opit+"\n"+arr[i];
            if(arr[i].contains(ngram)){
                counter++;
            }
        }

        double unigramProbability=(double)counter/corpusSize;

        corpus="Corpus size: "+css+"\n"+"Ngram: "+ngram+"\nUnigram probability: "
                +Double.toString(unigramProbability)+"\nCorpus: "+corpus+"\n";

        return corpus;


    }
*/