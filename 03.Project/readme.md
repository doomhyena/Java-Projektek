# Java Discord Rich Presence 

## **1. Maven Projekt Létrehozása**
1. Nyiss egy terminált vagy IDE-t (pl. IntelliJ IDEA vagy Eclipse).
2. Hozz létre egy új Maven projektet az alábbi paranccsal:
   ```bash
   mvn archetype:generate -DgroupId=com.example -DartifactId=DiscordRichPresence -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false
   ```
3. Navigálj a projekt könyvtárába:
   ```bash
   cd DiscordRichPresence
   ```

---

## **2. `pom.xml` Frissítése**
1. Nyisd meg a projekt gyökérkönyvtárában található `pom.xml` fájlt.
2. Add hozzá a Discord SDK Wrapper függőséget és a natív fájlok kezeléséhez szükséges függőséget:

   ```xml
   <dependencies>
       <!-- Discord RPC Wrapper -->
       <dependency>
           <groupId>de.jcm.discordgamesdk</groupId>
           <artifactId>discord-gamesdk</artifactId>
           <version>2.0.0</version>
       </dependency>
   </dependencies>

   <repositories>
       <repository>
           <id>jitpack.io</id>
           <url>https://jitpack.io</url>
       </repository>
   </repositories>
   ```

---

## **3. Discord Alkalmazás Beállítása**
1. Nyisd meg a [Discord Developer Portal](https://discord.com/developers/applications) oldalt.
2. Hozz létre egy új alkalmazást:
    - Kattints a **New Application** gombra.
    - Add meg a projekt nevét.
3. Jegyezd fel a **Client ID**-t és a **Client Secret**-et.
4. Navigálj a **Rich Presence** szekcióhoz:
    - Tölts fel egy nagy képet (pl. `large_image` néven).
    - Ez lesz az, amit a program a Rich Presence során megjelenít.

---

## **4. `.env` Fájl Létrehozása**
1. Hozz létre egy `.env` fájlt a projekt gyökérkönyvtárában.
2. Add meg benne a következő adatokat:
   ```
   clientId=123456789012345678  # Cseréld ki a saját Client ID-ra
   clientSecret=your-client-secret  # Nem feltétlen szükséges itt
   ```

---

## **5. A Program Futtatása**
1. **Kód megírása**:
    - Helyezd el a megadott Java kódot a `src/main/java/com/example/DiscordRichPresence.java` fájlba.
2. **Buildelés**:
    - Futtasd az alábbi parancsot a terminálban:
      ```bash
      mvn clean install
      ```
3. **Program futtatása**:
    - Indítsd el a programot az alábbi paranccsal:
      ```bash
      mvn exec:java -Dexec.mainClass="com.example.DiscordRichPresence"
      ```

---

## **6. Hibakeresés**
- **SDK Nem Található**: Ellenőrizd, hogy a Discord SDK megfelelő verzióját töltötted-e le, és a futtatókörnyezet tudja használni.
- **Rich Presence Nem Frissül**:
    - Ellenőrizd, hogy a Discord kliens fut-e a számítógépen.
    - Bizonyosodj meg róla, hogy a `.env` fájl helyes Client ID-t tartalmaz.

---

## **7. Opciók és Testreszabás**
- **Részletek módosítása**:
    - A `setDetails()` és `setState()` metódusokkal a megjelenített szöveg változtatható.
- **Gombok frissítése**:
    - Szerkeszd a `ActivityButton` objektumokat a kívánt URL-ek és címek megadásával.

---

## **8. Folyamatban Futás**
A program folyamatosan frissíti a Rich Presence-t, amíg fut. A folyamat leállításához nyomd meg a **Ctrl+C** billentyűkombinációt.

