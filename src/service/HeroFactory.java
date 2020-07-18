package service;

import model.Hero;
import model.SuperMan;

import java.util.Objects;

/**
 * Created by KPS on 7/18/2020.
 */
public class HeroFactory {
    public Hero generateHero(String name){
        Objects.nonNull(name);
        Hero hero = null;
        String lowerName = name.toLowerCase();
        switch (lowerName){
            case "superman":{
                hero = new SuperMan();
                break;
            }
            default:{
                System.out.println("the invalid input name");
                break;
            }
        }
        return hero;
    }
}
