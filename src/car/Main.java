package car;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Lada", "Granta", 1.7, "Yellow", 2015, "Russia");
        Car car2 = new Car("Audi", "A8", 3.0, "Black", 2020, "German");
        Car car3 = new Car("BMW", "Z8", 3.0, "Black", 2021, "German");
        Car car4 = new Car("KIA", "Sportage", 2.4, "Red", 2018, "South Korea");
        Car car5 = new Car("Hyundai", "Avante", 1.6, "Orange", 2016, "South Korea");
        car1.Car();
        car2.Car();
        car3.Car();
        car4.Car();
        car5.Car();
    }
}