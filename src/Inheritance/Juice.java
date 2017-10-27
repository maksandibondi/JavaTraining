package Inheritance;

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
        this.z = 1;
    }

    public void flow(){
        this.z = 2;
    }
}

class Apple extends Juice implements Bitter{
    public void setNumber(double mynum){
        this.z = 1;
    }
    public void flow(){
        this.z = 2;
    }
    public void bit(){
        this.z = 100;
    }
}