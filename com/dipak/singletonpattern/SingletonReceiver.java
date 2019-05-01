package com.dipak.singletonpattern;



/**
 * @author dipak
 */
public class SingletonReceiver {


    public Singleton getReceivers() {
        return Singleton.getInstance();
    }

    public static void main(String []args){

        System.out.println(Singleton.getInstance());

        System.out.println(Singleton.getInstance());

        System.out.println(Singleton.getInstance());

        SingletonReceiver receiver=new SingletonReceiver();

        System.out.println(receiver.getReceivers());

    }

}
