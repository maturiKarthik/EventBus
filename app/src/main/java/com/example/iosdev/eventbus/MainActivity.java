package com.example.iosdev.eventbus;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.greenrobot.eventbus.EventBus;

public class MainActivity extends AppCompatActivity {

    Button click;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        click = (Button)findViewById(R.id.click);
        textView=(TextView)findViewById(R.id.tv1);




        click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               //USE POSTSTICKY EVENT TO UPDATE THE UI
                EventBus.getDefault().postSticky(new MsgEvent("XXXXXXXX1#1#1#1#1T..!"));

                //STARTING ACTIVITY
                Intent i = new Intent(MainActivity.this,Another.class);
                startActivity(i);
            }
        });
    }


}
