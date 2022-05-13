package TA2;

import TA2.VerwaltungRaum;

public class Main {
    //Raum
    private static TA2.Raum eingangshalle = new TA2.Raum("Eingangshalle", "Du befindest dich in einem dunklem Raum.", "Du bist zurück in dem in der Eingangshalle in der du aufgewacht bist.", "Eingangshalle(EG)");
    //Raumverzeichnis
    private static Raum eingangshalle = new Raum("Eingangshalle", "Du befindest dich in einem dunklem Raum.", "Du bist zurück in dem in der Eingangshalle in der du aufgewacht bist.", "Eingangshalle(EG)");
    private static Raum küche = new Raum("Küche", "Etwas Licht scheint durch die Fenster und du siehst eine Küche vor dir.", "Du betrittst die Küche.", "Küche(EG)");
    private static Raum esszimmer = new Raum("Esszimmer", "Du betrittst ein großes Esszimmer, indem wohl schon länger neimand mehr war.", "Du stehst wieder im Speisezimmer", "Esszimmer(EG)");
    private static Raum garten = new Raum("Garten", "Du hast es in den Garten hinter dem Haus geschafft.", "Du befindest dich wieder im Garten.","Garten(draußen)");
    private static Raum vorraum = new Raum("Vorraum Bibliothek", "Du kommst in einen kleinen Flur von dem vier Türen abgehen.", "Du betrittst den Zwischenraum.","Vorraum Bibliothek (EG)");
    private static Raum keller= new Raum("Keller", "Du musst dich erst an die Dunkelheit gewöhnen, aber du erkennst langsam die Konturen des Weinkellers", "Du bist wieder beindruckt von der größe des Kellers. Wer braucht so viel Wein?", "Keller (UG versteckt)");
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
    private static Raum dachboden=new Raum("Dachboden","Du schaust dich im Dachboden um.","Du bist wieder im Dachboden.","Dachboden(versteckt)");
    private static Raum vorgarten= new Raum("Vorgarten", "Du trittst raus an die freie Luft, das tut gut.","Du hast das Haus wieder verlassen und denoch hast du mal wieder das Gefühl das nicht wirklich. Täuscht es vielleicht diesmal?","draußen");
    private static Raum bibliothek= new Raum("Bibliothek","Du trittst in eine Bibliothek, die Wände sind voll von Bücheregalen.","Du betrittst die Bibliothek.","Bibliothek(EG)");


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
