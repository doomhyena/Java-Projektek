# Java Számtani Sorozat Kalkulátor

### Program Áttekintése

Ez a Java program egy számtani sorozattal foglalkozó kalkulátor, amely három fő funkciót kínál:

1. **Az első `n` elem kiszámítása** és megjelenítése.
2. **Az `n`-edik elem meghatározása** a sorozatban.
3. **Az első `n` elem összegének kiszámítása**.

A felhasználó interaktív menüből választhatja ki a kívánt műveletet, miközben a program a számtani sorozatok matematikai képleteit használja a számításokhoz.

---

### Főbb Funkciók

#### 1. Az `n`-edik elem meghatározása
- A program az alábbi képlet alapján számítja ki a számtani sorozat `n`-edik elemét:
  \[
  a_n = a + (n - 1) \cdot d
  \]
  - Itt:
    - `a`: a sorozat első eleme.
    - `d`: a differencia (az egymást követő elemek közötti különbség).
    - `n`: az elem sorszáma.

#### 2. Az első `n` elem összegének kiszámítása
- Az első `n` elem összege a következő képlet segítségével kerül kiszámításra:
  \[
  S_n = \frac{n}{2} \cdot (2 \cdot a + (n - 1) \cdot d)
  \]
  - Ez egy közismert képlet, amely a sorozat kezdő- és végértékeire, valamint az elemek számára épít.

#### 3. Az első `n` elem megjelenítése
- Egy ciklus segítségével az első `n` elem kerül kiszámításra és megjelenítésre:
  - Minden elem az `a_n` képlet alapján számolódik ki.

---

### Kód Részei és Funkcióik

#### 1. **`nthTerm` Metódus**
- Ez a metódus számolja ki a számtani sorozat `n`-edik elemét.
- Kód:
  ```java
  public static int nthTerm(int a, int d, int n) {
      return a + (n - 1) * d;
  }
  ```
- **Bemenet**: `a` (első elem), `d` (differencia), `n` (elem sorszáma).
- **Kimenet**: Az `n`-edik elem.

#### 2. **`sumOfTerms` Metódus**
- Az első `n` elem összegét számolja ki.
- Kód:
  ```java
  public static int sumOfTerms(int a, int d, int n) {
      return (n * (2 * a + (n - 1) * d)) / 2;
  }
  ```
- **Bemenet**: `a`, `d`, `n`.
- **Kimenet**: Az első `n` elem összege.

#### 3. **`printSequence` Metódus**
- Az első `n` elem értékeit jeleníti meg a konzolon.
- Kód:
  ```java
  public static void printSequence(int a, int d, int n) {
      System.out.print("Az első " + n + " elem: ");
      for (int i = 1; i <= n; i++) {
          System.out.print(nthTerm(a, d, i) + " ");
      }
      System.out.println();
  }
  ```
- **Bemenet**: `a`, `d`, `n`.
- **Kimenet**: Az első `n` elem konzolra írt értékei.

#### 4. **`main` Metódus**
- A program itt indul el, és ez biztosítja a felhasználói interakciót.
- Menüt jelenít meg, ahol a felhasználó választhat:
  - Az első `n` elem kiszámítása (`1`).
  - Az `n`-edik elem meghatározása (`2`).
  - Az első `n` elem összege (`3`).
  - Kilépés (`4`).
- Az opciók alapján a megfelelő metódus kerül meghívásra.

---

### Példa Futtatás

#### **Bemenet**:
```
Számtani sorozat kalkulátor
Adja meg az első elemet (a): 2
Adja meg a differenciát (d): 3
```

#### **Menü**:
```
1 - Az első n elem kiszámítása
2 - Az n-edik elem meghatározása
3 - Az első n elem összegének kiszámítása
4 - Kilépés
```

#### **Példa 1: Az első 5 elem kiszámítása**:
**Bemenet**:
```
1
Adja meg n értékét: 5
```
**Kimenet**:
```
Az első 5 elem: 2 5 8 11 14
```

#### **Példa 2: A 10-edik elem meghatározása**:
**Bemenet**:
```
2
Adja meg az elem sorszámát (n): 10
```
**Kimenet**:
```
A sorozat 10-edik eleme: 29
```

#### **Példa 3: Az első 5 elem összege**:
**Bemenet**:
```
3
Adja meg n értékét: 5
```
**Kimenet**:
```
Az első 5 elem összege: 40
```

#### **Példa 4: Kilépés**:
**Bemenet**:
```
4
```
**Kimenet**:
```
Kilépés...
```

---

### Javítási Javaslatok és Fejlesztési Lehetőségek

1. **Input Kezelése**:
   - Ellenőrizzük, hogy a felhasználó számokat ad-e meg, és hiba esetén figyelmeztessük.
   - Például:
     ```java
     if (n <= 0) {
         System.out.println("Kérjük, pozitív egész számot adjon meg!");
     }
     ```

2. **Fájlkezelés**:
   - A programot tovább lehet fejleszteni úgy, hogy a sorozat adatait fájlba mentse vagy onnan olvassa be.

3. **Grafikus Felület**:
   - Egy egyszerű grafikus felhasználói felület (GUI) hozzáadása a felhasználói élmény növeléséhez.

4. **További Funkciók**:
   - Számtani sorozat vizsgálata adott számok alapján (pl. egy adott szám része-e a sorozatnak)
