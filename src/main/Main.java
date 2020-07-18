package main;

import model.Hero;
import service.HeroFactory;

/**
 * Created by KPS on 10/22/2019.
 */


public  class Main {

    public  static  void main(String[] args) throws ClassNotFoundException
    {
        HeroFactory heroFactory = new HeroFactory();
        Hero superman = heroFactory.generateHero("SuperMan");
        superman.fight();
    }

}
