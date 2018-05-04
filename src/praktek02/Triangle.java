package praktek02;
public class Triangle {
    double alas;
    double tinggi;
    
    void cetakinfo(){
        System.out.println("==================");
        System.out.println("ALAS    : "+alas);
        System.out.println("TINGGI  : "+tinggi);
        System.out.println("==================");    
    }

    public Triangle() {
        alas = 20;
        tinggi = 10;
    }
    
    
    double hitungLuas(){
        double luas;
        luas = 0.5*alas*tinggi;
        return luas;
    }
    
    void cetakluas(){
        System.out.println("Luasnya adalah : "+hitungLuas());
    }
}
