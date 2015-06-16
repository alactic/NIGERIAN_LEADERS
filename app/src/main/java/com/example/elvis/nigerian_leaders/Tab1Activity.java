package com.example.elvis.nigerian_leaders;
import android.app.Activity;
import android.content.Context;
import android.database.Cursor;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;



public class Tab1Activity extends Activity {
    String article;
    Context ctx=this;
    TextView ARTICLE;
    Context CTX=this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab1);
        ARTICLE= (TextView) findViewById(R.id.tab1);

        article = "         Nigeria i/naɪˈdʒɪəriə/, officially the Federal Republic of Nigeria, is a federal constitutional republic comprising 36 states and its Federal Capital Territory, Abuja. Nigeria is located in West Africa and shares land borders with the Republic of Benin in the west, Chad and Cameroon in the east, and Niger in the north. Its coast in the south lies on the Gulf of Guinea in the Atlantic Ocean.\n" +
                "\n" +
                "           Present-day Nigeria has been the site of numerous kingdoms and tribal states for millennia. The modern state originated from British colonial rule beginning in the 19th century, and the merging of the Southern Nigeria Protectorate and Northern Nigeria Protectorate in 1914. The British set up administrative and legal structures whilst practicing indirect rule through traditional chiefdoms. Nigeria became a formally independent federation in 1960, and plunged into a civil war from 1967–1970. It has since alternated between democratically-elected civilian governments and military dictatorships, with its 2011 presidential elections being viewed as the first to be conducted reasonably freely and fairly.\n" +
                "\n" +
                "           Nigeria is often referred to as the \"Giant of Africa\", owing to its large population and economy. With approximately 174 million inhabitants, Nigeria is the most populous country in Africa and the seventh most populous country in the world. Nigeria has one of the largest populations of youth in the world. The country is viewed as a multinational state, as it is inhabited by over 500 ethnic groups, of which the three largest are the Hausa, Igbo and Yoruba; these ethnic groups speak over 500 different languages, and are identified with wide variety of cultures. Regarding religion, Nigeria is divided roughly in half between Christians, who live mostly in the southern and central parts of the country, and Muslims, concentrated mostly in the northern and southwestern regions. A minority of the population practice religions indigenous to Nigeria, such as those native to Igbo and Yoruba peoples.";



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
        getMenuInflater().inflate(R.menu.menu_tab1, menu);
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
