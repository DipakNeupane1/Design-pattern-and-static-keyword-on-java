package com.dipak.abstractfactorypattern.serviceimpl;

import com.dipak.abstractfactorypattern.service.Apple;
/**
 * @author dipak
 */
public class Hatbazar implements Apple {
    @Override
    public void eat() {
        System.out.println("Apple consumed from Hatbazaar");

    }
}
