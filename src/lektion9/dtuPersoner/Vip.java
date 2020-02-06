package lektion9.dtuPersoner;

public class Vip extends Ansat {

    private String[] kurser;

    public Vip(String navn, String institutnavn, String[] kurser) {
        super(navn, institutnavn);
        if (kurser.length <= 4)
            this.kurser = kurser;
    }

    public String[] getKurser() {
        return kurser;
    }

    public void setKurser(String[] kurser) {
        this.kurser = kurser;
    }

    @Override
    public String toString() {
        String kursus = "[kursus=" + kurser[0] + "]";
        if (kurser.length > 1) {
            for (int i = 1; i < kurser.length; i++) {
                kursus += "\n\t[kursus=" + kurser[i] + "]";
            }
        }
        return "class Vip\n\t[navn=" + getNavn() + "]" +
                "\n\t[institutnavn=" + getInstitutnavn() + "]" +
                "\n\t" + kursus;
    }
}
