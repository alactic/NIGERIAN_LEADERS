package com.example.elvis.nigerian_leaders;
import android.app.Activity;
import android.content.Context;
import android.database.Cursor;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;


public class Ibrahim_bio extends Activity {
    String article;
    Context ctx=this;
    Button Login;
    TextView ARTICLE;
    Context CTX=this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ibrahim_bio);
        ARTICLE= (TextView) findViewById(R.id.ibrahim);

        article = "         General Ibrahim Badamasi Babangida (born 17 August 1941), also known as IBB, is a retired Nigerian Army officer who was a military ruler of Nigeria. He ruled Nigeria from 27 August 1985, when he overthrew Major General Muhammadu Buhari in a coup, until his departure from office on 27 August 1993, having annulled the elections held on June 12 that year. General Babangida was a key player in most of the military coups in Nigeria (July 1966, February 1976, December 1983, August 1985, December 1985 and April 1990). There is evidence of severe human rights abuses during his regime.\n" +
                "\nMarriage, family and personal life\n" +
                "           Ibrahim Babangida was born in 1941, Minna, Niger State. His parents are Muhammad and Aisha Babangida. He is from the Gwari ethnic group. On 6 September 1969, he married Maryam (née King) Babangida (First Lady of Nigeria 1985-93). They had four children together: Muhammadu, Aminu, Aishatu, and Halimatu. Maryam Babangida died from complications of ovarian cancer on 27 December 2009.\n" +
                "\nEarly military career\n" +
                "           Babangida joined the Nigerian Army on 10 December 1962, when he attended the Nigerian Military Training College in Kaduna. He went on to further his study at the Royal Armoured Corps from January 1966 until April 1966.\n" +
                "From August 1972 to June 1973, he took the Advanced Armoured Officers' course at Armored school. He attended the Senior officers' course, Armed Forces Command and Staff College, Jaji, from January 1977 until July 1977 and the Senior International Defence Management Course, Naval Postgraduate school, U.S., in 1980.\n" +
                "He was heavily involved in quelling the Nigerian coup of 1976, when he was to ‘liberate’ a radio station from one of the coup plotters, Col Buka Suka Dimka (a close friend of his), to prevent him making further announcements over the air waves. Although he did prevent further broadcasts, Col Dimka managed to escape.\n" +
                "           He attained the following ranks: Second Lieutenant (1963), Lieutenant (1966), Captain (1968), Major (1970), Lieutenant Colonel (1970), Colonel (1973), Brigadier (1979), Major General (1983), and General (1987). Babangida also served as a member of the Supreme Military Council from 1 August 1975 to October 1979.\n" +
                "Participation in the Nigerian counter-coup of July 1966\n" +
                "           Babangida, then a Lieutenant with the 1st Reconnaissance Squadron in Kaduna, was one of the many officers of northern Nigerian origin (including 2nd Lieutenant Sani Abacha, Lieutenant Muhammadu Buhari, Lieutenant Ibrahim Bako, Lt Colonel Murtala Muhammed, and Major Theophilus Danjuma among others), who staged what became known as the Nigerian Counter-Coup of 1966 because of grievances they felt towards the administration of General Aguiyi Ironsi's government which quelled the January 1966 coup.\n" +
                "\nPresidency (1985-93)\n" +
                "1985 Coup\n" +
                "           Babangida was the Chief of Army Staff and a member of the Supreme Military Council (SMC) under the administration of Major General Muhammadu Buhari. Babangida would later overthrow Buhari's regime on 27 August 1985 in a bloodless military coup that relied on mid-level officers that Babangida strategically positioned over the years.\n" +
                "He came into power in a military coup promising to bring to an end the human rights abuses perpetuated by Buhari's government, and to hand over power to a civilian government by 1990.  Eventually, he perpetuated one of the worst human right abuses.\n" +
                "\nEconomic policies\n" +
                "           Babangida issued a referendum to garner support for austerity measures suggested by the International Monetary Fund (IMF) and the World Bank, and subsequently launched his \"Structural Adjustment Program\" (SAP) in 1986. The policies entailed under the SAP were the deregulation of the agricultural sector by abolishing marketing boards and the elimination of price controls, the privatisation of public enterprises, the devaluation of the Naira to aid the competitiveness of the export sector, and the relaxation of restraints on foreign investment put in place by the Gowon and Obasanjo governments during the 1970s.\n" +
                "Between 1986 and 1988, when these policies were executed as intended by the IMF, the Nigerian economy actually did grow as had been hoped, with the export sector performing especially well, but the falling real wages in the public sector and amongst the urban classes, along with a drastic reduction in expenditure on public services, set off waves of rioting and other manifestations of discontent that made sustained commitment to the SAP difficult to maintain.\n" +
                "Babangida subsequently returned to an inflationary economic policy and partially reversed the deregulatory initiatives he had set in motion during the heyday of the SAP following mounting pressure, and economic growth slowed correspondingly, as capital flight resumed apace under the influence of negative real interest rates. Babangida is seen by many to have presided over one of the most corrupt governments in Nigeria, however, unlike other regimes, no ministers of his regime were convicted/tried by the courts.\n" +
                "Although he ran a Military Government, his government appeared to be consultative: issues were subjected to public debate, but the use to which the final recommendations were put was another matter. For instance, in setting up a 17-man 'Political Bureau' (the so-called Politburo) in January 1986, Babangida kicked off what was intended to be a national debate on the political way forward for Nigeria. The Politburo 'majority report' appeared to have been completed whilst consultations were ongoing nationwide. Curious still, the manipulation of what would be revealed as a 'minority report' made it to being the majority report. Significantly, a member of the Politburo issued a separate report, now popularly referred to as the 'minority report'. All the members of the Politburo were promised some involvement in managing the execution of the programmes suggested, and only a maximum of four did not benefit after the report was issued. This methodology is consistent with Babangida's patron-client political style.\n" +
                "\nOIC membership\n" +
                "           Babangida upgraded Nigeria's role in the Organisation of the Islamic Conference (OIC, now the Organisation of Islamic Cooperation), from an observer status to full-fledged membership. After public outcry and denial by Babangida, the John Shagaya panel was instituted to determine Nigeria's status in the OIC. The panel failed to take an explicit position on the issue, and instead, called for peace and stability within the nation, and the preservation of secularism within Nigeria. Commodore Ebitu Okoh Ukiwe, the first Chief of General Staff-in command, was 'dropped' by Babangida. Ukiwe had been opposed to the registration of Nigeria, a secular country, in the OIC.\n" +
                "Nigeria has never been withdrawn from the OIC and remains a member. Sani Abacha, who overthrew the Interim National Government set up when Babangida was forced out of office again unilaterally registered Nigeria as a member of the D-8 (Developing-8), an organisation for development cooperation among Bangladesh, Egypt, Indonesia, Iran, Malaysia, Nigeria, Pakistan and Turkey. The D-8, an idea proposed by then Prime Minister of Turkey Necmettin Erbakan in October 1996, is a \"cooperation among major Muslim developing countries\".\n" +
                "\n1990 coup attempt\n" +
                "           On 22 April 1990, Babangida's government was almost toppled by a coup attempt led by Major Gideon Orkar. Babangida was at the Dodan Barracks, the military headquarters and presidential residence, when they were attacked and occupied by the rebel troops, but managed to escape by a back route. During the brief interlude during which Orkar and his collaborators controlled radio transmitters in Lagos, they broadcast a vehement critique of Babangida's government, accusing it of widespread corruption and autocratic tendencies, and they also expelled the five northernmost and predominantly Hausa-Fulani Nigerian states from the union, accusing them of seeking to perpetuate their rule at the expense of the predominantly Christian peoples of Nigeria's middle-belt citing, in particular, the political neutralization of the Langtang Mafia.\n";



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
        getMenuInflater().inflate(R.menu.menu_ibrahim_bio, menu);
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
