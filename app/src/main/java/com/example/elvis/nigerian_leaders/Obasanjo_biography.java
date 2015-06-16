package com.example.elvis.nigerian_leaders;
import android.app.Activity;
import android.content.Context;
import android.database.Cursor;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

public class Obasanjo_biography extends Activity {
    String article;
    Context ctx=this;
    Button Login;
    TextView ARTICLE;
    Context CTX=this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_obasanjo_biography);
        ARTICLE= (TextView) findViewById(R.id.obasanjo);

        article = "         Olusegun Mathew Okikiola Aremu Obasanjo, GCFR (/oʊˈbɑːsəndʒoʊ/; Yoruba: Olúṣẹ́gun Ọbásanjọ́ [olúʃɛ̙́ɡũ ɒ̙básandʒɒ̙; born circa 5 March 1937) is a former Nigerian Army general who was President of Nigeria from 1999 to 2007. A Nigerian of Yoruba descent, Obasanjo was a career soldier before serving twice as his nation's head of state, as a military ruler from 13 February 1976 to 1 October 1979 and as a democratically elected president from 29 May 1999 to 29 May 2007.\n" +
                "His current home is Abeokuta, the capital city of Ogun State, where he is a nobleman as the holder of the chieftaincy titles of the Balogun of the Owu Lineage and the Ekerin Balogun of the Egba clan of Yorubaland.\n" +
                "           Ọbasanjọ was born in Ogun State; and grew up in Owu (Abeokuta). His first name, Olusegun, means \"The Lord is victorious\".\n" +
                "The Oloye Obasanjo's first wife, Mrs. Oluremi (Remi) Obasanjo, is the mother of his oldest children, the most well-known being Dr. Iyabo Obasanjo-Bello, a former Senator of Ogun State.\n" +
                "           In 1987, his second wife/ex-wife Lynda was ordered out of her car by armed men, but was fatally shot for failing to move quickly.\n" +
                "On 23 October 2005 the President lost his wife, Stella Obasanjo, First Lady of Nigeria the day after she had an abdominoplasty in Spain. In 2009 the doctor only known as 'AM' was sentenced to one year in jail for negligence in Spain and ordered to pay restitution to her son of about $176,000. Obasanjo has many children, who live throughout Nigeria, the United Kingdom and the United States.\n" +
                "His son, Dare Obasanjo, is a Principal Program Manager for Microsoft.\n" +
                "\nCareer\n" +
                "           At the age of 21, he enlisted in the Nigerian Army in 1958. He trained at Aldershot, and was commissioned as an officer in the Nigerian Army. He was also trained in India at the Defence Services Staff College, Wellington and at the Indian Army School of Engineering. He served at 1 Area Command in Kaduna. Promoted to Chief Army Engineer, he was made commander of 2 Area Command from July 1967, which was redesignated 2 Division Rear, and then the Ibadan Garrison Organisation. He was also trained in DSSC, Wellington. During the Nigerian Civil War, he commanded the Army\\'s 3 Marine Commando Division that took Owerri, effectively bringing an end to the civil war.\n" +
                "As chief of staff of Supreme Headquarters, Obasanjo sought advice from Rogerlay of Akobi and gained support of the military. On 13 February 1976, coup plotters, led by Army Col. Dimka, marked him, Murtala and other senior military personnel for assassination. Murtala was killed during the attempted coup, but Obasanjo escaped death. The low profile security policy adopted by Murtala had allowed the plotters easy access to their targets. The coup was foiled because the plotters missed Obasanjo and General Theophilus Danjuma, chief of army staff and de facto number three man in the country. The plotters failed to monopolize communications, although they were able to take over the radio station to announce the coup attempt.\n" +
                "Obasanjo and Danjuma established a chain of command and re-established security in Lagos, thereby regaining control. Obasanjo was appointed as head of state by the Supreme Military Council. Keeping the chain of command established by Murtala, Obasanjo pledged to continue the programme for the restoration of civilian government in 1979 and to carry forward the reform programme to improve the quality of public service.";



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
        getMenuInflater().inflate(R.menu.menu_obasanjo_biography, menu);
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
