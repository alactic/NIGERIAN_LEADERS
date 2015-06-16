package com.example.elvis.nigerian_leaders;
import android.app.Activity;
import android.content.Context;
import android.database.Cursor;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

public class Murtala_biography extends Activity {
    String article;
    Context ctx=this;
    Button Login;
    TextView ARTICLE;
    Context CTX=this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_murtala_biography);
        ARTICLE= (TextView) findViewById(R.id.murtala);

        article = "         General Murtala Ramat Muhammed (November 8, 1938–February 13, 1976) was a military ruler (Head of the Federal Military Government) of Nigeria from 1975 until his assassination in 1976.\n" +
                "            On July 30, 1975, Brigadier (later General) Muhammed was made head of state, when General Gowon was overthrown while at an Organization of African Unity (OAU) summit in Kampala, Uganda. Brigadiers Obasanjo (later Lt.General) and Danjuma (later Lt.General) were appointed as Chief of Staff, Supreme HQ and Chief of Army Staff, respectively.In the coup d'état that brought him to power he introduced the phrases \"Fellow Nigerians\" and \"with immediate effect\" to the national lexicon. In a short time, Murtala Muhammed's policies won him broad popular support, and his decisiveness elevated him to the status of a folk hero.\n" +
                "One of his first acts was to scrap the 1973 census, which was weighted in favor of the north, and to revert to the 1963 count for official purposes. Murtala Muhammad removed top federal and state officials to break links with the Gowon regime and to restore public confidence in the federal government. More than 10,000 public officials and employees were dismissed without benefits, on account of age, health, incompetence, or malpractice. The purge affected the civil service, judiciary, police and armed forces, diplomatic service, public corporations, and universities. Some officials were brought to trial on charges of corruption. He also began the demobilization of 100,000 troops from the swollen ranks of the armed forces.\n" +
                "Twelve of the 25 ministerial posts on the new Federal Executive Council went to civilians, but the cabinet was secondary to the executive Supreme Military Council. Muhammad imposed the authority of the federal government in areas formerly reserved for the states, restricting the latitude exercised by state governments and their governors in determining and executing policy. Newly appointed military governors of the states were not given seats on the Supreme Military Council, but instead were expected to administer federal policies handed down by Muhammad through the military council. The federal government took over the operation of the country's two largest newspapers, made broadcasting a federal monopoly, and brought remaining state-run universities under federal control.\n" +
                "           Murtala Muhammad initiated a comprehensive review of the Third National Development Plan. Singling out inflation as the greatest danger to the economy, he was determined to reduce the money supply that had been swollen by government expenditures on public works. Muhammad also announced that his government would encourage the rapid expansion of the private sector into areas dominated by public corporations. He reappraised foreign policy, stressing a \"Nigeria first\" orientation in line with OPEC price guidelines that was to the disadvantage of other African countries. Nigeria became \"neutral\" rather than \"nonaligned\" in international affairs. The shift in orientation became apparent with respect to Angola. Nigeria had worked with the OAU to bring about a negotiated reconciliation of the warring factions in the former Portuguese colony, but late in 1975 Murtala Muhammad announced Nigeria's support for the Soviet-backed Popular Movement for the Liberation of Angola, citing South Africa's armed intervention on the side of the rival National Union for the Total Independence of Angola (UNITA). The realignment strained relations with the United States, which argued for the withdrawal of Cuban troops and Soviet advisers from Angola.";



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
        getMenuInflater().inflate(R.menu.menu_murtala_biography, menu);
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
