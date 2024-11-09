import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner elso = new Scanner(System.in);

        System.out.println("Kérek egy számot: ");
        int elsoszam = elso.nextInt();
        System.out.println("A felhasználó által beadott szám: " + elsoszam);
        System.out.println("Kérek egy második számot: ");
        int masodikszam = elso.nextInt();
        System.out.println("A felhasználó által beadott szám: " + masodikszam);

        System.out.print("Milyen matematikai műveletet szeretnő használni?");
        System.out.println("1: Összeadás");
        System.out.println("2: Kivonás");
        System.out.println("3: Szorzás");
        System.out.println("4: Osztás");
        System.out.println("5: Maradékos osztás");
        int muvelet = elso.nextInt();
        System.out.println("A felhasználó által beadott szám: " + muvelet);

        int osszeg = elsoszam + masodikszam;
        int kivonas = elsoszam - masodikszam;
        int szorzas = elsoszam * masodikszam;
        int osztas = elsoszam / masodikszam;
        int maradok = elsoszam % masodikszam;

        if (muvelet == 1) {
            System.out.println("Az összeg: " + osszeg);
        } else if (muvelet == 2) {
            System.out.println("A különbség: " + kivonas);
        } else if (muvelet == 3) {
            System.out.println("A szorzatuk: " + szorzas);
        } else if (muvelet == 4) {
            System.out.println("Az osztás: " + osztas);
        } else if (muvelet == 5) {
            System.out.println("A mararékos osztás: " + maradok);
        }
    }
}