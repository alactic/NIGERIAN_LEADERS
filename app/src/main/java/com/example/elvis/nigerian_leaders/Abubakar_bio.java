package com.example.elvis.nigerian_leaders;
import android.app.Activity;
import android.content.Context;
import android.database.Cursor;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;


public class Abubakar_bio extends Activity {
    String article;
    Context ctx=this;
    Button Login;
    TextView ARTICLE;
    Context CTX=this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_abubakar_bio);
        ARTICLE= (TextView) findViewById(R.id.abubakar);

        article = "         General Abdulsalami Alhaji Abubakar (rtd.) (  pronunction (help•info) ahb-doo-sah-LAM-ee ah-boo-BAH-kahr[needs IPA] born 13 June 1942) is a Nigerian general who was President of Nigeria from 9 June 1998 until 29 May 1999. He succeeded Sani Abacha upon Abacha's death. It was during Abubakar's leadership that Nigeria adopted its new constitution on 5 May 1999, which provided for multiparty elections. Abubakar transferred power to president-elect Olusegun Obasanjo on 29 May 1999.\n" +
                "\n Early life and military career\n" +
                "           Abdulsalami Alhaji Abubakar hails from the Hausa ethnic group and was born on 13 June 1942 in Minna, Niger State. He was educated at Native Authority Primary School in that city, the Provincial Secondary School in Bida, and finally the Technical Institute, Kaduna.After this, he joined the military. Abubakar led Nigeria's contingent in the United Nations Interim Force in Lebanon and eventually rose to the role of Chief of Defence Staff. His wife's name is Fati and they have six children.\n" +
                "\nPresidency\n" +
                "           Nigeria had been ruled by military leaders since Muhammadu Buhari seized power from Shehu Shagari in a 1983 coup. Although democratic elections had been held in 1993, they were annulled by General Ibrahim Babangida. Reported to have had an initial reluctance to accepting the position, Abubakar was sworn in as president on 9 June 1998 after the unexpected death of Abacha. He declared a weeklong period of national mourning.\n" +
                "A few days after assuming office, Abubakar promised to hold elections within a year and transfer power to an elected president. He established the Independent National Electoral Commission (INEC), appointing former Supreme Court Justice Ephraim Akpata as chairman. The INEC held a series of elections first for Local Government Areas in December 1998, then for State Assemblies and Governors, National Assemblies and finally for the President on 27 February 1999. Although efforts were made to ensure that the elections were free and fair, there were widespread irregularities that drew criticism from foreign observers.\n" +
                "Surprising some critics of the country's military, Abubakar kept his word and transferred power to elected president Obasanjo on 29 May 1999. It was during his leadership that Nigeria adopted its new constitution on 5 May 1999, which went into effect when Obasanjo became president.\n" +
                "\nLater life\n" +
                "           Following his short rule Abubakar received multiple honours, including the Rainbow/Push Coalition Peace Prize, the Economic Community of West African States International Gold Medal, and the Star Award of Ghana. In 2000, former United Nations Secretary-General Kofi Annan appointed him to try to shore up the UN Mission (MONUC) to the Congo-Kinshasa.\n" +
                "           However, Abubakar's legacy is mixed. A lecture circuit at Chicago State University in Chicago, Illinois, United States featuring him encountered opposition, because he had supported Abacha's government. (Abacha's administration was notorious for its human rights abuses). He was also sued in that country by other Nigerians who claimed he was responsible for the death of 1993 president-elect Moshood Kashimawo Olawale Abiola, who died in custody after being prevented by the military from taking office, and for the violation of the rights of others during his administration.\n" +
                "           Abubakar helped in the Liberian peace movement by presiding over the 2003 peace talks between Charles Taylor and the opposing rebels. This is seen in the movie: \"Pray the Devil Back to Hell\".\n";



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
        getMenuInflater().inflate(R.menu.menu_abubakar_bio, menu);
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
