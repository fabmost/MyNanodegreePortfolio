package com.clicky.myportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Button btnSpotify, btnScores, btnLibrary, btnBuild, btnXYZ, btnCapstone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSpotify = (Button)findViewById(R.id.btnSpotify);
        btnScores = (Button)findViewById(R.id.btnScores);
        btnLibrary = (Button)findViewById(R.id.btnLibrary);
        btnBuild = (Button)findViewById(R.id.btnBuild);
        btnXYZ = (Button)findViewById(R.id.btnXYZ);
        btnCapstone = (Button)findViewById(R.id.btnCapstone);

        btnSpotify.setOnClickListener(this);
        btnScores.setOnClickListener(this);
        btnLibrary.setOnClickListener(this);
        btnBuild.setOnClickListener(this);
        btnXYZ.setOnClickListener(this);
        btnCapstone.setOnClickListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v){
        String message = "";
        if(v == btnSpotify){
            message = "This button will launch my Spotify App";
        }else if(v == btnScores){
            message = "This button will launch my Scores App";
        }else if(v == btnLibrary){
            message = "This button will launch my Library App";
        }else if(v == btnBuild){
            message = "This button will launch my Build It Bigger App";
        }else if(v == btnXYZ){
            message = "This button will launch my XYZ Reader App";
        }else if(v == btnCapstone){
            message = "This button will launch my Capstone App";
        }
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
}
