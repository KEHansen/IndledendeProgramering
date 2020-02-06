package ejendomvurdering;

public class ForurenetGrund extends Grund {

    private int fradrag;

    public ForurenetGrund(int areal, int kvadratmeterpris, int byggeret, int fradrag) {
        super(areal, kvadratmeterpris, byggeret);
        this.fradrag = fradrag;
    }

    public void sætFradrag(int fradrag) {
        this.fradrag = fradrag;
    }

    public int vurdering() {
        return areal * kvadratmeterpris + byggeret - fradrag;
    }
}
