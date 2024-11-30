# Java Számkitalálás Játék

#### Program Áttekintése
Ez a Java program egy egyszerű számkitalálós játékot valósít meg, amelyben a játékosnak ki kell találnia egy véletlenszerűen generált számot 1 és 100 között. A program visszajelzést ad a játékosnak, hogy a tippje nagyobb vagy kisebb a generált számnál, egészen addig, amíg a játékos el nem találja a helyes számot. A játék végén a program kiírja a helyes számot, majd befejezi a futást.

---

### Főbb Funkciók
1. **Véletlenszám Generálás**:
    - A program egy `Random` objektum segítségével generál egy véletlen számot az `[1, 100]` intervallumban.
   ```java
   Random random = new Random();
   int rnd = random.nextInt(100) + 1;
   ```

2. **Felhasználói Interakció**:
    - A program a `Scanner` osztály segítségével olvassa be a felhasználó tippjeit a konzolról.
   ```java
   Scanner be = new Scanner(System.in);
   ```

3. **Tipp Ellenőrzés**:
    - A program ellenőrzi, hogy a felhasználó tippje nagyobb, kisebb, vagy pontosan megegyezik a generált számmal. Az eredményről visszajelzést ad.
   ```java
   if (n > rnd) {
       System.out.println("A szám kisebb!");
   } else if (n < rnd) {
       System.out.println("A szám nagyobb!");
   }
   ```

4. **Helyes Tipp és Játék Vége**:
    - Ha a felhasználó eltalálja a helyes számot, a program kiírja az eredményt és kilép.
   ```java
   System.out.println("Erre a számra gondoltam! A szám: " + rnd + " volt!");
   System.out.println("-- Játék befejezve! --");
   ```

5. **Bemenet Érvényesítése**:
    - A program figyelmeztetést ad, ha a felhasználó nem az `[1, 100]` intervallumban ad meg számot, bár a logika helytelenül szerepel (ezt később részletezzük).

---

### Kód Részei és Funkcionalitásuk

#### 1. **Main osztály és a `main` metódus**
A program futása a `main` metódusban kezdődik. Itt történik a játék fő logikájának implementációja.

#### 2. **Véletlenszám Generálása**
```java
int rnd = random.nextInt(100) + 1;
```
- A `Random` osztály `nextInt(100)` metódusa egy `[0, 99]` intervallumba eső egész számot generál. Ezt az értéket megnövelve biztosítjuk, hogy a generált szám `[1, 100]` intervallumba essen.

#### 3. **Felhasználói Tipp Beolvasása**
```java
n = be.nextInt();
```
- A `Scanner` osztály segítségével olvassuk be a felhasználó által megadott számot.

#### 4. **Döntési Struktúra**
A `while` ciklus fut, amíg a felhasználó tippje nem egyezik meg a generált számmal. A különböző eseteket `if-else` ágak kezelik:
- **Tipp nagyobb a generált számnál**: "A szám kisebb!" üzenet.
- **Tipp kisebb a generált számnál**: "A szám nagyobb!" üzenet.
- **Helyes tipp**: "Erre a számra gondoltam!" üzenet.
- **Nem megfelelő tipp**: Bár van egy feltétel az `[1, 100]` intervallumon kívüli értékek kezelésére, ez nem kerül végrehajtásra a jelenlegi logika miatt.

---

### Javítási Javaslatok
1. **Bemenet Érvényesítése**:
    - Az intervallumon kívüli értékek ellenőrzése hibás, mert azokat az `else if` ágak előtt kellene kezelni. Így módosítható:
   ```java
   if (n < 1 || n > 100) {
       System.out.println("Nem megfelelő adatok! Próbáld meg újra!");
   } else if (n > rnd) {
       System.out.println("A szám kisebb!");
   } else if (n < rnd) {
       System.out.println("A szám nagyobb!");
   } else {
       System.out.println("Erre a számra gondoltam! A szám: " + rnd + " volt!");
       System.out.println("-- Játék befejezve! --");
   }
   ```

2. **Hibakezelés**:
    - Ha a felhasználó nem számot ad meg, a program kivételt dob. Ennek kezelésére érdemes a `try-catch` blokkot használni:
   ```java
   try {
       n = be.nextInt();
   } catch (InputMismatchException e) {
       System.out.println("Kérlek, számot adj meg!");
       be.nextLine(); // Törli a helytelen bemenetet
       continue; // Újraindítja a ciklust
   }
   ```

3. **Kód Olvashatóság Javítása**:
    - A fölösleges `else if` ágakat el lehet távolítani:
   ```java
   } else {
       System.out.println("Erre a számra gondoltam! A szám: " + rnd + " volt!");
       System.out.println("-- Játék befejezve! --");
   }
   ```

---

### Példa Futtatás
**Kimenet**:
```
-- Számkitalálós játék --
Kérek egy számot 1-100 között: 50
A szám nagyobb!
Kérek egy számot 1-100 között: 75
A szám kisebb!
Kérek egy számot 1-100 között: 62
A szám nagyobb!
Kérek egy számot 1-100 között: 68
Erre a számra gondoltam! A szám: 68 volt!
-- Játék befejezve! --
```

