package human;

public class Human {
    private int yearOfBirth;
     String name;
     String city;
     String job;

    Human(int yearOfBirth, String name, String city, String job) {
        if (yearOfBirth >= 0) {
            this.yearOfBirth = yearOfBirth;
        } else {
            this.yearOfBirth = Math.abs(yearOfBirth);
        }
        if (name != null) {
            this.name = name;
        } else {
            this.name = "Информация не указана";
        }
        if (city != null) {
            this.city = city;
        } else {
            this.city = "Информация не указана";
        }
        if (job != null) {
            this.job = job;
        } else {
            this.job = "Информация не указана";
        }
    }

    void human() {
        System.out.println("Привет! Меня зовут "+name+" Я из города "+city+" Я родился в "+yearOfBirth+" году. Я работаю на должности "+job+" Будем знакомы! ");
    }
}
