package people;

import java.util.ArrayList;

import items.Gun;
import items.Item;

public class Giant extends Person {
    protected ArrayList<Item> magicItems;

    public Giant(String name, Mood mood, int weight, int health) {
        super(name, mood, weight, health);
        this.magicItems = new ArrayList<>();
    }

    public void tieInKnot() {
        Gun gun = new Gun(1, false, false, true);
        System.out.println(getName() + " завязал ружье");
        gun.breakIt();
    }
    public void chuckle() {
        System.out.println("Хм");
    }
    public void cook() {}

}