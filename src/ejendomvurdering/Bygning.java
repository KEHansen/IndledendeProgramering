package ejendomvurdering;

public class Bygning {

    public int areal, kvadratmeterpris;

    public Bygning(int areal, int kvadratmeterpris) {
        this.areal = areal;
        this.kvadratmeterpris = kvadratmeterpris;
    }

    public int getAreal() {
        return areal;
    }

    public void setAreal(int areal) {
        this.areal = areal;
    }

    public int getKvadratmeterpris() {
        return kvadratmeterpris;
    }

    public void setKvadratmeterpris(int kvadratmeterpris) {
        this.kvadratmeterpris = kvadratmeterpris;
    }

    public int vurdering() {
        return areal * kvadratmeterpris;
    }
}
