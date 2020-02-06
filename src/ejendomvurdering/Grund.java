package ejendomvurdering;

public class Grund {

    public int areal, kvadratmeterpris, byggeret;

    public Grund(int areal, int kvadratmeterpris, int byggeret) {
        this.areal = areal;
        this.kvadratmeterpris = kvadratmeterpris;
        this.byggeret = byggeret;
    }

    public int vurdering() {
        return areal * kvadratmeterpris + byggeret;
    }
}
