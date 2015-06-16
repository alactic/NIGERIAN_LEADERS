package com.example.elvis.nigerian_leaders;
import android.app.Activity;
import android.content.Context;
import android.database.Cursor;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

public class Nnamdi_bio extends Activity {
    String article;
    Context ctx=this;
    Button Login;
    TextView ARTICLE;
    Context CTX=this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nnamdi_bio);
        ARTICLE= (TextView) findViewById(R.id.nnamdi);

        article = "\nEarly life\n" +
                "           Azikiwe was born on November 16, 1904, in Zungeru, Northern Nigeria. His parents were Igbo; his father Obed-Edom Chukwuemeka Azikiwe (1879–1958), a clerk in the British Administration of Nigeria and his mother was Rachel Ogbenyeanu Azikiwe. Nnamdi means \"My father is alive\" in the Igbo language. After studying at Hope Waddell Training Institute, Calabar, and Methodist Boys High School Lagos, Azikiwe went to the United States. While there he attended Howard University, Washington DC, before enrolling and graduating from Lincoln University, Pennsylvania, in 1930. He obtained a master's degree in Religion from Lincoln University in 1932 and another master's degree in Anthropology from University of Pennsylvania in 1934. He worked as an instructor at Lincoln before returning to Nigeria.\n" +
                "\nNewspaper career\n" +
                "           After teaching at Lincoln, Azikiwe, in November 1934, took the position of editor for the African Morning Post, a daily newspaper in Accra, Ghana. In that position he promoted a pro-African nationalist agenda. Smertin has described his writing there: \"In his passionately denunciatory articles and public statements he censured the existing colonial order: the restrictions on the Africans' right to express their opinions, and racial discrimination. He also criticised those Africans who belonged to the \"elite\" of colonial society and favoured retaining the existing order, as they regarded it as the basis of their well being.\n" +
                "As a result of publishing an article on May 15, 1936, entitled \"Has the African a God?\" written by I. T. A. Wallace-Johnson he was brought to trial on charges of sedition. Although he was found guilty of the charges and sentenced to six months in prison, he was acquitted on appeal. He returned to Lagos, Nigeria, in 1937 and founded the West African Pilot, which he used as a vehicle to foster Nigerian nationalism. He founded the Zik Group of Newspapers, publishing multiple newspapers in cities across the country. Azikiwe became active in the Nigerian Youth Movement (NYM), the first genuinely nationalist organization in Nigeria. However, in 1941 he backed Samuel Akinsanya to be NYM candidate for a vacant seat in the Legislative Council, but the executive selected Ernest Ikoli instead. Azikiwe resigned from the NYM accusing the NYM mostly Yoruba leadership of discrimination against the Ijebu-Yoruba members, Ibos and some Ijebu members with him and thus splitting the NYM along ethnic lines.\n" +
                "\nPolitical career\n" +
                "           After a successful journalism enterprise, Azikiwe entered into politics, co-founding the National Council of Nigeria and the Cameroons (NCNC) alongside Herbert Macaulay in 1944. He became the secretary-general of the National Council in 1946, and was elected to Legislative Council of Nigeria the following year. In 1951, he became the leader of the Opposition to the government of Obafemi Awolowo in the Western Region's House of Assembly after losing the four-cornered elections to the Action Group. In 1952, he moved to the Eastern Region, and was elected to the position of Chief Minister and in 1954 became Premier of Nigeria's Eastern Region. On November 16, 1960, he became the Governor General, with Abubakar Tafawa Balewa as Prime Minister. On the same day became the first Nigerian named to the Privy Council of the United Kingdom. With the proclamation of a republic in 1963, he became the first President of Nigeria. In both posts, Azikiwe's role was largely ceremonial.\n" +
                "Azikiwe and his civilian colleagues were removed from power in the military coup of January 15, 1966. He was the most prominent politician to escape the spate of assassinations following the coup. During the Biafran (1967–1970) war of secession, Azikiwe became a spokesman for the nascent republic and an adviser to its leader Chukwuemeka Odumegwu Ojukwu. He switched allegiance back to Nigeria during the war and publicly appealed to Ojukwu to end the war in pamphlets and interviews published at the time.\n" +
                "           After the war, he served as Chancellor of University of Lagos from 1972 to 1976. He joined the Nigerian People's Party in 1978, making unsuccessful bids for the presidency in 1979 and again in 1983. He left politics involuntarily after the military coup on December 31, 1983. He died on May 11, 1996, at the University of Nigeria Teaching Hospital, in Enugu, Enugu State, after a protracted illness. He was buried in his native Onitsha.\n" +
                "Places named after Azikiwe include the Nnamdi Azikiwe International Airport in Abuja, the Nnamdi Azikiwe Stadium in Enugu, the Nnamdi Azikiwe University in Awka, Anambra State, Nnamdi Azikiwe Press Centre, Dodan Barracks, Obalende, Ikoyi, Lagos. Azikiwe Avenue, in Dar es Salaam, Tanzania. His portrait adorns Nigeria's five hundred naira currency note.";



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
        getMenuInflater().inflate(R.menu.menu_nnamdi_bio, menu);
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
