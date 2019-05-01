package com.dipak.abstractfactorypattern.serviceimpl;

import com.dipak.abstractfactorypattern.service.Apple;
/**
 * @author dipak
 */
public class SuperMarket implements Apple {
    @Override
    public void eat() {
        System.out.println("Apple Consumed from supermarket");
    }
}
