package com.example.elvis.nigerian_leaders;
import android.app.Activity;
import android.content.Context;
import android.database.Cursor;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;


public class Abacha_bio extends Activity {
    String article;
    Context ctx=this;
    Button Login;
    TextView ARTICLE;
    Context CTX=this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_abacha_bio);
        ARTICLE= (TextView) findViewById(R.id.abacha);

        article = "        Sani Abacha (20 September 1943 – 8 June 1998) was a Nigerian Army general and politician " +
                "who served as the de facto President of Nigeria from 1993 to 1998. Abacha's regime is controversial:" +
                " although it saw dramatic economic growth, it also witnessed widespread human rights abuses. Early life and education\n" +
                "A Kanuri from Borno by tribe, Abacha was born and brought up in Kano, Nigeria. He attended the Nigerian Military Training College and Mons Officer Cadet School before being commissioned as a 2nd lieutenant in 1963.\n" +
                "\nMilitary career\n" +
                "          Abacha was commissioned in 1963 after he had attended Mons Officer Cadet School in Aldershot, England. Before then, he had " +
                "attended the Nigerian Military Training College in Kaduna. Refusing to accept a single political appointment throughout his military career," +
                " Abacha has been described as the epitome of military discipline.\n" +
                "Abacha's military career is distinguished by a string of successful coups. He is by some records the most successful coup plotter in the history of Nigeria's military. He took part in the countercoup of July 1966, from the conceptual stage, and may have been a participant in the Lagos or Abeokuta phases of the January 1966 coup." +
                " He was also a prominent figure in every single successful coup in Nigerian history, two of which brought and removed General Muhammadu Buhari from power in 1983. When General Ibrahim Babangida was named President and Commander-in-Chief of the Armed Forces of the Federal Republic of Nigeria in 1985, Abacha was named Chief of Army Staff. He was appointed Minister of Defence in 1990.\n" +
                "In 1990, Abacha became the first Nigerian soldier to attain the rank of a full General without skipping a single rank. On 17 November 1993, Abacha overthrew the short-lived transitional government of Chief Ernest Shonekan. In September 1994, he issued a decree that placed his government above the jurisdiction of the courts, effectively giving him absolute power. Another decree gave him the right to detain anyone for up to three months without trial.\n" +

                "\nParticipation in the Nigerian counter-coup of July 1966\n" +
                "Abacha, then a 2nd Lieutenant with the 3rd Battalion in Kaduna, was one of the many officers of northern Nigerian origin (including 2nd Lieutenant Ibrahim Babangida, Lieutenant Muhammadu Buhari, Lieutenant Ibrahim Bako, and Major Theophilus Danjuma among others), who staged what became known as the Nigerian Counter-Coup of 1966 because of grievances they felt towards the administration of General Aguiyi Ironsi's government which quelled the coup in January 1966.\n" +

                "\nPresidency\n" +
                "            The Abacha administration became the first to record unprecedented economic achievements: he oversaw an increase in the country's foreign exchange reserves from $494 million in 1993 to $9.6 billion by the middle of 1997, reduced the external debt of Nigeria from $36 billion in 1993 to $27 billion by 1997, brought all the controversial privatization programs of the Babangida administration to halt, reduced an inflation rate of 54% inherited from Ibrahim Badamasi Babangida to 8.5% between 1993 and 1998, all while the nation's primary commodity, oil was at an average of $15 per barrel. His administration is also credited with creating the most comprehensive and realistic blueprint for Nigeria's development through the Vision 2010 committee chaired by his predecessor Ernest Shonekan. Death\n" +
                "Early in 1998, Abacha announced that elections would be held that August, with a view toward handing power to a civilian government on 1 October. It soon became apparent, though, that Abacha had no intention of permitting an honest election; by April he had strong-armed the country's five parties into endorsing him as the sole presidential candidate.\n" +
                "Abacha died in June 1998 while at the presidential villa in Abuja. He was buried on the same day, according to Muslim tradition, without an autopsy. This fueled speculation that he may have been executed extrajudicially by way of being poisoned by political rivals via prostitutes. The government identified the cause of death as a sudden heart attack. It is reported that he was in the company of two Indian prostitutes imported from Dubai. It is thought that the prostitutes laced his drink with a poisonous substance, making Abacha feel unwell around 4:30am. He retired to his bed and was dead by 6:15am.\n";



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
        getMenuInflater().inflate(R.menu.menu_abacha_bio, menu);
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
