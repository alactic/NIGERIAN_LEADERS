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


public class Ironsi_biography extends Activity{
    String article;
    Context ctx=this;
    Button Login;
    TextView ARTICLE;
    Context CTX=this;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ironsi_biography);
        ARTICLE= (TextView) findViewById(R.id.ironsi);
          article="             Major General Johnson Thomas Umunnakwe Aguiyi-Ironsi (3 March 1924 - 29 July 1966) was a Nigerian soldier. He seized power in the chaos that ensued the first military coup in Nigeria and served as the Head of State of Nigeria from 16 January 1966 until he was overthrown and killed on 29 July 1966 by a group of Northern army officers who revolted against his perceived tribalistic government." +
                  "\nEarly life\n" +
                  "             Thomas Umunnakwe Aguiyi-Ironsi was born to Mazi Ezeugo Aguiyi's on 3 March 1924, in Umuahia-Ibeku, present-day Abia State, Nigeria. When he was eight years old, Ironsi moved in with his older sister Anyamma, who was married to Theophilius Johnson, a Sierra Leonean diplomat in Umuahia. Ironsi subsequently took the last name of his brother-in-law, who became his father figure. At the age of 18, Ironsi joined the Nigerian Army against the wishes of his sister.\n" +
                  "\nMilitary career\n" +
                  "             Aguiyi-Ironsi enlisted in the Nigerian Army on 2 February 1942 and was admitted to and excelled in military training at Eaton Hall, England and also attended Royal Army Ordnance Corps before he was later commissioned as an infantry officer with the rank of Lieutenant on 12 June 1949. He soon returned to Nigeria to serve as the aide-de-camp to John Macpherson, Governor General of Nigeria, and he was assigned as equerry to Queen Elizabeth II during her visit to Nigeria in 1956, for which assignment he was sent to Buckingham Palace to train. During the Congo Crisis of the 1960s, the United Nations Secretary-General, Dag Hammarskjöld, appealed to the Nigerian government to send troops to Congo. Lieutenant Colonel Ironsi led the 5th battalion to the Kivu and Leopoldville provinces of Congo. His unit proved integral to the peacekeeping effort, and he was soon appointed the Force Commander of the United Nations Operation in the Congo.\n" +
                  "             In 1960 he led the Nigerian contingent in Congo. There he single-handedly negotiated the release of Austrian medical personnel and Nigerian troops when they were ambushed by Katangese rebels. For this he was awarded the 1st class Ritter-Kreuz Award. He also single-handedly confronted an angry mob in Leopoldville, disbanding them. This and many other exploits earned him the name \"Johnny Ironside\", a corruption of his name \"Ironsi\" with reference to various British military historical parallels.\n" +
                  "Ironsi returned from Congo in 1964 during the post-independence \"Nigerianization\" of the country's institutions of government. It was decided that the British General Officer Commanding (GOC) of the Nigerian Army, Major General Welby-Everard, would step down to allow the government to appoint an indigenous GOC. Ironsi led the pack of candidates jostling for the coveted position. A consensus was reached by the ruling Northern People's Congress (NPC) and National Council of Nigerian Citizens (NCNC) coalition government, and Ironsi became General Officer Commanding of the Nigerian Army on 9 February 1965.\n" +
                  "\nPolitics\n" +
                  "\nFall of the First Republic\n" +
                  "             On the 14 January 1966, Soldiers of mostly Igbo extraction led by Major Chukwuma Kaduna Nzeogwu, an Igbo from Okpanam near Asaba, present day Delta state, eradicated the uppermost echelon of politicians from the Northern and Western provinces.This and other factors effectively led to the Fall of the Republican Government. Though Ironsi, an Igbo, was purportedly slated for assassination, he effectively took control of Lagos, the Federal Capital Territory. With President also an Igbo Nnamdi Azikiwe refusing to intervene and insure the continuity of civilian rule, Ironsi effectively at Gun point forced the remaining members of Balewa's Government to resign, he then made the Senate president Nwafor Orizu, another Igbo who was serving as acting president in Azikiwe's absence, to officially surrender power to him, staging a coup of his own and ending the First Nigerian Republic.\n" +
                  "\n194 days in office\n" +
                  "             Ironsi inherited a Nigeria deeply fractured by its ethnic and religious cleavages. The fact that none of the high-profile victims of the 1966 coup were of Igbo extraction, and also that the main beneficiaries of the coup were Igbo, led the Northern part of the country to believe that it was an Igbo conspiracy. Though Ironsi tried to dispel this notion by courting the aggrieved ethnic groups through political appointments and patronage, his failure to punish the coup plotters and the promulgation of the now infamous \"Decree No. 34\"—which abrogated the country's federal structure in exchange for a unitary one— crystallized this conspiracy theory.\n" +
                  "             During his short regime Aguiyi-Ironsi promulgated a raft of decrees. Among them were the Constitution Suspension and Amendment Decree No.1, which suspended most articles of the Constitution (though he left intact those sections of the constitution that dealt with fundamental human rights, freedom of expression and conscience were left intact). The Circulation of Newspaper Decree No.2 which removed the restrictions on press freedom put in place by the preceding civilian administration. According to Ndayo Uko, the Decree no.2 was to serve \"as a kind gesture to the press..\" to safeguard himself when he went on later to promulgate the Defamatory and Offensive Decree No.44 of 1966 which made it an \"offense to display or pass on pictorial representation, sing songs, or play instruments the words of which are likely to provoke any section of the country.\"He also as per the proposals of a single man committee passed the controversial Unification Decree No. 34 aimed to unify Nigeria into a unitary state. This decree effectively gave prefriential treatment to the Igbo in Unified State were the Regions no longer had any sort of autonomy from the Federal Government.\n";
        DatabaseOperations DB = new DatabaseOperations(ctx);
        DB.putInfomation10(DB, article);

        DatabaseOperations DOP = new DatabaseOperations(CTX);
        Cursor CR = DOP.getInformation10(DOP);
        CR.moveToNext();
        String NAME = "";
        NAME = CR.getString(0);

        ARTICLE.setText(NAME);


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_ironsi_biography, menu);
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
