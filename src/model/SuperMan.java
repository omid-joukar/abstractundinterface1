package model;

/**
 * Created by KPS on 7/18/2020.
 */
public class SuperMan implements Hero {
    @Override
    public void fight() {
        System.out.println("i am fighting");
    }

    @Override
    public void runn() {
        System.out.println("i am running");
    }
}
