public class Fjord {
    public static void main(String[] args) {
        Car car = new Car("Takk", "Sedan", 50, 8);
        Car car2 = new Car("Beklager", "Sedan", 40, 7.5);
        Car car3 = new Car("Vakker", "SUV", 60, 5);
        Car car4 = new Car("Stygg", "SUV", 55, 6);
        Car car5 = new Car("Vanskellig", "Truck", 65, 4.75);
        Car car6 = new Car("Lastebil", "Truck", 70, 5.5);


        car.printResults();
        car2.printResults();
        car3.printResults();
        car4.printResults();
        car5.printResults();
        car6.printResults();
    }
}