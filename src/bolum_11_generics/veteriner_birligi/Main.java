package bolum_11_generics.veteriner_birligi;

public class Main {
    
    public static void main(String[] args) {
        Kedi kedi=new Kedi("01-01-2016", true, "Van Kedisi");
        kedi.bilgileriGoster();
        System.out.println(kedi);
    }
}
