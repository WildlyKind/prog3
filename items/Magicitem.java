package items;

public class Magicitem extends Item {
    public boolean isBroken = false;

    public Magicitem(String name, int count, boolean isBroken, boolean isMagic) {
        super(count, name, isBroken, isMagic);
    }

    public void use() {}
}