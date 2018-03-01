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
import android.widget.TextView;
import android.widget.Toast;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class MainActivity extends AppCompatActivity {


    EditText input;
    TextView output;
    Button insertCorpus;
    Button calculateProb;
    String MyCorpus="MyCorpus.txt";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText input=(EditText)findViewById(R.id.input);
        final TextView output=(TextView)findViewById(R.id.output);
        Button insertCorpus=(Button)findViewById(R.id.insertCorpus);
        Button calculateProb=(Button)findViewById(R.id.calculateProb);

        insertCorpus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String corpus=input.getText().toString();
                writeCorpus(MyCorpus, corpus);

            }
        });

        calculateProb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //  String opit=readCorpus(MyCorpus);
                  output.setText(readCorpus(MyCorpus));

            }
        });






    }//end onCreate





     public void writeCorpus(String filename, String content){

        try{
            FileOutputStream fos = openFileOutput(filename, Context.MODE_PRIVATE);
            fos.write(content.getBytes());
            fos.close();
            Toast.makeText(this, "Saved Corpus", Toast.LENGTH_SHORT).show();
        }catch (Exception e){
            Toast.makeText(this, "File not found", Toast.LENGTH_SHORT).show();
        }
    }//end write
//--------------------------------------------------------------------------------------------
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
     }//end read Corpus
















}
