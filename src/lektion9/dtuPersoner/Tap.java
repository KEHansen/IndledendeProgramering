package lektion9.dtuPersoner;

public class Tap extends Ansat {

    private int arbejdstid;

    public Tap(String navn, String institutnavn, int arbejdstid) {
        super(navn, institutnavn);
        this.arbejdstid = arbejdstid;
    }

    public int getArbejdstid() {
        return arbejdstid;
    }

    public void setArbejdstid(int arbejdstid) {
        this.arbejdstid = arbejdstid;
    }

    @Override
    public String toString() {
        return "class Tap\n\t[navn="+getNavn()+"]" +
                "\n\t[institutnavn="+getInstitutnavn()+"]" +
                "\n\t[arbejdstid="+arbejdstid+"]";

    }
}
