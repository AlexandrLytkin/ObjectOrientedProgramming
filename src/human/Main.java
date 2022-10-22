package human;

public class Main {
    public static void main(String[] args) {
        Human maxim = new Human(-35, "Максим", "Минск", "бренд-менеджером");
        Human anna = new Human( 29,"Аня", "Москва", "методистом образовательных программ");
        Human katia = new Human(28, "Катя", "Калининград", "продакт-менеджером");
        Human artyom = new Human(27, "Артем", "Москва", "директором по развитию бизнеса");
        Human vladimir = new Human(21, "Владимир", "Казань","сейчас нигде не работает");
        maxim.human();
        anna.human();
        katia.human();
        artyom.human();
        vladimir.human();
    }
}

