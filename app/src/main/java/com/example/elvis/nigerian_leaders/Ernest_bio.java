package com.example.elvis.nigerian_leaders;
import android.app.Activity;
import android.content.Context;
import android.database.Cursor;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;


public class Ernest_bio extends Activity {
    String article;
    Context ctx=this;
    Button Login;

    TextView ARTICLE;
    Context CTX=this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ernest_bio);
        ARTICLE= (TextView) findViewById(R.id.ernest);

        article = "         Ernest Adegunle Oladeinde Shonekan (born 9 May 1936 in Lagos, south-west Nigeria) is a British-trained Nigerian lawyer, industrialist, politician and traditional chieftain. He was appointed as interim president of Nigeria by General Ibrahim Babangida on 26 August 1993. Babangida resigned under pressure to cede control to a democratic government. Shonekan's transitional administration only lasted three months, as a palace coup led by General Sani Abacha forcefully dismantled the remaining democratic institutions and brought the government back under military control on 17 November 1993.\n" +
                "           Prior to his political career, Shonekan was the chief executive of the United African Company of Nigeria PLC (UAC), a large Nigerian conglomerate.\n" +
                "\nEarly life and education\n" +
                "           Shonekan was born and raised in Lagos, the former Nigerian capital (now Abuja). The son of an Abeokuta-born civil servant, he was one of six children born into the family. Shonekan was educated at C.M.S grammar school and Igbobi College, Lagos. He also attended and received a law degree from the University of London and was later called to the bar.\n" +
                "\nCareer\n" +
                "           He joined UAC in 1964,and was later sent to Harvard Business School. At UAC, he pursued a legal path; a few years after joining the company, he was promoted to the position of assistant legal adviser. He became a deputy adviser two years later, and soon joined the board.\n" +
                "           In 1980, he was made chairman and chief executive of UAC. As head of UAC, he was the chief executive of the largest African-controlled company in Sub-Saharan Africa.\n" +
                "\nHead of Transitional Council\n" +
                "           Shonekan was a seasoned and proven businessman with a wide network. His proven abilities and political neutrality made him a prospective leader for Babangida's council of civilians-run government, a government which was in the midst of economic turmoil and later came to a political crisis. On 2 January 1993, Shonekan assumed office as the head of government affairs under the leadership of the military president Babangida. At the time, the transitional council was designed to be the final phase leading to a scheduled hand over to an elected democratic leader.\n" +
                "Shonekan learned of the dire condition of government finances, which he was unable to correct. The 1993 budget was pegged to include a 28 billion naira deficit with little money left in its foreign reserves. The government was hard pressed on debt obligations and had to hold constant talks for debt re-scheduling.\n" +
                "Improvements were underway. The Armed Forces Ruling Council had designed a realistic two-year economic program. The program's outline called for reducing the petrol subsidy, to bring in 65 billion naira to government coffers. A modification of VAT was also in the works and a plan to inculcate fiscal discipline. By the end of June, following the cancellation of the 12 June presidential elections, the Nigerian nation was engulfed in political turmoil. Fiscal discipline was not heeded, and the government exceeded the deficit target by the beginning of the second quarter. By August 1993, Babangida decided to step aside and install an Interim government.\n" +
                "\n" +
                "          Oloye Shonekan assumed the office of President of Nigeria on 26 August 1993, named by Babangida. The nation was gradually moving towards a stalemate. Shonekan had lobbied for debt cancellation but, after the cancellation of the 12 June elections, most of the western powers had imposed economic sanctions on Nigeria.\n" +
                "Inflation was uncontrollable and most non-oil foreign investment disappeared. The political problems continued. The winner of the 12 June elections vowed to oppose the interim government. The democracy supporters of southwest Nigeria, Shonekan's region, considered him an obstacle on the nation's path to democracy, social justice, and improving the welfare of the people. During his few months in power, he tried to create a new timetable for democratic return, while his government was hampered by a workers' strike.\n" +
                "Shonekan released political prisoners detained by Babangida. He tried to set a timetable for troop withdrawal from ECOMOG's peacekeeping mission in Liberia. The government also initiated an audit of the accounts of NNPC, the oil giant, an organisation that had many operational inefficiencies. Shonekan's administration introduced a bill to repeal three major draconian decrees of the military government.\n" +
                "He loosely controlled the military. The Defence Secretary made a military coup and took control of power in November 1993, just a few months into the administration.\n";



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
        getMenuInflater().inflate(R.menu.menu_ernest_bio, menu);
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
