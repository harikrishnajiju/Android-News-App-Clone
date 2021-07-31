package com.harikrishnajiju.newsappclone;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    ImageView IV2;
    TextView hl, by, bo;
    int[] pic = {R.drawable.news1,R.drawable.news2,R.drawable.news3,R.drawable.news4,R.drawable.news5,R.drawable.news6,R.drawable.news7,R.drawable.news8};
    static String pos;
    int loc;
    String[] headline = {"Queen 'delighted' after Harry and Meghan announce birth of baby girl","My foggy glasses solution helped me through Covid","Phil Foden: Manchester City midfielder Europe's most valuable player, says CIES Football Observatory","Amazon-dwellers lived sustainably for 5,000 years","Dan Evans, Katie Boulter & Harriet Dart win in Nottingham","Euro 2020: How Gareth Southgate restored faith in England’s national team","Donald Trump calls Bitcoin 'a scam against the dollar'","iOS15: Apple continues privacy war with app tracker reports"};
    String[] author = {"By Hazel Shearing\n" + "BBC News","By Dougal Shaw\n" + "Business reporter, BBC News","BBC Sports News","By Victoria Gill\n" + "Science correspondent, BBC News", "BBC Sports News","By Ryan Baldi\n" + "BBC Sport", "By Mary-Ann Russon\n" + "Business reporter, BBC News","By Zoe Kleinman & David Molloy\n" + "Technology reporters"};
    String[] body = {"The Queen is \"delighted\" after the Duke and Duchess of Sussex announced the birth of their second child, Lilibet \"Lili\" Diana Mountbatten-Windsor, Buckingham Palace has said.\n" +
            "\n" + "The Prince of Wales and the Duke of Cambridge also congratulated the couple on social media.\n" +
            "\n" + "The Queen's 11th great-grandchild was born on Friday at a hospital in Santa Barbara, California.\n" +
            "\n" + "Lilibet was the Queen's nickname when she was a child.\n" +
            "\n" + "Buckingham Palace said: \"The Queen, the Prince of Wales and the Duchess of Cornwall, and the Duke and Duchess of Cambridge have been informed and are delighted with the news.\"\n" +
            "\n" + "Prince Charles, Prince Harry's father, and the Duchess of Cornwall tweeted: \"Congratulations to Harry, Meghan and Archie on the arrival of baby Lilibet Diana. Wishing them all well at this special time.\"\n" +
            "\n" + "Prince William and the Duchess and Cambridge said: \"We are all delighted by the happy news of the arrival of baby Lili.\"\n" +
            "\n" + "Prime Minister Boris Johnson sent his \"many congratulations\" to the couple and Labour leader Sir Keir Starmer welcomed the \"wonderful news\".","The pandemic has hit young people's work and career prospects particularly hard. For Alex Wickens, 22, the best response was to start a business designed to tackle a practical problem that has emerged in the era of Covid.\n" +
            "\n" + "It is something many of us will have experienced for the first time, thanks to the pandemic.\n" +
            "\n" + "You put your face mask on to enter a shop and your glasses start fogging up. All of a sudden you can't see the products on the shelf and you're losing your bearings.\n" +
            "\n" + "Alex, from Sussex, noticed this problem working shifts at his local supermarket. He would struggle to read the package labels sometimes, when he was stacking shelves.\n" +
            "\n" + "He hadn't planned to be working in a supermarket, but the pandemic had thrown all his career plans into the air, just when he thought he had his life sorted.\n" +
            "\n" + "He had taken a year off after sixth-form college to figure out exactly what he wanted to do with his life - and realised he wanted to be a commercial pilot. So he took a job at his local supermarket to weather out the pandemic, however long it might last. This brought him enough money to live on, since he lived with his parents.\n" +
            "\n" + "It was at the supermarket he encountered his foggy glasses problem - and he noticed that lots of other customers, who were trying to combine face masks with spectacles, were having the same issue.\n" +
            "\n" + "Covid had created a new problem and if there was a solution, there was a possible business opportunity, he thought.\n" +
            "\n" + "Searching online for a practical remedy he found that all it would take to fix the steamy glasses issue is a simple clip placed at the top of a mask. This secures the top of the seam around the bridge of your nose, ensuring your breath exits away from your glasses. Several small companies make these. He found a firm in Normandy, France that made them to order, using banks of 3D-printers. In his best month he took in nearly £3,000 in revenue - in most he takes around £1,000. He donates 10% of profits to a local charity called Trelis that supports homeless and unemployed people.\n" +
            "\n" + "He's had positive feedback from a variety of customers, from people working on construction sites to fellow key workers in the NHS and supermarkets.","English trio Phil Foden, Marcus Rashford and Mason Greenwood are the most valuable players in Europe's top-five leagues, according to research group CIES Football Observatory.\n" +
            "\n" + "Manchester City's Foden tops the list at 190.2m euros (£163.4m), ahead of Manchester United duo Greenwood (£152.8m) and Rashford (£136.6m).\n" +
            "\n" + "United playmaker Bruno Fernandes (£132.4m) is fifth on the list.\n" +
            "\n" + "Chelsea's Mason Mount, 22, is the 10th highest-priced player at £106.1m." + "Foden, 21, shone during City's triumphant Premier League campaign, his performances earning him the PFA Young Player of the Year award.\n" +
            "\n" + "The versatile attacker also scored three goals and notched three assists to help Pep Guardiola's side reach the Champions League final, which they lost to Chelsea.\n" +
            "\n" + "Greenwood and Rashford were instrumental in helping United finish second in the Premier League and reach the Europa League final, scoring 12 and 21 goals in all competitions respectively.\n" +
            "\n" + "Foden and Rashford are part of England's Euro 2020 squad, but Greenwood was forced to withdraw because of injury.\n" +
            "\n" + "Borussia Dortmund striker Erling Braut Haaland, who scored 41 goals in as many games in the 2020-21 campaign, is the most valuable non-Premier League player at 155.5m euros (£133.5m).",
            "A study that dug into the history of the Amazon Rainforest has found that indigenous people lived there for millennia with \"causing no detectable species losses or disturbances\".\n" +
            "\n" + "Scientists working in Peru searched layers of soil for microscopic fossil evidence of human impact.\n" +
            "\n" + "They found that forests were not \"cleared, farmed, or otherwise significantly altered in prehistory\".\n" +
            "\n" + "The research is published in the journal PNAS. They searched each sediment layer for microscopic plant fossils called phytoliths - tiny records of what grew in the forest over thousands of years. \"We found very little sign of human modification over 5,000 years,\" said Dr Piperno.\n" +
            "\n" + "\"So I think we have a good deal of evidence now, that those off-river forests were less occupied and less modified.\"\n" +
            "\n" + "The scientists say their findings also point to the value of indigenous knowledge in helping us to preserve the biodiversity in the Amazon, for example, by guiding the selection of the best species for replanting and restoration.\n" +
            "\n" + "\"Indigenous peoples have tremendous knowledge of their forest and their environment,\" said Dr Piperno, \"and that needs to be included in our conservation plans\".",
            "Britain's Katie Boulter says she feels stronger than ever as she got her grass-court campaign off to a winning start in Nottingham.\n" +
            "\n" + "The 24-year-old world number 262 beat Maria Camila Osorio Serrano 6-2 6-3 in the first round at an event taking place three weeks before Wimbledon.\n" +
            "\n" + "\"I am getting closer to where I want to be,\" said Boulter, who was ranked in the top 100 before a back injury two years ago.\n" +
            "\n" + "\"I feel my game is in a good place.\"\n" +
            "\n" + "She added: \"I feel stronger than I ever have before and I hope I can go a lot further this year. I want to get my ranking up, that's my number one goal and get back to where I was and push forward from there.\"\n" +
            "\n" + "She is joined in the second round by Harriet Dart, who beat fellow Briton Emma Raducanu 6-3 6-4.\n" +
            "\n" + "Compatriot Francesca Jones was also poised to progress as she led Georgina Garcia Perez 3-1 in the third set, but the Spaniard then required a medical time-out, which resulted in Jones suffering from full body cramps.\n" +
            "\n" + "Jones could not recover from then and was beaten 4-6 6-3 6-4.\n" +
            "\n" + "Meanwhile, in the men's Challenger event in Nottingham, British number one Dan Evans recovered from a set down to beat Australian Thanasi Kokkinakis 4-6 7-6 (7-1) 7-6 (7-5) to advance.",
            "\"One of the main factors I got with Gareth Southgate,\" 42-cap striker Danny Welbeck says of the England manager, \"was he likes to make sure there's a really good culture within the group\".\n" +
            "\n" + "It is a term that is referenced with increasing regularity within the sporting world, one dismissed by detractors as a form of empty business jargon.\n" +
            "\n" + "But not only does Southgate believe in the importance of implementing a strong working culture, it is the central tenet of his management style.\n" +
            "\n" + "Whenever England qualify for a major tournament, frenzied expectation begins to mount. And as the Three Lions prepare for Euro 2020 this month, the customary optimism has rarely been more justified.",
            "Former US President Donald Trump has told Fox Business that he sees Bitcoin as a \"scam\" affecting the value of the US dollar.\n" +
            "\n" + "\"Bitcoin, it just seems like a scam,\" Mr Trump said. \"I don't like it because it's another currency competing against the dollar.\"\n" +
            "\n" + "He added that he wanted the dollar to be \"the currency of the world\".\n" +
            "\n" + "His comments come on the back of news El Salvador plans to make the crypto-currency legal tender.\n" +
            "\n" + "The price of Bitcoin has been falling steadily since early May and so far has not recovered.\n" +
            "\n" + "The falls were widely attributed to China banning banned banks and payment firms from providing services related to crypto-currency transactions, as well as electric car maker Tesla announcing it would no longer accept the currency a week before that.",
            "Apple device users will now be able see when individual apps request to access features such as the microphone, camera and phone gallery, plus which third parties they have connected with in the last seven days.\n" +
            "\n" + "The new \"app privacy report\" feature was unveiled at the firm's annual developers' conference, WWDC.\n" +
            "\n" + "Apple has prioritised privacy lately, including a war on ad-tracking.\n" +
            "\n" + "No new hardware was announced at the event, despite earlier speculation. Privacy\n" +
            "The new privacy report goes further than Apple's existing \"nutrition labels\" which show users what kinds of permissions apps ask for, before they are installed.\n" +
            "\n" + "It will allow users to dive deep into when exactly an app used the permissions it has been given - and what third-party websites it contacted or sent data to. However, there may be a cultural barrier to overcome here, said Ben Wood.\n" +
            "\n" + "\"The ability to share health data with other family members looks an interesting idea on paper, but it is hard to see that many parents would want to share updates with their children,\" he said.\n" +
            "\n" + "There may, for example, be a number of reasons why a person's heart rate increases which are not medical emergencies.\n" +
            "\n" + "Others, like Carolina Milanesi from Creative Strategies, said she could see it being taken up by families who live far away.\n" +
            "\n" + "\"My biggest worry over the pandemic was my mom and asking how she was felt like nagging her,\" she tweeted."};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Bundle extras = getIntent().getExtras();
        pos = extras.getString("position");
        if (pos.contains("Queen")) { loc = 0;}
        if (pos.contains("Covid")) { loc = 1;}
        if (pos.contains("Phil")) { loc = 2;}
        if (pos.contains("Amazon")) { loc = 3;}
        if (pos.contains("Dan")) { loc = 4;}
        if (pos.contains("Euro 2020")) { loc = 5;}
        if (pos.contains("Donald")) { loc = 6;}
        if (pos.contains("iOS15")) { loc = 7;}
        IV2 = findViewById(R.id.imageView2);
        hl = findViewById(R.id.headline);
        by = findViewById(R.id.author);
        bo = findViewById(R.id.body);
        IV2.setImageResource(pic[loc]);
        hl.setText(headline[loc]);
        by.setText(author[loc]);
        bo.setText(body[loc]);
    }
}