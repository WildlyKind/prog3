package items;

import home.Home;
import items.eat.Food;

public class Fireplace extends Item{
    public boolean fire;

    public Fireplace(boolean fire) {
        this.fire = fire;
    }

    public void ignite() {
        fire = true;
    }

    public void cookFood(Food food) {}
    public void stew() {}
    public void use() {}
}