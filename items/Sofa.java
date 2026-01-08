package items;

import people.Person;

public class Sofa extends Item{
    protected int maxLoad;
    protected int currentLoad;
    protected int currentSag;
    protected double elasticityCoefficient;
    public int countPeople;

    public Sofa(int count, int maxLoad, double elasticityCoefficient, int currentLoad, int currentSag, int countPeople) {
        this.count = count;
        this.maxLoad = maxLoad;
        this.elasticityCoefficient = elasticityCoefficient;
        this.currentLoad = currentLoad;
        this.currentSag = currentSag;
        this.countPeople = countPeople;
    }


    public void addPerson(Person p) {}
    public void removePerson(Person p) {}
    public double getSagPercentage() { return 0.0; }
    public void checkBreak() {}
    public void use() {}
}