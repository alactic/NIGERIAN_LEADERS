 package com.example.elvis.nigerian_leaders;
import android.app.Activity;
import android.content.Context;
import android.database.Cursor;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;



public class Shehu_bio extends Activity {
    String article;
    Context ctx=this;
    TextView ARTICLE;
    Context CTX=this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shehu_bio);
        ARTICLE= (TextView) findViewById(R.id.shehu);

        article = "         Shehu Usman Aliyu Shagari, Turakin Sakkwato (born February 25, 1925) served as the President of Nigeria’s Second Republic (1979–1983), after the handover of power by General Olusegun Obasanjo's military government.\n" +
                "           Shagari is a northerner of Fulani extraction and holds the aristocratic title of Turakin Sakkwato in the Sokoto Caliphate. He worked as a teacher for a brief period before entering politics in 1954 upon his election to the federal House of Representatives.\n" +
                "\nEarly life\n" +
                "           Shehu Usman Shagari was born in Shagari village to the family of Magaji Aliyu and Mariamu in 1925. His name, Usman, means \"Companion\". He was raised in a polygamous family, and was the sixth child born into the family. Prior to becoming Magajin Shagari, Aliyu, Shehu's father was a farmer, trader and herder. However, due to traditional rites that prevented rulers from participating in business, Aliyu relinquished some of his trading interest when he became the Magaji, or village head, of Shagari village. Aliyu died five years after Shehu's birth, and Shehu's elder brother, Bello, briefly took on his father's mantle as Magajin Shagari.\n" +
                "The village of Shagari was founded by Fulani Jihadist[citation needed] and cattlemen and later dominated by Hausa traders. Like many Jihadist founded towns, religious recitals were important for children growing up[citation needed]. Shagari was taught recitals at home and later went to a Quranic school at the age of four. However, he was obliged to attend elementary school at Yabo, a town close by. After, he went to the Sokoto Middle School and later to Kaduna college.\n" +
                "\nEarly career\n" +
                "           Kaduna College originally was created to be a teachers training school. There were few high level civil service professions open to indigenous in Northern Nigeria and coupled with the lack of a post-graduate school except the Yaba Higher college; the teaching profession became the dominant career path early graduates of Kaduna college took and Shagari was no exception. After finishing secondary school, he was called on to become the new pupil-science teacher of Sokoto Middle School, shortly after, he was appointed the science teacher for Zaria Middle school. In 1945, after the end of World War II, he moved back to become the science and also history and geography teacher of the Sokoto Middle School. There, he was re-united with his extended family who lived nearby. Six years after, he was posted to Argungu as the headmaster of the new primary school there.\n" +
                "\nMarriages\n" +
                "           After, becoming the science teacher for Sokoto Middle School, he had a close look at arranged marriages. His uncle Magaji Basharu and his brother, Bello had tried to have him marry Basharu's granddaughter. However, Shagari gave the visiting bridal train a taunting look. After the visitors left and in the tense atmosphere, the bride followed them briskly. Shagari later married twice to Hadiza and Aishatu Shagari.\n" +
                "\nEarly political career\n" +
                "           Starting from the late 1930s, a few Northern Nigeria political organizations started mushrooming. Shagari who was educated at Kaduna college, was already well versed in the early independence movement in Southern Nigeria as an avid reader of southern newspapers. He also held strong social views about development of Yabo, his district in Sokoto. In 1946, Shagari and Mallam Gambo Abuja started the Youth Social Circle, a political organization centered around Sokoto. They were supported by noble men such as Ahmadu Bello, Ibrahim Gusau, and Mallam Ahamdu Dabbaba. By 1948, a consolidation idea was initiated in the region to merge all the nascent political organizations under one group. The youth social circle of Sokoto agreed to the merger, and together with other groups formed the Northern People's congress. Later on, the organization became a political party and went on to win the national parliamentary election in 1959. Before 1959, Shagari was elected to represent the constituency of Sokoto Southwest. In 1958, he was appointed parliamentary secretary to the Prime Minister, Abubakar Tafawa Balewa. Shagari later went on to hold the positions of minister of Economic Development in 1960, minister of Internal Affairs in 1962 and minister of Works and Survey in 1965. However, the first republic was cut short by a military coup. Shagari returned to Sokoto to work on his farm and later to work as a councilor for the Sokoto Native Authority. In 1970, as part of a movement to broaden the government, Yakubu Gowon made Shagari a minister of Economic affairs and later of Finance.\n" +
                "           Gowon's government was later overthrown as part of a military putsch by some military officers. A new democratic return timetable was initiated by the new Administration. As part of its preparation for democratic return, the government of Obasanjo established a constitutional conference. Members to the conference where both elected and selected. Within the conference, a national organization was formed among some members, the organization was called National Movement, it later metamorphosized to become the National Party of Nigeria and contested the 1979 election with Shehu Usman Aliyu Shagari as its presidential candidate.";



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
        getMenuInflater().inflate(R.menu.menu_shehu_bio, menu);
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
