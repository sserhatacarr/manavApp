import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double armut = 2.14, elma = 3.67, domates = 1.11, muz = 0.95, patlican = 5.0;
        double kga, kge, kgd, kgm, kgp, total;

        //Ürün kilogram fiyatları ve kullancıdan alınıcak kg miktar karşılıkları değişken olarak tanımlandı.

        Scanner inp = new Scanner(System.in);

        System.out.print("Kaç kilo armut istiyorsunuz ? : ");
        kga = inp.nextDouble();
        armut *= kga;

        System.out.print("Kaç kilo elma istiyorsunuz ? : ");
        kge = inp.nextDouble();
        elma *= kge;

        System.out.print("Kaç kilo domates istiyorsunuz ? : ");
        kgd = inp.nextDouble();
        domates *= kgd;

        System.out.print("Kaç kilo muz istiyorsunuz ? : ");
        kgm = inp.nextDouble();
        muz *= kgm;

        System.out.print("Kaç kilo patlıcan istiyorsunuz ? : ");
        kgp = inp.nextDouble();
        patlican *= kgp;

        //Scanner sınıfından nesne üretildi ve kullanıdan alınan kilogram karşılıkları değişkenlere atandı.

        total = armut + elma + domates + muz + patlican;
        System.out.print("Toplam tutar = " + total);

        // Toplam tutar hesaplandı ve yazdırıldı.


    }
}
