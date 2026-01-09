package items.eat;

public class Sausages extends Food {
    public boolean hot;
    public boolean burnt;

    public Sausages(int count, String name, boolean isBroken, boolean isMagic) {
        super(count, name, isBroken, isMagic);
    }

    public void use() {
        fresh = false;
    }
}