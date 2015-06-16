package com.example.elvis.nigerian_leaders;
import android.app.Activity;
import android.content.Context;
import android.database.Cursor;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;


public class Musa_bio extends Activity {
    String article;
    Context ctx=this;
    Button Login;
    TextView ARTICLE;
    Context CTX=this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_musa_bio);
        ARTICLE= (TextView) findViewById(R.id.musa);

        article = "         Umaru Musa Yar'Adua (16 August 1951 – 5 May 2010) was the President of Nigeria and the 13th Head of State. He served as governor of Katsina State in northern Nigeria from 29 May 1999 to 28 May 2007. He was declared the winner of the controversial Nigerian presidential election held on 21 April 2007, and was sworn in on 29 May 2007. He was a member of the ruling People's Democratic Party (PDP). In 2009, Yar'Adua left for Saudi Arabia to receive treatment for pericarditis. He returned to Nigeria in 2010, where he died on 5 May.\n" +
                "\nFamily and Early Life\n" +
                "           Yar'Adua was born into an aristocratic Fulani family in Katsina; his father, a former Minister for Lagos during the First republic, held the royal title of Mutawalli (custodian of the treasury) of the Katsina Emirate, a title which Yar'Adua inherited. He started his education at Rafukka Primary School in 1958, and moved to Dutsinma Boarding Primary School in 1962. He attended the Government College at Keffi from 1965 until 1969. In 1971 he received a Higher School Certificate from Barewa College. He attended Ahmadu Bello University in Zaria from 1972 to 1975, obtaining a B.Sc. degree in Education and Chemistry, and then returned in 1978 to achieve an M.Sc. degree in Analytical Chemistry.\n" +
                "Alhaji Umaru Yar'Adua married Turai Umaru Yar'Adua of Katsina in 1975; they had seven children (five daughters and two sons). Their daughter Zainab is married to Kebbi State governor Usman Saidu Nasamu Dakingari. Their daughter Nafisat is married to Bauchi State governor Isa Yuguda. Yar'Adua was married to Hauwa Umar Radda as a second wife from 1992 to 1997. They had two children.\n" +
                "\nProfessional Career\n" +
                "           Yar'Adua's first employment was at Holy Child College in Lagos (1975–76). He later served as a lecturer at the College of Arts, Science, and Technology in Zaria, Kaduna State, between 1976 and 1979. In 1979 he began working as a lecturer at College of Art Science, remaining in this position until 1983, when he began working in the corporate sector.\n" +
                "Yar'Adua worked at Sambo Farms Ltd in Funtua, Katsina State, as its pioneer General Manager between 1983 and 1989. He served as a Board Member of Katsina State Farmers' Supply Company between 1984 and 1985, Member of the Governing Council of Katsina College of Arts, Science and Technology Zaria and Katsina Polytechnic between 1978 and 1983, Board Chairman of Katsina State Investment and Property Development Company (KIPDECO) between 1994 and 1996. He served as a director of many companies, including Habib Nigeria Bank Ltd, 1995–99; Lodigiani Nigeria Ltd, 1987–99, Hamada Holdings, 1983–99; and Madara Ltd, Vom, Jos, 1987–99. He was Chairman of Nation House Press Ltd, Kaduna, from 1995 to 1999.\n" +
                "\nEarly Political Career\n" +
                "           During the Second Republic (1979–83), Yar'Adua was a member of the leftist People's Redemption Party, while his father was briefly the National Vice chairman of the National Party of Nigeria. During the Transition Programme of President Ibrahim Badamasi Babangida, Yar'Adua was one of the foundation members of the Peoples Front, a political association under the leadership of his elder brother, the late Major-General Shehu Musa Yar'Adua. That association later fused to form the Social Democratic Party. Yar'Adua was a member of the 1988 Constituent Assembly. He was a member of the party's National Caucus and the SDP State Secretary in Katsina and contested the 1991 Governorship election, but lost to Saidu Barda, the candidate of the National Republican Convention and an ally of Babangida. In 1999, he ran for the same position and won. He was re-elected in 2003. He was the first governor to publicly declare his assets.\n" +
                "In the year of 2000, during his administration as governor, Katsina became the fifth northern Nigerian state to adopt sharia, or Islamic law. In 2002 Amina Lawal, a woman from Katsina, was sentenced to death by stoning by a sharia court in the town of Bakori for committing adultery; the story attracted international attention. Her sentence was at first upheld by a court in the town of Funtua, then overturned a year later following an appeal.\n" +
                "According to a public hearing that was carried out shortly after his death in May 2010, there has never being a Governor like him in the history of Katsina State.\n" +
                "Governor Ibrahim Shema of Katsina State has attributed the achievements recorded in the state to the sagacity of former governor and late President Umaru Musa Yar’Adua. The late Yar’Adua was governor for eight years in Katsina State from 1999 to 2007 before he was succeeded by the incumbent.\n" +
                "           He said with two years before the end of his administration, the policy of free education for primary and secondary school students would be maintained.\n" +
                "On 16–17 December 2006, Yar'Adua was chosen as the presidential candidate of the ruling PDP for the April 2007 election, receiving 3,024 votes from party delegates; his closest rival, Rochas Okorocha, received 372 votes. Yar'Adua's success in the primary was attributed to the support of incumbent President Olusegun Obasanjo; At the time of his nomination he was an obscure figure on the national stage, and has been described as a \"puppet\" of Obasanjo who could not have won the nomination under fair circumstances. Shortly after winning the nomination, Yar'Adua chose Goodluck Jonathan, governor of Bayelsa State, as his vice-presidential candidate.\n" +
                "Another view of the support he received from President Obasanjo is that he was one of few serving governors with a spotless record, devoid of any suspicions or charges of corruption. He also belonged to the People's Democratic Movement (PDM) – a powerful political block founded by his late brother, Shehu Musa Yar'Adua, who was also Obasanjo's vice president during his military rule.\n" +
                "In 2007 Umaru Yar'Adua, who suffered from a kidney condition, challenged his critics to a game of squash in an endeavor to end speculations about his health. On 6 March 2007 he was flown to Germany for medical reasons, further fomenting rumors about his health. His spokesperson said this was due to stress and quoted Yar'Adua as saying he was fine and would soon be back to campaigning. Another report, which was rejected by Yar'Adua's spokesperson, claims that Yar'Adua collapsed after suffering a possible heart attack.\n" +
                "\nPresidency\n" +
                "           In the presidential election, held on 21 April 2007, Yar'Adua won with 70% of the vote (24.6 million votes) according to official results released on 23 April. The election was highly controversial. Strongly criticized by observers, as well as the two primary opposition candidates, Muhammadu Buhari of the All Nigeria Peoples Party (ANPP) and Atiku Abubakar of the Action Congress (AC), its results were largely rejected as having been rigged in Yar'Adua's favor.\n" +
                "After the election, Yar'Adua proposed a government of national unity. In late June 2007, two opposition parties, the ANPP and the Progressive Peoples Alliance (PPA), agreed to join Yar'Adua's government. On 28 June 2007, Yar'Adua publicly revealed his declaration of assets from May (becoming the first Nigerian Leader to do so), according to which he had ₦856,452,892 (US$5.8 million) in assets, ₦19 million ($0.1 million) of which belonged to his wife. He also had ₦88,793,269.77 ($0.5 million) in liabilities. This disclosure, which fulfilled a pre-election promise he made, was intended to set an example for other Nigerian politicians and discourage corruption.\n" +
                "Yar'Adua's new cabinet was sworn in on 26 July 2007. It included 39 ministers, including two for the ANPP.\n" +
                "Buhari and Abubakar filed petitions to have the results of the 2007 presidential election invalidated due to alleged fraud, but on 26 February 2008 a court rejected the petitions. Buhari and Abubakar said that they would appeal to the Supreme Court. Marred by corruption, many argued that this election was rigged by Obasanjo as well, as he wanted his successor to have the same basic ideals that he possessed as President.\n" +
                "\nIllness and Death\n" +
                "President Yar\\'Adua left Nigeria on 23 November 2009, and was reported to be receiving treatment for pericarditis at a clinic in Saudi Arabia. He was not seen in public again, and his absence created a dangerous power vacuum in Nigeria.\n" +
                "In December 2009 Oluwarotimi Odunayo Akeredolu, president of the Nigerian Bar Association (NBA), stated that Yar\\'Adua should have handed over power to Vice-President Goodluck Jonathan in an acting capacity during his illness, a statement that was backed up by the NBA national executive committee. On 22 January 2010, the Supreme Court of Nigeria ruled that the Federal Executive Council (FEC) had fourteen days to decide a resolution on whether Yar\\'Adua was \"incapable of discharging the functions of his office\". The ruling also stated that the Federal Executive Council should hear testimony of five doctors, one of whom should be Yar\\'Adua\\'s personal physician.\n" +
                "On 9 February 2010, the Senate controversially used the \"doctrine of necessity\" to transfer Presidential Powers to Vice President Goodluck Jonathan, and declared him Acting President, with all the accompanying powers, until Yar\\'Adua returned to full health. The power transfer, considered illegal by some, has been called a \"coup without the word\" by opposition lawyers and lawmakers. However, there are others that felt the power vacuum would lead to instability and a possible military takeover.\n" +
                "On 24 February 2010, Yar\\'Adua returned to Abuja. His state of health was unclear, but there was speculation that he was still on a life support machine. Various political and religious figures in Nigeria had visited him during his illness saying he would make a recovery.\n" +
                "Yar\\'Adua died on 5 May at the Aso Rock Presidential Villa. An Islamic burial took place on 6 May in his hometown in Katsina";



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
        getMenuInflater().inflate(R.menu.menu_musa_bio, menu);
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
