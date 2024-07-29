package Basic;
import java.util.Scanner;
public class BuyuktenKucuge {
    public static void main(String[] args) {
        //Kullanıcıdan alınan 3 sayıyı büyükten küçüğe sıralayan program
        Scanner input = new Scanner(System.in);

        System.out.println("İlk sayıyı girin: ");
        int a = input.nextInt();
        System.out.println("İkinci sayıyı girin: ");
        int b = input.nextInt();
        System.out.println("Üçüncü sayıyı girin: ");
        int c = input.nextInt();

        if (a > b && a > c) {
            if (b > c) {
                System.out.println("Büyükten küçüğe sıralamamız: a > b > c");
            } else {
                System.out.println("Büyükten küçüğe sıralamamız: a > c > b");
            }
        } else if (b > a && b > c) {
            if (a > c) {
                System.out.println("Büyükten küçüğe sıralamamız: b > a > c");
            } else {
                System.out.println("Büyükten küçüğe sıralamamız: b > c > a");
            }
        } else if (c > a && c > b) {
            if (a > b) {
                System.out.println("Büyükten küçüğe sıralamamız: c > a > b");
            } else {
                System.out.println("Büyükten küçüğe sıralamamız: c > b > a");
            }
        } else {
            System.out.println("Sayılar birbirine eşittir");
        }
    }
}
