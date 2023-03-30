package bolum_10_abstracinterface.acess_modifiers;

public class PrivateKullanimi { // Sınıfr tanımlamalarında private kullanılmaz
    //private yapılan kurucu metot o sınıftan nesne üretilmesini engeller.Ve o sınıftan kalıtım ile yeni sınıf oluşturulmasını engeller.

    public PrivateKullanimi(){

    }
    private int a;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    private void metot(){
        
    }
    private class InnerSinif{
        
    }
}

class YeniSinif extends PrivateKullanimi{
    
}
