package com.example.austin.tutorial2;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by Austin on 2017-05-25.
 */
//TO make multiple screens
//    Create a new layout for the new screen. Do this by right clicking the layout folder in res and create a new resource file
//    Create a new java class to correspond to it.
//    Follow naming conventions for all things in Java. Scrub.
    //Open the AndroidManifest and add the activity into the xml file


    //New java file
public class HelpActivity extends AppCompatActivity{

    //Methods that runs when it is first loaded
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help);

    }

    public void swapHelp () {

    }
}
