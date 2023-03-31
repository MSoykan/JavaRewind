package bolum_11_generics.veteriner_birligi;

public class Main {
    
    public static void main(String[] args) {

        objeleriOlustur();
    }

    private static void objeleriOlustur(){

        
        Kedi kedi=new Kedi("01-01-2016", true, "Van Kedisi");
        kedi.bilgileriGoster();


        Musteri m1=new Musteri("emre","123","ankara");
        Musteri m2=new Musteri("soykan", "336", "üsküdar");
        Musteri m3=new Musteri("hasan", "324", "kadıköy");
        System.out.println(m3);
        m3.kendiniTanit();
    }
}
