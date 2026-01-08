package people;

import java.util.ArrayList;
import items.Item;
import items.eat.*;;

public class Person {
    protected String name;
    protected Mood mood;
    protected ArrayList<Item> items;
    protected int weight;
    protected int health;

    public void speak() {}
    public String getName() { return ""; }
    public Item getItem(Item item) { return null; }
    public void throwIt() {}
    public void handshake() {}
    public boolean sitDown() { return false; }
    public void bustle() {}
    public void eat(Food food) {}
    public void drink(Drink drink) {}
    public void setMood() {}
    public Mood getCurrentMood() { return null; }
}