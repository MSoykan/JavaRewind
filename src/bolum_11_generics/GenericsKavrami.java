package bolum_11_generics;

import java.util.ArrayList;

public class GenericsKavrami {
    
    public static void main(String[] args) {
        String[] isimler = {"emre","ayse","ali"};
        Integer[] sayilar = {1,5,7,9,10};
        char[] karakterler = {'a','b','k'};
/* 
        StringDiziYazdir.yazdir(isimler);
        IntegerDiziYazdir.yazidrInt(sayilar);
        CharDiziYazdir.charYazdir(karakterler);*/

        // int > Integer, double>Double, float>Float, char>Character
        GenericDiziYazdir<String> stringGenericDiziYazdir=new GenericDiziYazdir<String>();
        stringGenericDiziYazdir.yazdir(isimler);

        GenericDiziYazdir<Integer> integergGenericDiziYazdir= new GenericDiziYazdir<Integer>();
        integergGenericDiziYazdir.yazdir(sayilar);

        ArrayList<String> listem=new ArrayList();
        listem.add("ankara");
        listem.add("bursa");
        listem.add("izmir");
        listem.add("mugla");
    //    listem.add(1);
     //   listem.add(true);
        for(Object gecici : listem){
            System.out.println(((String)gecici).length());
        }
    }
}
