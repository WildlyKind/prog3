package items.eat;

public abstract class Food extends items.Item {
    protected boolean fresh;

    public Food(int count, String name, boolean isBroken, boolean isMagic) {
        super(count, name, isBroken, isMagic);
    }

    public abstract void eatBy();
}