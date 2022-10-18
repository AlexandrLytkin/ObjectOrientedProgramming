package car;

public class Car {
    String brand;
    String model;
    double engineVolume;
    String color;
    int productionYear;
    String productionCountry;

    public Car(String brand, String model, double engineVolume, String color, int productionYear, String productionCountry) {
        if (brand != null) {
            this.brand = brand;
        } else {
            this.brand = "default";
        }

        if (model != null) {
            this.model = model;
        } else {
            this.model = "default";
        }

        if (Double.compare(engineVolume, 0) != 0) {
            this.engineVolume = engineVolume;
        } else {
            this.engineVolume = 1.5;
        }

        if (color != null) {
            this.color = color;
        } else {
            this.color = "white";
        }

        if (productionYear != 0) {
            this.productionYear = productionYear;
        } else {
            this.productionYear = 2000;
        }

        if (productionCountry != null) {
            this.productionCountry = productionCountry;
        } else {
            this.productionCountry = "default";
        }
    }

    void Car() {
        System.out.println("марка "+brand+" модель "+model+" объем двигателя в литрах "+engineVolume+" цвет кузова "+color+" год производства "+productionYear+" страна сборки "+productionCountry);
    }
}