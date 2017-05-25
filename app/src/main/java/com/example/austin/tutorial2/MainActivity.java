package com.example.austin.tutorial2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import static com.example.austin.tutorial2.R.id.chkFudge;
import static com.example.austin.tutorial2.R.id.chkNuts;
import static com.example.austin.tutorial2.R.id.chkWC;
import static com.example.austin.tutorial2.R.id.edtName;
import static com.example.austin.tutorial2.R.id.imgSundae;
import static com.example.austin.tutorial2.R.id.rbFake;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clearOrder (View view){
        //findViewById finds the widget by name
        //Type cast in front of it to correct widget type
        ( (EditText)findViewById(edtName)).setText("");
        ((RadioGroup)findViewById(R.id.rbgSize)).clearCheck();
        ((RadioButton)findViewById(rbFake)).setSelected(true);
        ((CheckBox)findViewById(chkFudge)).setChecked(false);
        ((CheckBox)findViewById(chkNuts)).setChecked(false);
        ((CheckBox)findViewById(chkWC)).setChecked(false);

        ((ImageView)findViewById(imgSundae)).setImageResource(R.drawable.emptybowl);
    }

    public void setSmall (View view){
       // ImageView emptySundae = (ImageView)findViewById(R.id.imgSundae);

        ImageView image  = (ImageView) findViewById(R.id.imgSundae);
        image.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.scoop1));
    }

    public void setMedium (View view){
        ImageView image = (ImageView)findViewById(R.id.imgSundae);
        image.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.scoop2));
    }

    public void setLarge (View view){
        ImageView image = (ImageView)findViewById(R.id.imgSundae);
        image.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.scoop3));
    }
    public void submitOrder (View view){
        ((TextView)findViewById(R.id.subOrder)).setText("Your Order has been submitted!");
    }

    public void showHelpScreen (View view){
        Intent helpIntent = new Intent(this, HelpActivity.class);
        startActivity(helpIntent);
    }
}
