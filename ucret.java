import java.util.Scanner;

public class ucret {
    public static void main(String[] args) {
         double km ;
         double perKm= 2.20,total;
         double startPrice=10;



         Scanner inpunt= new Scanner (System. in);
         System.out.print("Mesafeyi KM cinsinden giriniz:");
         km= inpunt.nextDouble();
         total = km*perKm;
         total+= startPrice;

   // kosul operaterü saglandı total 20 den küçükse 20 tl al degilse totalin kendisini al
      total= (total<20)? 20: total;

        System.out.println("Toplam tutar:"+ total);







    }
}
