package bolum_11_generics;

public class GenericDiziYazdir<GelenVeriTürü> {

    public void yazdir(GelenVeriTürü[] dizi){
        for(GelenVeriTürü gecici : dizi){
            System.out.println(gecici);
        }
    }
    
}
