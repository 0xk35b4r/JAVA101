import java.util.Scanner;
public class DikUcgendeHipotenusBulanProgram {
    public static void main(String[] args) {
        // Değişkenler
        int a, b;
        double c;

        // Scanner Import
        // Kullanıcıdan Veri Alma
        Scanner input = new Scanner(System.in);
        System.out.print("a kenar uzunluğunu giriniz : ");
        a = input.nextInt();
        System.out.print("b kenar uzunluğunu giriniz : ");
        b = input.nextInt();

        c = Math.sqrt((a*a) + (b*b));
        System.out.println(c);




        
    }
}
