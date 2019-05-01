package com.dipak.booleantest;

public class TrueFalseBoolean {
    public boolean apple=true;
    public boolean banana=false;

    public boolean result(){
        if (!apple){
            System.out.println("apple is true");
            return false;
        }
        if (!banana){
            System.out.println("banana is::"+banana);
            return banana;
        }
        return apple;
    }
    public static void main(String [] args){
        TrueFalseBoolean tf=new TrueFalseBoolean();
        tf.result();
    }
        }
