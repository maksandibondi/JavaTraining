package com.company;

// no need to import classes Juice.java and Interfaces as all of them are in this package
// only public classes from another packages can be accessed after importing
// basically package is like a C++ DLL that has some functionality but

public class Main {

    public static void main(String[] args) {
        // write your code here


        Juice obj = new Orange();
        obj.size = Juice.JuiceSize.MEDIUM;
        System.out.println("Hello World: size = " + obj.size);
        int x = obj.z.intValue()+1;

        Juice obj2 = new Orange();
        obj2.z = 1;
        obj2.flow();
        double val = obj2.getNumber();
        System.out.println("Hello World: size = " + val);


        String f = "Hello";
        String a = f+"x";
        int b = a.compareTo(a+"x");
        System.out.println(b);

    }
}
