package com.example.elvis.nigerian_leaders;
import android.app.Activity;
import android.content.Context;
import android.database.Cursor;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

public class Buhari_bio extends Activity {
    String article;
    Context ctx=this;
    Button Login;
    TextView ARTICLE;
    Context CTX=this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buhari_bio);
        ARTICLE= (TextView) findViewById(R.id.buhari);

        article = "\nEarly life\n" +
                "           Muhammadu Buhari was born on 17 December 1942, in Daura, Katsina State, to his father Adamu and mother Zulaihat. He is the twenty-third child of his father. Buhari was raised by his mother, after his father died when he was about four years old.\n" +
                "He attended primary school in Daura and Mai'adua before proceeding to Katsina Model School in 1953, and Katsina Provincial Secondary School (now Government College Katsina) from 1956 to 1961. He then joined the Nigerian Military Training School in Kaduna, where his military career began.\n" +
                "\nMilitary career\n" +
                "           Buhari joined the Nigerian Army in 1961, when he attended the Nigerian Military Training College (in February 1964, it was renamed the Nigerian Defence Academy) in Kaduna. From 1962 to 1963, he underwent officer cadets training at Mons Officer Cadet School in Aldershot in England.\n" +
                "In January 1963, Buhari was commissioned as second lieutenant, and appointed Platoon Commander of the Second Infantry Battalion in Abeokuta, Nigeria. From November 1963 to January 1964, Buhari attended the Platoon Commanders’ Course at the Nigerian Military Training College, Kaduna. In 1964, he facilitated his military training by attending the Mechanical Transport Officer’s Course at the Army Mechanical Transport School in Borden, United Kingdom.\n" +
                "           From 1965 to 1967, Buhari served as Commander of the Second Infantry Battalion. He was appointed Brigade Major, Second Sector, First Infantry Division, April 1967 to July 1967.\n" +
                "Buhari was made Brigade Major of the Third Infantry Brigade, July 1967 to October 1968 and Brigade Major/Commandant, Thirty-first Infantry Brigade, 1970 to 1971.\n" +
                "Buhari served as the Assistant Adjutant-General, First Infantry Division Headquarters, from 1971 to 1972. He also attended the Defence Services Staff College, Wellington, India, in 1973.\n" +
                "           From 1974 to 1975, Buhari was Acting Director of Transport and Supply at the Nigerian Army Corps of Supply and Transport Headquarters.\n" +
                "He was also Military Secretary at the Army Headquarters from 1978 to 1979 and was a member of the Supreme Military Council from 1978 to 1979.\n" +
                "           From 1979 to 1980, at the rank of colonel, Buhari (class of 1980) attended the US Army War College in Carlisle, Pennsylvania, in the United States, and gained a Masters Degree in Strategic Studies. Upon completion of the on-campus full-time resident program lasting ten months and the two-year-long, distance learning program, the United States Army War College (USAWC) college awards its graduate officers a master's degree in Strategic Studies.";



        DatabaseOperations DB = new DatabaseOperations(ctx);
        DB.putInfomation(DB, article);

        DatabaseOperations DOP = new DatabaseOperations(CTX);
        Cursor CR = DOP.getInformation(DOP);
        CR.moveToLast();
        String NAME = "";
        NAME = CR.getString(0);

        ARTICLE.setText(NAME);


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_buhari_bio, menu);
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
