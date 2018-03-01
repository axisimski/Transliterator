package axisimski.bigramtagger;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    EditText input;
    TextView output;
    Button insertCorpus;
    Button calculateProb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        EditText input=(EditText)findViewById(R.id.input);
        TextView output=(TextView)findViewById(R.id.output);
        Button insertCorpus=(Button)findViewById(R.id.insertCorpus);
        Button calculateProb=(Button)findViewById(R.id.calculateProb);



    }















}
