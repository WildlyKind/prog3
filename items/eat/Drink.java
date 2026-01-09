package items.eat;

public abstract class Drink extends items.Item {

    public Drink(int count, String name, boolean isBroken, boolean isMagic) {
        super(count, name, isBroken, isMagic);
    }

    public abstract void use();
}