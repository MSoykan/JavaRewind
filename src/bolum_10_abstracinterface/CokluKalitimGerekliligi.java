package bolum_10_abstracinterface;

import java.util.ArrayList;

public class CokluKalitimGerekliligi {
    
    public static void main(String[] args) {
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
    }
}
interface Kisi{
    void yemekYe();
    void sporYap();
}

abstract class Sarkici implements Kisi { // ABSTRACT CLASS INTERFACE IMPLEMENT EDERSE FONKSIYONLARI GERÇEKLESTIRMEZ
    // SARKİCİ DAN TÜRTİLEN ALT SINIFLAR MUTLAKA BUNLARI GERCEKLETIRMEK ZORUNDADIR
    //çünkü zaten burdan nesne türetemiyorum.
    abstract void sarkiSoyle();
}

interface ArabeskSarkiciOzellikleri{
    void sahnedeSigarIc();
    
}
interface PopSarkiciÖzellikleri{
    void sahnedeDansEt();
    void duetYap();
}
class Tarkan implements PopSarkiciÖzellikleri{

    @Override
    public void sahnedeDansEt() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'sahnedeDansEt'");
    }

    @Override
    public void duetYap() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'duetYap'");
    }

}

class Hadise implements PopSarkiciÖzellikleri{

    @Override
    public void sahnedeDansEt() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'sahnedeDansEt'");
    }

    @Override
    public void duetYap() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'duetYap'");
    }

}

class ArabeskSarkici extends Sarkici{

    @Override
    void sarkiSoyle() {
        System.out.println("Arabeskci söylüyor.");
    }

    @Override
    public void yemekYe() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'yemekYe'");
    }

    @Override
    public void sporYap() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'sporYap'");
    }
    
}

class PopSarkici extends Sarkici{

    @Override
    void sarkiSoyle() {
        System.out.println("Pop şarkıcı şarkı söylüyor.");
    }

    @Override
    public void yemekYe() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'yemekYe'");
    }

    @Override
    public void sporYap() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'sporYap'");
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
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'duetYap'");
    }

}