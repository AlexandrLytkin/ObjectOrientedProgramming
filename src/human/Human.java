package human;

import java.time.LocalDate;

public class Human {
    private int age;
    private String name;
    private String city;
    String job;


    Human(int age, String name, String city, String job) {

        if (age >= 0) {
            this.age = LocalDate.now().getYear() - age;
        } else {
            this.age = LocalDate.now().getYear() - Math.abs(age);
        }

        if (name != null && !name.isEmpty() && !name.isBlank()) {
            this.name = name;
        } else {
            this.name = "Информация не указана";
        }

        if (city != null && !city.isEmpty() && !city.isBlank()) {
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

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        if (age >= 0) {
            this.age = LocalDate.now().getYear() - age;
        } else {
            this.age = LocalDate.now().getYear() - Math.abs(age);
        }
    }

    public String getName() {
        return name;
    }
    public void setName (String name) {
        if (name != null && !name.isEmpty() && !name.isBlank()) {
            this.name = name;
        } else {
            this.name = "Информация не указана";
        }
    }

    public String getCity() {
        return city;
    }
    public void setCity (String city) {
        if (city != null && !city.isEmpty() &&  !city.isBlank()) {
            this.city = city;
        } else {
            this.city = "Информация не указана";
        }
    }

    void human() {
        System.out.println("Привет! Меня зовут "+getName()+" Я из города "+getCity()+" Я родился в "+ getAge() +" году. Я работаю на должности: "+job+" Будем знакомы! ");
    }
}
