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
    public static TA2.AktionTür treppe1EG = new TA2.AktionTür("",true,true,"Nutze die Treppe?","Du gehst die Treppe hoch",eingangshalle,flurOG);



    public static TA2.AktionTür türEingangshalleBadezimmer= new TextAdventure.AktionTür(eingangshalle,badezimmer,"",false,"Du öffnest vorsichtig die Tür.",rv,"Mysteriöse weiße Tür öffnen",false);
    public static TA2.AktionTür türFlurOGBadezimmer=new TextAdventure.AktionTür(flurOG,badezimmer,"",false,"Du gehst bedächtig zu der Tür. Die Türe geht leicht auf.",rv,"Die weiße Türe kommt dir bekannt vor. Magst du sie öffnen?",false);
    public static TA2.AktionTreppe treppe2EG=new TextAdventure.AktionTreppe(flurEG,flurOG,"",false,"Vorsichtig nutzt du die Treppe. Stürzen mag niemand!",rv,"Nutze die massive Steintreppe");
    public static TA2.AktionTür türKücheEsszimmer=new TextAdventure.AktionTür(küche,esszimmer,"",false,"Du gehst durch den Durchgang den Durchgang in der Küche in den nächsten Raum.",rv,"Ein Durchgang führt durch die Küche in einen weiteren Raum. Gehe dort hin",false);
    public static TA2.AktionTür türEsszimmerGarten=new TextAdventure.AktionTür(esszimmer,garten,"",false,"Du reißt die Türe auf.",rv,"Eine Tür die nach draußen zu führen scheint. Vielleicht in den Garten. Versuche sie zu öffnen", true);
    public static TA2.AktionTür türGartenKapelle=new TextAdventure.AktionTür(garten,kapelle,"",true,"Die Türe öffnet sich träge und schlechte Luft schlägt dir entgegen",rv,"Eine große mächtige Kappelle, die gar nicht in den Garten passt. Versuche die Holztüre zu öffnen",true);
    public static TA2.AktionTür türEsszimmerVorraum=new TextAdventure.AktionTür(esszimmer,vorraum,"",false,"Die Türe geht auf und du gehst durch.",rv,"Öffne Tür im hinterem Teil des Raumes",false);
    public static TA2.AktionTür türVorraumBibliothek=new TextAdventure.AktionTür(vorraum,bibliothek,"",false,"",rv,"Öffne die verzierte Holztüre an der Wand. Was wohl dahinter liegt?",false);
    public static TA2.AktionTür türVorraumFlurEG=new TextAdventure.AktionTür(vorraum,flurEG,"",false,"Öffne die massive Tür",rv,"Öffne die große massive Holztüre.",true);
    public static TA2.AktionTür türFlurEGAlbtraumraum=new TextAdventure.AktionTür(flurEG,albtraumRaum,"",false,"Die Türe ist so faszinierten. Du fühlst fast einen Sog während du sie öffnest.",rv,"Eine glatte Schwarzetüre. 'Öffne mich schreit' sie dir zu. Öffnest du sie?",false);
    public static TA2.AktionTür türEingangshalleVorgarten=new TextAdventure.AktionTür(eingangshalle,vorgarten,"",false,"Die Eingangstüre öffnet sich.",rv,"Die Konturen zeigen eine massive Türe. Versuche sie zu öffnen",true);
    public static TA2.AktionTür türFlurEGWohnzimmer=new TextAdventure.AktionTür(flurEG,wohnzimmer,"",false,"Die Türe schwingt lautlos auf.",rv,"Schlichte Tür am Flurende versuchen zu öffnen", false);
    public static TA2.AktionTür türFlurOGArena=new TextAdventure.AktionTür(flurOG,arena,"",false,"",rv,"Türe mit Schwertsymbol öffnen",false);
    public static TA2.AktionTür türFlurOGTeezimmer=new TextAdventure.AktionTür(flurOG,teezimmer,"",false,"",rv,"Schlichte Holztüre, man hört leises plätschern. Öffnen?", false);
    public static TA2.AktionTür türFlurOGBesenkammer=new TextAdventure.AktionTür(flurOG,besenkammer,"",false,"Die Türe ist bereits einen Spalt offen. Du schlüpfst durch den Spalt",rv,"Unscheinbare Tür. Die hast du glatt übersehen. Schau rein",false);
    public static TA2.AktionTür türFlurOGBeschwörerraum=new TextAdventure.AktionTür(flurOG,beschwörkammer,"",false,"Du öffnest die Tür",rv,"Türe auf der rechten Seite versuchen zu öffnen", false);
    public static TA2.AktionTür türFlurOGGemächer=new TextAdventure.AktionTür(flurOG,gemächer,"",true,"Das das klappt hättest nichtmal du gedacht",rv,"Durch die geheime Tür gehen die man nicht sieht.",false);
    public static TA2.AktionTür türTeeZimmerHinterDemBild=new AktionTür(teezimmer,hinterDemBild,"",true,"Du rennst mit voller Geschwindigkeit in Richtung Wand.",rv,"Gegen das Bild in der Mitte des Raum rennen?",true);


    //Gegenstand
    private static Gegenstand g1 = new Gegenstand("Hans",true,true,eingangshalle,true);

    //Listen
    private static Gegenstand[] gegenstandsliste= {g1};
    //Verwaltungen
    static TA2.VerwaltungRaum rv= new VerwaltungRaum(eingangshalle);

    static TA2.VerwaltungGegenstände gv = new VerwaltungGegenstände(gegenstandsliste);

    public static void main(String[] args) {

    }

}
