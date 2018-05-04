package praktek02;
public class TriangleAksi {
    public static void main(String[] args) {
        Triangle t1 = new Triangle();
        t1.alas = 20;
        t1.tinggi = 10;
        
        t1.cetakinfo();
        
        System.out.println("Luas Triangle = "+t1.hitungLuas());
    }
}
