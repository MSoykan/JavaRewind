package bolum_10_abstracinterface.member_innerclass_örnek;

public class HesapMakinesi {

    int sayi=0;
    static int sayi2=5;

    public class Topla {

        public int topla(int i, int j){
            return i+j;
        }

    }

    public String bolmeYap(int sayi1, int sayi2){

        class Bolme{
            public String bolme(int i, int j ){
                if(j==0){
                    System.out.println("Bolen sıfır olamaz");
                    return "";
                }else{
                    int sonuç=i/j;
                    return String.valueOf(sonuç);
                }
            }
        }
        Bolme b=new Bolme();
        return b.bolme(sayi1, sayi2);

    }

    class Cikar{
        public int cikar(int i, int j){
            return i-j;
        }
    }

    private class Çarpma{ // İç sınıf üst csınıfın bütün variablelarını görür.

        int içDegisken ;

        public int çarpma(int i, int j ){

            System.out.println(sayi);
            System.out.println(sayi2);
            return i*j;
        }
    }

    

    public int carp(int i, int i1) {

        Çarpma carpma=new Çarpma();
        int carpim=carpma.çarpma(i,i1);
        return carpim;

    }

}
