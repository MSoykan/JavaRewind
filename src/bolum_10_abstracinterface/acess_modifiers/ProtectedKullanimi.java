package bolum_10_abstracinterface.acess_modifiers;

public class ProtectedKullanimi {

    protected int protectedDegisken;

    protected void protectedMetot() {

    
    }
    protected class InnterProtectedSinif{
        
    }
}

class G extends ProtectedKullanimi{
// class başında bişey yoksa sadece ayni paket içerisinden erişilir
// Public class'in protected variableları, classi extend eden
// alt siniflardan ulabilabilir.
@Override
protected void protectedMetot() {
    super.protectedMetot();
    System.out.println(protectedDegisken);
}

}
