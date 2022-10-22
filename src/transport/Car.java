package transport;

import java.time.LocalDate;

public class Car {
    public static class Key {
         private final boolean remoteStartEngine;
        private final boolean keylessAccess;

        public Key(boolean remoteStartEngine, boolean keylessAccess) {
            this.remoteStartEngine = remoteStartEngine;
            this.keylessAccess = keylessAccess;
        }

        public Key() {
            this(false, false);
        }

        public boolean isRemoteStartEngine() {
            return remoteStartEngine;
        }

        public boolean isKeylessAccess() {
            return keylessAccess;
        }
    }

    public static class Insurance {
        private final LocalDate lastDate;
        private final double cost;
        private final String numberInsurance;

        public Insurance() {
            this(null, 6500, null);
        }

        public LocalDate getLastDate() {
            return lastDate;
        }

        public double getCost() {
            return cost;
        }

        public String getNumberInsurance() {
            return numberInsurance;
        }

        public Insurance(LocalDate lastDate, double cost, String numberInsurance) {
            if (lastDate == null) {
                this.lastDate = LocalDate.now().plusDays(365);
            } else {
                this.lastDate = lastDate;
             }
            this.cost = cost;
            if (numberInsurance == null) {
                this.numberInsurance = "123456789";
            } else {
                this.numberInsurance = numberInsurance;
            }
        }
        public void checkLastDate() {
            if (lastDate.isBefore(LocalDate.now()) || lastDate.isEqual(LocalDate.now())) {
                System.out.println("нужно срочно ехать оформлять новую страховку  ");
            }
        }

        public void checkNumberInsurance() {
            if (numberInsurance.length() != 9) {
                System.out.println("Номер страховки некорректный!");
            }
        }


    }

    private final String brand;
    private final String model;
    private double engineVolume;
    private String color;
    private final int productionYear;
    private final String productionCountry;
    private String transmission;
    private final String bodyType;
    private String registrationNumber;
    private final int seatPlace;
    private String summerTires;
    private Key key;
    private Insurance insurance;


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
        if (key == null) {
            this.key = new Key();
        } else {
            this.key = key;
        }
        if (insurance == null) {
            this.insurance = new Insurance();
        } else {
            this.insurance = insurance;
        }
        this.transmission = "МКПП";
        this.bodyType = "седан";
        this.registrationNumber = "х000хх000";
        this.seatPlace = 5;
        this.summerTires = "лето";

    }

    public String getBrand() {
        return brand;
    }
    public String getModel() {
        return model;
    }
    public int getProductionYear() {
        return productionYear;
    }
    public String getProductionCountry() {
        return productionCountry;
    }
    public String getBodyType() {
        return bodyType;
    }
    public int getSeatPlace() {
        return seatPlace;
    }

    public double getEngineVolume() {
        return engineVolume;
    }
    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getTransmission() {
        return transmission;
    }
    public void setTransmission(String transmission) {
        if (transmission == null) {
            this.transmission = "МКПП";
        } else {
            this.transmission = transmission;
        }
    }
    public String getRegistrationNumber() {
        return registrationNumber;
    }
    public void setRegistrationNumber(String registrationNumber) {
        if (registrationNumber == null) {
            this.registrationNumber = "х000хх000";
        } else {
            this.registrationNumber = registrationNumber;
        }
    }
    public String getSummerTires() {
        return summerTires;
    }
    public void setSummerTires(String summerTires) {
        if (summerTires == "лето") {
            this.summerTires = summerTires;
        }
        if (summerTires == "зима") {
            this.summerTires = summerTires;
        } else {
            this.summerTires = "не корректные данные "+summerTires+" : введите «лето» или «зима»";
        }
    }
    public Key getKey() {
        return key;
    }
    public void setKey(Key key) {
        this.key = key;
    }
    public Insurance getInsurance() {
        return insurance;
    }

    public void setInsurance(Insurance insurance) {
        this.insurance = insurance;
    }

    public void changeTires(String typeTires) {
        if (typeTires == "лето" || typeTires == "зима") {
            summerTires = typeTires;
        } else {
            this.summerTires = "не корректные данные "+null+" : введите «лето» или «зима»";
        }
    }
    public boolean checkNumber() {
        if (registrationNumber.length() != 9) {
            return false;
        }
        char[] chars = registrationNumber.toCharArray();
        if (!Character.isAlphabetic(chars[0]) || !Character.isAlphabetic(chars[4]) || !Character.isAlphabetic(chars[5])) {
            return false;
        }
        if (!Character.isDigit(chars[1]) || !Character.isDigit(chars[2]) || !Character.isDigit(chars[3]) ||
                !Character.isDigit(chars[6]) || !Character.isDigit(chars[7]) ||!Character.isDigit(chars[8])) {
            return false;
        }
        return true;
    }

}