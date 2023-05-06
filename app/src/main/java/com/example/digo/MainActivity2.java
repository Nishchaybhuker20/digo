package com.example.digo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.media.Image;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.provider.MediaStore;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {
    ImageView Camerabutton;

    public boolean isConnected() {
        boolean connected = false;
        try {
            ConnectivityManager cm = (ConnectivityManager)getApplicationContext().getSystemService(Context.CONNECTIVITY_SERVICE);
            NetworkInfo nInfo = cm.getActiveNetworkInfo();
            connected = nInfo != null && nInfo.isAvailable() && nInfo.isConnected();
            return connected;
        } catch (Exception e) {
            Log.e("Connectivity Exception", e.getMessage());
        }
        return connected;
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        ImageView airplane = (ImageView) findViewById(R.id.airplane);
        airplane.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity2.this,
                        "Checking Airplane Mode",
                        Toast.LENGTH_LONG).show();
                Intent i = new Intent(MainActivity2.this, Airplane.class);
                startActivity(i);
            }
        });

        ImageView battery = (ImageView) findViewById(R.id.battery);
        battery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity2.this,
                        "Checking Battery Life",
                        Toast.LENGTH_LONG).show();
                Intent i = new Intent(MainActivity2.this, Battery.class);
                startActivity(i);
            }
        });

        ImageView bluetooth = (ImageView) findViewById(R.id.bluetooth);
        bluetooth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity2.this,
                        "Checking Bluettoh status",
                        Toast.LENGTH_LONG).show();
                Intent i = new Intent(MainActivity2.this, Bluetooth.class);
                startActivity(i);
            }
        });

        ImageView brightness = (ImageView) findViewById(R.id.brightness);
        brightness.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity2.this,
                        "Checking Brightness Level",
                        Toast.LENGTH_LONG).show();
                Intent i = new Intent(MainActivity2.this, Brightness.class);
                startActivity(i);
            }
        });

        // to open camera using try catch block
        Camerabutton =(ImageView) findViewById(R.id.flash);
        Camerabutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Toast.makeText(MainActivity2.this,
                            "Checking Flash",
                            Toast.LENGTH_LONG).show();
                    Intent intent=new Intent();
                    intent.setAction(MediaStore.ACTION_IMAGE_CAPTURE);
                    startActivity(intent);
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        });

        ImageView gps = (ImageView) findViewById(R.id.gps);
        gps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity2.this,
                        "Checking gps",
                        Toast.LENGTH_LONG).show();
                Intent i = new Intent(MainActivity2.this, Location.class);
                startActivity(i);
            }
        });

        ImageView internet = (ImageView) findViewById(R.id.internet);
        internet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Check for Internet Connection
                if (isConnected()) {
                    Toast.makeText(getApplicationContext(), "Internet Connected", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(), "No Internet Connection", Toast.LENGTH_SHORT).show();
                }
            }
        });

        ImageView security = (ImageView) findViewById(R.id.security);
        security.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity2.this,
                        "Checking Security",
                        Toast.LENGTH_LONG).show();
                Intent i = new Intent(MainActivity2.this, Security.class);
                startActivity(i);
            }
        });

        ImageView sound = (ImageView) findViewById(R.id.sound);
        sound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity2.this,
                        "Checking Sound Level",
                        Toast.LENGTH_LONG).show();
                Intent i = new Intent(MainActivity2.this, Sound.class);
                startActivity(i);
            }
        });

        ImageView touchID = (ImageView) findViewById(R.id.touchID);
        touchID.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity2.this,
                        "Checking FingerPrint Sensor",
                        Toast.LENGTH_LONG).show();
                Intent i = new Intent(MainActivity2.this, Security.class);
                startActivity(i);
            }
        });

        ImageView vibration = (ImageView) findViewById(R.id.vibration);
        vibration.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity2.this,
                        "Checking Vibration Motor",
                        Toast.LENGTH_LONG).show();
                Intent i = new Intent(MainActivity2.this, Rotation.class);
                startActivity(i);
            }
        });

        ImageView wifi = (ImageView) findViewById(R.id.wifi);
        wifi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity2.this,
                        "Checking Wifi connection",
                        Toast.LENGTH_LONG).show();
                Intent i = new Intent(MainActivity2.this, Wifi.class);
                startActivity(i);
            }
        });



    }
}