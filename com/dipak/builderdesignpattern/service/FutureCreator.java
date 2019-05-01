package com.dipak.builderdesignpattern.service;

import com.dipak.builderdesignpattern.domain.Future;
/**
 * @author dipak
 */
public interface FutureCreator {
    Future create();
    FutureCreator setEducation(final String education);
    FutureCreator setLabour(final String labour);
    FutureCreator setCountry(final String country);
}
