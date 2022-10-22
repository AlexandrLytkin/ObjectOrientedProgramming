package car;

import transport.Car;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Lada", "Granta", 1.7, "Yellow", 2015, "Russia");
        Car car2 = new Car("Audi", "A8", 3.0, "Black", 2020, "German");
        Car car3 = new Car("BMW", "Z8", 3.0, "Black", 2021, "German");
        Car car4 = new Car("KIA", "Sportage", 2.4, "Red", 2018, "South Korea");
        Car car5 = new Car("Hyundai", "Avante", 1.6, "Orange", 2016, "South Korea");
        car1.setRegistrationNumber("c666cc666");
        car1.setTransmission("вариатор");
        car1.setKey(new Car.Key(true,true));
        car1.setInsurance(new Car.Insurance(LocalDate.now(), 15000, "12345678"));
        car1.getInsurance().checkNumberInsurance();
        car1.getInsurance().checkLastDate();
        infoAboutCar(car1);
        infoAboutCar(car2);
        infoAboutCar(car3);
        infoAboutCar(car4);
        infoAboutCar(car5);
    }

    private static void infoAboutCar(Car car) {
        System.out.println("марка "+ car.getBrand()
                +" модель "+ car.getModel()
                +" объем двигателя в литрах "+ car.getEngineVolume()
                +" цвет кузова "+ car.getColor()
                +" год производства "+ car.getProductionYear()
                +" страна сборки "+ car.getProductionCountry()
                +" трансмиссия: "+ car.getTransmission()
                +" тип кузова:"+ car.getBodyType()
                +" регистрационный номер:"+ car.getRegistrationNumber()
                +" мест в салоне: "+ car.getSeatPlace()
                +" покрышки: "+ car.getSummerTires()
                +", "+ (car.getKey().isKeylessAccess() ?"безключевой доступ" : "ключ зажигания")
                +", "+ (car.getKey().isRemoteStartEngine() ? "удаленый запуск" : "обычный запуск")
                +", номер страховки"+ car.getInsurance().getNumberInsurance()
                +", стоимость страховки"+ car.getInsurance().getCost()
                +", срок действия страховки"+ car.getInsurance().getLastDate()
        );



    }


}