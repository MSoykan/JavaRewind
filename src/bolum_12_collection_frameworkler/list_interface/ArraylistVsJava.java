package bolum_12_collection_frameworkler.list_interface;

import java.util.ArrayList;

public class ArraylistVsJava {
    public static void main(String[] args) {
        

        ArrayList<String> isimlerListesi = new ArrayList<>();
        String [] isimlerDizisi = new String[9000000];

        long baslamaZamani = System.currentTimeMillis();//100
        //dizi elemanları atanır
        for(int i=0; i<9000000; i++){
            isimlerDizisi[i]= "deneme"+i;
        }
        long bitmeZamani= System.currentTimeMillis();//120

        System.out.println("Dizi çalışma süresi : "+ (bitmeZamani - baslamaZamani));

        baslamaZamani=System.currentTimeMillis();
        for(int i=0; i<9000000;i++){
            isimlerListesi.add("deneme"+i);
        }
        bitmeZamani=System.currentTimeMillis();

        System.out.println("Listenin çalışma süresi:" + (bitmeZamani - baslamaZamani));

        baslamaZamani=System.currentTimeMillis();
        isimlerDizisi[4000000]="yeni deger";
        bitmeZamani=System.currentTimeMillis();
        System.out.println( );
    }
}
