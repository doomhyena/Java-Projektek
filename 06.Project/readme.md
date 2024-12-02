### Java Szótár

#### **Program Áttekintése**
Ez a Java program egy egyszerű szótár funkcióit valósítja meg, lehetőséget biztosítva szavak hozzáadására és azok jelentéseinek keresésére. A program menüvezérelt, és a fő funkciók osztályokba és metódusokba vannak szervezve, ami elősegíti az átláthatóságot és az újrahasznosíthatóságot.

---

### **Főbb Funkciók**

1. **Szótár Adatstruktúrája**:
   - A szavakat és azok jelentéseit egy `HashMap` tárolja.
   - Kulcs: a szó (pl. *"alma"*).
   - Érték: a jelentés (pl. *"gyümölcs"*).

2. **Moduláris Felépítés**:
   - A szótár műveleteit (hozzáadás és keresés) külön metódusok végzik.
   - A `Main` osztály a szótárkezelő és a fő program logikájának házigazdája.

3. **Felhasználói Interakció**:
   - A `Scanner` osztály lehetővé teszi a felhasználótól érkező bemenetek olvasását.
   - Egy egyszerű szöveges menürendszer irányítja a felhasználót a műveletek között.

4. **Parancsok Kezelése**:
   - A felhasználó a következő lehetőségek közül választhat:
     - **1**: Új szó hozzáadása.
     - **2**: Jelentés keresése egy létező szóhoz.
     - **3**: Kilépés.

---

### **Osztályok és Metódusok**

#### **1. `Main` Osztály**
Ez az osztály tartalmazza a fő program logikáját és a szótárat tároló adatstruktúrát.

##### **Attribútumok**
- `private HashMap<String, String> dictionary`: A szótár, amely a szavakat és jelentéseiket tárolja.

##### **Metódusok**

1. **Konstruktor**:
   - A konstruktor inicializálja a `dictionary` adattagot:
   ```java
   public Main() {
       dictionary = new HashMap<>();
   }
   ```

2. **`addWord`**:
   - Hozzáad egy új szót és annak jelentését a szótárhoz.
   - Paraméterek:
     - `String word`: A hozzáadandó szó.
     - `String meaning`: A szó jelentése.
   - Megvalósítás:
   ```java
   public void addWord(String word, String meaning) {
       dictionary.put(word, meaning);
   }
   ```

3. **`getMeaning`**:
   - Kikeresi egy szó jelentését a szótárból.
   - Paraméter:
     - `String word`: A keresendő szó.
   - Visszatérési érték:
     - A keresett szó jelentése, vagy `null`, ha a szó nem található.
   - Megvalósítás:
   ```java
   public String getMeaning(String word) {
       return dictionary.get(word);
   }
   ```

#### **2. `main` Metódus**
Ez a program belépési pontja, amely a felhasználói interakciót és a menüvezérlést végzi.

- **Felhasználói Parancsok Kezelése**:
  A felhasználó bemenetét egy `do-while` ciklus kezeli, amely addig fut, amíg a felhasználó a **"3"** parancsot nem adja meg.

---

### **Kód Folyamata**

1. **Üdvözlés**:
   - A program üdvözli a felhasználót, majd megjeleníti a parancsokat:
   ```java
   System.out.println("Üdvözöljük az egyszerű szótárban!");
   ```

2. **Menümegjelenítés**:
   - A program megkéri a felhasználót, hogy válasszon a következő parancsok közül:
     - Szó hozzáadása.
     - Jelentés keresése.
     - Kilépés.

3. **Parancs Végrehajtása**:
   - A bemenet alapján a megfelelő műveletet hajtja végre a program:
     - Új szó hozzáadása.
     - Jelentés keresése.
     - Kilépés.

4. **Hibakezelés**:
   - Érvénytelen parancs esetén figyelmezteti a felhasználót.

5. **Kilépés**:
   - A program bezárja a szótárt és befejezi a futást.

---

### **Teljes Kód**

```java
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

        scanner.close();
    }
}
```

---

### **Példa Futtatás**

**Kimenet**:
```
Üdvözöljük az egyszerű szótárban!
Válasszon egy parancsot: (1) Szó hozzáadása (2) Jelentés keresése (3) Kilépés
1
Adja meg a szót: alma
Adja meg a jelentését: gyümölcs
A szó hozzáadva.
Válasszon egy parancsot: (1) Szó hozzáadása (2) Jelentés keresése (3) Kilépés
2
Adja meg a keresett szót: alma
A(z) alma jelentése: gyümölcs
Válasszon egy parancsot: (1) Szó hozzáadása (2) Jelentés keresése (3) Kilépés
3
Kilépés a szótárból.
```

---

### **Továbbfejlesztési Lehetőségek**
1. **Fájlkezelés**: A szavakat elmenthetjük és visszatölthetjük fájlból.
2. **Többnyelvű támogatás**: A `HashMap` helyett összetettebb adatstruktúrával több nyelv kezelése is megvalósítható.
3. **Érvényesítés**: Ellenőrizzük, hogy a szó vagy a jelentés nem üres-e, mielőtt hozzáadjuk.
