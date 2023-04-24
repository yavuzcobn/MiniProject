package kahvemakinesi;

import java.util.Scanner;

public class KahveSecimi {

    public static void hangiKahve(){

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen Kahve Seciminizi yapiniz: 1.Türk kahvesi  2.Filtre Kahve 3.Espresso");
        String kahve = input.nextLine();

        if (kahve.equalsIgnoreCase("Türk kahvesi")){
            System.out.println(kahve +" hazırlanıyor.");
        }
        else if (kahve.equalsIgnoreCase("Filtre Kahve")){
            System.out.println(kahve +" hazırlanıyor.");
        }
        else if (kahve.equalsIgnoreCase("Espresso")){
            System.out.println(kahve +" hazırlanıyor.");
        }
        else {
            System.out.println("Hatalı tuşlama yaptınız.");
        }

    }

    public static void sut(){

        Scanner scan =new Scanner(System.in);
        String sut ="";

        do {
            System.out.println("Sut eklememizi ister misiniz? (Evet veya Hayir olarak cevaplayiniz.) : ");
            sut = scan.next();
            if (sut.equalsIgnoreCase("Evet")) {
                System.out.println("Sut ekleniyor...");
                break;
            } else if (sut.equalsIgnoreCase("Hayir")) {
                System.out.println("Sut eklenmiyor...");
                break;
            } else {
                System.out.println("Hatali giris!");
            }
        } while (true);
    }

    public static void seker(){

        Scanner scan =new Scanner(System.in);
        String seker ="";
        int kacSeker = 0;

        do {
            System.out.println("Seker ister misiniz ? (Evet veya hayır cevabını veriniz) : ");
            seker = scan.next();
            if (seker.equalsIgnoreCase("Evet")) {
                System.out.println("Kac seker ekleyelim?");
                kacSeker = Math.abs(scan.nextInt());
                System.out.println( kacSeker + " Seker ekleniyor...");
                break;
            } else if (seker.equalsIgnoreCase("Hayir")) {
                System.out.println("Seker eklenmiyor...");
                break;
            } else {
                System.out.println("Hatali giris!");
            }
        } while (true);
    }

    public static void boyut(){

        Scanner scan =new Scanner(System.in);
        String boyut ="";

        do {

            System.out.println("Kahveniz hangi boyutta olsun? (Buyuk boy, orta boy, kucuk boy olarak giriniz.) : ");

            boyut = scan.nextLine();
            System.out.println();
            if (boyut.equalsIgnoreCase("buyuk boy") ||
                    boyut.equalsIgnoreCase("orta boy") ||
                    boyut.equalsIgnoreCase("kucuk boy")) {
                System.out.println("Kahveniz " + boyut + " hazirlaniyor");
                break;
            } else {
                System.out.println("Hatali secim...");
            }

        } while (true);

    }

//    public static void sonuc() {
//
//        hangiKahve();
//        boyut();
//        System.out.println( kahve+" "+boyut+" hazirdir.Afiyet olsun !!!");
//    }

}

