package TA2;

public class VerwaltungZeit implements InterfaceOfUpdate{
    protected int Zeit=0;
    public VerwaltungZeit() {
    }

    @Override
    public void update() {
        Zeit++;
    }

    public int getZeit() {
        return Zeit;
    }

    public void setZeit(int zeit) {
        Zeit = zeit;
    }

    public String getTageszeit(){
        if(Zeit%100<25){
            return "Vormittag";

        } else if (Zeit%100<50&&Zeit%100>=25) {
            return "Nachmittag";

        } else if (Zeit%100<75&&Zeit%100>=50) {
            return "Abend";

        } else {
            return "Nacht";
        }
    }
}
