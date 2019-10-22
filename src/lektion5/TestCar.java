package lektion5;

import metods.Car;

public class TestCar {

    public static void main(String[] args) {

        Car minBil = new Car("Audi", "VS 51322", "Hvid", 0);


        Car minBrorsBil = new Car("Audi", "VS 51322", "Hvid", 0);
        Car jonasBil = new Car("Audi", "BF 34872", "Hvid", 0);
        Car minSøstersBil = new Car("Susuki", "AN 94433", "Sort", 0);

        System.out.println(minBil);
        System.out.println(minBrorsBil);
        System.out.println(jonasBil);
        System.out.println(minSøstersBil);
        /*System.out.println("Min bil er også min brors bil: " + minBil.equals(minBrorsBil));
        System.out.println("Min bil er også Jonas' bil: " + minBil.equals(jonasBil));
        System.out.println("Min bil ligner Jonas' bil: " + minBil.alike(jonasBil));
        System.out.println("Min bil ligner min søsters bil: " + minBil.alike(minSøstersBil));*/

    }
}
