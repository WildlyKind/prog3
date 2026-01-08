package people;

import java.util.ArrayList;
import items.Item;

public class Giant extends Person {
    protected ArrayList<Item> magicItems;
    protected Item inHands;

    public boolean tieInKnot() { return false; }
    public void chuckle() {}
    public void cook() {}
}