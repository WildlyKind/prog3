package people;

import items.*;
import items.eat.*;

public class Giant extends Person {

    Magicitem cauldron = new Magicitem("Медный котелок", 1, false, true);
    Magicitem sausagesPack = new Magicitem("Расплющенный пакет с сардельками", 1, false, true);
    Magicitem poker = new Magicitem("Кочерга", 1, false, true);
    Magicitem kettle = new Magicitem("Чайник", 1, false, true);
    Magicitem mug = new Magicitem("Щербатая кружка", 2, false, true);
    Mead mead = new Mead(1, "Янтарно-желтая жидкость", false, false);

    public Item[] magicItems = {cauldron, sausagesPack, poker, kettle, mug, mead};

    public Giant(String name, Mood mood, int weight, int health) {
        super(name, mood, weight, health);
    }

    public void tieInKnot(Gun gun) {
        System.out.println(getName() + " завязал ружье");
        gun.breakIt();
    }

    public void chuckle() {
        System.out.println("Хм");
    }

    public Tea cookTea(int count) {
        Tea tea = new Tea(count, "Чай", false, false);
        tea.hot = true;
        return tea;
    }

    public Sausages cookSausages(int count) {
        Sausages sausages = new Sausages(count, "Сосиска", false, false);
        sausages.hot = true;
        sausages.fresh = true;
        return sausages;
    }

}