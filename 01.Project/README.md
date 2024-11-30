
#  Java Kő-Papír-Olló Játék 

Ez a projekt egy klasszikus **Kő-Papír-Olló** játékot valósít meg Java nyelven. A játékos a számítógép ellen játszik, amely véletlenszerűen választja ki a saját lépését. A cél az, hogy megverjük a gépet a hagyományos szabályok szerint: **Kő** üti az **Ollót**, **Olló** üti a **Papírt**, **Papír** üti a **Követ**.

## Tartalomjegyzék
1. [Követelmények](#követelmények)
2. [Telepítés és futtatás](#telepítés-és-futtatás)
3. [Használati útmutató](#használati-útmutató)
4. [A játék működése](#a-játék-működése)
5. [Fejlesztői megjegyzések](#fejlesztői-megjegyzések)

## Követelmények

- **Java** 8 vagy újabb verzió.
- Fejlesztői környezet (pl. IntelliJ IDEA, Eclipse) - opcionális, ha forráskódból futtatnánk.

## Telepítés és futtatás

1. **Letöltés vagy klónozás:** Klónozd a projektet a GitHub-ról:

   ```bash
   git clone https://github.com/doomhyena/01.Project.git
   cd ko-papir-ollo
   ```

2. **Fordítás és futtatás:** Navigálj a projekt könyvtárba, és használd a következő parancsokat a program fordításához és futtatásához:

   ```bash
   javac main.java
   java main
   ```

   Ezzel elindul a játék a terminálban.

## Használati útmutató

1. A program indításakor a játékos választhat a következő lehetőségek közül:
    - `K` - Kő
    - `P` - Papír
    - `O` - Olló

2. A számítógép véletlenszerűen kiválaszt egy lépést.

3. A program összehasonlítja a játékos és a számítógép választását, majd kiírja az eredményt:
    - **Győzelem:** Ha a játékos nyer.
    - **Vereség:** Ha a számítógép nyer.
    - **Döntetlen:** Ha a választások megegyeznek.

4. A játékosnak lehetősége van új játékot kezdeni vagy kilépni.

## A játék működése

A "Kő-Papír-Olló" játék főbb lépései a következők:
- A program véletlenszám-generátort használ a számítógép választásához.
- A játékos választását a konzolon keresztül kapja meg a program.
- Az eredményeket logikai feltételek alapján határozza meg a program:
    - Ha a játékos választása veri a számítógépét, a játékos nyer.
    - Ha a számítógép választása veri a játékosét, a gép nyer.
    - Ha ugyanazt választják, döntetlen az eredmény.

## Fejlesztői megjegyzések

- A projekt alkalmas a Java alapfogalmainak (feltételes utasítások, ciklusok, felhasználói bemenet kezelése, véletlenszám-generálás) tanulmányozására.
- További bővítési lehetőségek:
    - A játékos és a gép pontszámának tárolása és megjelenítése.
    - Grafikus felhasználói felület (GUI) hozzáadása Swing vagy JavaFX segítségével.
    - Nehezebb szintű, statisztikán alapuló gépi válaszadások implementálása.

---

2024/9/11
