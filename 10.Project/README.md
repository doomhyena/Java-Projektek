# Ragzás

## Leírás
Ez a Java program egy fájlból (`nevek.txt`) olvas neveket, meghatározza az utolsó szó magánhangzóinak típusát ("magas" vagy "mély"), és a megfelelő magyar toldalékot (`-nek` vagy `-nak`) csatolja hozzá. Ha az utolsó magánhangzó `e`, `a`, `i` vagy `u`, akkor a hosszú változatára (`é`, `á`, `í`, `ú`) cseréli, mielőtt a toldalékot hozzáadná.

## Funkciók
- Nevek beolvasása a `nevek.txt` fájlból.
- Magánhangzó-harmónia meghatározása (magas/mély).
- Az utolsó magánhangzó módosítása, ha szükséges.
- A megfelelő toldalék (`-nek` vagy `-nak`) hozzáadása.
- Az átalakított nevek konzolra való kiírása.

## Telepítés
1. Győződj meg róla, hogy a Java telepítve van.
2. Mentsd el a megadott Java kódot `Main.java` néven.
3. Hozz létre egy `nevek.txt` fájlt ugyanabban a könyvtárban, és adj hozzá neveket (soronként egyet).
4. Fordítsd le és futtasd a programot:
   ```sh
   javac Main.java
   java Main
   ```

## Használat
1. Adj hozzá neveket a `nevek.txt` fájlhoz.
2. Futtasd a programot.
3. A módosított nevek a megfelelő toldalékkal a konzolon jelennek meg.

## Példa
**Bemenet (`nevek.txt`)**:
```
Géza
Béla
Anna
Zoltán
```

**Kimenet**:
```
Gézának
Bélának
Annának
Zoltánnak
```

## Fájlstruktúra
```
projekt_konyvtar/
│-- Main.java
│-- nevek.txt
```

## Licenc
Ez a projekt nyílt forráskódú és szabadon felhasználható.

