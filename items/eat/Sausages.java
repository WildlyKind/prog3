package items.eat;

public class Sausages extends Food {
    protected boolean hot;
    protected boolean burnt;

    public Sausages(int count, String name, boolean isBroken, boolean isMagic) {
        super(count, name, isBroken, isMagic);
    }

    public void eatBy() {}

    public void use() {}
}