package com.example.elvis.nigerian_leaders;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;


public class Tab2Activity  extends Activity
{
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_tab2);

        final LinearLayout Balewa=(LinearLayout)findViewById(R.id.Balewa);
        Balewa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Balewa.class);
                startActivity(intent);
            }
        });

        final LinearLayout Nnamdi=(LinearLayout)findViewById(R.id.nnamdi);
        Nnamdi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Nnamdi.class);
                startActivity(intent);
            }
        });

        final LinearLayout Gowon=(LinearLayout)findViewById(R.id.gowon);
        Gowon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Gowon.class);
                startActivity(intent);
            }
        });

        final LinearLayout Ironsi=(LinearLayout)findViewById(R.id.ironsi);
        Ironsi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Ironsi.class);
                startActivity(intent);
            }
        });

        final LinearLayout Murtala=(LinearLayout)findViewById(R.id.murtala);
        Murtala.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Murtala.class);
                startActivity(intent);
            }
        });

        final LinearLayout Goodluck=(LinearLayout)findViewById(R.id.goodluck);
        Goodluck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Goodluck.class);
                startActivity(intent);
            }
        });
        final LinearLayout Shehu=(LinearLayout)findViewById(R.id.shehu);
        Shehu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Shehu.class);
                startActivity(intent);
            }
        });

        final LinearLayout Obasanjo=(LinearLayout)findViewById(R.id.obasanjo);
        Obasanjo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Obasanjo.class);
                startActivity(intent);
            }
        });
        final LinearLayout Musa=(LinearLayout)findViewById(R.id.musa);
        Musa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Musa.class);
                startActivity(intent);
            }
        });

        final LinearLayout Ibrahim=(LinearLayout)findViewById(R.id.ibrahim);
        Ibrahim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Ibrahim.class);
                startActivity(intent);
            }
        });

        final LinearLayout Buhari=(LinearLayout)findViewById(R.id.buhari);
        Buhari.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), buhari.class);
                startActivity(intent);
            }
        });

        final LinearLayout Abacha=(LinearLayout)findViewById(R.id.abacha);
        Abacha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Abacha.class);
                startActivity(intent);
            }
        });

        final LinearLayout Abubakar=(LinearLayout)findViewById(R.id.abubakar);
        Abubakar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Abubakar.class);
                startActivity(intent);
            }
        });

        final LinearLayout Ernest=(LinearLayout)findViewById(R.id.ernest);
        Ernest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Ernest.class);
                startActivity(intent);
            }
        });










    }
}
