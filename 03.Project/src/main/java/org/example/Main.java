package org.example;
import de.jcm.discordgamesdk.*;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        try {
            LibraryLoader.loadLibrary();
        } catch (Exception e) {
            e.printStackTrace();
            return;
        }

        long clientId = Long.parseLong(System.getenv("clientId"));
        Core core = new Core(clientId);

        try {
            Activity activity = new Activity();
            activity.setDetails("FIRST ROW");
            activity.setState("SECOND ROW");
            activity.timestamps().setStart(Instant.now());
            activity.assets().setLargeImage("A kép neve");
            activity.assets().setLargeText("A kép szövege ami ráhúzásnál látszik");

            HashMap<Integer, ActivityButton> buttons = new HashMap<>();
            buttons.put(0, new ActivityButton("Discord", "https://discord.gg/daZgQG3cm9"));
            buttons.put(1, new ActivityButton("Github", "https://github.com/doomhyena"));
            activity.setButtons(buttons.values().toArray(new ActivityButton[0]));

            core.activityManager().updateActivity(activity);

            System.out.println("Ready");

            while (true) {
                core.runCallbacks();
                Thread.sleep(1000);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            core.close();
        }
    }
}