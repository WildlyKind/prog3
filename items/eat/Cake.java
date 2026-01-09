package items.eat;

import items.eat.enums.*;

public class Cake extends Food {
    protected boolean isSquashed;
    protected Glaze glaze;
    protected Filling filling;

     public Cake(int count, String name, boolean isBroken, boolean isMagic, boolean isSquashed, Glaze glaze, Filling filling) {
        super(count, name, isBroken, isMagic);
        this.isBroken = isBroken;
        this.isMagic = isMagic;
        this.count = count;
        this.isSquashed = isSquashed;
        this.glaze = glaze;
        this.filling = filling;
    }

    public void eatBy() {}

    public void use() {}
}