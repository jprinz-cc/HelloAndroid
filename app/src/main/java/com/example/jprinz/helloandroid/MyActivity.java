package com.example.jprinz.helloandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.Toast;

public class MyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);

        // Let's take a look at Toast and Log in action
        Toast.makeText(this, "Can you see me", Toast.LENGTH_SHORT).show();


        Log.i("info", "Done creating the app");

    }

    public void topClick(View v){
        Toast.makeText(this, "Top button clicked", Toast.LENGTH_SHORT).show();
        Log.i("info", "The user clicked the top button");
    }

    public void bottomClick(View v){
        Toast.makeText(this, "Bottom button clicked", Toast.LENGTH_SHORT).show();
        Log.i("info", "The user clicked the top button");
    }


    // TODO: The flashing pid bug might be caused by the code below!
}
