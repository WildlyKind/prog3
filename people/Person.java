package people;

import java.util.ArrayList;
import items.eat.*;
import items.*;

public class Person {
    public String name;
    protected Mood mood;
    protected ArrayList<Item> items;
    protected double weight;
    protected int health;
    public Item inHands;

    public Person(String name, Mood mood, double weight, int health) {
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

    public void handshake(Person p) {
        if (inHands == null  || p.inHands == null) {
            setMood(mood.HAPPY);
            p.setMood(mood.HAPPY);
        }
        if (this instanceof Giant || p instanceof Giant) {
            this.health -= 5;
        }
    }

    public void sitDown(Sofa sofa) {
        sofa.currentLoad += this.weight;
    }

    public void bustle(Person person) {
        person.setMood(mood.INTERESTING);
    }

    public void eat(Food food) {
        if (food.count > 0) {
            if (health < 90) {
                health += 10;
            } else {
                health = 100;
            }
            weight += 0.3;
            mood = mood.HAPPY;
            if (food.fresh == false) {
                health -= 20;
            }
        }
        food.use();
    }

    public void drink(Drink drink) {
        if (drink.count > 0) {
            if (health < 95) {
                health += 5;
            } else {
                health = 100;
            }
            mood = mood.HAPPY;
            weight += 0.1;
        }
        drink.use();
    }

    public void setMood(Mood m) {
        mood = m;
    }

    public Mood getCurrentMood() {
        return mood;
    }
}