import java.io.*;

public class Main {

    public enum MaganhangzoTipus {
        Magas,
        Mely
    }

    private static BufferedReader olvaso;

    public static void main(String[] args) {
        try {
            olvaso = new BufferedReader(new FileReader("nevek.txt"));
            String sor = null;
            while((sor = olvaso.readLine()) != null) {
                MaganhangzoTipus tipus = getMaganhangzoTipus(sor);
                if(tipus == MaganhangzoTipus.Mely) {
                    System.out.println(utolsoMaganhangzoCsere(sor) + "nak");
                } else {
                    System.out.println(utolsoMaganhangzoCsere(sor) + "nek");
                }
            }
        } catch (Exception x) {
            x.printStackTrace();
        }
    }

    public static MaganhangzoTipus getMaganhangzoTipus(String str) {
        String[] reszek = str.split(" ");
        String szo = reszek[reszek.length - 1];
        String magasMaganhangzok = szo.replaceAll("[^eéiíöőüű]", "");
        String melyMaganhangzok = szo.replaceAll("[^aáoóuú]", "");
        if(magasMaganhangzok.length() == 0 && melyMaganhangzok.length() == 0) {
            return MaganhangzoTipus.Mely;
        } else if (magasMaganhangzok.length() != 0 && melyMaganhangzok.length() == 0) {
            return MaganhangzoTipus.Magas;
        } else if(magasMaganhangzok.length() == 0 && melyMaganhangzok.length() != 0) {
            return MaganhangzoTipus.Mely;
        } else {
            return MaganhangzoTipus.Mely;
        }
    }

    public static String utolsoMaganhangzoCsere(String nev) {
        String utolsoBetu = nev.substring(nev.length() - 1);
        if(utolsoBetu.equals("e")) {
            return nev.substring(0, nev.length() - 1) + "é";
        } else if (utolsoBetu.equals("a")) {
            return nev.substring(0, nev.length() - 1) + "á";
        } else if(utolsoBetu.equals("i")) {
            return nev.substring(0, nev.length() - 1) + "í";
        } else if(utolsoBetu.equals("u")) {
            return nev.substring(0, nev.length() - 1) + "ú";
        }
        return nev;
    }
}
