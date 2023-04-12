package bolum_12_collection_frameworkler.list_interface;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ListelerinGezilmesi {
    public static void main(String[] args) {
        ArrayList<Integer> sayilar1 = new ArrayList<>();
        sayilar1.add(1);
        sayilar1.add(2);
        sayilar1.add(3);
        sayilar1.add(4);
        sayilar1.add(5);

        ArrayList<Integer> sayilar2 = new ArrayList<>();
        sayilar2.add(3);
        sayilar2.add(4);
        sayilar2.add(5);
        sayilar2.add(6);
        sayilar2.add(7);
        //Iterator

        System.out.println("iterator ile listenin gezilmesi");
        Iterator<Integer> iterator=sayilar1.iterator();
        while(iterator.hasNext()){

            System.out.println(iterator.next());
            
        }

        ListIterator<Integer> listIterator = sayilar1.listIterator();
        while(listIterator.hasNext()){
            System.out.println(listIterator.next());
        }

        System.out.println("List iterator ile listeyi sondan başa yazmak");
        ListIterator<Integer> listIteratorSondanBasa=sayilar2.listIterator();
        while(listIteratorSondanBasa.hasPrevious()){
            System.out.println(listIteratorSondanBasa.previous());
        }
    }
}
