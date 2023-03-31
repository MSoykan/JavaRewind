package bolum_11_generics;

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
    }
}
