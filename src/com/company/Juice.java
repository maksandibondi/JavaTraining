package com.company;

public abstract class Juice implements Flow {
    enum JuiceSize {SMALL, LARGE, MEDIUM}
    Number z = 10;
    JuiceSize size;
    double getNumber(){
        return this.z.doubleValue();
    }
}

class Orange extends Juice {
    public void setNumber(double mynum){
        this.z = mynum;
    }

    public void flow(){
        this.z = 2;
    }
}
