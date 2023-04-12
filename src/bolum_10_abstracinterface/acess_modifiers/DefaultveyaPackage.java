package bolum_10_abstracinterface.acess_modifiers;
//Basinda public yazmayan siniflar sadece ayni paket içinden erişilebilir.
public class DefaultveyaPackage {
    
    int sayi=5;
    void metot(){

    }

    class InnerClass{

    }
}

class Y extends DefaultveyaPackage{
    @Override
    void metot() {
        super.metot();
    }
}