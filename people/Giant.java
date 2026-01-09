package people;

import items.*;

public class Giant extends Person {

    Magicitem cauldron = new Magicitem("Медный котелок", 1, false, true);
    Magicitem sausagesPack = new Magicitem("Расплющенный пакет с сардельками", 1, false, true);
    Magicitem poker = new Magicitem("Кочерга", 1, false, true);
    Magicitem kettle = new Magicitem("Чайник", 1, false, true);
    Magicitem mug = new Magicitem("Щербатая кружка", 2, false, true);

    public Item[] magicItems = {cauldron, sausagesPack, poker, kettle, mug};

    public Giant(String name, Mood mood, int weight, int health) {
        super(name, mood, weight, health);
    }

    public void tieInKnot() {
        Gun gun = new Gun(1,"Ружье", false, false, true);
        System.out.println(getName() + " завязал ружье");
        gun.breakIt();
    }
    public void chuckle() {
        System.out.println("Хм");
    }
    public void cook() {}

}