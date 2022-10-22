package flower;

public class Main {
    public static void main(String[] args) {
        Flower rose = new Flower("Роза обыкновенная", "Голландия", 35.59, 0);
        Flower hrizantema = new Flower("Хризантема", null, 15, 5);
        Flower pion = new Flower("Пион", "Англии", 69.9,1);
        Flower glopsofila = new Flower("Гипсофила", "Турция", 19.5,10);
        infoAboutFlower(rose);
        infoAboutFlower(hrizantema);
        infoAboutFlower(pion);
        infoAboutFlower(glopsofila);
        System.out.println();
        costBouquet(rose,hrizantema,pion,glopsofila,rose);
    }

    private static void infoAboutFlower(Flower flower) {
        System.out.println("Название цветка: " + flower.getFlowerColor()
                + ", страна происхождения " + flower.getCountry()
                + ", стоимостью: " + flower.getCost()
                + " срок стояния цветка:" + flower.lifeSpan);
    }

    private static void costBouquet(Flower... flowers) {
        int countFlower = 0;
        double totalCostFlowers = 0;
        int minSpan = flowers[0].lifeSpan;
        for (int i = 0; i < flowers.length; i++) {
            Flower currentFlower = flowers[i];
            totalCostFlowers += currentFlower.getCost();
            if (minSpan > currentFlower.lifeSpan) {
                 minSpan = currentFlower.lifeSpan;
            }
            infoAboutFlower(currentFlower);
            countFlower ++;
        }
        if (countFlower % 2 == 0) {
            System.out.println("четное количесто цветов");
        }

        System.out.println("Стоимость букета :"+totalCostFlowers);
        System.out.println("Срок стояния букета :"+minSpan);
        System.out.println("Цветов в букете :"+countFlower);
    }
}