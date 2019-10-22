package metods;

public class Circle {

    private double radius;

    public Circle() { //Konstrutør
        radius = 1;
    }

    public void setRadius(double r){
        if (r > 0)
            radius = r;
    }

    public double area() {
        return Math.pow(radius, 2)*Math.PI;
    }

    public double circumference(){
        return 2*Math.PI*radius;
    }

    public String toString() {
        return "Radius: " + radius;
    }

}
