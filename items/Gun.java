package items;

public class Gun extends Item {
    public boolean loaded;
    public boolean isBroken = false;

    public Gun(int count, String name, boolean isBroken, boolean isMagic, boolean loaded) {
        super(count, name, isBroken, isMagic);
    }

    public void breakIt() {
        this.isBroken = true;
        this.loaded = false;
        System.out.println(this.name + " сломано");
    }

    public void use() {}
}