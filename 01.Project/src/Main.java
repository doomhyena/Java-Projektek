import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] rps = {"k", "p", "o"};
        String computermove = rps[new Random().nextInt(rps.length)];
        Scanner s = new Scanner(System.in);
        String playerMove;

        while (true) {
            System.out.println("Kérlek írd meg, hogy te mit választasz (k, p vagy o): ");
            playerMove = s.nextLine();
            if (playerMove.equals("k") || playerMove.equals("p") || playerMove.equals("o")) {
                break;
            }
            System.out.println(playerMove + "nem egy valid kézmozdulat.");
        }
        System.out.println("A gép kézmozdulata: " + computermove);

        if (playerMove.equals(computermove)) {
            System.out.println("A játék dönntetlen lett!");
        } else if (playerMove.equals("k")) {
            if (computermove.equals("o")) {
                System.out.println("Vesztettél!");
            } else if (computermove.equals("p")) {
                System.out.println("Nyertél!");
            }
        } else if (playerMove.equals("p")) {
            if (computermove.equals("k")) {
                System.out.println("Vesztettél!");
            } else if (computermove.equals("o")) {
                System.out.println("Nyertél!");
            }
        } else if (playerMove.equals("o")) {
            if (computermove.equals("p")) {
                System.out.println("Vesztettél!");
            } else if (computermove.equals("k")) {
                System.out.println("Nyertél!");
            }
        }
    }
}