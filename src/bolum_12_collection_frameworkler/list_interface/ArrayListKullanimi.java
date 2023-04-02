package bolum_12_collection_frameworkler.list_interface;

import java.util.ArrayList;
import java.util.List;

public class ArrayListKullanimi {
    
    public static void main(String[] args) {
        //bellekte 10 tane eleman tutan arraylist oluşturur
        ArrayList<Integer> sayilar2=new ArrayList<>();
        sayilar2.add(1);
        sayilar2.add(2);
        sayilar2.add(3);

        //verdiğiniz deger kadar eleman tutacak bir arraylist olusturur
        ArrayList<String> isimler = new ArrayList<>(20);
        isimler.add("mahmut");
        isimler.add("deli");
        isimler.add("emre");
        //arraylisti verilen sayi kadar eleman tutacak sekilde artırır.
        isimler.ensureCapacity(100);
        //arraylisti içindeki eleman tutacak şekilde küçültür.
        isimler.trimToSize();



        ArrayList<String> isimlerYedek = new ArrayList<>(isimler);
        //eleman sayısını gösterir.
        System.out.println(isimlerYedek);
        //liste boş ie true
        System.out.println(isimlerYedek.isEmpty());
        //bütün listeyi temizler.
        System.out.println(isimler.isEmpty());

        System.out.println("");

        String[] isimlerDizisi = isimler.toArray(new String[0]); 
        System.out.println(isimlerDizisi[1]);
        System.out.println(isimlerDizisi.length);
        System.out.println(isimler.size());

        isimler.remove("mahmut");
        System.out.println(isimler);

        List<String> yeniIsımlerListesi = isimler.subList(1, 5);
    }
}
