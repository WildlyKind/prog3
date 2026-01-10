package items;

public class Gun extends Item {
    public boolean loaded;
    public boolean isBroken;

    public Gun(int count, String name, boolean isBroken, boolean isMagic, boolean loaded) {
        super(count, name, isBroken, isMagic);
        this.loaded = loaded;
    }

    public void breakIt() {
        this.isBroken = true;
        this.loaded = false;
        check(this.isBroken);
    }

    public void use() {
        this.loaded = false;
    }
}