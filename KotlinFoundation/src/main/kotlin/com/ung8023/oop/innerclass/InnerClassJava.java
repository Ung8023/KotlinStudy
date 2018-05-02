package com.ung8023.oop.innerclass;

public class InnerClassJava {
    public static class Inner{}

    public static void main(String[] args) {
//        Inner inner = new InnerClassJava().new Inner();
        Inner inner = new InnerClassJava.Inner();
    }
}
