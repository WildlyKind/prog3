package items;

public abstract class Item {
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

    public abstract void use();
}