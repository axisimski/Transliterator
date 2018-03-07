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
        String lat;

        lat=cyr.replaceAll("а","a");
        lat=lat.replaceAll("б","b");
        lat=lat.replaceAll("в","v");
        lat=lat.replaceAll("г","g");
        lat=lat.replaceAll("д","d");
        lat=lat.replaceAll("е","e");
        lat=lat.replaceAll("ё","e");
        lat=lat.replaceAll("ж","zh");
        lat=lat.replaceAll("з","z");
        lat=lat.replaceAll("и","i");
        lat=lat.replaceAll("й","i");
        lat=lat.replaceAll("к","k");
        lat=lat.replaceAll("л","l");
        lat=lat.replaceAll("м","m");
        lat=lat.replaceAll("н","n");
        lat=lat.replaceAll("о","o");
        lat=lat.replaceAll("п","p");
        lat=lat.replaceAll("р","r");
        lat=lat.replaceAll("с","s");
        lat=lat.replaceAll("т","t");
        lat=lat.replaceAll("у","u");
        lat=lat.replaceAll("ф","f");
        lat=lat.replaceAll("х","kh");
        lat=lat.replaceAll("ц","ts");
        lat=lat.replaceAll("ч","ch");
        lat=lat.replaceAll("ш","sh");
        lat=lat.replaceAll("щ","shch");
        lat=lat.replaceAll("ъ","ie");
        lat=lat.replaceAll("ы","y");
        lat=lat.replaceAll("ь","-");
        lat=lat.replaceAll("э","e");
        lat=lat.replaceAll("ю","iu");
        lat=lat.replaceAll("я","ia");







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