import java.util.HashMap;
import java.util.Scanner;

public class Main {
    private HashMap<String, String> dictionary;

    public Main() {
        dictionary = new HashMap<>();
    }

    public void addWord(String word, String meaning) {
        dictionary.put(word, meaning);
    }

    public String getMeaning(String word) {
        return dictionary.get(word);
    }

    public static void main(String[] args) {
        Main myDictionary = new Main();
        Scanner scanner = new Scanner(System.in);
        String command;

        System.out.println("Üdvözöljük az egyszerű szótárban!");

        do {
            System.out.println("Válasszon egy parancsot: (1) Szó hozzáadása (2) Jelentés keresése (3) Kilépés");
            command = scanner.nextLine();

            switch (command) {
                case "1":
                    System.out.print("Adja meg a szót: ");
                    String word = scanner.nextLine();
                    System.out.print("Adja meg a jelentését: ");
                    String meaning = scanner.nextLine();
                    myDictionary.addWord(word, meaning);
                    System.out.println("A szó hozzáadva.");
                    break;

                case "2":
                    System.out.print("Adja meg a keresett szót: ");
                    String searchWord = scanner.nextLine();
                    String foundMeaning = myDictionary.getMeaning(searchWord);
                    if (foundMeaning != null) {
                        System.out.println("A(z) " + searchWord + " jelentése: " + foundMeaning);
                    } else {
                        System.out.println("A(z) " + searchWord + " szó nem található a szótárban.");
                    }
                    break;

                case "3":
                    System.out.println("Kilépés a szótárból.");
                    break;

                default:
                    System.out.println("Érvénytelen parancs. Kérjük, próbálja újra.");
                    break;
            }
        } while (!command.equals("3"));

        scanner.close(); // 38 perc
    }
}