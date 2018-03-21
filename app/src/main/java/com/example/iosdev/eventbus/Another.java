package com.example.iosdev.eventbus;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.TextView;
import android.widget.Toast;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;

/**
 * Created by iosdev on 20/03/2018.
 */

public class Another extends Activity {

    TextView tv;
    EventBus eventBus =  EventBus.getDefault();

    @Override
    protected void onStart() {
        super.onStart();
        eventBus.register(this);
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.another);

    }


    // USE THE FOLLOWING ANOTATION TO ACTIVT THE
    @Subscribe(sticky = true)
    public void onEvent(MsgEvent event){
        tv = (TextView)findViewById(R.id.tv);
        tv.setText("event::"+event.getMsg());
        Toast t = Toast.makeText(this,event.getMsg(),Toast.LENGTH_LONG);
        t.show();
    }




    @Override
    protected void onDestroy() {
        //eventBus.unregister(this);
        super.onDestroy();
    }
}
