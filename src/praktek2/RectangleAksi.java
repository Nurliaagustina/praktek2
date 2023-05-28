package praktek2;

public class RectangleAksi {
    public static void main(String[] args) {
        Rectangle rl = new Rectangle();
        rl.panjang = 9;
        rl.lebar =3;
        
        rl.cetakinfo();
        system.out.println("luas rectangle = "+rl.hitungluas());
        rl.cetakluas();
        
        rectangle r2 = new rectangle();
        r2.cetakinfo();
        
        rectangle r3 = new rectangle(50,30);
        r3.cetakinfo();
    }
}
