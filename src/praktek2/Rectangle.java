package praktek2;
public class Rectangle {
   double panjang;
   double lebar;

    public Rectangle() {
        panjang=5;
        lebar=2;
    }
   
   void cetakinfo(){
       system.out.println("====================");
       system.out.println("panjang :"+panjang);
       system.out.println("lebar   :"+lebar);
       system.out.println("====================");
        }
   
   double hitungluas() {
       double luas;
       luas=panjang*lebar;
       return luas;        
   }
   
   void cetakluas(){
       system.out.println("luasnya adalah: "+hitungluas());
   }
}
