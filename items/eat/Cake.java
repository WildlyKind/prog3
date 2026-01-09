package items.eat;

import items.eat.enums.*;

public class Cake extends Food {
    protected boolean isSquashed;
    protected Glaze glaze;
    protected Filling filling;
    private final cakeSpec spec;

     public Cake(int count, String name, boolean isBroken, boolean isMagic, boolean isSquashed, Glaze glaze, Filling filling) {
        super(count, name, isBroken, isMagic);
        this.isBroken = isBroken;
        this.isMagic = isMagic;
        this.count = count;
        this.isSquashed = isSquashed;
        this.glaze = glaze;
        this.filling = filling;
        this.spec = new cakeSpec(glaze, filling);
    }

    public void use() {
        fresh = false;
    }

    public Glaze getGlaze() {
        return spec.glaze();
    }

    public Filling getFilling() {
        return spec.filling();
    }
}