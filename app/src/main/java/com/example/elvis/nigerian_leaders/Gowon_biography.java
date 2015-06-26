package com.example.elvis.nigerian_leaders;
import android.app.Activity;
import android.content.Context;
import android.content.CursorLoader;
import android.content.Loader;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.LoaderManager;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;


public class Gowon_biography extends Activity  {
    String article;
    Context ctx=this;
    Button Login;
    TextView ARTICLE;
    Context CTX=this;
    private Cursor cursor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gowon_biography);
        ARTICLE= (TextView) findViewById(R.id.gowon);

        article = "         General Yakubu \"Jack\" Dan-Yumma Gowon (born 19 October 1934) was the head of state (Head of the Federal Military Government) of Nigeria from 1966 to 1975. He took power after one military coup d'état and was overthrown in another. During his rule, the Nigerian government successfully prevented Biafran secession during the 1967–70 Nigerian Civil War.\n" +
                "\n Early life\n" +
                "           Gowon is an Ngas (Angas) from Lur, a small village in the present Kanke Local Government Area of Plateau State. His parents, Nde Yohanna and Matwok Kurnyang, left for Wusasa, Zaria as Church Missionary Society (CMS) missionaries in the early days of Gowon's life. His father took pride in the fact that he married the same day as the future Queen Mother Elizabeth married the future King George VI. Gowon was the fifth of eleven children. He grew up in Zaria and had his early life and education there. At school Gowon proved to be a very good athlete: he was the school football goalkeeper, pole vaulter, and long distance runner. He broke the school mile record in his first year. He was also the boxing captain.\n" +
                "\nEarly career and political ascent\n" +
                "           Yakubu Gowon joined the Nigerian army in 1954, receiving a commission as a Second Lieutenant on 19 October 1955, his 21st birthday.\n" +
                "He also attended both the Royal Military Academy Sandhurst, UK (1955–56), Staff College, Camberley, UK (1962) as well as the Joint Staff College, Latimer, 1965. He saw action in the Congo (Zaire) as part of the United Nations Peacekeeping Force, both in 1960–61 and in 1963. He advanced to battalion commander rank by 1966, at which time he was still a Lieutenant Colonel.\n" +
                "Up until that year Gowon remained strictly a career soldier with no involvement whatsoever in politics, until the tumultuous events of the year suddenly thrust him into a leadership role, when his unusual background as a Northerner who was neither of Hausa or Fulani ancestry nor of the Islamic faith made him a particularly safe choice to lead a nation whose population were seething with ethnic tension.\n" +
                "           In January 1966, he became Nigeria's youngest military chief of staff at the age of 32, because a military coup d'état by a group of junior officers under Major Chukwuma Kaduna Nzeogwu led to the overthrow of Nigeria's civilian government. In the course of this coup, mostly northern and western leaders were killed, including Sir Abubakar Tafawa Balewa, Nigeria's Prime Minister; Sir Ahmadu Bello, Sardauna of Sokoto and Premier of the Northern Region; and Samuel Akintola, Premier of the Western Region, Lt Col Arthur Unegbe and so many more. The then Lieutenant Colonel Gowon returned from his course at the Joint Staff College, Latimer UK two days before the coup – a late arrival that possibly exempted him from the coupist hit list. Success in twentieth century world affairs since 1919 and the subsequent failure by Major General Johnson Aguiyi-Ironsi (who was the head of state following the January 1966 coup-with Gowon his Chief of Staff) to meet Northern demands for the prosecution of the coup plotters further inflamed Northern anger. It should be noted that there was significant support for the coup plotters from both the Eastern Region as well as the mostly left-wing \"Lagos-Ibadan\" press.\n" +
                "Then came Ironsi's Decree Number 34, which proposed the abolition of the federal system of government in favor of a unitary state, a position which had long been championed by some Southerners-especially by a major section of the Igbo-dominated NCNC. This was perhaps wrongly interpreted by Northerners as a Southern (particularly Ibo) attempt at a takeover of all levers of power in the country. The North lagged badly behind the Western and Eastern regions in terms of education due to their religious related unacceptance of western education early, while the mostly-Igbo Easterners were already present in the federal civil service.\n" +
                "The original intention of Murtala Mohammed and his fellow coup-plotters seems to have been to engineer the secession of the Northern region from Nigeria as a whole, but they were subsequently dissuaded of their plans by several advisors, amongst which included a number of high ranking civil servants and judges, and importantly emissaries of the British and American governments who had interests in the Nigerian polity. The young officers then decided to name Lieutenant Colonel Gowon, who apparently had not been actively involved in events until that point, as Nigerian Head of State. On ascent to power Gowon reversed Ironsi's abrogation of the federal principle.\n" +
                "\nRole in the Biafran War\n" +
                "           In anticipation of eastern secession, Gowon moved quickly to weaken the support base of the region by decreeing the creation of twelve new states to replace the four regions. Six of these states contained minority groups that had demanded state creation since the 1950s. Gowon rightly calculated that the eastern minorities would not actively support the Igbos, given the prospect of having their own states if the secession effort were defeated. Many of the federal troops who fought the civil war, known as the Biafran War, to bring the Eastern Region back to the federation, were members of minority groups.\n" +
                "The war lasted thirty months and ended in January 1970. In accepting Biafra' unconditional cease-fire, Gowon declared that there would be no victor and no vanquished. In this spirit, the years afterward were declared to be a period of rehabilitation, reconstruction, and reconciliation. The oil-price boom, which began as a result of the high price of crude oil (the country's major revenue earner) in the world market in 1973, increased the federal government's ability to undertake these tasks.\n" +
                "\nBuildup to the Biafran War\n" +
                "           In the meantime, the July counter-coup had unleashed pogroms against more than 50,000 Easterners throughout the Northern Region. Hundreds of Eastern officers were murdered during the revolt, and in the North, as commanding officers either lost their control of their troops or actively egged them on to violence against Igbo civilians, it did not take long for Northerners from all walks of life to participate. Tens of thousands of Igbos were killed throughout the North. The persecution precipitated the flight of more than a million Igbo towards their ancestral homelands in eastern Nigeria. Lieutenant Colonel Chukwuemeka Odumegwu Ojukwu, the military governor of the Eastern region who did not allow attempts by Northern soldiers stationed in his region to replicate the massacres of Igbo officers, argued that if Igbo lives could not be preserved by the Nigerian state, then the Igbo reserved the right to establish a state of their own in which their rights would indeed be respected.\n" +
                "There arose tension between the Eastern region and the northern controlled federal government led by Gowon. On 4–5 January 1967, in line with Ojukwu's demand to meet for talks only on neutral soil, a summit attended by Gowon, Ojukwu and other members of the Supreme Military Council was held at Aburi in Ghana, the stated purpose of which was to resolve all outstanding conflicts and establish Nigeria as a confederation of regions. The outcome of this summit was the Aburi Accord.\n" +
                "The Aburi Accord did not see the light of the day, as the Gowon led government had huge\n" +
                "consideration for the possible revenues, especially oil revenues which were expected to increase given that reserves having been discovered in the area in the mid-1960s. It has been said without confirmation that both Gowon and Ojukwu had knowledge of the huge oil reserves in the Niger Delta area, which today has grown to be the mainstay of the Nigerian economy.\n" +
                "In a move to check the influence of Ojukwu's government in the East, Gowon announced on 5 May 1967 the division of the 3 Nigerian regions into 12 states: North-Western State, North-Eastern state, Kano State, North-Central State, Benue-Plateau State, Kwara State, Western State, Lagos State, Mid-Western State, and, from Ojukwu's Eastern Region, a Rivers State, a South-Eastern State, and an East-Central State. The non-Igbo South-Eastern and Rivers states which had the oil reserves and access to the sea, were carved out to isolate the Igbo areas as East-Central state.\n" +
                "One controversial aspect of this move was Gowon's annexing of Port Harcourt, a large city in the Niger Delta, in the South of Nigeria (the Ikwerres and Ijaws), sitting on some of Nigeria's largest reserves, into the new Rivers State, emasculating the migrant Igbo population of traders there. The flight of many of them back to their villages in the \"Igbo heartland\" in Eastern Nigeria where they felt safer was alleged to be a contradiction for Gowon's \"no victor, no vanquished\" policy, when at the end of the war, the properties they left behind were claimed by the Rivers State indigenes.\n" +
                "Minority ethnicities of the Eastern Region were rather not sanguine about the prospect of secession, as it would mean living in what they felt would be an Igbo-dominated nation. Some non-Igbos living in the Eastern Region either refrained from offering active support to the Biafran struggle, or actively aided the federal side by enlisting in the Nigerian army and feeding it intelligence about Biafran military activities.\n" +
                "           However, some did play active roles in the Biafran government, with N.U. Akpan serving as Secretary to the Government, Lt. Col (later Major-General) Philip Effiong, serving as Biafra's Chief of Defence Staff and others like Chiefs Bassey and Graham-Douglas serving in other significant roles.";



        DatabaseOperations DB = new DatabaseOperations(ctx);
        DB.putInfomation8(DB, article);

        DatabaseOperations DOP = new DatabaseOperations(CTX);
        Cursor CR = DOP.getInformation8(DOP);
        CR.moveToNext();
        String NAME = "";
        NAME = CR.getString(0);

        ARTICLE.setText(NAME);


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_gowon_biography, menu);
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
