package com.bridgeLabz.day1;

public class DefaultValue {
    int i ;
    long l ;
    float f ;
    double d ;
    byte b ;
    short s;
    char c ;
    boolean bu ;
    public static void main(String[] args) {
        DefaultValue r = new DefaultValue() ;
        System.out.println(r.i);
        System.out.println(r.l);
        System.out.println(r.f);
        System.out.println(r.d);
        System.out.println(r.b);
        System.out.println(r.s);
        System.out.println(r.c);
        System.out.println(r.bu);
    }
}
