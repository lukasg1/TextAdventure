package TA2;

import TA2.VerwaltungRaum;
import TextAdventure.AktionTreppe;
import TextAdventure.AktionTür;

public class Main {
    //Raumverzeichnis
    private static Raum eingangshalle = new Raum("Eingangshalle", "Du befindest dich in einem dunklem Raum.", "Du bist zurück in dem in der Eingangshalle in der du aufgewacht bist.", "Eingangshalle(EG)");
    private static Raum küche = new Raum("Küche", "Etwas Licht scheint durch die Fenster und du siehst eine Küche vor dir.", "Du betrittst die Küche.", "Küche(EG)");
    private static Raum esszimmer = new Raum("Esszimmer", "Du betrittst ein großes Esszimmer, indem wohl schon länger neimand mehr war.", "Du stehst wieder im Speisezimmer", "Esszimmer(EG)");
    private static Raum garten = new Raum("Garten", "Du hast es in den Garten hinter dem Haus geschafft.", "Du befindest dich wieder im Garten.","Garten(draußen)");
    private static Raum vorraum = new Raum("Vorraum Bibliothek", "Du kommst in einen kleinen Flur von dem vier Türen abgehen.", "Du betrittst den Zwischenraum.","Vorraum Bibliothek (EG)");

    private static Raum kapelle = new Raum("Kapelle", "Bedächtig gehst du in die Mitte des Raums, er ist voll von Skeletten. UND LEICHEN!?", "Du fühlst dich unwohl wieder in die Kapelle gegangen zu sein.", "Kapelle(draußen versteckt)");
    private static Raum flurEG = new Raum("Flur Erdgeschoss.", "Du hast ein ganz mulmiges Gefühl besonders als du Blut auf dem Boden siehst.","Du betrittst wieder den dir viel zu engen FLur. Scheiß Klaustorphobie.","Flur (EG)");
    private static Raum albtraumRaum = new Raum("AlbtraumRaum","Plötzlich dreht sich alles um dich und die Schatten bewegen sich.","Wieder beginnt sich alles zu drehen.","Albtraumraum(EG)");
    private static Raum wohnzimmer = new Raum("Wohnzimmer", "Du betrittst endlich mal einen gemütlichen Raum: Sofas, Sessel, Bilder. Einfach angenehm.","Endlich zurück im kleinen Wohnzimmer. Der Couch sieht verlockend aus,aber dafür hast du doch eigentlich keine Zeit...", "(Wohnzimmer(EG)");
    private static Raum flurOG= new Raum("Flur Obergeschoss","Du stehst in einem großen Flur mit vielen Türen. Da staunst du wie groß das Gebäude wirklich ist.", "Du schaust dich im Flur um.","Flur(OG)");
    private static Raum arena= new Raum("Arena Raum", "Du stehst in einem runden Raum und vor dir eine große Imposante Statue... die sich bewegt!","Du betrittst den Arena-Raum.","ArenaRaum(OG)");
    private static Raum beschwörkammer= new Raum("Kammer der Beschwörung", "Ein Raum mit roten Kreisen auf dem Boden, das kann ja nur gut laufen","Wilkommen zurück im Raum für satanistische Anfänger *Ironie*","Beschwör-Kammer (OG)");
    private static Raum badezimmer = new Raum("Badezimmer","Du betrittst ein weiß gekachelten Raum. Dusche, Wc, Waschbecken. Ein Badezimmer.", "Du stehst im Badezimmer.","Badezimmer(OG/UG)");
    private static Raum teezimmer = new Raum("Teezimmer","Du betrittst den Raum. Du bist sehr überrascht als dieser sich als Teezimmer entpuppt. Mit einem kleinen Springenbrunnen, Holzschränkchen und freundlichen beigen Wänden.","Du schreitest wieder in das Teezimmer, was dir neu aufällt sind die hübschen Blumen an der Decke. Super Relevant :)","Teeservierraum(OG)");
    private static Raum besenkammer = new Raum("Besenkammer","Du betritst eine kleine Besenkammer. Die Türe fällt hinter dir zu.", "Du gehst wieder in die Besenkammer. Die Türe schließt sich wie von alleine, spuky,", "Besenkammer(OG)");
    private static Raum hinterDemBild = new Raum("-Hinter dem Bild- Raum","Du beginnst dich zu fangen nachdem du etwas taumelst und siehst dich um.","Dir fährt eine Gänsehaut über den Rücken.","Ein Raum hinter dem Bild (OG versteckt)");
    private static Raum gemächer= new Raum("Gemächer der Hexe","Du befindest dich in einem alten Arbeitszimmer mit Bett und allerlei Dingen an den Wänden aufgereiht. Kolben, Kräuter usw.", "Das Zimmer Arbeitszimmer scheint auch bewohnt gewesen zu sein","Schlafgemach Hexe (OG versteckt");

    private static Raum vorgarten= new Raum("Vorgarten", "Du trittst raus an die freie Luft, das tut gut.","Du hast das Haus wieder verlassen und denoch hast du mal wieder das Gefühl das nicht wirklich. Täuscht es vielleicht diesmal?","draußen");
    private static Raum bibliothek= new Raum("Bibliothek","Du trittst in eine Bibliothek, die Wände sind voll von Bücheregalen.","Du betrittst die Bibliothek.","Bibliothek(EG)");


    public static TA2.AktionTür türEingangshalleKüche = new TA2.AktionTür("",true,true,"Du erkennst eine große Holztüre.Ob sie wohl aufgeht?","Die Türe ist sehr schwerfällig, aber lässt sich öfnnen",eingangshalle,küche);
    public static TA2.AktionTreppe treppe1EG = new TA2.AktionTreppe("",true,true,"Nutze die Treppe?","Du gehst die Treppe hoch",eingangshalle,flurOG);
    public static TA2.AktionTür türEingangshalleBadezimmer = new TA2.AktionTür("",true,true,"Mysteriöse weiße Tür öffnen?","Du öffnest vorsichtig die Tür.",eingangshalle,badezimmer);
    public static TA2.AktionTür türFlurOGBadezimmer = new TA2.AktionTür("",true,true,"Die weiße Türe kommt dir bekannt vor. Magst du sie öffnen?","Du gehst bedächtig zu der Tür. Die Türe geht leicht auf.",flurOG,badezimmer);
    public static TA2.AktionTreppe treppe2EG = new TA2.AktionTreppe("",true,true,"Nutze die massive Steintreppe","Vorsichtig nutzt du die Treppe. Stürzen mag niemand!",flurEG,flurOG);
    public static TA2.AktionTür türKücheEsszimmer = new TA2.AktionTür("",true,true,"Ein Durchgang führt durch die Küche in einen weiteren Raum. Gehe dort hin","Du gehst durch den Durchgang den Durchgang in der Küche in den nächsten Raum",küche,esszimmer);
    public static TA2.AktionTür türEsszimmerGarten = new TA2.AktionTür("",true,true,"Eine große mächtige Kappelle, die gar nicht in den Garten passt. Versuche die Holztüre zu öffnen","Du reißt die Türe auf.",esszimmer,garten);
    public static TA2.AktionTür türGartenKapelle = new TA2.AktionTür("",true,true,"Eine große mächtige Kappelle, die gar nicht in den Garten passt. Versuche die Holztüre zu öffnen","Die Türe öffnet sich träge und schlechte Luft schlägt dir entgegen.",garten,kapelle);
    public static TA2.AktionTür türEsszimmerVorraum = new TA2.AktionTür("",true,true,"Öffne Tür im hinterem Teil des Raumes","Die Türe geht auf und du gehst durch.",esszimmer,vorraum);
    public static TA2.AktionTür türVorraumBibliothek = new TA2.AktionTür("",true,true,"Öffne die verzierte Holztüre an der Wand. Was wohl dahinter liegt?","",vorraum,bibliothek);
    public static TA2.AktionTür türVorraumFlurEG = new TA2.AktionTür("",true,true,"Öffne die große massive Holztüre.","Öffne die massive Tür",vorraum,flurEG);
    public static TA2.AktionTür türFlurEGAlbtraumraum = new TA2.AktionTür("",true,true,"Eine glatte Schwarzetüre. 'Öffne mich schreit' sie dir zu. Öffnest du sie?","Die Türe ist so faszinierten. Du fühlst fast einen Sog während du sie öffnest.",flurEG,albtraumRaum);
    public static TA2.AktionTür türEingangshalleVorgarten = new TA2.AktionTür("",true,true,"Die Konturen zeigen eine massive Türe. Versuche sie zu öffnen.","Die Eingangstüre öffnet sich.",eingangshalle,vorgarten);
    public static TA2.AktionTür türFlurEGWohnzimmer = new TA2.AktionTür("",true,true,"Schlichte Tür am Flurende versuchen zu öffnen.","Die Türe schwingt lautlos auf.",flurEG,wohnzimmer);
    public static TA2.AktionTür türFlurOGArena = new TA2.AktionTür("",true,true,"Türe mit Schwertsymbol öffnen.","",flurOG,arena);
    public static TA2.AktionTür türFlurOGTeezimmer = new TA2.AktionTür("",true,true,"Schlichte Holztüre, man hört leises plätschern. Öffnen?","",flurOG,teezimmer);
    public static TA2.AktionTür türFlurOGBeschwörerraum = new TA2.AktionTür("",true,true,"Türe auf der rechten Seite versuchen zu öffnen","Du öffnest die Tür",flurOG,beschwörkammer);
    public static TA2.AktionTür türFlurOGGemächer = new TA2.AktionTür("",true,true,"Durch die geheime Tür gehen die man nicht sieht","Das das klappt hättest nichtmal du gedacht",flurOG,gemächer);
    public static TA2.AktionTür türTeeZimmerHinterDemBild = new TA2.AktionTür("",true,true,"Gegen das Bild in der Mitte des Raum rennen?","Du rennst mit voller Geschwindigkeit in Richtung Wand.",teezimmer,hinterDemBild);






    //Schlüssel
    private static Gegenstand goldenerSchlüssel =new Gegenstand("goldener Schlüssel",true,true,null,true,true);
    private static AktionSammeln sammelnGoldenerSchlüssel = new AktionSammeln("", true, true, "", "", goldenerSchlüssel);
    private static Gegenstand modernerSchlüssel = new Gegenstand("moderner Schlüssel",true,true,null,true, true);
    private static Gegenstand bronzeschlüssel = new Gegenstand("Bronzeschlüssel",true,true,null,true, true);
    private static Gegenstand alterSchlüssel = new Gegenstand("alter Schlüssel",true,true,null,true, true);
    //Feuermacher
    private static Gegenstand streichölzer = new Gegenstand("Streichhölzer",true,true,null,true, true,false,false,false,false,true);
    private static Gegenstand feuerzeug = new Gegenstand("Feuerzeug",true,true,null,true, true,false,false,false,false,true);
    //Massives
    private static Gegenstand axt = new Gegenstand("Axt",true,true,null,true, true,false,false,false,false,false, true);
    private static Gegenstand schwert = new Gegenstand("Schwert",true,true,null,true, true,false,false,false,false,false, true);
    private static Gegenstand schwert2 = new Gegenstand("Schwert",true,true,null,true, true,false,false,false,false,false, true);
    private static Gegenstand eisenstang = new Gegenstand("Eisenstange",true,true,null,true, true,false,false,false,false,false, true);
    private static Gegenstand massivesHolzbrett = new Gegenstand("massives Holzbrett",true,true,null,true, true,false,false,false,false,false, true);
    private static Gegenstand improvisierterSpeer = new Gegenstand("improvisierter Speer",true,true,null,true, true,false,false,false,false,false, true);
    //Trinkbares
    private static Gegenstand wasser= new Gegenstand("Wasser",true,true,null,true,false,true);
    private static Gegenstand glasMitWasser= new Gegenstand("Glas gefüllt mit Wasser",true,true,null,true,false,true);
    private static Gegenstand flascheWein= new Gegenstand("Flasche mit Wein",true,true,null,true,false,true);
    private static Gegenstand ColaFlasche= new Gegenstand("Cola",true,true,null,true,false,true);

    private static Gegenstand vaseMitWasser= new Gegenstand("Vase gefüllt mit Wasser",true,true,null,true,false,true,false,true);
    //Gegenstände zum nutzen und mitnehmen
    private static Gegenstand besenstiel = new Gegenstand("Besenstiel",true,true,null,true,true);
    private static Gegenstand klebeband = new Gegenstand("Klebeband",true,true,null,true,true);
    private static Gegenstand speerspitze = new Gegenstand("Speerspitze",true,true,null,true,true);
    private static Gegenstand flasche = new Gegenstand("Flasche",true,true,null,true,true);
    private static Gegenstand leeresGlas = new Gegenstand("leeresGlas",true,true,null,true,true);

    private static Gegenstand tomatensoßendose = new Gegenstand("Tomatensoßendose",true,true,null,true,true);

    private static Gegenstand halbeLeiter2 = new Gegenstand("halbe Leiter",true,true,null,true,true);
    private static Gegenstand halbeLeiter = new Gegenstand("halbe Leiter",true,true,null,true,true);
    private static Gegenstand leiter = new Gegenstand("Leiter",true,true,null,true);
    private static Gegenstand metalschrott = new Gegenstand("Metalschrott",true,true,null,true,true);

    //essbares
    private static Gegenstand schinken = new Gegenstand("Schinken",true,true,null,true,true,false,true);
    private static Gegenstand apfel = new Gegenstand("Apfel",true,true,null,true,true,false,true);
    private static Gegenstand kekse = new Gegenstand("Kekse",true,true,null,true,true,false,true);
    private static Gegenstand tomatensoße = new Gegenstand("Tomatensoße",true,true,null,true,true,false,true);
    private static Gegenstand handVollChips = new Gegenstand("Handvoll Salt&Vinger-Chips",true,true,null,true,true,false,true);

    //Zerstörbares
    private static Gegenstand schrank=new Gegenstand("Schrank",true,true,null,true,false,false,false,true);
    private static Gegenstand truhe=new Gegenstand("Truhe",true,true,null,true,false,false,false,true);
    private static Gegenstand besen=new Gegenstand("Besen",true,true,null,true,false,false,false,true);
    private static Gegenstand vase=new Gegenstand("Vase",true,true,null,true,false,false,false,true);
    private static AktionZerstören = new AktionZerstören("", true, true, );



    //Listen
    private static Gegenstand[] gegenstandsListe= {goldenerSchlüssel,vase,besen,truhe,schrank,handVollChips,tomatensoße,kekse,apfel,schinken,metalschrott,leiter,halbeLeiter,halbeLeiter2,tomatensoßendose,leeresGlas,flasche,speerspitze,klebeband,besenstiel, vaseMitWasser,ColaFlasche,flascheWein,glasMitWasser,wasser,modernerSchlüssel,bronzeschlüssel,alterSchlüssel,feuerzeug,streichölzer,axt,schwert,schwert2,eisenstang,improvisierterSpeer,massivesHolzbrett};
    private static TA2.Raum[] raumListe = {eingangshalle, küche, esszimmer, garten, vorraum, kapelle, flurEG, albtraumRaum, wohnzimmer, flurOG, arena, beschwörkammer, badezimmer, teezimmer,besenkammer, hinterDemBild, gemächer, vorgarten, bibliothek};
    private static AktionOberklasse[] aktionsListe={türEingangshalleKüche,türEingangshalleBadezimmer,türEingangshalleVorgarten,türFlurOGBadezimmer,türFlurEGAlbtraumraum,türEsszimmerGarten,türEsszimmerVorraum,türFlurEGWohnzimmer,türFlurOGArena,türFlurOGBeschwörerraum,türFlurOGGemächer,türFlurOGTeezimmer,türGartenKapelle,türKücheEsszimmer,türTeeZimmerHinterDemBild,türVorraumBibliothek,türVorraumFlurEG,treppe1EG,treppe2EG,sammelnGoldenerSchlüssel};

    //Verwaltungen
    static TA2.VerwaltungRaum rv= new VerwaltungRaum(eingangshalle);

    static TA2.VerwaltungGegenstände gv = new VerwaltungGegenstände(gegenstandsListe);

    public static void main(String[] args) {

    }



}
