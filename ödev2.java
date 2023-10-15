package src;
import java.util.Scanner;
public class ödev2 {


        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);

            System.out.println("Lütfen 3 sayı giriniz:");
            double sayi1 = scan.nextDouble();

            double sayi2 = scan.nextDouble();

            double sayi3 = scan.nextDouble();

            double enBuyuk = sayi1;
            double enKucuk = sayi1;
            if  (sayi1 > enBuyuk) {
                enBuyuk = sayi1;
            } else if (sayi1 < enKucuk) {
                enKucuk = sayi1;
            }
            if (sayi2 > enBuyuk) {
                enBuyuk = sayi2;
            } else if (sayi2 < enKucuk) {
                enKucuk = sayi2;
            }

            if (sayi3 > enBuyuk) {
                enBuyuk = sayi3;
            } else if (sayi3 < enKucuk) {
                enKucuk = sayi3;
            }

            System.out.println("En büyük sayı: " + enBuyuk);
            System.out.println("En küçük sayı: " + enKucuk);

        }
    }

