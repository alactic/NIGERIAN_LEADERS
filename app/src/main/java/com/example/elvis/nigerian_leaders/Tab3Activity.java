package com.example.elvis.nigerian_leaders;
import android.app.Activity;
import android.content.Context;
import android.database.Cursor;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;



public class Tab3Activity extends Activity {
    String article;
    Context ctx=this;
    TextView ARTICLE;
    Context CTX=this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab3);
        ARTICLE= (TextView) findViewById(R.id.tab_3);

        article = "1862 (January 1): Lagos Island annexed as a colony of Britain\n" +
                  "Mr. H.S Freeman became Governor of Lagos Colony (Jan. 22)\n" +
                "\n1893: Oil Rivers Protectorate renamed Niger Coast Protectorate with Calabar as capital.\n" +
                "\n1890's: British reporter Flora Shaw, who later married Lord Frederick Lugard, suggests  that the country be named \"Nigeria\" after the Niger River.\n" +
                "\n1897: The British overthrew Oba Ovonramwen of Benin, one of the last independent West African kings.\n" +
                "\n1900: The Niger Coast Protectorate, merged with the colony and protectorate of Lagos, was renamed the Protectorate of Southern Nigeria.\n" +
                "\n1914: The northern and southern protectorates were amalgamated to form Nigeria. Colonial officer Frederick Lugard was governor-general.\n" +
                "\n1929 (October): Women in the eastern commercial city of Aba held a rowdy but effective and victorious protest against high taxes and low prices of Nigerian exports.\n" +
                "\n1951: The British decided to grant Nigeria internal self-rule, following an agitation led by the NCNC, Dr Azikiwe’s political party.\n" +
                "\n1954: The position of Governor was created in the three regions (North, West and East) on the adoption of federalism.\n" +
                "\n1958: Nigerian Armed Forces transferred to Federal control. The Nigerian Navy was born.\n" +
                "\n1959: The new Nigerian currency, the Pound, was introduced\n" +
                "\n1959: Northern Peoples Congress (NPC) and Niger Delta Congress (NDC) formed an alliance to contest parliamentary elections.\n" +
                "\n1960 (October 1): Independence. Dr. Nnamdi Azikiwe became Nigeria’s first indigenous Governor General.\n" +
                "\n1960-1966: First Republic of Nigeria under a British parliamentary system. Abubakar Tafawa Balewa was elected Prime Minister.\n" +
                "\n1960: Nigeria's joined with Liberia and Togo in the \"Monrovia Group\", seeking some form of a confederation of African states.\n" +
                "\n1961 (February 11 and 12): After a plebiscite, the Northern Cameroon, which before then was administered separately within Nigeria, voted to join Nigeria. But Southern Cameroon became part of francophone Cameroon.\n" +
                "\n1961 (June 1): Northern Cameroon became Sardauna Province of Nigeria, the thirteenth province of Northern Nigeria as the country’s map assumed a new shape.\n" +
                "\n1961 (October 1): Southern Cameroon ceased to be a part of Nigeria.\n" +
                "\n1962:Following a split in the leadership of the AG that led to a crisis in the Western Region, a state of emergency was declared in the region, and the federal government invoked its emergency powers to administer the region directly. Consequently the AG was toppled as regional power. Awolowo, its leader, and other AG leaders, were convicted of treasonable felony. Awolowo's former deputy and premier of the Western Region formed a new party--the Nigerian National Democratic Party (NNDP)--that took over the government. Meanwhile, the federal coalition government acted on the agitation of minority non-Yoruba groups for a separate state to be excised from the Western Region\n" +
                "\n1963: Nigeria shed the bulk of its political affinity with the British colonial power to become a Republic. Nnamdi Azikiwe became the first President. Obafemi Awolowo leader of the Action Group (AG) became leader of the opposition. The regional premiers were Ahmadu Bello (Northern Region, NPC), Samuel Akintola (Western Region, AG), Michael Okpara (Eastern Region, NCNC). Dennis Osadebey (NCNC) became premier of the Midwestern Region just created out of the old Western region.\n" +
                "\n1964: Prime Minister Balewa’s Northern Peoples Congress (NPC) aligned with a faction of the Action Group (AG) led by Chief Ladoke Akintola, the Nigerian National Democratic Party (NNDP), to form the Nigerian National Alliance (NNA) in readiness for the elections. At the same time, the main Action Group led by Chief Obafemi Awolowo formed an alliance with the United Middle-Belt Congress (UMBC) and Alhaji Aminu Kano's Northern Elements Progressive Union (NEPU) and Borno Youth Movement to form the United Progressive Grand Alliance (UPGA).\n" +
                "\n1965 (November): Violence erupted in the western region, and criticism of the political ruling class created unease in the new republic.\n" +
                "\n1966 (January 15): Junior officers of the Nigerian army, mostly majors overthrew the government in a coup d’etat. The officers, most of whom were Igbo, assassinated Balewa in Lagos, Akintola in Ibadan, and Bello in Kaduna, as well as some senior northern officers. The coup leaders pledged to establish a strong and efficient government committed to a progressive program and eventually to new elections. They vowed to stop the post-electoral violence and stamp out corruption that they said was rife in the civilian administration. General Johnson T. Aguiyi-Ironsi, the most senior military officer, and incidentally an easterner (Igbo), who stepped in to restore order, became the head of state.\n" +
                "\n1966 (May 29): Massive rioting started in the major towns of Northern Nigeria and attack the Igbos and other easterners to avenge the death of many senior northerners in the coup.\n" +
                "\n1966 (July 29): A group of Northern officers and men stormed the Western Region’s governor’s residence in Ibadan where General Aguiyi Ironsi was staying with his host, Lt. Col Adekunle Fajuyi. Both the head of state and governor are killed.\n" +
                "\n1966 (August 1): Lt. Col Yakubu Gowon a fairly junior officer from the north became the new head of state.\n" +
                "\n1967 (January 4): Nigeria's military leaders travelled to Aburi in Ghana to find a solution to problems facing the country and to avert an imminent military clash between the north and the east.\n" +
                "\n1967 (May 30): Lt Col Ojukwu, governor of the east, declared his region the Republic of Biafra.\n" +
                "\n1967 (July 6): First shots were fired heralding a 30-month war between the Federal government and the rebel Republic of Biafra.\n" +
                "\n1970 (January 15): The civil war ended and reconstruction and rehabilitation begin.\n" +
                "\n1971 (April 2): Nigeria switches with amazing smoothness from driving on the left hand side (like Britain) to the left, like all its neighbouring countries.\n" +
                "\n1973 (May): Gowon establishes the National Youth Service Corps Scheme and introduces compulsory one-year service for all university graduates, to promote integration and peace after the war.\n" +
                "\n1974: General Gowon said he could not keep his earlier promise to return power to a democratically elected government in 1976. He announced an indefinite postponement of a programme of transition to civil rule.\n" +
                "\n1975 (October): Gowon was overthrown in a coup, on the anniversary of his ninth year in office. Brigadier (later General) Murtala Mohammed, the new head of state promised a 1979 restoration of democracy.\n" +
                "\n1976: The federal government adhering to the recommendations of a panel earlier set up to advise it, approves the creation of a new Federal Capital Territory, Abuja, away from Lagos.\n" +
                "\n1976 (February 13): Murtala Mohammed was killed in the traffic on his way to work. But the coup executed by an easy-going physical education corps Lt colonel, and heralded by a quixotic announcement on the radio, was botched.\n" +
                "\n1976 (February 14): General Mohammed is succeeded by General Olusegun Obasanjo who pledged to pursue his predecessor’s transition programme.\n" +
                "\n1976 (September 2): The Universal Primary Education Scheme (UPE) was introduced, making education free and compulsory in the country.\n" +
                "\n1977: Nigeria hosted FESTAC the festival of arts and culture drawing black talent and civilization from around the world.\n" +
                "\n1979: Nigeria got a new constitution.\n" +
                "\n1979 (October 1): General Obasanjo handed over to Alhaji Shehu Shagari as first elected executive President and the first politician to govern Nigeria since 1966. Five parties had competed for the presidency, and Shagari of the National Party of Nigeria (NPN) was declared the winner. The other parties were: Unity Party of Nigeria (UPN), National People’s Party (UPN), Great Nigeria People’s Party (GNPP), People’s Redemption Party (PRP)\n" +
                "\n1983: The conduct of the general elections was criticised by opposing parties and the media. Violent erupted in some parts of the west.\n" +
                "\n1983(September): Shagari was re-elected president of Nigeria in August-September 1983.\n" +
                "\n1983(December 31): Following a coup d’etat, the military returned to power.  Major-General Muhammadu Buhari was named head of state.\n" +
                "\n1985 (August 27): Following accusations of callousness and overzealousness, Buhari was overthrown in a palace coup. The army chief, General Ibrahim Babangida took over power.\n" +
                "\n1986:  The seat of government was officially moved from Lagos to Abuja\n" +
                "\n1993 (June 12): After several postponements by the military administration, presidential elections were held. Businessman and newspaper publisher Moshood Abiola of the SDP took unexpected lead in early returns.\n" +
                "\n1993 (June 23): Babangida on national television offered his reasons for annulling the results of the Presidential election. At least 100 people were killed in riots in the southwest, Abiola's home area.\n" +
                "\n1993 (August 26): Under severe opposition and pressure, Babangida resigned as military president and appointed an interim government headed by Chief Ernest A. Shonekan.\n" +
                "\n1993 (October): A ragtag group of young people under the name of Movement for the Advancement of Democracy  (MAD) hijacked a Nigerian airliner to neighbouring Niger in order to protest official corruption. Nigerian troops stormed liberated the plane at the N’djamena airport, Republic of Niger.\n" +
                "\n1993 (November 17): General Sani Abacha, defence minister in the interim government and most senior officer, seized power from Shonekan, abolishes the constitution.\n" +
                "\n1994: Abiola, who had escaped abroad after the annulment, returned and proclaimed himself president. He was arrested and charged with treason.\n" +
                "\n1995 (July): Former head of state, Obasanjo was sentenced to 25 years in prison by a secret military tribunal for alleged participation in an attempt (widely believed to have been fictional) to overthrow the government.\n" +
                "\n1996 (May): Nnamdi Azikiwe, Nigeria's first president, died.\n" +
                "\n1998 (June 8): General Abacha died suddenly and mysteriously. The official cause of death: heart attack. Nigerians swarmed the streets rejoicing.\n" +
                "\n1998 (June 9): Gen. Abdulsalaam Abubakar was named Nigeria's eighth military ruler. He promised to restore civilian rule promptly.\n" +
                "\n1998: A month after General Abacha's death the United Nations General-Secretary Kofi Annan arrived in Nigeria to conclude deals for the release of Chief Abiola.\n" +
                "\n1998 (July 7): Abiola died in detention of a heart disease, a week after Annan’s visit, before he could be released in a general amnesty for political prisoners. Rioting in Lagos led to over 60 deaths.\n" +
                "\n1998 (July 20): Abubakar promised to relinquish power on May 29, 1999.\n" +
                "\n1999 (February 15): Former military ruler Obasanjo won the presidential nomination of the Peoples Democratic Party (PDP).\n" +
                "\n1999 (May): A new Constitution was adopted. It was based on the 1979 Constitution.\n" +
                "\n1999 (May 29): Former Military Head of State, Olusegun Obasanjo, was sworn in as Nigeria's democratically elected civilian President.";



        DatabaseOperations DB = new DatabaseOperations(ctx);
        DB.putInfomation2(DB, article);

        DatabaseOperations DOP = new DatabaseOperations(CTX);
        Cursor CR = DOP.getInformation2(DOP);
        CR.moveToLast();
        String NAME = "";
        NAME = CR.getString(0);

        ARTICLE.setText(NAME);


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_tab3, menu);
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
