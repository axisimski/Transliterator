package axisimski.bigramtagger;

import android.Manifest;
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
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class MainActivity extends AppCompatActivity {


    EditText input;
    TextView output;
    Button insertCorpus;
    Button calculateProb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M && checkSelfPermission(Manifest.permission.WRITE_EXTERNAL_STORAGE)
                !=PackageManager.PERMISSION_GRANTED) {
            requestPermissions(new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE},1000);
        }

        final EditText input=(EditText)findViewById(R.id.input);
        TextView output=(TextView)findViewById(R.id.output);
        Button insertCorpus=(Button)findViewById(R.id.insertCorpus);
        Button calculateProb=(Button)findViewById(R.id.calculateProb);

        insertCorpus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String corpus=input.getText().toString();
                saveCorpus("MyCorpus", corpus);

            }
        });

    }


    private void saveCorpus(String filename, String content){

        String fileName = filename+".txt";

        File file = new File(Environment.getExternalStorageDirectory().getAbsolutePath()
        , filename);

        try{
            FileOutputStream fos = new FileOutputStream(file);
            fos.write(content.getBytes());
            fos.close();
            Toast.makeText(this, "Saved Corpus", Toast.LENGTH_SHORT).show();
        }catch (FileNotFoundException e){
            Toast.makeText(this, "File not found", Toast.LENGTH_SHORT).show();

        }catch (IOException e){
            Toast.makeText(this, "Error~!", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public void onRequestPermissionResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults){

        switch (requestCode){
            case 1000:

                if(grantResults[0]==PackageManager.PERMISSION_GRANTED){
                    Toast.makeText(this, "Granted",Toast.LENGTH_SHORT).show();
                }

                else
                    Toast.makeText(this,"Permission not granted", Toast.LENGTH_SHORT).show();
                finish();
        }

    }















}
