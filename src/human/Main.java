package human;

public class Main {
    public static void main(String[] args) {
        Human maxim = new Human(-1987, "Максим", "Минск", "бренд-менеджером");
        Human anna = new Human( 1997,"Аня", "Москва", "методистом образовательных программ");
        Human katia = new Human(1994, "Катя", "Калининград", "продакт-менеджером");
        Human artyom = new Human(1995, "Артем", "Москва", "директором по развитию бизнеса");
        maxim.human();
        anna.human();
        katia.human();
        artyom.human();
    }
}

