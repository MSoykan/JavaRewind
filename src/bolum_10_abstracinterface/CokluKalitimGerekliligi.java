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
    }
}

abstract class Sarkici {
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

}

class Hadise implements PopSarkiciÖzellikleri{

    @Override
    public void sahnedeDansEt() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'sahnedeDansEt'");
    }

}

class ArabeskSarkici extends Sarkici{

    @Override
    void sarkiSoyle() {
        System.out.println("Arabeskci söylüyor.");
    }
    
}

class PopSarkici extends Sarkici{

    @Override
    void sarkiSoyle() {
        System.out.println("Pop şarkıcı şarkı söylüyor.");
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

}