package oop-giris;

public class StaticKavrami {
    public static void main(String[] args) {
        
        Memur m1=new Memur();
        m1.setIsim("emre");
        m1.setMaas(4000);

    }
}

class Memur {
    
    private String isim;
    private int maas;
    private static int olusturulanMemurNesnesi;

    public Memur(){
        olusturulanMemurNesnesi ++;
    }

    public String getIsim() {
        return isim;
    }
    public void setIsim(String isim) {
        this.isim = isim;
    }

    
    public int getMaas() {
        return maas;
    }
    public void setMaas(int maas) {
        this.maas = maas;
    }



}