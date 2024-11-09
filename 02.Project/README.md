# Java Számológép

Ez a projekt egy alapvető számológép-alkalmazást valósít meg, amely konzolos felületen kér be két számot a felhasználótól, és lehetőséget ad alapvető matematikai műveletek elvégzésére. A támogatott műveletek: **Összeadás**, **Kivonás**, **Szorzás**, **Osztás** és **Maradékos osztás**.

## Tartalomjegyzék
1. [Követelmények](#követelmények)
2. [Telepítés és futtatás](#telepítés-és-futtatás)
3. [Használati útmutató](#használati-útmutató)
4. [Működési elv](#működési-elv)
5. [Fejlesztői megjegyzések](#fejlesztői-megjegyzések)

## Követelmények

- **Java** 8 vagy újabb verzió
- Fejlesztői környezet (pl. IntelliJ IDEA, Eclipse) - opcionális

## Telepítés és futtatás

1. **Forráskód letöltése vagy klónozása:**
   ```bash
   git clone https://github.com/felhasznalonev/java-szamologep.git
   cd java-szamologep
   ```

2. **Fordítás és futtatás:**
    - Navigálj a projekt könyvtárba, majd használd a következő parancsokat:
   ```bash
   javac Main.java
   java Main
   ```

3. **Használat:** A program konzolon keresztül fog kommunikálni a felhasználóval.

## Használati útmutató

1. **Számok megadása:**
    - A program először bekéri az első számot, majd a másodikat.

2. **Művelet kiválasztása:**
    - A felhasználó kiválaszthatja a kívánt műveletet a következő menüpontok alapján:
        - `1`: Összeadás
        - `2`: Kivonás
        - `3`: Szorzás
        - `4`: Osztás
        - `5`: Maradékos osztás

3. **Eredmény megjelenítése:**
    - A program azonnal kiírja az eredményt, a választott műveletnek megfelelően.

### Példa

- A program futása során a konzolon a következőképp néz ki:

   ```
   Kérek egy számot: 
   10
   Kérek egy második számot: 
   5
   Milyen matematikai műveletet szeretnél használni?
   1: Összeadás
   2: Kivonás
   3: Szorzás
   4: Osztás
   5: Maradékos osztás
   3
   A szorzatuk: 50
   ```

## Működési elv

A program a következő logikai lépéseken keresztül működik:

- A felhasználó két számot és egy műveletet ad meg.
- Az alkalmazás a művelet alapján kiszámítja és kiírja az eredményt:
    - `+`, `-`, `*`, `/`, `%` műveleteket támogat.
- Figyelem: Az osztás művelet esetén a program csak egész számokat kezel, így ha a második szám 0, osztási hiba léphet fel.

## Fejlesztői megjegyzések

- **Hibaelhárítás**: A program nem kezeli a nulla osztót, ezért bővítés javasolt a hibakezelésre.
- **További funkciók**: Az alkalmazás bővíthető lebegőpontos számok támogatásával vagy új műveletekkel.

--- 
2024/09/11