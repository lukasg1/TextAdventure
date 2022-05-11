package TextAdventure;


public class Raum {
    public boolean entdeckt;
    public String raumName;
    public String textErstesMal;
    public String textNichtErstesMal;
    public String lage;
    public int letzterAufruf;
    public Raum(String raumName, String textErstesMal, String textNichtErstesMal, String lage){
        this.raumName = raumName;
        entdeckt=false;
        this.textErstesMal= textErstesMal;
        this.textNichtErstesMal= textNichtErstesMal;
        this.lage=lage;
        this.letzterAufruf=0;

    }

    public int getLetzterAufruf() {
        return letzterAufruf;
    }

    public void setLetzterAufruf(int letzterAufruf) {
        this.letzterAufruf = letzterAufruf;
    }

    public boolean getEntdeckt() {
        return entdeckt;
    }

    public void entdecke() {
        this.entdeckt = true;
    }

    public String getRaumName() {
        return raumName;
    }

    public void betreteRaum(){
        if(entdeckt==false ){
            System.out.println(textErstesMal);
            entdeckt=true;
        }
        else{
            System.out.println(textNichtErstesMal);
        }
    }


}
