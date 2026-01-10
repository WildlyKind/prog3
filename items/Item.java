package items;

import java.util.Objects;

import exceptions.ItemIsBrokenException;

public abstract class Item implements Usable{
    public String name;
    public boolean isBroken;
    public boolean isMagic;
    public int count;

    public Item(int count, String name, boolean isBroken, boolean isMagic) {
        this.count = count;
        this.name = name;
        this.isBroken = isBroken;
        this.isMagic = isMagic;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Item item = (Item) o;
        return count == item.count &&
               isBroken == item.isBroken &&
               isMagic == item.isMagic &&
               Objects.equals(name, item.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(count, name, isBroken, isMagic);
    }

    @Override
    public String toString() {
        return "Item{ name=" + name + ", count=" + count + ", isBroken=" + isBroken + ", isMagic=" + isMagic +"}";
    }

    public abstract void use();

    public void check(boolean isBroken) {
        try {
            if (isBroken) {
                throw new ItemIsBrokenException(name);
            }
        } catch (ItemIsBrokenException e) {
            System.out.println(e.getMessage());
        }
    }
}
