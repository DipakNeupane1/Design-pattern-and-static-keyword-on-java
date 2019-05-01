package com.dipak.abstractfactorypattern.serviceimpl;

import com.dipak.abstractfactorypattern.service.Apple;
import com.dipak.abstractfactorypattern.service.Fruit;
/**
 * @author dipak
 */
public class HatbazarConsumed implements Fruit {
    @Override
    public Apple buy() {
        return new Hatbazar();
    }
}
