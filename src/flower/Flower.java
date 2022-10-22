package flower;

public class Flower {
    private String flowerColor;
    private String country;
    private double cost;
    int lifeSpan;

    Flower(String flowerColor, String country, double cost, int lifeSpan) {
        if (flowerColor != null) {
            this.flowerColor = flowerColor;
        } else {
            this.flowerColor = "Белый";
        }
        if (country != null) {
            this.country = country;
        } else {
            this.country = "Россия";
        }
        if (Double.compare(cost, 0) <= 0) {
            this.cost = 1;
        } else {
            this.cost = Math.abs(cost);
        }
        if (lifeSpan <= 0) {
            this.lifeSpan = 3;
        } else {
            this.lifeSpan = Math.abs(lifeSpan);
        }
    }

    public String getFlowerColor() {
        return flowerColor;
    }
    public void setFlowerColor(String flowerColor) {
        if (flowerColor != null) {
            this.flowerColor = flowerColor;
        } else {
            this.flowerColor = "Белый";
        }
    }

    public String getCountry() {
        return country;
    }
    public void setCountry (String country) {
        if (country != null) {
            this.country = country;
        } else {
            this.country = "Россия";
        }
    }

    public double getCost() {
        return cost;
    }
    public void setCost(double cost) {
        if (Double.compare(cost, 0) <= 0) {
            this.cost = 1;
        } else {
            this.cost = Math.abs(cost);
        }
    }
}
