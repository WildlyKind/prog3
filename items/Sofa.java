package items;

import people.Person;

public class Sofa extends Item{
    protected int maxLoad;
    public int currentLoad;
    protected int currentSag;
    protected double elasticityCoefficient;
    public int countPeople;

    public Sofa(int count, String name, boolean isBroken, boolean isMagic, int maxLoad, double elasticityCoefficient, int currentLoad, int countPeople) {
        super(count, name, isBroken, isMagic);
        this.maxLoad = maxLoad;
        this.elasticityCoefficient = elasticityCoefficient;
        this.currentLoad = currentLoad;
        this.currentSag = (int) (this.currentLoad * this.elasticityCoefficient);
        this.countPeople = countPeople;
    }


    public void addPerson(Person p) {
        countPeople++;
    }

    public void removePerson(Person p) {
        countPeople--;
    }

    public double getSagPercentage() { return 0.0; }
    public void checkBreak() {
        if (currentLoad > maxLoad) {
            isBroken = true;
        }
    }
    public void use() {}
}