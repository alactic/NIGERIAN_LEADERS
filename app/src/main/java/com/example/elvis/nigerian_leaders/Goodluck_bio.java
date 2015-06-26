package com.example.elvis.nigerian_leaders;
import android.app.Activity;
import android.app.LoaderManager;
import android.content.Context;
import android.content.CursorLoader;
import android.content.Loader;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;


public class Goodluck_bio extends Activity {
    String article;
    Context ctx=this;
    Button Login;
    TextView ARTICLE;
    Context CTX=this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_goodluck_bio);
        ARTICLE= (TextView) findViewById(R.id.Goodluck);


        article = "         Goodluck Ebele Azikiwe Jonathan, GCFR, BNER, GCON (born 20 November 1957) is a Nigerian politician and the President of Nigeria from 2010 to 2015. He re-contested and lost the recently concluded Presidential election, upon which he conceded defeat in the competitive election, the first sitting Nigerian president to do so. Prior to his role as President, he served as Governor of Bayelsa State from 2005 to 2007 and as Vice-President of Nigeria from 2007 to 2010.\n" +
                "Jonathan's term as President of Nigeria will end on 29 May 2015, when he will hand over to President Elect Muhammadu Buhari.[citation needed]\n" +
                "\nEarly and personal life\n" +
                "           Jonathan was born in what is now Bayelsa State to a family of canoe makers.Jonathan holds a B.Sc. degree in Zoology in which he attained Second Class Honours. He holds an M.Sc. degree in Hydrobiology and Fisheries biology, and a PhD degree in Zoology from the University of Port Harcourt, which he did not finish according to Olusegun Obasanjo. Before he entered politics in 1998, he worked as an education inspector, lecturer, and environmental-protection officer.\n" +
                "Jonathan and his wife Patience have two children. He is a Christian, and he comes from the Ijaw ethnic group.\n" +
                "In 2007, President Jonathan declared his assets worth a total of ₦ 295,304,420 Naira ($1,845,652 USD). However on 9 October 2014, the richestlifestyle.com website ranked Mr Jonathan sixth on its list, claiming his net worth was about $100m (£62m). He threatened to sue the website, claiming it \"was an attempt to portray him as corrupt.\" The page was removed, but was then published by another website which estimated Jonathan's net wealth at $10 million.\n" +
                "\nDeputy Governor of Bayelsa\n" +
                "           On 29 May 1999, Jonathan was sworn in as Deputy Governor of Bayelsa alongside Diepreye Alamieyeseigha who named in as the governor of the state on the platform of PDP. Jonathan served as Deputy Governor until December 2005.\n" +
                "\nGovernor of Bayelsa\n" +
                "           On 9 December 2005, Jonathan, who was Deputy Governor at the time, was sworn in as Governor of Bayelsa State upon the impeachment of the current Governor Diepreye Alamieyeseigha by the Bayelsa State Assembly after being charged with money laundering in the United Kingdom. In September 2006, Jonathan was marred by reports released by Wikileaks claiming his wife was indicted for money-laundering by Nigeria’s anti-crime agency, the Economic and Financial Crimes Commission (EFCC). The report proved to be false. The head of the EFCC stated that “Mrs. Jonathan was not in any way involved in any case of money laundering investigated by the EFCC\".\n" +
                "\nVice-presidency\n" +
                "           As Vice-President, Jonathan took on a very low profile while recognising the constitutional limits of the Vice-President office, he participated in cabinet meetings and, by statute, was a member of the National Security Council, the National Defence Council, the Federal Executive Council, and was the Chairman of National Economic Council.\n" +
                "Vice-President Jonathan was instrumental in negotiating an agreement with many of the major militant groups in the Niger Delta, who were mostly his fellow Ijaws, to lay down their weapons and stop fighting as part of a government amnesty.\n" +
                "Presidency\n" +
                "\nActing president\n" +
                "           On 9 February 2010, a motion from the Nigerian Senate invested Goodluck Jonathan as acting President of the federation because President Yar'Adua went for medical treatment in Saudi Arabia in November 2009. On 10 February 2010, during his first day as acting president, Jonathan announced a minor cabinet reshuffle. Prince Adetokunbo Kayode, who was the Labour Minister, was named Minister of Justice, to replace Mr Mike Aondoakaa. Aondoakaa was named as the Minister of Special Duties, and his counterpart Ibrahim Kazaure, was named Minister of Labour.\n" +
                "Acting President Jonathan also promised to continue implementing the Seven-point agenda policy framework of President Umaru Musa Yar’adua.\n" +
                "In accordance with the order of succession in the Nigerian constitution following President Umaru Yar'Adua's death on 5 May 2010, Vice-President Goodluck Jonathan was sworn in as President of the Federal Republic of Nigeria on 6 May 2010, becoming Nigeria's 14th Head of State. He cited anti-corruption, power and electoral reforms as focuses of his administration. He stated that he came to office under \"very sad and unusual circumstances\".\n" +
                "On 18 May 2010, the National Assembly approved Jonathan's nomination of former Kaduna State governor, Namadi Sambo, for the position of Vice-President.";



        DatabaseOperations DB = new DatabaseOperations(ctx);
        DB.putInfomation7(DB, article);

        DatabaseOperations DOP = new DatabaseOperations(CTX);
        Cursor CR = DOP.getInformation7(DOP);
        CR.moveToNext();
        String NAME = "";
        NAME = CR.getString(0);

        ARTICLE.setText(NAME);


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_goodluck_bio, menu);
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
