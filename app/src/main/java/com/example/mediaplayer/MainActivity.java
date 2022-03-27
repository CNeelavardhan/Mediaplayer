package com.example.mediaplayer;

import android.content.Intent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {



    public Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button StartService=findViewById(R.id.button);
        Button StopService=findViewById(R.id.button2);

        StartService.setOnClickListener(this);
        StopService.setOnClickListener(this);
        intent=new Intent(this,myService.class);

    }
    public void startService(){
        startService(new Intent(getApplicationContext(),myService.class));
        Toast.makeText(this,"Service Started!!",Toast.LENGTH_SHORT).show();
    }



    public void stopService(){
        stopService(new Intent(getApplicationContext(),myService.class));

        Toast.makeText(this,"Service Stopped!!",Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onClick(View v) {
        int id=v.getId();
        if(id==R.id.button){
            startService();

        }
        if(id==R.id.button2){
            stopService();

        }

    }
}