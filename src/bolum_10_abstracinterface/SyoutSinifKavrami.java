package bolum_10_abstracinterface;

public class SyoutSinifKavrami {
    
    public static void main(String[] args) {
        
        Elma a=new Elma();
        Yenilebilir aa=new Elma();
        Yenilebilir bb = new Inek();

        ((Elma) aa).elmaMetotu();//Type casting yapmasak cortlardık, olmazdı
        ((Inek) bb).inekMetotu();
    }
}
class A{

}

class B {

}


interface Yenilebilir{//Sadece metot tanımlanıyor.İçerde foknsiyonun içi doldurulmaz.
    void yemekSekli();
    
}

class Elma implements Yenilebilir{

    @Override
    public void yemekSekli() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'yemekSekli'");
    }

    void elmaMetotu(){

    }
}

class Inek implements Yenilebilir{

    @Override
    public void yemekSekli() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'yemekSekli'");
    }
    
    void inekMetotu(){

    }
}

