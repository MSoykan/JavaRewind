package bolum_11_generics.veteriner_birligi;

public class Kedi extends Hayvan {

    private String tur;
    private String cinsi;

    public Kedi(String dogumTarihi, boolean kayitli, String cinsi) {
        super(dogumTarihi, kayitli);
        this.tur="Kedi";
        this.cinsi=cinsi;   
    }

    @Override
    void bilgileriGoster() {
        System.out.println(toString() + "kayıtlı mı:"+ isKayitli());
    }

    @Override
    public String toString() {
        return "Kedi [tur=" + tur + ", cinsi=" + cinsi + "]";
    }

    
    


}
