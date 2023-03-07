import java.util.Scanner;
public class ManavKasaProgrami {
    public static void main(String[] args) {
        double armut, elma, domates, muz, patlican;
        double armutfiyat = 2.14;
        double elmafiyat = 3.67;
        double domatesfiyat = 1.11;
        double muzfiyat = 0.95;
        double patlicanfiyati = 5.00;

        Scanner input = new Scanner (System.in);

        System.out.print("Kaç kilo armut aldınız?: ");
        armut = input.nextDouble();
        System.out.print("Kaç kilo elma aldınız?: ");
        elma = input.nextDouble();
        System.out.print("Kaç kilo domates aldınız?: ");
        domates = input.nextDouble();
        System.out.print("Kaç kilo muz aldınız?: ");
        muz = input.nextDouble();
        System.out.print("Kaç kilo patlıcan aldınız?: ");
        patlican = input.nextDouble();

        double toplam = (armut*armutfiyat)+(elma*elmafiyat)+(muz*muzfiyat)+(patlican*patlicanfiyati)+(domates*domatesfiyat);
        System.out.print("Toplam Tutar: " +toplam);



    }
}
