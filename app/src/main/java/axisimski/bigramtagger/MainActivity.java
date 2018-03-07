package axisimski.bigramtagger;

import android.Manifest;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Environment;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.MultiAutoCompleteTextView;
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


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text_edt=(EditText)findViewById(R.id.text_edt);
        Button toCyrillic=(Button)findViewById(R.id.toCyrillic);
        Button toLatin=(Button)findViewById(R.id.toLatin);

        toCyrillic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                CyrillicToLatin();
            }
        });



    }//end onCreate


    public void CyrillicToLatin(){

        String cyr=text_edt.getText().toString();

        toLatin convToLat=new toLatin();

        String lat=convToLat.convert(cyr);








        text_edt.setText(lat);



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