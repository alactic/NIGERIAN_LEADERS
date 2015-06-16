package com.example.elvis.nigerian_leaders;
import android.app.Activity;
import android.content.Context;
import android.database.Cursor;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

public class Balewa_Biblography extends Activity {
    String article;
    Context ctx=this;
    Button Login;
    TextView ARTICLE;
    Context CTX=this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_balewa__biblography);
        ARTICLE= (TextView) findViewById(R.id.Balewa);

        article = "         Alhaji Sir Abubakar Tafawa Balewa (1912-1966) was the first prime minister of independent Nigeria, serving from 1957 to 1966.\n" +
                "Abubakar Tafawa Balewa was born in Tafawa Balewa, North East State, Nigeria. Unlike the majority of Northern Nigerian political leaders, he was of humble background, his father having been a client to a district head. After attending Katsina Teacher Training College (1928-1933), he was a teacher and later headmaster of the Bauchi Middle School. He studied at the London University Institute of Education (1945-1946), where he received a teacher's certificate in history.\n" +
                "           During World War II Tafawa Balewa had become interested in political activities. In 1943 he founded the Bauchi Discussion Circle, an organization interested in political reform. In 1948 he was elected vice president of the Northern Teacher's Association, the first trade union in Northern Nigeria. In 1949 he helped organize the Northern People's Congress (NPC), originally conceived as a cultural...\n" +
                "           Alhaji Sir Abubakar Tafawa Balewa, KBE(1) (December 1912 – January 15, 1966) was a Nigerian politician, and the only prime minister of an independent Nigeria.\n" +
                "           Originally a trained teacher, he became a vocal leader for Northern interest as one of the few educated Nigerians of his time. He was also an international statesman,\n" +
                "widely respected across the African continent as one of the leaders who encouraged the formation of the Organization of African Unity (OAU). Nicknamed the Golden\n" +
                "Voice of Africa because of his oratory, he stands one of the only three National Heroes of the Nigerian Nation.\n" +
                "\n" +
                "Early life and career\n" +
                "           In contrast with the largely aristocratic ruling elite in the north, many of whose ancestry derives from royal lineage, Balewa had very humble origins. His father was a slave who rose in service of the Madaki of Bauchi and became a district head.\n" +
                "According to family oral history, Balewa’s paternal grandfather Isa was murdered in front of his family by his rival’s agents. Isa’s widow then took her infant son to Bauchi, where the Madaki of Bauchi took her in. Abubakar was born in December 1912 in the village of Tafawa Balewa, in modern day Bauchi state. He was his father’s only child. The name of his birthplace was appended to Abubakar’s name (Abubakar Tafawa Balewa). Tafawa Balewa village takes its name from two corrupted Fulani words: “Tafari” (rock) and Baleri (black). This may have contributed to the “Black Rock” nickname he acquired in later life. Although it is widely (incorrectly) presumed that he was Hausa, Balewa’s father Yakubu Dan Zala was in fact of Bageri ethnicity, and his mother Fatima Inna was Fulani.\n" +
                " \n" +
                "Education\n" +
                "           He attended Quaranic school and learnt the first chapter of the Qur’an by heart. For his Western education he attended Bauchi Provincial School. According to his teacher and classmates he was a shy, quiet and not outstanding student. Although reserved by nature, he did commit a disciplinary infraction when he was caught outside school without permission, and smoking with his friends to boot. He was whipped as punishment.  One of his juniors at school was Nuhu Bamalli (later Foreign Minister). He later attended Katsina Teacher Training College (1928-1933) and graduated with a third class certificate. His best subject was unsurprisingly, English. He became a teacher and irritated by a friend’s remark that no Northerner had ever passed the exam for a Senior Teacher’s Certificate, Balewa duly sat the exam, and obtained the Certificate. He became headmaster of the Bauchi Middle School. He reported that the first white woman he ever set eyes on was Dame Margery Perham (a renowned academic on African affairs) when she visited Nigeria on an investigation of native administration.\n" +
                "           In 1945 he and other northerners (including Aminu Kano) obtained a scholarship to study at the University of London’s Institute of Education (1945-1946), where he received a teacher’s certificate in history. When he returned to Nigeria he said he now saw the world with “new eyes”. Balewa said he:\n" +
                "“returned to Nigeria with new eyes, because I had seen people who lived without fear, who obeyed the law as part of their nature, who knew individual liberty”\n" +
                "He returned to Nigeria as a Native Authority Education Officer.\n" +
                "He was elected in 1946, to the colony's Northern House of Assembly, and to the Legislative Assembly in 1947. As a legislator, he was a vocal advocate of the rights of northern Nigeria, and together with Alhaji Ahmadu Bello, who held the hereditary title of Sardauna of Sokoto, he founded the Northern People's Congress (NPC).\n" +

                "\n" +
                "Politics\n" +
                "           Balewa was no firebrand political radical. He may have remained a teacher for the rest of his life had southern politicians such as the flamboyant intellectual Nnamdi Azikiwe not pushed for Nigerian independence. Although not overtly political he founded an organisation named the “Bauchi Discussion Circle” in 1943, and was elected vice president of the Northern Teacher’s Association (the first trade union in Northern Nigeria) in 1948. Anxious not to be politically upstaged by the southerners, Northern leaders sought educated Northerners to serve in political posts. Balewa helped found the Northern People’s Congress (NPC), which was originally intended as a cultural organisation but by 1951 morphed into a political party due to the need to present a Northern response to the rapid and sophisticated political groupings emerging in the south.  Balewa was called into political service as the Bauchi Native Authority’s representative to the Northern House of Assembly.  The House of Assembly also selected him to become a member of the Nigerian Legislative Council.\n" +
                "           Despite political involvement, Balewa remained suspicious of Nigerian unification and feared that the Northern Region would be dominated by the better educated and dynamic south. He said that “the southern tribes who are now pouring into the north in ever increasing numbers…do not mix with the northern people in social matters and we…look upon them as invaders. Since 1914 the Brirish government has been trying to make Nigeria into one country, but the Nigerian people themselves are historically different in their backgrounds, in their religious beliefs and customs, and do not show themselves any sign of willingness to unite. So what it comes to is that Nigerian unity is only a British intention in the country.”\n" +
                "\nBalewa administration\n" +
                "           Balewa entered the government in 1952 as Minister of Works, and later served as Minister of Transport. In 1957, he was elected Chief Minister, forming a coalition government between the NPC and the National Council of Nigeria and the Cameroons (NCNC), led by Nnamdi Azikiwe. He retained the post as Prime Minister when Nigeria gained independence in 1960, and was reelected in 1964.\n" +
                "Prior to Nigeria's independence, a constitutional conference in 1954 had adopted a regional political framework for the country, with all regions given a considerable amount ofpolitical freedom. The three regions then were composed of diverse cultural groups. The premiers and some prominent leaders of the regions later took on a policy of guiding their regions against political encroachment from other regional leaders. Later on, this political environment influenced the Balewa administration. His term in office was turbulent, with regional factionalism constantly threatening his government.\n" +
                "           However, as Prime Minister of Nigeria, he played important roles in the continent's formative indigenous rule. He was an important leader in the formation of the Organization of African Unity and creating a cooperative relationship with French speaking African Countries. He was also instrumental in negotiations between Moise Tshombe and the Congolese authorities during the Congo Crisis of 1960–1964. He led a vocal protest against the Sharpeville Massacre of 1960 and also entered into an alliance with Commonwealth ministers who wanted South Africa to leave the Commonwealth in 1961. However, a treason charge and conviction against one of the western region's leaders, Obafemi Awolowo, led to protest and condemnation from many of his supporters. The 1965 election in the region later produced violent protests. Rioting and violence were soon synchronous with what was perceived as inordinate political encroachment and an over-exuberant election outcome for Awolowo's western opponents.\n" +
                "           As Prime Minister of Nigeria, Sir Abubakar Tafawa Balewa, from 1960 to 1961, doubled as Foreign Affairs advocate of Nigeria. In 1961, the Balewa government created an official Foreign Affairs and Commonwealth Relations ministerial position in favour of Jaja Wachuku who became, from 1961 to 1965, the First substantive Nigerian Minister of Foreign Affairs and Commonwealth Relations, later called External Affairs.\n" +
                "           In 1963 he gave a spellbinding eloquent speech at the Addis Ababa (Ethiopia) inaugural conference of the Organisation of African Unity. As Prime Minister he maintained a thoroughly dignified comportment.  A British acquaintance called him “perhaps the perfect Victorian gentleman”. He gained several awards from the British: OBE in 1952, CBE in 1955, Knighted by Queen Elizabeth II in January 1960 and was awarded an honorary degree by the University of Sheffield in May 1960.\n" +
                "           Balewa proposed an amendment to Nigeria’s constitution to give due recognition to the nation building role played by then Governor-General Dr. Nnamdi Azikiwe. Balewa proposed that “Nnamdi Azikiwe shall be deemed to have been elected President and Commander in-Chief of the Armed Forces” because “Nigeria can never adequately reward Dr. Azikiwe” for the nationalist role he played in building Nigeria and achieving independence.\n" +
                "\n";



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
        getMenuInflater().inflate(R.menu.menu_balewa__bibliograghy, menu);
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
