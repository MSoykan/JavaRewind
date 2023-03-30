package bolum_10_abstracinterface.acess_modifiers;

public class ProtectedKullanimi {

    protected int sayi;

    protected void protectedMetot() {

    
    }
    protected class InnterProtectedSinif{
        
    }
}

class G extends ProtectedKullanimi{

@Override
protected void protectedMetot() {
    super.protectedMetot();
    System.out.println(sayi);
}

}
