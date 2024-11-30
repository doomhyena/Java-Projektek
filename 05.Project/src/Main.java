import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("-- Számkitalálós játék --");
        Scanner be = new Scanner(System.in);
        Random random = new Random();
        int rnd = random.nextInt(100) + 1;
        int n = 0;

        while (n != rnd) {
            System.out.print("Kérek egy számot 1-100 között: ");
            n = be.nextInt();

            if (n > rnd) {
                System.out.println("A szám kisebb!");
            } else if (n < rnd) {
                System.out.println("A szám nagyobb!");
            } else if (n == rnd) {
                System.out.println("Erre a számra gondoltam! A szám: " + rnd + " volt!");
                System.out.println("-- Játék befejezve! --");
            } else if (n < 1 || n > 100) {
                System.out.println("Nem megfelelő adatok! Próbáld meg újra!");
            } else {
                System.out.println("Nem megfelelő adatok! Próbáld meg újra!");
            }
        }
        be.close();
    }
}