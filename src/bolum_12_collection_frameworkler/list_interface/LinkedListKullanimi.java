package bolum_12_collection_frameworkler.list_interface;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkedListKullanimi {
    public static void main(String[] args) {

        LinkedList<Integer> sayilar = new LinkedList<>();
        ArrayList<Integer> sayilar2 = new ArrayList<>();

        long baslamaSuresi=System.currentTimeMillis();
        linkedListHazirla(sayilar);
        long bitisSuresi=System.currentTimeMillis();
        System.out.println("ll çalisma süresi "+(bitisSuresi-baslamaSuresi));


        baslamaSuresi=System.currentTimeMillis();
        arrayListHazirla(sayilar2);
        bitisSuresi=System.currentTimeMillis();
        System.out.println("arrayList calisma suresi "+(bitisSuresi-baslamaSuresi));
        /*
         * sayilar.add(1);
         * sayilar.add(2);
         * sayilar.add(4);
         * sayilar.add(2, 3);
         */
     /*   ListIterator<Integer> iterator = sayilar.listIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
*/

    }

    public static void arrayListHazirla(ArrayList<Integer> sayilar2){
        for(int i=0; i<20000; i++){
            int yeniEklenecekEleman = (int)(Math.random()*5000000);
            siraliEkle(sayilar2, yeniEklenecekEleman);
        }
    }

    public static void linkedListHazirla(LinkedList<Integer> sayilar){
        for(int i=0; i<20000; i++){
            int yeniEklenecekEleman = (int)(Math.random()*500000);
            siraliEkle(sayilar, yeniEklenecekEleman);
        }
    }

    public static boolean siraliEkle(List<Integer> liste, Integer yeniEklenecekEleman) {

        ListIterator<Integer> iterator=liste.listIterator();

        while(iterator.hasNext()){

            int karsilastirmaSonucu = iterator.next().compareTo(yeniEklenecekEleman);
            if(karsilastirmaSonucu==0){
                iterator.add(yeniEklenecekEleman);
                return true;
            }else if(karsilastirmaSonucu > 0){
                iterator.previous();
                iterator.add(yeniEklenecekEleman);
                return true;
            }else {

            }
        }
        iterator.add(yeniEklenecekEleman);
        return true;
    }
}
