package de.fhro.inf.prg3.a07;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // this will inflate the layout from res/layout/activity_main.xml
        setContentView(R.layout.activity_main);


        Button btn = (Button) findViewById(R.id.button1);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ListView lv = (ListView) findViewById(R.id.mealsListView);
                lv.setAdapter(new ArrayAdapter<>(
                        MainActivity.this,     // context we're in; typically the activity
                        R.layout.meal_entry,   // where to find the layout for each item
                        new String[] {"Hans", "Dampf"} // your data
                ));
            }
        });
    }
}
