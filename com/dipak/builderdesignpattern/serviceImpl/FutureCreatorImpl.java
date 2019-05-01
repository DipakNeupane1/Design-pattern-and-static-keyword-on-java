package com.dipak.builderdesignpattern.serviceImpl;

import com.dipak.builderdesignpattern.domain.Future;
import com.dipak.builderdesignpattern.service.FutureCreator;
/**
 * @author dipak
 */
public class FutureCreatorImpl implements FutureCreator {

    private Future tmpFuture;

    public FutureCreatorImpl(){
        this.tmpFuture=new Future();
    }

    @Override
    public Future create() {
        Future future=new Future();
        future.setEducation(tmpFuture.getEducation());
        future.setLabour(tmpFuture.getLabour());
        future.setCountry(tmpFuture.getCountry());
        return future;
    }

    @Override
    public FutureCreator setEducation(String education) {
        tmpFuture.setEducation(education);
        return this;
    }

    @Override
    public FutureCreator setLabour(String labour) {
        tmpFuture.setLabour(labour);
        return this;
    }

    @Override
    public FutureCreator setCountry(String country) {
        tmpFuture.setCountry(country);
        return this;
    }
}
