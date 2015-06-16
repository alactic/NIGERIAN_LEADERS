package com.example.elvis.nigerian_leaders;


import android.app.TabActivity;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TabHost;


public class buhari extends TabActivity
{
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buhari);

        // create the TabHost that will contain the Tabs
        TabHost tabHost = (TabHost)findViewById(android.R.id.tabhost);


        TabHost.TabSpec tab1 = tabHost.newTabSpec("First Tab");
        // Set the Tab name and Activity
        // that will be opened when particular Tab will be selected
        tab1.setIndicator("BIOGRAPHY");
        tab1.setContent(new Intent(this,Buhari_bio.class));


        /** Add the tabs  to the TabHost to display. */
        tabHost.addTab(tab1);
    }
}

