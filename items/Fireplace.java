package items;

import items.eat.Food;

public class Fireplace extends Item{
    public boolean fire;

    public Fireplace(int count, String name, boolean isBroken, boolean isMagic, boolean fire) {
        super(count, name, isBroken, isMagic);
    }

    public void ignite() {
        fire = true;
    }

    public void cookFood(Food food) {}
    public void stew() {}
    public void use() {}
}