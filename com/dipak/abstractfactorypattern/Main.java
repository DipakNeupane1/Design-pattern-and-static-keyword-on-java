package com.dipak.abstractfactorypattern;

import com.dipak.abstractfactorypattern.service.Apple;
import com.dipak.abstractfactorypattern.service.Fruit;
import com.dipak.abstractfactorypattern.serviceimpl.HatbazarConsumed;
import com.dipak.abstractfactorypattern.serviceimpl.SuperMarketConsumed;

import java.util.Scanner;

/**
 * @author dipak
 */
public class Main {

    public static void main(String[] args) {
        Fruit fruit = null;
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter market name to buy fruits");
        String inter = scanner.nextLine();
        if (inter.equals("bazar")) {
            fruit = new HatbazarConsumed();
        } else if (inter.equals("market")) {
            fruit = new SuperMarketConsumed();
        } else {
            System.out.println("Sorry wrong entered....");
           main(args);
        }
        Apple apple = fruit.buy();
        apple.eat();
        main(args);
    }
}
