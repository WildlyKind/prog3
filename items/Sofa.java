package items;

import people.Person;

public class Sofa extends Item{
    protected int maxLoad;
    protected int currentLoad;
    protected int currentSag;
    protected double elasticityCoefficient;
    public int countPeople;

    public void addPerson(Person p) {}
    public void removePerson(Person p) {}
    public double getSagPercentage() { return 0.0; }
    public void checkBreak() {}
    public void use() {}
}