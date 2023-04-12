package bolum_10_abstracinterface.member_innerclass_örnek;

public class Main {

    public static void main(String[] args) {
        
        HesapMakinesi hm= new HesapMakinesi();
        HesapMakinesi.Topla toplayici=hm.new Topla();
        int toplam=toplayici.topla(5, 6);
        System.out.println("Toplam :"+toplam);

        HesapMakinesi.Cikar cikarici=hm.new Cikar();
        int fark=cikarici.cikar(9, 4);
        System.out.println("Fark :"+fark);

        hm.carp(6,4);

        String bolum=hm.bolmeYap(10, 2);
        System.out.println(bolum);
    }
    
}
