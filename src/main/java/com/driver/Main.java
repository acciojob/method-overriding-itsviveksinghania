package com.driver;

public class Main {
    public static void main(String[] args) {
        B obj = new B();
        System.out.println(obj.meth());
    }
}

class A{
    public A() {
    }
    String meth(){
        return "Invoking method fro class A";
    }
}

class B extends A{
    public B() {
    }

    @Override
    String meth() {
        return "Method is overridden in Extendend class B";
    }
}
