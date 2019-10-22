package metods;

import java.util.Objects;

public class Car {

    private int serialNr = 0, counter, local = 1;
    private String mærke, nrPlade, farve;

    public Car(String mærke, String nrPlade, String farve, int serialNr) {
        this.mærke = mærke;
        this.nrPlade = nrPlade;
        this.farve = farve;
        this.serialNr = serialNr + ++local;



    }

    public String getBrand() {
        return mærke;
    }

    public void setBrand(String mærke) {
        this.mærke = mærke;
    }

    public String getLicenseplate() {
        return nrPlade;
    }

    public void setLicenseplate(String nrPlade) {
        this.nrPlade = nrPlade;
    }

    public String getColor() {
        return farve;
    }

    public void setColor(String farve) {
        this.farve = farve;
    }

    public boolean equals(Car otherCar) {
        return Objects.equals(nrPlade, otherCar.nrPlade);
    }

    public boolean alike(Car otherCar) {
        return Objects.equals(mærke, otherCar.mærke) &&
                Objects.equals(farve, otherCar.farve);
    }

    @Override
    public String toString() {
        return '[' + nrPlade + "] " + serialNr + ' ' + farve + ' ' + mærke;
    }
}
