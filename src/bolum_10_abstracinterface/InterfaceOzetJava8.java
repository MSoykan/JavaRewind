package bolum_10_abstracinterface;

import bolum_10_abstracinterface.acess_modifiers.ProtectedKullanimi;

public class InterfaceOzetJava8 {
    public static void main(String[] args) {
        
        SinifA a = new SinifA();
        a.metotA();
        boolean sonuc = InterfaceA.emailKontrol("emrea@asa.com");
        System.out.println(sonuc);
    }
    
}

abstract interface InterfaceA{// abstract yazmamıza gerek yok.

    void metotA(); // Bunlar default olarak public.
    default void defaultMetot(){
        System.out.println("Ben default interface metoduyum");
    }
    static final int sayi=10;
    static void staticMetot(){
        System.out.println("Ben statik metotum");
    }
    static boolean emailKontrol(String mail){
        if(mail.contains("@")){
            return true;
        }else return false;
    }
}

class Soykan extends ProtectedKullanimi{}

class SinifA implements InterfaceA{

    static{

    }
    {

    }

    @Override
    public void defaultMetot() {
        // TODO Auto-generated method stub
        InterfaceA.super.defaultMetot();
    }

    @Override
    public void metotA() {
        System.out.println("Ben a sinifi içindeki default metotum.");
        
    }

}