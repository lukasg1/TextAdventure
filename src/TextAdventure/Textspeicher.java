package TextAdventure;

public class Textspeicher {
    public Textspeicher(){

    }

    public void t(String text){
        System.out.println(text);
    }
    public void t(int zahl){
        System.out.println(zahl);
    }

    public void text(int i){
        switch(i){
            case 1:
                t("Du weißt weder wo noch wer du bist. Dein Schädel brummt und nur langsam gewöhnst du dich an die Dunkelheit.");
        }
    }
}
