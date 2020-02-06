package lektion9.dtuPersoner;

public class Person {

    public String navn;

    public Person(String navn) {
        this.navn = navn;
    }

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    @Override
    public String toString() {
        return "class Person\n\t[navn="+getNavn()+"]";
    }
}
