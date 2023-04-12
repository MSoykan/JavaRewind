package bolum_11_generics.veteriner_birligi;

public class Veteriner extends Kisi{

    private String mezunOlduguOkul;
    private int calismaSuresi;

    public Veteriner(String isim, String tcKimlik, String mezunOlduguOkul, int calismaSuresi) {
        super(isim, tcKimlik);
        this.mezunOlduguOkul = mezunOlduguOkul;
        this.calismaSuresi=calismaSuresi;
    }

    @Override
    void kendiniTanit() {

    }

    
    
}
