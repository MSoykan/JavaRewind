package bolum_10_abstracinterface;

import bolum_10_abstracinterface.acess_modifiers.ErisimBelirleyiciler;
import java.util.ArrayList;

public class CokluKalitimGerekliligi extends ErisimBelirleyiciler {
    
    public static void main(String[] args) {
        System.out.println("Bakalı mbasityor mu?");
        CokluKalitimGerekliligi ck = new CokluKalitimGerekliligi();
        ck.bastir();
        MuslumBaba muslum=new MuslumBaba();
        PopSarkiciÖzellikleri popSarkici1 = new Tarkan();
        PopSarkiciÖzellikleri popSarkici2 = new Hadise();

        PopSarkiciÖzellikleri dizi[] = new PopSarkiciÖzellikleri[5];
        dizi[0]=popSarkici1;
        dizi[1]= popSarkici2;

        ArrayList<PopSarkiciÖzellikleri> sarkicilar=new ArrayList<>();
        sarkicilar.add(popSarkici1);
        sarkicilar.add(popSarkici2);

        popSarkici1.sahnedeDansEt();
        popSarkici1.adiniSoyle();
        // ArabeskSarkiciOzellikleri.yas=50;
    }
    public void bastir(){
        System.out.println(protectedDegisken);
    }
}

interface Kisi{
    void yemekYe();
    void sporYap();
    default void adiniSoyle(){
        System.out.println("Ben kişi interfaceiyim.");
    }
}

interface OgrenciOzellikleri extends Kisi,UniversiteOgrencisi{ // Interface interface'i extend edebilir.
    void dersCalis();
    void okulaGit();
}

interface UniversiteOgrencisi{
    void finallereCalis();
}

class Student implements OgrenciOzellikleri{

    @Override
    public void dersCalis() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void okulaGit() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void sporYap() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void yemekYe() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void finallereCalis() {
        // TODO Auto-generated method stub
        
    }
    
}

abstract class Sarkici implements Kisi { // ABSTRACT CLASS INTERFACE IMPLEMENT EDERSE FONKSIYONLARI GERÇEKLESTIRMEZ
    // SARKİCİ DAN TÜRTİLEN ALT SINIFLAR MUTLAKA BUNLARI GERCEKLETIRMEK ZORUNDADIR
    //çünkü zaten burdan nesne türetemiyorum.
    abstract void sarkiSoyle();
}

interface ArabeskSarkiciOzellikleri{ // NOT: INTERFACELER BIRBIRINI EXTEND EDEBILIR
    void sahnedeSigarIc();
    final static int yas = 50; // Direk arabesks....leri.yas ile erisbilirsin
    
}
interface PopSarkiciÖzellikleri extends Kisi{
    void sahnedeDansEt();
    void duetYap();
}
class Tarkan implements PopSarkiciÖzellikleri{

    @Override
    public void sahnedeDansEt() {
        // TODO Auto-generated method stub
    }

    @Override
    public void duetYap() {

    }

    @Override
    public void sporYap() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void yemekYe() {
        // TODO Auto-generated method stub
        
    }

}

class Hadise implements PopSarkiciÖzellikleri{

    @Override
    public void sahnedeDansEt() {
    }

    @Override
    public void duetYap() {
    }

    @Override
    public void sporYap() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void yemekYe() {
        // TODO Auto-generated method stub
        
    }

}

class ArabeskSarkici extends Sarkici{

    @Override
    void sarkiSoyle() {
        System.out.println("Arabeskci söylüyor.");
    }

    @Override
    public void yemekYe() {
    }

    @Override
    public void sporYap() {
    }
    
}

class PopSarkici extends Sarkici{

    @Override
    void sarkiSoyle() {
        System.out.println("pop şşarkıcı şarkı söylüyor.");
    }

    @Override
    public void yemekYe() {
    }

    @Override
    public void sporYap() {
        // TODO Auto-generated method stub
    }

}

class MuslumBaba implements ArabeskSarkiciOzellikleri,PopSarkiciÖzellikleri{

    @Override
    public void sahnedeDansEt() {
        System.out.println("Popçu dansı ediliyor.");
    }

    @Override
    public void sahnedeSigarIc() {
        System.out.println("Sahnede sigara içiilir.");
    }

    @Override
    public void duetYap() {
    }

    @Override
    public void sporYap() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void yemekYe() {
        // TODO Auto-generated method stub
        
    }

}