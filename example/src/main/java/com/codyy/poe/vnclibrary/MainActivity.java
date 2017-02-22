package com.codyy.poe.vnclibrary;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.widget.TextView;

import es.farfuteam.vncpp.controller.ActivityTabs;

/**
 * Created by poe on 2/22/17.
 */

public class MainActivity extends FragmentActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TextView tv =new TextView(this);
        tv.setText("VNC Control");
        setContentView(tv);
        tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ActivityTabs.class);
                startActivity(intent);
            }
        });
    }

}
