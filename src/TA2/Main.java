package TA2;

import javax.swing.*;


public class Main {
    static Würfel w100=new Würfel();
    //Raumverzeichnis
     static Raum eingangshalle = new Raum("Eingangshalle", "Du befindest dich in einem dunklem Raum.", "Du bist zurück in dem in der Eingangshalle in der du aufgewacht bist.", "Eingangshalle(EG)");
     static Raum küche = new Raum("Küche", "Etwas Licht scheint durch die Fenster und du siehst eine Küche vor dir.", "Du betrittst die Küche.", "Küche(EG)");
     static Raum esszimmer = new Raum("Esszimmer", "Du betrittst ein großes Esszimmer, indem wohl schon länger niemand mehr war.", "Du stehst wieder im Speisezimmer", "Esszimmer(EG)");
     static Raum garten = new Raum("Garten", "Du hast es in den Garten hinter dem Haus geschafft.", "Du befindest dich wieder im Garten.","Garten(draußen)");
     static Raum vorraum = new Raum("kleiner Flur", "Du kommst in einen kleinen Flur von dem vier Türen abgehen.", "Du betrittst den Zwischenraum.","Vorraum Bibliothek (EG)");

     static Raum kapelle = new Raum("Kapelle", "Bedächtig gehst du in die Mitte des Raums, er ist voll von Skeletten. UND LEICHEN!?", "Du fühlst dich unwohl wieder in die Kapelle gegangen zu sein.", "Kapelle(draußen versteckt)");
     static Raum flurEG = new Raum("Flur Erdgeschoss", "Du hast ein ganz mulmiges Gefühl besonders als du Blut auf dem Boden siehst.","Du betrittst wieder den dir viel zu engen Flur. Scheiß Klaustorphobie.","Flur (EG)");
     static Raum albtraumRaum = new Raum("Albtraumraum","Plötzlich dreht sich alles um dich und die Schatten bewegen sich.","Wieder beginnt sich alles zu drehen.","Albtraumraum(EG)");
     static Raum tresorRaum = new Raum("Tresorraum", "Du befindest dich im geheimen Tresorraum. Welcher Depp hat denn die Türe offen gelassen?!", "Du bist wieder im Tresorraum. Hast du dich etwa verlaufen? ...", "Tresorraum(EG)");
     static Raum wohnzimmer = new Raum("Wohnzimmer", "Du betrittst endlich mal einen gemütlichen Raum: Sofas, Sessel, Bilder. Einfach angenehm.","Endlich zurück im kleinen Wohnzimmer. Der Couch sieht verlockend aus,aber dafür hast du doch eigentlich keine Zeit...", "(Wohnzimmer(EG)");
     static Raum flurOG= new Raum("Flur Obergeschoss","Du stehst in einem großen Flur mit vielen Türen. Da staunst du wie groß das Gebäude wirklich ist.", "Du schaust dich im Flur um.","Flur(OG)");
     static Raum arena= new Raum("Arena Raum", "Du stehst in einem runden Raum und vor dir eine große Imposante Statue... die sich bewegt!","Du betrittst den Arena-Raum.","ArenaRaum(OG)");
     static Raum beschwörkammer= new Raum("Kammer der Beschwörung", "Ein Raum mit roten Kreisen auf dem Boden, das kann ja nur gut laufen","Wilkommen zurück im Raum für satanistische Anfänger *Ironie*","Beschwör-Kammer (OG)");
     static Raum badezimmer = new Raum("Badezimmer","Du betrittst ein weiß gekachelten Raum. Dusche, Wc, Waschbecken. Ein Badezimmer.", "Du stehst im Badezimmer.","Badezimmer(OG/UG)");
     static Raum teezimmer = new Raum("Teezimmer","Du betrittst den Raum. Du bist sehr überrascht als dieser sich als Teezimmer entpuppt. Mit einem kleinen Springenbrunnen, Holzschränkchen und freundlichen beigen Wänden.","Du schreitest wieder in das Teezimmer, was dir neu aufällt sind die hübschen Blumen an der Decke. Super Relevant :)","Teeservierraum(OG)");
     static Raum hinterDemBild = new Raum("-Hinter dem Bild- Raum","Du beginnst dich zu fangen nachdem du etwas taumelst und siehst dich um.","Dir fährt eine Gänsehaut über den Rücken.","Ein Raum hinter dem Bild (OG versteckt)");
     static Raum gemächer= new Raum("Gemächer der Hexe","Du befindest dich in einem alten Arbeitszimmer mit Bett und allerlei Dingen an den Wänden aufgereiht. Kolben, Kräuter usw.", "Das Zimmer Arbeitszimmer scheint auch bewohnt gewesen zu sein","Schlafgemach Hexe (OG versteckt");

     static Raum vorgarten= new Raum("Vorgarten", "Du trittst raus an die freie Luft, das tut gut.","Du hast das Haus wieder verlassen und denoch hast du mal wieder das Gefühl das nicht wirklich. Täuscht es vielleicht diesmal?","draußen");
     static Raum bibliothek= new Raum("Bibliothek","Du trittst in eine Bibliothek, die Wände sind voll von Bücheregalen.","Du betrittst die Bibliothek.","Bibliothek(EG)");

    //Schlüssel
    static Gegenstand goldenerSchlüssel = new Gegenstand("goldener Schlüssel",true,true,küche,false,true);
    static Gegenstand modernerSchlüssel = new Gegenstand("moderner Schlüssel",true,true,gemächer,true, true);
    static Gegenstand bronzeschlüssel = new Gegenstand("Bronzeschlüssel",true,true,hinterDemBild,true, true);
    static Gegenstand alterSchlüssel = new Gegenstand("alter Schlüssel",true,true,arena,true, true);
    static AktionSammeln sammleGoldenerSchlüssel = new AktionSammeln("", true, true, "", "", goldenerSchlüssel);
    static AktionSammeln sammleModernerSchlüssel = new AktionSammeln("", true, true, "", "", modernerSchlüssel);
    static AktionSammeln sammleBronzeSchlüssel = new AktionSammeln("", true, true, "", "", bronzeschlüssel);
    static AktionSammeln sammleAlterSchlüssel = new AktionSammeln("", true, true, "", "", alterSchlüssel);


    static TA2.AktionTür türEingangshalleKüche = new TA2.AktionTür("",true,false,"Du erkennst eine große Holztüre. Ob sie wohl aufgeht?","Die Türe ist sehr schwerfällig, aber lässt sich öfnnen",eingangshalle,küche);
     static TA2.AktionTreppe treppe1EG = new TA2.AktionTreppe("",false,true,"Nutze die Treppe?","Du gehst die Treppe hoch",eingangshalle,flurOG);
     static TA2.AktionTür türEingangshalleBadezimmer = new TA2.AktionTür("",true,false,"Mysteriöse weiße Tür öffnen?","Du öffnest vorsichtig die Tür.",eingangshalle,badezimmer);
     static TA2.TürBadezimmer türFlurOGBadezimmer = new TA2.TürBadezimmer("",true,true,"Die weiße Türe kommt dir bekannt vor. Magst du sie öffnen?","Du gehst bedächtig zu der Tür. Die Türe geht leicht auf.",flurOG,badezimmer);
     static TA2.AktionTreppe treppe2EG = new TA2.AktionTreppe("",true,true,"Nutze die massive Steintreppe","Vorsichtig nutzt du die Treppe. Stürzen mag niemand!",flurEG,flurOG);
     static TA2.AktionTür türKücheEsszimmer = new TA2.AktionTür("",true,true,"Ein Durchgang führt durch die Küche in einen weiteren Raum. Gehe dort hin","Du gehst durch den Durchgang in der Küche in den nächsten Raum",küche,esszimmer);
     static TA2.AktionTürBrauchtGegenstand türEsszimmerGarten = new TA2.AktionTürBrauchtGegenstand("",true,true,"Eine kleine Türe, vielleicht ein Ausgang?","Du reißt die Türe auf.",esszimmer,garten,bronzeschlüssel);
     static TA2.AktionTür türGartenKapelle = new TA2.AktionTür("",true,true,"Eine große mächtige Kappelle, die gar nicht in den Garten passt. Versuche die Holztüre zu öffnen","Die Türe öffnet sich träge und schlechte Luft schlägt dir entgegen.",garten,kapelle);
     static TA2.AktionTür türEsszimmerVorraum = new TA2.AktionTür("",true,true,"Öffne Tür im hinterem Teil des Raumes","Die Türe geht auf und du gehst durch.",esszimmer,vorraum);
     static TA2.AktionTür türVorraumBibliothek = new TA2.AktionTür("",true,true,"Öffne die verzierte Holztüre an der Wand. Was wohl dahinter liegt?","",vorraum,bibliothek);
     static TA2.AktionTür türVorraumFlurEG = new TA2.AktionTür("",true,true,"Öffne die große massive Holztüre.","Öffne die massive Tür",vorraum,flurEG);
     static TA2.AktionTürBrauchtGegenstand türFlurEGAlbtraumraum = new TA2.AktionTürBrauchtGegenstand("",true,true,"Eine glatte Schwarzetüre. 'Öffne mich schreit' sie dir zu. Öffnest du sie?","Die Türe ist so faszinierten. Du fühlst fast einen Sog während du sie öffnest.",flurEG,albtraumRaum,alterSchlüssel);
     static TA2.AktionTürBrauchtGegenstand türEingangshalleVorgarten = new TA2.AktionTürBrauchtGegenstand("",true,true,"Die Konturen zeigen eine massive Türe. Versuche sie zu öffnen.","Die Eingangstüre öffnet sich.",eingangshalle,vorgarten,goldenerSchlüssel);
     static TA2.AktionTür türFlurEGWohnzimmer = new TA2.AktionTür("",true,true,"Schlichte Tür am Flurende versuchen zu öffnen.","Die Türe schwingt lautlos auf.",flurEG,wohnzimmer);
     static TA2.AktionTür türFlurOGArena = new TA2.AktionTür("",true,true,"Türe mit Schwertsymbol öffnen.","",flurOG,arena);
     static TA2.AktionTür türFlurOGTeezimmer = new TA2.AktionTür("",true,true,"Schlichte Holztüre, man hört leises plätschern. Öffnen?","",flurOG,teezimmer);
     static TA2.AktionTür türFlurOGBeschwörerraum = new TA2.AktionTür("",true,true,"Türe auf der rechten Seite versuchen zu öffnen","Du öffnest die Tür",flurOG,beschwörkammer);
     static TA2.AktionTür türFlurOGGemächer = new TA2.AktionTür("",true,true,"Durch die geheime Tür gehen die man nicht sieht","Das das klappt hättest nichtmal du gedacht",flurOG,gemächer);
     static TA2.AktionTür türTeeZimmerHinterDemBild = new TA2.AktionTür("",true,true,"Gegen das Bild in der Mitte des Raum rennen?","Du rennst mit voller Geschwindigkeit in Richtung Wand.",teezimmer,hinterDemBild);
     static TA2.AktionTür türAlbtraumraumTresorRaum = new TA2.AktionTür("", true, true,"Den geheimen Tresorraum öffnen?", "Du öffnest den Tresorraum. Welcher Depp hat denn die Türe offen stehen lassen?!", albtraumRaum, tresorRaum);






    //Feuermacher
     static Gegenstand streichölzer = new Gegenstand("Streichhölzer",true,true,flurOG,true, true,false,false,false,false,true);
     static Gegenstand feuerzeug = new Gegenstand("Feuerzeug",true,true,vorgarten,true, true,false,false,false,false,true);
     static AktionSammeln sammleStreichhölzer = new AktionSammeln("", true, true, "", "", streichölzer);
     static AktionSammeln sammleFeuerzeug = new AktionSammeln("", true, true, "", "", feuerzeug);
    //Massives
     static Gegenstand axt = new Gegenstand("Axt",true,true,küche,true, true,false,false,false,false,false, true);
     static Gegenstand schwert = new Gegenstand("Schwert",true,true,null,true, true,false,false,false,false,false, true);
     static Gegenstand schwert2 = new Gegenstand("Schwert",true,true,null,true, true,false,false,false,false,false, true);
     static Gegenstand eisenstange = new Gegenstand("Eisenstange",true,true,garten,true, true,false,false,false,false,false, true);
     static Gegenstand massivesHolzbrett = new Gegenstand("massives Holzbrett",true,true,null,true, true,false,false,false,false,false, true);
     static Gegenstand improvisierterSpeer = new Gegenstand("improvisierter Speer",true,true,null,true, true,false,false,false,false,false, true);
     static AktionSammeln sammleAxt = new AktionSammeln("", true, true, "", "", axt);
     static AktionSammeln sammleSchwert = new AktionSammeln("", true, true, "", "", schwert);
     static AktionSammeln sammleSchwert2 = new AktionSammeln("", true, true, "", "", schwert2);
     static AktionSammeln sammleEisenstange = new AktionSammeln("", true, true, "", "", eisenstange);
     static AktionSammeln sammleMassivesHolzbrett = new AktionSammeln("", true, true, "", "", massivesHolzbrett);
     static AktionSammeln sammleImprovisierterSpeer = new AktionSammeln("", true, true, "", "", improvisierterSpeer);


    //Trinkbares
     static Gegenstand wasser= new Gegenstand("Wasser",true,true,badezimmer,true,false,true);
     static Gegenstand leeresGlas = new Gegenstand("leeresGlas",true,true,null,true,true);
     static Gegenstand glasMitWasser= new Gegenstand("Glas gefüllt mit Wasser",true,true,küche,true,true,true);
     static Gegenstand flascheWein= new Gegenstand("Flasche mit Wein",true,true,wohnzimmer,true,true,true);
     static Gegenstand ColaFlasche= new Gegenstand("Cola",true,true,null,true,true,true);
     static AktionTrinken trinkeWasser = new AktionTrinken("", true, true, "", "", wasser);
     static Gegenstand flasche = new Gegenstand("Flasche",true,true,null,true,true);
     static Gegenstand flasche2 = new Gegenstand("Flasche",true,true,null,true,true);
     static AktionTrinkenMitRest trinkeWasserGlas = new AktionTrinkenMitRest("", true, true, "", "", glasMitWasser, leeresGlas);
     static AktionTrinkenMitRest trinkeFlaschWein = new AktionTrinkenMitRest("", true, true, "", "", flascheWein, flasche);
     static AktionTrinkenMitRest trinkeFlascheCola = new AktionTrinkenMitRest("", true, true, "", "", ColaFlasche, flasche2);

     static Gegenstand vaseMitWasser = new Gegenstand("Vase gefüllt mit Wasser",true,true,esszimmer,true,false,true,false,true);
     static Gegenstand vase = new Gegenstand("Vase",true,true,null,true,false,false,false,true);
     static AktionTrinkenMitRest trinkeVaseMitRest = new AktionTrinkenMitRest("", true, true, "", "", vaseMitWasser, vase);
    //Gegenstände zum nutzen und mitnehmen
     static Gegenstand besenstiel = new Gegenstand("Besenstiel",true,true,null,true,true);
     static Gegenstand klebeband = new Gegenstand("Klebeband",true,true,badezimmer,true,true);
     static Gegenstand speerspitze = new Gegenstand("Speerspitze",true,true,gemächer,true,true);

     static Gegenstand tomatensoßendose = new Gegenstand("Tomatensoßendose",true,true,null,true,true);
     static Gegenstand halbeLeiter2 = new Gegenstand("halbe Leiter",true,true,vorgarten,true,true);
     static Gegenstand halbeLeiter = new Gegenstand("halbe Leiter",true,true,garten,true,true);
     static Gegenstand leiter = new Gegenstand("Leiter",true,true, null,true,true);
     static Gegenstand metallschrott = new Gegenstand("Metalschrott",true,true,null,true,true);
     static AktionSammeln sammleBesenstiel = new AktionSammeln("", true, true, "", "",besenstiel);
     static AktionSammeln sammleKlebeband = new AktionSammeln("", true, true, "", "",klebeband);
     static AktionSammeln sammleSpeerspitze = new AktionSammeln("", true, true, "", "",speerspitze);
     static AktionSammeln sammleFlasche = new AktionSammeln("", true, true, "", "",flasche);
     static AktionSammeln sammleLeeresGlas = new AktionSammeln("", true, true, "", "",leeresGlas);
     static AktionSammeln sammleTomatensoßendose = new AktionSammeln("", true, true, "", "", tomatensoßendose);
     static AktionSammeln sammleHalbeLeiter2 = new AktionSammeln("", true, true, "", "", halbeLeiter2);
     static AktionSammeln sammleHalbeLeiter = new AktionSammeln("", true, true, "", "", halbeLeiter);
     static AktionSammeln sammleLeiter = new AktionSammeln("", true, true, "", "", leiter);
     static AktionSammeln sammleMetallschrott = new AktionSammeln("", true, true, "", "", metallschrott);

     static AktionSammeln sammleGlas = new AktionSammeln("", true, true, "", "",glasMitWasser);


    //essbares
     static Gegenstand schinken = new Gegenstand("Schinken",true,true,küche,true,true,false,true);
     static Gegenstand apfel = new Gegenstand("Äpfel",true,true,küche,true,true,false,true);
     static Gegenstand kekse = new Gegenstand("Kekse",true,true,esszimmer,true,true,false,true);
     static Gegenstand tomatensoße = new Gegenstand("Tomatensoße",true,true,null,true,true,false,true);
     static Gegenstand handVollChips = new Gegenstand("eine Handvoll Salt&Vinger-Chips",true,true,wohnzimmer,true,true,false,true);
     static AktionEssen esseSchinken = new AktionEssen("", true, true, "", "", schinken);
     static AktionEssen esseApfel = new AktionEssen("", true, true, "", "", apfel);
     static AktionEssen esseKekse = new AktionEssen("", true, true, "", "", kekse);
     static AktionEssen esseTomatensoße = new AktionEssen("", true, true, "", "", tomatensoße);
     static AktionEssen esseHandVollChips = new AktionEssen("", true, true, "", "", handVollChips);
     static AktionSammeln sammleSchinken = new AktionSammeln("", true, true, "", "", schinken);
     static AktionSammeln sammleApfel = new AktionSammeln("", true, true, "", "", apfel);
     static AktionSammeln sammleKekse = new AktionSammeln("", true, true, "", "", kekse);
     static AktionSammeln sammleTomatensoße = new AktionSammeln("", true, true, "", "", tomatensoße);
     static AktionSammeln sammleHandVollChips = new AktionSammeln("", true, true, "", "", handVollChips);

    //TIMETRAVEL



    //Zerstörbares
     static Gegenstand schrank = new Gegenstand("Schrank",true,true,teezimmer,true,false,false,false,true);
     static Gegenstand truhe = new Gegenstand("Truhe",true,true,arena,true,false,false,false,true);
     static Gegenstand besen= new Gegenstand("Besen",true,true,esszimmer,true,false,false,false,true);
     static AktionZerstörenMitRest zerstöreSchrank = new AktionZerstörenMitRest("", true, true,"", "", schrank, massivesHolzbrett);
     static AktionZerstören zerstöreTruhe = new AktionZerstören("", true, true, "", "", truhe);
     static AktionZerstörenMitRest zerstöreBesen = new AktionZerstörenMitRest("", true, true, "", "", besen, besenstiel);
     static AktionZerstören zerstöreVase = new AktionZerstören("", true, true,"", "", vase);

     static AktionZusammenbasteln bastleSpeer = new AktionZusammenbasteln("",true,true,"","",besenstiel,klebeband,speerspitze,improvisierterSpeer);
     static AktionZusammenbasteln bastleLeiter = new AktionZusammenbasteln("",true,true,"","",halbeLeiter,halbeLeiter2,leiter);

     //Coolemagiche gegenstände
     static Gegenstand blutstein_1= new Gegenstand("blutstein_1",true,true,bibliothek,true,true);
     static Gegenstand blutstein_2= new Gegenstand("blutstein_2",true,true,tresorRaum,true,true);
     static Gegenstand blutstein_3= new Gegenstand("blutstein_3",true,true,hinterDemBild,true,true);
     static Gegenstand magischeKugel_1= new Gegenstand("magischeKugel_1",true,true,hinterDemBild,true,true);
     static Gegenstand magischeKugel_2= new Gegenstand("magischeKugel_2",true,true,kapelle,true,true);
     static Gegenstand magischeKugel_3= new Gegenstand("magischeKugel_3",true,true,bibliothek,true,true);
     static Gegenstand magischeKugel_4= new Gegenstand("magischeKugel_4",true,true,kapelle,true,true);
     static Gegenstand magischeKugel_5= new Gegenstand("magischeKugel_5",true,true,arena,true,true);
     static Gegenstand magischeKugel_6= new Gegenstand("magischeKugel_6",true,true,albtraumRaum,true,true);
     static Gegenstand großemagischeKugel_1= new Gegenstand("großemagischeKugel_1",true,true,null,true,true);
     static Gegenstand großemagischeKugel_2= new Gegenstand("großemagischeKugel_2",true,true,null,true,true);
     static Gegenstand übermächtigemagischeKugel= new Gegenstand("übermächtigemagischeKugel",true,true,null,true,true);




     static ASammelBlutstein blutstein_1_sammeln = new ASammelBlutstein("Blutstein 1 Sammeln",true,true,"Blutstein I aufheben","Du Hebst den 1. Blutstein auf",blutstein_1);
     static AktionSammeln blutstein_2_sammeln = new AktionSammeln("Blutstein 2 Sammeln",true,true,"Blutstein II aufheben","Du Hebst den 2. Blutstein auf",blutstein_2);
     static AktionSammeln blutstein_3_sammeln = new AktionSammeln("Blutstein 3 Sammeln",true,true,"Blutstein III aufheben","Du Hebst den 3. Blutstein auf",blutstein_3);
     static AktionSammeln magischeKugel_1_sammeln = new AktionSammeln("Magischekugel 1 Sammeln",true,true,"Magischekugel I aufheben","Du Hebst die 1. Magischekugel auf",magischeKugel_1);
     static AktionSammeln magischeKugel_2_sammeln = new AktionSammeln("Magischekugel 2 Sammeln",true,true,"Magischekugel II aufheben","Du Hebst die 2. Magischekugel auf",magischeKugel_2);
     static AktionSammeln magischeKugel_3_sammeln = new AktionSammeln("Magischekugel 3 Sammeln",true,true,"Magischekugel III aufheben","Du Hebst die 3. Magischekugel auf",magischeKugel_3);
     static AktionSammeln magischeKugel_4_sammeln = new AktionSammeln("Magischekugel 4 Sammeln",true,true,"Magischekugel VI aufheben","Du Hebst die 4. Magischekugel auf",magischeKugel_4);
     static AktionSammeln magischeKugel_5_sammeln = new AktionSammeln("Magischekugel 5 Sammeln",true,true,"Magischekugel V aufheben","Du Hebst die 5. Magischekugel auf",magischeKugel_5);
     static AktionSammeln magischeKugel_6_sammeln = new AktionSammeln("Magischekugel 6 Sammeln",true,true,"Magischekugel VI aufheben","Du Hebst die 6. Magischekugel auf",magischeKugel_6);

     static AktionZusammenbasteln großemagischeKugel_1_basteln=new AktionZusammenbasteln("GroßemagischeKugel I basteln",true,true,"3Magische Kugeln zur Großenmagischenkugel I umwandeln"," Du wandelst Magischekugel I, II & III in GroßemagischeKugel1 um",magischeKugel_1,magischeKugel_2,magischeKugel_3,großemagischeKugel_1);
     static AktionZusammenbasteln großemagischeKugel_2_basteln=new AktionZusammenbasteln("GroßemagischeKugel II basteln",true,true,"3Magische Kugeln zur Großenmagischenkugel II umwandeln"," Du wandelst Magischekugel VI, V & VI in GroßemagischeKugel2 um",magischeKugel_4,magischeKugel_5,magischeKugel_6,großemagischeKugel_2);
     static AktionBesonderesZusammenbasteln übermachtigmagischeKugel_basteln=new AktionBesonderesZusammenbasteln("Übermachtigmagische Kugel basteln",true,true,"2 Großemagische Kugeln zur Übermächtigmagischenkugel umwandeln"," Du wandelst Großemagischekugel I & II in übermächtigmagischeKugel um",großemagischeKugel_1,großemagischeKugel_2,übermächtigemagischeKugel);
    //Einzelaktionen

    static ALichtschalter aLichtschalter= new ALichtschalter(eingangshalle);
    static AOfen aOfen= new AOfen(küche);
    static AHandy aHandy= new AHandy(eingangshalle);
    static  AKaempfe aKaempfeA = new AKaempfe(arena);
    static  AKaempfe aKaempfeB = new AKaempfe(bibliothek);
    static AFlucht aFluchtA = new AFlucht(arena);
    static  AFlucht aFluchtB = new AFlucht(bibliothek);
    static ARuestung aRuestungA = new ARuestung(arena);
    static ARuestung aRuestungB = new ARuestung(bibliothek); //wie füge ich flucht funktion hinzu????

    static AStart1 start1=new AStart1();

    static ARucksackAufheben aRucksackAufheben= new ARucksackAufheben();

    //Ereignisse
    static Ereignisse gewonnen= new Ereignisse("Sieg",false);
    static Ereignisse bosskampf=new Ereignisse("Boss", true);
    static Ereignisse frei=new Ereignisse("Frei", false);
    static Ereignisse hausSauer=new Ereignisse("Haus im Blutrausch", false);
    static Ereignisse gestorben=new Ereignisse("Du bist gestorben", false);

    //Action Enemy Flows
    static EAFBoss1 eafBoss1=new EAFBoss1();
    static EAFBoss2 eafBoss2=new EAFBoss2();

    static AEntkommen entkommen=new AEntkommen(vorgarten);
    //Listen
    private static Gegenstand[] gegenstandsListe= {goldenerSchlüssel,vase,besen,truhe,schrank,handVollChips,tomatensoße,kekse,apfel,schinken,metallschrott,leiter,halbeLeiter,halbeLeiter2,tomatensoßendose,leeresGlas,flasche,speerspitze,klebeband,besenstiel, vaseMitWasser,ColaFlasche,flascheWein,glasMitWasser,wasser,modernerSchlüssel,bronzeschlüssel,alterSchlüssel,feuerzeug,streichölzer,axt,schwert,schwert2,eisenstange,improvisierterSpeer,massivesHolzbrett, blutstein_1, blutstein_2, blutstein_3, magischeKugel_1,magischeKugel_2,magischeKugel_3,magischeKugel_4,magischeKugel_5,magischeKugel_6,übermächtigemagischeKugel,großemagischeKugel_1,großemagischeKugel_2};
    private static TA2.Raum[] raumListe = {eingangshalle, küche, esszimmer, garten, vorraum, kapelle, flurEG, albtraumRaum, wohnzimmer, flurOG, arena, beschwörkammer, badezimmer, teezimmer, hinterDemBild, gemächer, vorgarten, bibliothek, tresorRaum};
    private static AktionOberklasse[] aktionsListe={türAlbtraumraumTresorRaum,türEingangshalleKüche,türEingangshalleBadezimmer,türEingangshalleVorgarten,türFlurOGBadezimmer,türFlurEGAlbtraumraum,türEsszimmerGarten,türEsszimmerVorraum,türFlurEGWohnzimmer,türFlurOGArena,türFlurOGBeschwörerraum,türFlurOGGemächer,türFlurOGTeezimmer,türGartenKapelle,türKücheEsszimmer,türTeeZimmerHinterDemBild,türVorraumBibliothek,türVorraumFlurEG,treppe1EG,treppe2EG,sammleGoldenerSchlüssel,
    sammleBronzeSchlüssel,sammleAlterSchlüssel, sammleAxt,sammleBesenstiel,sammleEisenstange,sammleFeuerzeug,sammleFlasche,sammleHalbeLeiter,sammleHalbeLeiter2,sammleImprovisierterSpeer,sammleKlebeband,sammleLeeresGlas,sammleLeiter,sammleMassivesHolzbrett,sammleMetallschrott,sammleModernerSchlüssel,sammleSchwert,sammleSchwert2,sammleSpeerspitze,sammleStreichhölzer,sammleTomatensoßendose,
    zerstöreSchrank,zerstöreBesen,zerstöreTruhe,zerstöreVase,bastleSpeer,esseApfel,esseKekse,esseSchinken,esseTomatensoße,esseHandVollChips,trinkeFlascheCola,trinkeFlaschWein,trinkeVaseMitRest,trinkeWasser,trinkeWasserGlas,
            aLichtschalter,aHandy, aRuestungA, aRuestungB, aOfen,sammleSchinken,sammleApfel,sammleKekse,sammleHandVollChips,sammleTomatensoße, aKaempfeA,aKaempfeB, sammleGlas, aRucksackAufheben, start1, aFluchtA, aFluchtB,
    eafBoss1,eafBoss2,blutstein_1_sammeln,blutstein_2_sammeln,blutstein_3_sammeln,magischeKugel_1_sammeln,magischeKugel_2_sammeln,magischeKugel_3_sammeln,magischeKugel_4_sammeln,magischeKugel_5_sammeln,magischeKugel_6_sammeln,großemagischeKugel_1_basteln,großemagischeKugel_2_basteln,übermachtigmagischeKugel_basteln,bastleLeiter,entkommen};
    private Ereignisse[] ereignisListe ={};

    //Verwaltungen
    static TA2.VerwaltungRaum rv= new VerwaltungRaum(eingangshalle);

    static TA2.VerwaltungGegenstände gv = new VerwaltungGegenstände(gegenstandsListe);

    static VerwaltungAktionen av= new VerwaltungAktionen(aktionsListe);

    static VerwaltungZeit zv=new VerwaltungZeit();

    static JFrame frame = new JFrame("Das Haus");






    public static void main(String[] args) {
        spieler();
        //bot();





    }

    public static void spieler(){updateAll();
        frame.setContentPane(new Auswahl().maintest);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);


    }

    public static void bot(){
        spiele();
    }

    public static void spiele(){
        for(int i=0; i<20; i++){
            try {

                updateAllBot();

                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
        }


    }

    public static void updateAll(){
        gv.update();
        av.update();

        //Abbruchbedingung
        if(gewonnen.isAktiv()||gestorben.isAktiv()){
            frame.dispose();

        }



    }

    public static void updateAllBot(){
        gv.update();
        av.update();

        //Abbruchbedingung
        if(gewonnen.isAktiv()||gestorben.isAktiv()){
            frame.dispose();

        }



        int rand=(int)(Math.random() * av.anzahlaktiveaktionen()) ;
        av.gibAktiveAktionen()[rand ].ausführen();

    }



}
