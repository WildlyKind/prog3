package items;

public class Gun extends Item {
    public boolean loaded;
    public boolean isBroken = false;

    public Gun(int count, boolean isBroken, boolean isMagic, boolean loaded) {
        this.count = count;
        this.isBroken = isBroken;
        this.isMagic = isMagic;
        this.loaded = loaded;
    }

    public void breakIt() {
        this.isBroken = true;
        System.out.println("Ружье сломано");
    }

    public void use() {}
}