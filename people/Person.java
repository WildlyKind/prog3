package people;

import java.util.ArrayList;
import items.Item;
import items.eat.*;;

public class Person {
    public String name;
    protected Mood mood;
    protected ArrayList<Item> items;
    protected int weight;
    protected int health;
    public Item inHands;

    public Person(String name, Mood mood, int weight, int health) {
        this.name = name;
        this.mood = mood;
        this.weight = weight;
    }

    public void speak(String text) {
        System.out.println(getName() + ": " + text);
    }

    public String getName() { 
        return name;
    }

    public Item getItem(Item item) {
        inHands = item;
        return null;
    }

    public void throwIt() {}

    public void handshake(Person p) {
        if (inHands == null  || p.inHands == null) {
            setMood(mood.HAPPY);
            p.setMood(mood.HAPPY);
        }
        if (this instanceof Giant || p instanceof Giant) {
            this.health -= 5;
        }
    }

    public boolean sitDown() { return false; }
    public void bustle() {}
    public void eat(Food food) {}
    public void drink(Drink drink) {}

    public void setMood(Mood m) {
        mood = m;
    }

    public Mood getCurrentMood() {
        return mood;
    }
}