package items;

public abstract class Item {
    public String name;
    public boolean isBroken;
    public boolean isMagic;
    public int count;

    public abstract void use();
}