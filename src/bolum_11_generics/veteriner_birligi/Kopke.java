package bolum_11_generics.veteriner_birligi;

public class Kopke extends Hayvan {

    private int asiSayisi;

    public Kopke(String dogumTarihi, boolean kayitli, int asiSayisi) {
        super(dogumTarihi, kayitli);
        this.asiSayisi = asiSayisi;
    }

    @Override
    void bilgileriGoster() {
        
    }

    @Override
    public String toString() {
        return "Kopke [asiSayisi=" + asiSayisi + "]";
    }
    
    
}
