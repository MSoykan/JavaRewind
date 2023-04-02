package bolum_12_collection_frameworkler.list_interface;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListKullanimi {
    public static void main(String[] args) {
        
        LinkedList<Integer> sayilar= new LinkedList<>();

        sayilar.add(1);
        sayilar.add(2);
        sayilar.add(4);
        sayilar.add(2, 3);


        ListIterator<Integer> iterator=sayilar.listIterator();
        while(iterato.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
