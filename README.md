# Java-Projektek Repository

Ez a repozitórium különböző Java projektek gyűjteménye, melyek példákat, gyakorlatokat és különféle feladatokat tartalmaznak Java nyelven.
## Tartalom

A repó jelenlegi projektjei:
- **01.Project**: Egy egyszerű kő papír olló játék. 2024/10/30
- **02.Project**: Egy egyszerű számológép. 2024/11/09

## Követelmények

A projektek futtatásához szükséges:
- **Java Development Kit (JDK)** 17 vagy újabb verzió
- **Maven** (ha Maven alapú a projekt), vagy Gradle
- Opcionális: Egyes projektek specifikus csomagokat igényelhetnek, ezek a `pom.xml` vagy `build.gradle` fájlban találhatók.

## Futtatási útmutató

1. Klónozd a repozitóriumot:
   ```bash
   git clone https://github.com/felhasznalonev/repo-neve.git
   cd repo-neve
   ```
2. Navigálj a kívánt projekt mappájába.
3. Kompile és futtasd a projektet:

   Ha egy egyszerű `javac` parancsot használsz:
   ```bash
   javac src/Main.java
   java -cp src Main
   ```

   Maven projekt esetén:
   ```bash
   mvn clean install
   mvn exec:java -Dexec.mainClass="com.example.Main"
   ```

   Gradle projekt esetén:
   ```bash
   ./gradlew run
   ```

## Strukturális információk

A projektek mappákba rendezve találhatók:
```
/root-repo
│
├── 01.Project/
│   ├── src/
│   └── README.md
│
├── 02.Project/
│   ├── src/
│   └── README.md
└──
```

## Hasznos források

- [Java Dokumentáció](https://docs.oracle.com/en/java/)
- [Maven Dokumentáció](https://maven.apache.org/guides/)
- [Spring Boot Dokumentáció](https://spring.io/projects/spring-boot)

## Kapcsolat

Ha kérdésed van vagy hibát találtál, nyiss egy [issue](https://github.com/felhasznalonev/repo-neve/issues)-t vagy küldj egy emailt: **doomhyenaofficial@gmail.com**
