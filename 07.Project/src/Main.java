import java.util.Scanner;

public class Main {

    // 21:33
    public static int nthTerm(int a, int d, int n) {
        return a + (n - 1) * d;
    }

    public static int sumOfTerms(int a, int d, int n) {
        return (n * (2 * a + (n - 1) * d)) / 2;
    }

    public static void printSequence(int a, int d, int n) {
        System.out.print("Az első " + n + " elem: ");
        for (int i = 1; i <= n; i++) {
            System.out.print(nthTerm(a, d, i) + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Számtani sorozat kalkulátor");
        System.out.println("Adja meg az első elemet (a): ");
        int a = scanner.nextInt();

        System.out.println("Adja meg a differenciát (d): ");
        int d = scanner.nextInt();

        String command;

        do {
            System.out.println("\nVálasszon egy műveletet:");
            System.out.println("1 - Az első n elem kiszámítása");
            System.out.println("2 - Az n-edik elem meghatározása");
            System.out.println("3 - Az első n elem összegének kiszámítása");
            System.out.println("4 - Kilépés");
            command = scanner.next();

            switch (command) {
                case "1":
                    System.out.println("Adja meg n értékét: ");
                    int n = scanner.nextInt();
                    printSequence(a, d, n);
                    break;

                case "2":
                    System.out.println("Adja meg az elem sorszámát (n): ");
                    n = scanner.nextInt();
                    System.out.println("A sorozat " + n + "-edik eleme: " + nthTerm(a, d, n));
                    break;

                case "3":
                    System.out.println("Adja meg n értékét: ");
                    n = scanner.nextInt();
                    System.out.println("Az első " + n + " elem összege: " + sumOfTerms(a, d, n));
                    break;

                case "4":
                    System.out.println("Kilépés...");
                    break;

                default:
                    System.out.println("Érvénytelen választás. Próbálja újra.");
            }
        } while (!command.equals("4"));

        scanner.close(); // Vége: 22:58
    }
}
