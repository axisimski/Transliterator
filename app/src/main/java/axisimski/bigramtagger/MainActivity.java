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


    EditText corpusInput;
    EditText ngramInput;
    TextView output;
    Button insertCorpus;
    Button calculateProb;
    String MyCorpus="MyCorpus.txt";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        corpusInput=(EditText)findViewById(R.id.corpusInput);
        final EditText ngramInput=(EditText)findViewById(R.id.ngramInput);
        final TextView output=(TextView)findViewById(R.id.output);
        Button insertCorpus=(Button)findViewById(R.id.insertCorpus);
        Button calculateProb=(Button)findViewById(R.id.calculateProb);

        insertCorpus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String corpus=corpusInput.getText().toString();
                writeCorpus(MyCorpus, corpus);

            }
        });

        calculateProb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String corpus=readCorpus(MyCorpus);
                String unigram=ngramInput.getText().toString();

                String n=unigramProbability(corpus, unigram);
                output.setText(n);
            }
        });

    }//end onCreate



//Read/Write block
//=======================================================================================//
     public void writeCorpus(String filename, String content){

        try{
            FileOutputStream fos = openFileOutput(filename, Context.MODE_PRIVATE);
            fos.write(content.getBytes());
            fos.close();
            Toast.makeText(this, "Saved Corpus", Toast.LENGTH_SHORT).show();
        }catch (Exception e){
            Toast.makeText(this, "File not found", Toast.LENGTH_SHORT).show();
        }
    }//end write            //
//---------------------------------------------------------------------------------------//
     public String readCorpus(String file){

         String text="";

         try {
             FileInputStream fis =   this.openFileInput(file);
             int size=fis.available();
             byte[] buffer = new byte[size];
             fis.read(buffer);
             fis.close();
             text=new String(buffer);

         }catch (Exception e){
             e.printStackTrace();
             Toast.makeText(this, "Error reading file", Toast.LENGTH_SHORT).show();
         }

         return text;
     }//end read Corpus                         //
//=======================================================================================//
//End of Read/Write block



    public String unigramProbability(String corpus, String ngram){


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










}
