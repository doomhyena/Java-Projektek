# Jelszógenerátor

Ez a projekt egy egyszerű jelszógenerátor Java nyelven, amely véletlenszerű, biztonságos jelszavakat hoz létre adott hosszúságban.

## Főbb jellemzők
- A jelszó tartalmaz legalább egy nagybetűt, egy kisbetűt, egy számjegyet és egy speciális karaktert.
- A jelszó hossza legalább 4 karakter kell legyen.
- A karakterek véletlenszerű sorrendbe keverése biztosítja a biztonságot.
- A generált jelszó biztonságos véletlenszám-generátort (SecureRandom) használ.

## Használat
1. **Futtatás**:
    - A program egy 12 karakter hosszú jelszót generál és kiírja a konzolra.
    - A jelszó hosszát az `int passwordLength = 12;` változó módosításával lehet megváltoztatni.

2. **Fő metódusok**:
    - `generatePassword(int length)`: Véletlenszerű jelszót generál a megadott hosszúsággal.
    - `shuffleString(String input)`: A generált jelszó karaktereit véletlenszerűen összekeveri.

## Példa kimenet
```
Generált jelszó: A2b!3Xy9&*
```

## Fejlesztési követelmények
- Java 8 vagy újabb verzió.

## Fordítás és futtatás
Fordítsd le a forráskódot:
```
javac Main.java
```

Majd futtasd:
```
java Main
```

## Licenc
Ez a projekt szabadon felhasználható és módosítható.

