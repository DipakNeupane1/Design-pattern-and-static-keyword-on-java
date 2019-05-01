package com.dipak.builderdesignpattern;

import com.dipak.builderdesignpattern.domain.Future;
import com.dipak.builderdesignpattern.service.FutureCreator;
import com.dipak.builderdesignpattern.serviceImpl.FutureCreatorImpl;
/**
 * @author dipak
 */
public class FutureCreatorIndividual {
    private FutureCreator creator;

    public FutureCreatorIndividual(final FutureCreator creator) {
        this.creator = creator;
    }

    public Future constructFuture() {
        return creator.setEducation("BCA")
                .setLabour("Hard Labour")
                .setCountry("Nepal")
                .create();
    }
    public static void main(String[] args){
        FutureCreator creator=new FutureCreatorImpl();
        FutureCreatorIndividual creatorIndividual=new FutureCreatorIndividual(creator);
        System.out.println("See My Future in Builder pattern==="+creatorIndividual.constructFuture());
    }
}
