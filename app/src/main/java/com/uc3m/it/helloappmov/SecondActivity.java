package com.uc3m.it.helloappmov;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.content.Intent;

import java.text.BreakIterator;

public class SecondActivity extends AppCompatActivity {

    // cuando hagamos el onclick hay que poner despueés de AppCompatActivity:
    //   implements View.OnClickListener
    ImageButton button_Activity;
    ImageButton button_List;
    ImageButton button_Water;
    ImageButton button_Recycle;
    ImageButton button_Transport;
    ImageButton button_Weather;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_second);

        button_Activity = (ImageButton)findViewById(R.id.button_Activity);

        button_List = (ImageButton) findViewById(R.id.button_List);

        /*
        button_Water.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent AddTrip = new Intent(getApplicationContext(), AddTripActivity.class);
                startActivity(AddTrip);
            }
        });*/

        button_Water = (ImageButton)findViewById(R.id.button_Water);
        /*button_Recycle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent TripLists = new Intent(getApplicationContext(), ListActivity.class);
                startActivity(TripLists);
            }
        });*/

        button_Recycle = (ImageButton)findViewById(R.id.button_Recycle);

        /*button_Clock.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Alarm = new Intent(getApplicationContext(), AlarmActivity.class);
                startActivity(Alarm);
            }
        });*/

        button_Transport = (ImageButton)findViewById(R.id.button_Transport);

        /*button_Maps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Map = new Intent(getApplicationContext(), MapActivity.class);
                startActivity(Map);
            }
        });*/

        button_Weather = (ImageButton)findViewById(R.id.button_Weather);

        /*button_Weight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Weight = new Intent(getApplicationContext(), WeightActivity.class);
                startActivity(Weight);
            }
        });*/
    }

    /*@ Override
    public void onClick(View view){
        //String value=button_male.getText().toString();
    }*/

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
}
