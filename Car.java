public class Car {
    private String model;
    private String type;
    private double tankSize;
    private double time;
    private double mpg;

    public Car(String model, String type, int tankSize, double time) {
        this.model = model;
        this.type = type;
        this.tankSize = literToGallon(tankSize);
        this.time = time;
        this.mpg = calculateMPG();
    }

    private double calculateMPG() {
        return (time * 60)/tankSize;
    }

    private boolean meetsStandards() {
        if (type.equals("Sedan")) return mpg >= 50;
        if (type.equals("SUV")) return mpg >= 40;
        if (type.equals("Truck")) return mpg >= 30;

        System.out.println(type + " is not a car type.");
        return false;
    }

    private double literToGallon(double tankSize) {return tankSize / 3.785;}

    public void printResults() {
        if (meetsStandards()) System.out.println(model + ": MPG: " + mpg + ": Does meet standards");
        else System.out.println(model + ": MPG: " + mpg + ": Does not meet standards");

    }
}