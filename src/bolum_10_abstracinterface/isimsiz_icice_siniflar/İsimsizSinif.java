package bolum_10_abstracinterface.isimsiz_icice_siniflar;

public class İsimsizSinif {

    public static void main(String[] args) {
         Hesaplayici hesap=new Hesaplayici(){
           @Override
           public void topla(int s1, int s2) {
               // TODO Auto-generated method stub
               super.topla(s1, s2);
           } 
         };
    }
    
}

class gecici extends  Canli{

    @Override
    void adiniSoyle() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'adiniSoyle'");
    }

}


abstract class Canli{
    abstract void adiniSoyle();
    void selamVer(){
        System.out.println("Selam");
    }
}