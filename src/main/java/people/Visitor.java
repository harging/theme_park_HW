package people;

import attractions.Attraction;
import behaviours.ITicketed;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Visitor {

    private int age;
    private double height;
    private double money;
    private Attraction visitedAttraction;
    private ArrayList<Attraction> visitedAttractions = new ArrayList<>();

    public Visitor(int age, double height, double money) {
        this.age = age;
        this.height = height;
        this.money = money;
    }

    public int getAge() {
        return age;
    }

    public double getHeight() {
        return height;
    }

    public double getMoney() {
        return money;
    }

    public void addVisitedAttractions(Attraction visitedAttraction) {
        this.visitedAttractions.add(visitedAttraction);
    }
}
